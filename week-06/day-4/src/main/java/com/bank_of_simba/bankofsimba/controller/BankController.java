package com.bank_of_simba.bankofsimba.controller;

import com.bank_of_simba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    List<BankAccount> list = new ArrayList<>();

    public BankController() {

        list.add(new BankAccount("Mufasa", 900000, "lion", true, true));
        list.add(new BankAccount("Pumba", 10, "warthog", false, true));
        list.add(new BankAccount("Timon", 5, "meerkat", false, true));
        list.add(new BankAccount("Scar", 666, "lion", false, false));
        list.add(new BankAccount("Azizi", 0, "hyenas", false, false));
    }

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion", true, true));
        return "index";
    }
    @RequestMapping("/list")
    public String list(Model model, @ModelAttribute BankAccount acc) {
        model.addAttribute(list);
        model.addAttribute(acc);
        return "list";
    }

    @PostMapping("/raisebyindex")
    public String raiseByIndex(@ModelAttribute int accountIndex) {
        if (accountIndex < list.size()) {
            list.get(accountIndex).raise();
        }
        return "redirect:/list";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute BankAccount acc) {
        list.add(acc);
        return "redirect:/list";
    }
}