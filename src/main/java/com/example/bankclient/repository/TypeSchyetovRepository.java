package com.example.bankclient.repository;


import com.example.bankclient.model.TypeSchyotov;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeSchyetovRepository extends JpaRepository<TypeSchyotov, Long> {
}
