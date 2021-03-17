package com.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springcloud.common.dto.ProductInfoDTO;
import com.springcloud.entity.OrderInfo;

/**
 * @author chenshirong6
 * @date Created in 2021/3/17 9:35
 */
public interface OrderInfoService extends IService<OrderInfo> {
    ProductInfoDTO addOrderById(Long orderNo);
}
