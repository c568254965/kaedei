package com.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springcloud.entity.ProductInfo;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 17:03
 */
public interface ProductInfoService extends IService<ProductInfo> {

    void cutProductCount(Long productId);
}