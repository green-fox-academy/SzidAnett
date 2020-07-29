package com.example.urlshortener.controller;

import com.example.urlshortener.exception.AliasNotFoundException;
import com.example.urlshortener.exception.NoContentException;
import com.example.urlshortener.model.Message;
import com.example.urlshortener.model.StoredUrl;
import com.example.urlshortener.service.IUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

   @Autowired
    private IUrlService urlService;

    @GetMapping("/")
    public String showUrlForm(StoredUrl storedUrl, Model model) {

        Message message = new Message();
        message.setErrorText("Enter url to shorten:");

        model.addAttribute("url", storedUrl);
        model.addAttribute("message", message);
        return "newurl";
    }

    @PostMapping("/save_link")
    public String processUrlForm(StoredUrl storedUrl,  Message message, Model model) {

        //Message message = new Message();
        //message.setErrorText("Sample message");

        if (urlService.findByAlias(storedUrl.getAliasUrl()).isPresent()) {
            message.setErrorText("Alias url already exists");
        }
        else {
            message.setErrorText("Saved succesfully!");
            urlService.createUrl(storedUrl);
            storedUrl.setOrigUrl("");
            storedUrl.setAliasUrl("");
        }

        model.addAttribute("message", message);
        model.addAttribute("url", storedUrl);
        return "newurl";
    }


    @GetMapping("/a/{alias}")
    public String sendToOrigUrl(@PathVariable("alias") String alias, Optional<StoredUrl> storedUrl, Model model) {

        storedUrl = urlService.findByAlias(alias);

        if (storedUrl.isPresent()) {
            StoredUrl myStoredUrl = storedUrl.get();
            myStoredUrl.setHitCounter(myStoredUrl.getHitCounter()+1);
            urlService.createUrl(myStoredUrl);
            return "redirect:" + myStoredUrl.getOrigUrl();
        }
        else {
            throw new AliasNotFoundException();
        }
    }
    @GetMapping("/api/links")
    @ResponseBody
    public List<StoredUrl> showAliases(Model model) {

        return urlService.readAllUrls();
    }

    @DeleteMapping("/api/links/{alias}")
    @ResponseBody
    public String deleteAlias(@PathVariable("alias") String alias, Optional<StoredUrl> storedUrl, Model model) {

        storedUrl = urlService.findByAlias(alias);

        if (storedUrl.isPresent()) {
            urlService.deleteUrl(storedUrl.get().getId());
            throw new NoContentException();
        }
        else {
            throw new AliasNotFoundException();
        }
    }

}
