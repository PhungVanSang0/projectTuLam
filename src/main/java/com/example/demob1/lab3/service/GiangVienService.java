package com.example.demob1.lab3.service;

import com.example.demob1.lab3.entity.GiangVien;

import java.util.ArrayList;
import java.util.List;

public class GiangVienService {
    private List<GiangVien> list = new ArrayList<>();
    public GiangVienService(){
        list.add(new GiangVien("1","HangNT169","Táo",3,true,"Ha noi"));
        list.add(new GiangVien("2","NguyenVV4","Cam",4,true,"Ha noi"));
        list.add(new GiangVien("3","PhongTT35","Sầu riêng",5,false,"Ha noi"));
        list.add(new GiangVien("4","KhanhPG","Vải",7,false,"Ha noi"));
        list.add(new GiangVien("5","TienNH21","Mít",10,true,"Ha noi"));
    }

    public List<GiangVien> getAll(){
        return list;
    }

    public GiangVien findById(String id){
        for (GiangVien gv:list){
            if(gv.getId().equals(id)){
                return gv;
            }
        }return null;
    }

    public GiangVien findByGioiTinh(boolean gioiTinh){
        for (GiangVien gv:list){
            if(gv.isGioiTinh()){
                return gv;
            }
        }return null;
    }

    public void add(GiangVien gv){
        list.add(gv);
    }

    public void update(GiangVien gv){
        list.set(list.indexOf(findById(gv.getId())),gv);
    }

    public void delete(GiangVien gv){
        list.remove(findById(gv.getId()));
    }
}
