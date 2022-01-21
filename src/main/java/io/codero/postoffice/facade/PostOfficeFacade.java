package io.codero.postoffice.facade;

import io.codero.postoffice.dto.CreatePostOfficeDto;
import io.codero.postoffice.dto.FilterPostOfficeDto;
import io.codero.postoffice.dto.PostOfficeDto;
import io.codero.postoffice.entity.PostOffice;
import io.codero.postoffice.mapper.PostOfficeMapper;
import io.codero.postoffice.service.PostOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PostOfficeFacade {
    private final PostOfficeService service;
    private final PostOfficeMapper mapper;

    public PostOfficeDto getById(Integer id) {
        return mapper.toDto(service.getById(id));
    }

    public PostOfficeDto insert(CreatePostOfficeDto dto) {
        PostOffice postOffice = mapper.createDtoToEntity(dto);
        return mapper.toDto(service.insert(postOffice));
    }

    public List<PostOfficeDto> findByFilter(FilterPostOfficeDto dto) {
        return service.findByFilter(dto).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public PostOfficeDto update(PostOfficeDto dto) {
        PostOffice postOffice = mapper.toEntity(dto);
        return mapper.toDto(service.update(postOffice));
    }

    public void deleteById(Integer id) {
        service.deleteById(id);
    }

    public void deleteAll() {
        service.deleteAll();
    }
}
