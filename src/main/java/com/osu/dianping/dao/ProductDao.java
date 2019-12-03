package com.osu.dianping.dao;

import com.osu.dianping.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    int insertProduct(Product product);
    Product queryProductById(long productId);
    int updateProduct(Product product);
    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    int queryProductCount(@Param("productCondition") Product productCondition);
    int updateProductCategorytobenull(long productCategoryId);
}
