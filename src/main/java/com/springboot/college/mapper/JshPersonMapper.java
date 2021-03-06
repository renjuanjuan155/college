package com.springboot.college.mapper;

import com.springboot.college.model.JshPerson;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshPersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_person",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_person (Id, Type, ",
        "Name, tenant_id, delete_Flag)",
        "values (#{id,jdbcType=BIGINT}, #{type,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{tenantId,jdbcType=BIGINT}, #{deleteFlag,jdbcType=VARCHAR})"
    })
    int insert(JshPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_person",
        "set Type = #{type,jdbcType=VARCHAR},",
          "Name = #{name,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "delete_Flag = #{deleteFlag,jdbcType=VARCHAR}",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(JshPerson record);
}