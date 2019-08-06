package com.example.demo.controller;

import com.example.demo.Entity.Stu;
import com.example.demo.Util.REST;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StuController {

    @Autowired
    private StuService stuService;

    @RequestMapping(value = "Stu/{isdel}", method = RequestMethod.GET)
    public REST findStuByName(@PathVariable Integer isdel){
        Stu stu = stuService.findStuByName(isdel);
        return REST.success(stu);
    }
}
