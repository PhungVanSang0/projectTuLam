package com.example.demob1.lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GiangVien {
    private String id;
    private String ma;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String diaChi;
}
