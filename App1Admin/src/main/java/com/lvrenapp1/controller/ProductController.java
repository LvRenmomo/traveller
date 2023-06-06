package com.lvrenapp1.controller;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lvrenapp1.entity.Product;
import com.lvrenapp1.entity.R;
import com.lvrenapp1.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;


    @GetMapping("/findSwiper")
    public R findSwiper(){
        List<Product> findSwiperList = productService.list(new LambdaQueryWrapper<Product>().notIn(Product::getSwiperSort, false));
        return R.ok().data(findSwiperList);
    }
}
