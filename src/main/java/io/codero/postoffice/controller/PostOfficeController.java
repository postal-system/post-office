package io.codero.postoffice.controller;

import io.codero.postoffice.dto.CreatePostOfficeDto;
import io.codero.postoffice.dto.FilterPostOfficeDto;
import io.codero.postoffice.dto.PostOfficeDto;
import io.codero.postoffice.facade.PostOfficeFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post-office")
@RequiredArgsConstructor
public class PostOfficeController {
    private final PostOfficeFacade facade;

    @PostMapping()
    public ResponseEntity<PostOfficeDto> create(@RequestBody CreatePostOfficeDto dto) {
        return ResponseEntity.ok().body(facade.create(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostOfficeDto> getById(@PathVariable("id") Integer id) {
        PostOfficeDto dto = facade.getById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping(value = "/filter")
    public ResponseEntity<List<PostOfficeDto>> findByFilter(@RequestBody FilterPostOfficeDto dto) {
        return ResponseEntity.ok().body(facade.findByFilter(dto));
    }

    @PutMapping()
    public ResponseEntity<PostOfficeDto> update(@RequestBody PostOfficeDto dto) {
        return ResponseEntity.ok().body(facade.update(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {
        facade.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteAll() {
        facade.deleteAll();
        return ResponseEntity.ok().build();
    }
}
