package com.example.urlshortener.service;

import com.example.urlshortener.model.StoredUrl;

import java.util.List;
import java.util.Optional;

public interface IUrlService {

    void createUrl(StoredUrl storedUrl);

    Optional<StoredUrl> findByAlias(String aliasUrl);

    public List<StoredUrl> readAllUrls();

    void deleteUrl(long id);

}
