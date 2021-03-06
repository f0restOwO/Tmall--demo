package com.yang.mapper;

import com.yang.domain.ProductImage;
import com.yang.domain.ProductImageExample;
import java.util.List;

public interface ProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    int insert(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    int insertSelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    List<ProductImage> selectByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    ProductImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productimage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductImage record);
}