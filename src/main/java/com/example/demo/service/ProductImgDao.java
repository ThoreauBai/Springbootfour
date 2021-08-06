package com.example.demo.service;


import com.example.demo.dao.model.ProductImg;

import java.util.List;

/**
 * @Auther: le
 * @Date: 2018/8/30 19:34
 * @Description:
 */
public interface ProductImgDao {
    /**
     * 批量添加商品缩略图
     * @param productImgList
     * @return
     */
    int batchInsertProductImg(List<ProductImg> productImgList);

    /**
     * 通过商品id查询图片
     * @param productId
     * @return
     */
    ProductImg selectImgById(String productId);
}
