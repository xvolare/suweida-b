package com.example.fastreachserve.controller.customer;

import com.example.fastreachserve.service.customer.CustomerUserService;
import dto.customer.CustomerUserAddDTO;
import dto.customer.CustomerUserEditDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import result.Result;

/*
 * 功能：用户注册/修改
 * 负责人：何子恒
 * */
@Slf4j
@RestController
@RequestMapping("/customer/register/")
public class CustomerUserController {
    @Autowired
    private CustomerUserService customerUserService;
    //添加的功能-1
    @PostMapping("/add")
    public Result add(@RequestBody CustomerUserAddDTO customerUserAddDTO){
        log.info("开始注册");
        log.info("注册信息：{}",customerUserAddDTO);
        if(customerUserService.add(customerUserAddDTO)){
            return Result.sucess();
        }else{
            return Result.error();
        }
    }

    //添加的功能-2
    @PostMapping("/edit")
    public Result edit(@RequestBody CustomerUserEditDTO customerUserEditDTO) {
        if (customerUserService.edit(customerUserEditDTO)) {
            return Result.sucess();
        } else {
            return Result.error();
        }
    }
}
