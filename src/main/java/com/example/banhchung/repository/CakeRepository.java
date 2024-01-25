package com.example.banhchung.repository;


import com.example.banhchung.model.Cake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CakeRepository extends CrudRepository<Cake, Integer> {

    public List<Cake> findChungByDetailsContaining(String keyword);
}