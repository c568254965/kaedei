package com.springcloud.openapi;

import com.springcloud.api.ProductCenterFeignApi;
import com.springcloud.common.dto.ProductInfoDTO;
import com.springcloud.entity.ProductInfo;
import com.springcloud.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 14:16
 */

@RestController
public class OpenProductController implements ProductCenterFeignApi {

    @Autowired
    ProductInfoService productInfoService;

    @Override
    @PostMapping("/selectProductById/{productId}")
    public ProductInfoDTO selectProductById(Long productId) {

        productInfoService.cutProductCount(productId);
        System.out.println("productId:"+productId);
        ProductInfoDTO productInfoDTO = new ProductInfoDTO();
        ProductInfo existProductInfo = productInfoService.getById(productId);
        BeanUtils.copyProperties(existProductInfo,productInfoDTO);
        return productInfoDTO;
    }
}
