package com.wugf.controller;

import com.wugf.api.StockApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StockController {

    @Autowired
    private StockApi stockApi;

    @RequestMapping("getInfo")
    public Map<String, Object> getInfo(){
        return stockApi.getInfo();
    }
}
