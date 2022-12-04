package com.exalt.learning.aerospikeentitydemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {
    @Id
    private int id;
    private String model;
    private short horsePower;

}
