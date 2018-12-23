package com.microclouds.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table city
 *
 * @mbg.generated do_not_delete_during_merge Sat Dec 22 15:48:24 CST 2018
 */
public class City implements Serializable {
    /**
     * Database Column Remarks:
     *   自增id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.id
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   城市编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    private String cityCode;

    /**
     * Database Column Remarks:
     *   城市名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_name
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    private String cityName;

    /**
     * Database Column Remarks:
     *   省份的code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.province_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.id
     *
     * @return the value of city.id
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.id
     *
     * @param id the value for city.id
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_code
     *
     * @return the value of city.city_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_code
     *
     * @param cityCode the value for city.city_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_name
     *
     * @return the value of city.city_name
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_name
     *
     * @param cityName the value for city.city_name
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.province_code
     *
     * @return the value of city.province_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.province_code
     *
     * @param provinceCode the value for city.province_code
     *
     * @mbg.generated Sat Dec 22 15:48:24 CST 2018
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}