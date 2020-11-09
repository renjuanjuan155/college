package com.springboot.college.mapper;

import com.springboot.college.model.JshLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_log (id, userID, ",
        "operation, clientIP, ",
        "createtime, status, ",
        "contentdetails, remark, ",
        "tenant_id)",
        "values (#{id,jdbcType=BIGINT}, #{userid,jdbcType=BIGINT}, ",
        "#{operation,jdbcType=VARCHAR}, #{clientip,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT}, ",
        "#{contentdetails,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{tenantId,jdbcType=BIGINT})"
    })
    int insert(JshLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int updateByPrimaryKeySelective(JshLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_log
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_log",
        "set userID = #{userid,jdbcType=BIGINT},",
          "operation = #{operation,jdbcType=VARCHAR},",
          "clientIP = #{clientip,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT},",
          "contentdetails = #{contentdetails,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(JshLog record);
}