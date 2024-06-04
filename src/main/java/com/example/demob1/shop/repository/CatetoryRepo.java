package com.example.demob1.shop.repository;

import com.example.demob1.shop.entity.Catetory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CatetoryRepo extends JpaRepository<Catetory,String> {
    public Catetory findCatetoryByName(String name);

    //jpql
    @Query("SELECT c FROM Catetory c WHERE c.name= :name")
    public Catetory findCatetoryByNameJpql(String name);

    @Query(value = "SELECT * FROM Catetories WHERE c.name= :name",nativeQuery = true)
    public Catetory findCatetoryByNameSQL(@Param("name") String name);
}
