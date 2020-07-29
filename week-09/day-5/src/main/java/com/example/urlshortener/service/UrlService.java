package com.example.urlshortener.service;

import com.example.urlshortener.model.StoredUrl;
import com.example.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrlService implements  IUrlService{

    @Autowired
    private UrlRepository repository;

    @Override
    public void createUrl(StoredUrl storedUrl) {
        repository.save(storedUrl);
    }

    @Override
    public Optional<StoredUrl> findByAlias(String aliasUrl) {
        return repository.findByAliasUrl(aliasUrl);
    }

    @Override
    public List<StoredUrl> readAllUrls() {
        return repository.findAll();
    }

    @Override
    public void deleteUrl(long id) {
        repository.deleteById(id);
    }

}
