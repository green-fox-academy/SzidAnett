package com.example.urlshortener.repository;

import com.example.urlshortener.model.StoredUrl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UrlRepository extends CrudRepository<StoredUrl, Long> {

    Optional<StoredUrl> findByAliasUrl(String aliasUrl);

    List<StoredUrl> findAll();

    @Override
    void deleteById(Long aLong);
}
