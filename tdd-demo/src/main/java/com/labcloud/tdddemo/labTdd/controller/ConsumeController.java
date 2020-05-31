package com.labcloud.tdddemo.labTdd.controller;

import com.labcloud.tdddemo.labTdd.service.IConsumeService;
import com.labcloud.tdddemo.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsumeController {

    @Autowired
    private IConsumeService consumeService;

    @PostMapping("/buyGood")
    public Map<String, Object> buyGood(int id, int useMoney, String goodName){
        RestResult restResult = RestResult.create();
        consumeService.buyGood(restResult, id, useMoney, goodName);
        return restResult.outResult();
    }
}
