package com.example.HotelManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HotelManagementSystem.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
