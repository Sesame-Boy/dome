package com.cloud.spring.controller;

import com.cloud.spring.entities.CommonResult;
import com.cloud.spring.entities.Payment;
import com.cloud.spring.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int res=paymentService.create(payment);
        if(res>0){
            return new CommonResult(200,"插入成功",res);
        }else {
            return new CommonResult(400,"插入失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(400,"查询失败",null);
        }
    }
}
