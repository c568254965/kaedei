package com.springcloud.controller;

import cn.hutool.json.JSONUtil;
import com.springcloud.api.ProductCenterFeignApi;
import com.springcloud.common.dto.ProductInfoDTO;
import com.springcloud.service.OrderInfoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 14:33
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    ProductCenterFeignApi productCenterFeignApi;
    @Autowired
    OrderInfoService orderInfoService;

    @GetMapping("/testForOrder/{orderNo}")
    @GlobalTransactional(name="prex-create-order",rollbackFor=Exception.class)
    public String testForOrder(@PathVariable("orderNo") Long orderNo){
      ProductInfoDTO productInfo1 = productCenterFeignApi.selectProductById(orderNo);

        ProductInfoDTO productInfo  = orderInfoService.addOrderById(orderNo);
        //System.out.println(1/0);
        return JSONUtil.toJsonStr(productInfo);
      //  return "222";
    }

}
