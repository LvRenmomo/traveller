package com.lvrenapp1.controller;

import com.lvrenapp1.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test1 {

    @GetMapping("test")
    public R test(){
        return R.ok();
    }

}
