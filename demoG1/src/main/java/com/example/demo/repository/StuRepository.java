package com.example.demo.repository;

import com.example.demo.Entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepository extends JpaRepository<Stu,String> {
    Stu findStuByName(Integer isdel);
}
