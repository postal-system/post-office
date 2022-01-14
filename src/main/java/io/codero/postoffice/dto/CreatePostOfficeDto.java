package io.codero.postoffice.dto;

import lombok.Data;

@Data
public class CreatePostOfficeDto {
    private String name;
    private String address;
    private String operationTime;
    private String metadata;
}
