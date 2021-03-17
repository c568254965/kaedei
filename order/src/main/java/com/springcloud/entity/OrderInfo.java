package com.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author chenshirong6
 * @date Created in 2021/3/17 9:31
 */

@TableName("order_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    @TableId
    private Long orderNo;
    private String userName;
    private Date createDt ;
    private String productNo;
    private Integer  productCount;
}
