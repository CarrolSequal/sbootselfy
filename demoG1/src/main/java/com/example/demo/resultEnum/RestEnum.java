package com.example.demo.resultEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RestEnum {
    SUCCESS("200","success"),
    ERROR("400","error");
    private String code;
    private String msg;
}
