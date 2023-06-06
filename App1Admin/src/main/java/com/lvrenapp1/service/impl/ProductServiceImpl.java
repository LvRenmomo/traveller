package com.lvrenapp1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvrenapp1.entity.Product;
import com.lvrenapp1.mapper.ProductMapper;
import com.lvrenapp1.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ProductService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Resource
   private ProductMapper productMapper;
}
