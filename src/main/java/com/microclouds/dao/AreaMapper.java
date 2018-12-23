package com.microclouds.dao;

import com.microclouds.pojo.Area;
import com.microclouds.pojo.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    long countByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int deleteByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    Area selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    int updateByPrimaryKey(Area record);
}