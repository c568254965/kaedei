package com.springcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 17:01
 */

@TableName(value = "product_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {
    @TableId(type = IdType.AUTO)
    private Long productNo;

    private String productName;

    private Integer productStore;

    private double productPrice;
}
