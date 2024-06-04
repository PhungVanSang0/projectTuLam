package com.example.demob1.lab2.service;

import com.example.demob1.lab2.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<Student>();

    public StudentService(){
        list.add(new Student("id01","name01",20,"Ha Noi 1",true));
        list.add(new Student("id02","name02",21,"Ha Noi 2",false));
        list.add(new Student("id03","name03",22,"Ha Noi 3",true));
    }

    public List<Student> getAll(){
        return list;
    }

    public Student findById(String id){
        for (Student st :list) {
            if (st.getId().equals(id)) {
                return st;
            }
        }return null;
    }

    public void add(Student student) {
        list.add(student);
    }

    public void update(Student student) {
        list.set(list.indexOf(findById(student.getId())),student);
    }

    public void delete(Student student) {
        list.remove(findById(student.getId()));
    }

}
