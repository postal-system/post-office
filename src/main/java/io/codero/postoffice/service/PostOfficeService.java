package io.codero.postoffice.service;

import io.codero.postoffice.entity.PostOffice;
import io.codero.postoffice.exception.PostOfficeNotFoundException;
import io.codero.postoffice.repositoty.PostOfficeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostOfficeService {
    private final PostOfficeRepository repository;

    public PostOffice insert(PostOffice postOffice) {
        return repository.save(postOffice);
    }

    public PostOffice getById(int id) {
        return repository.findById(id).orElseThrow(() -> new PostOfficeNotFoundException("Object with " + id + "not found"));
    }

    public List<PostOffice> getAll() {
        return repository.findAll();
    }

    public PostOffice update(PostOffice postOffice) {
        return repository.save(postOffice);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
