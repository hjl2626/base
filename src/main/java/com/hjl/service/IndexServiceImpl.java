package com.hjl.service;

import com.hjl.aop.Test;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl {


    @Test
    public String index(){
        return "index";
    }
}
