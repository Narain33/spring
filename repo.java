package com.project.SpringAngular;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<database, Long> {
    @Override
    List<database> findAll();
}
