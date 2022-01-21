package io.codero.postoffice.dto;

import lombok.Data;

@Data
public class FilterPostOfficeDto {
    private Integer id;
    private String partOfName;
    private String partOfAddress;
    private String startTime;
    private String endTime;
}
