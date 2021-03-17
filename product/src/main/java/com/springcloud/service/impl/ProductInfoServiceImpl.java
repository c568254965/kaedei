package com.springcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.entity.ProductInfo;
import com.springcloud.mapper.ProductInfoMapper;
import com.springcloud.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 17:03
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {


    @Autowired
    ProductInfoMapper productInfoMapper;
    @Override
    public void cutProductCount(Long productId) {
        QueryWrapper<ProductInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ProductInfo::getProductNo,productId);
        ProductInfo productInfo = productInfoMapper.selectOne(queryWrapper);
        if(null!=productInfo){
            UpdateWrapper<ProductInfo> updateWrapper = new UpdateWrapper();
            updateWrapper.lambda().eq(ProductInfo::getProductNo,productId)
                    .set(ProductInfo::getProductStore,productInfo.getProductStore()-1);
            productInfoMapper.update(null,updateWrapper);
        }


    }
}
