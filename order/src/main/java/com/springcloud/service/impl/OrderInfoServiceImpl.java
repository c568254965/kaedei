package com.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.api.ProductCenterFeignApi;
import com.springcloud.common.dto.ProductInfoDTO;
import com.springcloud.entity.OrderInfo;
import com.springcloud.mapper.OrderInfoMapper;
import com.springcloud.service.OrderInfoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenshirong6
 * @date Created in 2021/3/17 9:36
 */

@Service
public class OrderInfoServiceImpl   extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {



    @Autowired
    OrderInfoMapper orderInfoMapper;
    @Override
    public ProductInfoDTO addOrderById(Long orderNo) {

        OrderInfo orderInfo = orderInfoMapper.selectById(1L);
        orderInfo.setProductCount(999);
        orderInfoMapper.updateById(orderInfo);


        return ProductInfoDTO.builder().productName("success...").build();
    }
}
