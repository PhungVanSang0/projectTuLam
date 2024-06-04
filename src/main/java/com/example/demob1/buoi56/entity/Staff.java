package com.example.demob1.buoi56.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Staff {
    private String name;
    private int age;
    private String address;
    private String position;
    private String[] hobies;
    private Country country;
}
