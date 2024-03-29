package com.lvrenapp1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单详细表
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-01-12 10:19
 */
@TableName("t_order_detail")
@Data
public class OrderDetail {

    private Integer id; // 编号

    private Integer mId; // 订单主表Id

    private Integer goodsId; // 商品ID

    private Integer goodsNumber; // 商品购买数量

    private BigDecimal goodsPrice; // 商品单价

    private String goodsName; // 商品名称

    private String goodsPic; // 商品图片

}
