package com.tiangouforum.dao;

import com.tiangouforum.domain.Frmuserinf;
import com.tiangouforum.domain.FrmuserinfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("FrmuserinfDao")
public interface FrmuserinfDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    long countByExample(FrmuserinfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    int deleteByExample(FrmuserinfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    int insert(Frmuserinf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    int insertSelective(Frmuserinf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    List<Frmuserinf> selectByExample(FrmuserinfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Frmuserinf record, @Param("example") FrmuserinfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table frmuserinf
     *
     * @mbg.generated Sun Jan 28 18:57:51 CST 2018
     */
    int updateByExample(@Param("record") Frmuserinf record, @Param("example") FrmuserinfExample example);
}