package com.yang.mapper;

import com.yang.domain.Review;
import com.yang.domain.ReviewExample;
import java.util.List;

public interface ReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    int insert(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    int insertSelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    List<Review> selectByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    Review selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Review record);
}