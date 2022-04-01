package io.codero.postoffice.service;

import io.codero.postoffice.dto.FilterPostOfficeDto;
import io.codero.postoffice.entity.PostOffice;
import io.codero.postoffice.exception.PostOfficeNotFoundException;
import io.codero.postoffice.filter.PostOfficeFilter;
import io.codero.postoffice.repositoty.PostOfficeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

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

    public Page<PostOffice> findByFilter(FilterPostOfficeDto dto) {
        PageRequest pageRequest = PageRequest.of(0, 100);
        PostOfficeFilter filter = new PostOfficeFilter(dto);
        return repository.findAll(filter, pageRequest);
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
