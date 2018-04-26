package com.hjl.controller;


import com.hjl.aop.Test;
import com.hjl.service.IndexService;
import com.hjl.service.IndexServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("index")
public class Index {

    @Resource
    private IndexServiceImpl indexService;

    @RequestMapping("")
    @ResponseBody
    @Test
    public String index(){
        return indexService.index();
    }
}
