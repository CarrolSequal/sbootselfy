package com.example.demo.service.Impl;

import com.example.demo.Entity.Stu;
import com.example.demo.repository.StuRepository;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;

public class StuServiceImpl implements StuService {

    @Autowired
    private StuRepository stuRepository;

    @Override
    public Stu findStuByName(Integer isdel) {
        return stuRepository.findStuByName(isdel);
    }
}
