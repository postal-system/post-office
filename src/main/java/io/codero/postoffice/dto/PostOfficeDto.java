package io.codero.postoffice.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class PostOfficeDto {
    private int id;
    private String name;
    private String address;
    private LocalTime startTime;
    private LocalTime endTime;
}
