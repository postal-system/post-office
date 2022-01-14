package io.codero.postoffice.mapper;

import io.codero.postoffice.dto.CreatePostOfficeDto;
import io.codero.postoffice.dto.PostOfficeDto;
import io.codero.postoffice.entity.PostOffice;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface PostOfficeMapper {
    PostOffice createDtoToEntity(CreatePostOfficeDto dto);

    PostOffice toEntity(PostOfficeDto dto);

    PostOfficeDto toDto(PostOffice entity);
}
