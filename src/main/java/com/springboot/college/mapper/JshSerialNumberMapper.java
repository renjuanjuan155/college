package com.springboot.college.mapper;

import com.springboot.college.model.JshSerialNumber;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshSerialNumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_serial_number",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_serial_number (id, material_Id, ",
        "serial_Number, is_Sell, ",
        "remark, delete_Flag, ",
        "create_Time, creator, ",
        "update_Time, updater, ",
        "depothead_Id, tenant_id)",
        "values (#{id,jdbcType=BIGINT}, #{materialId,jdbcType=BIGINT}, ",
        "#{serialNumber,jdbcType=VARCHAR}, #{isSell,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{deleteFlag,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{creator,jdbcType=BIGINT}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=BIGINT}, ",
        "#{depotheadId,jdbcType=BIGINT}, #{tenantId,jdbcType=BIGINT})"
    })
    int insert(JshSerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshSerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int updateByPrimaryKeySelective(JshSerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_serial_number",
        "set material_Id = #{materialId,jdbcType=BIGINT},",
          "serial_Number = #{serialNumber,jdbcType=VARCHAR},",
          "is_Sell = #{isSell,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "delete_Flag = #{deleteFlag,jdbcType=VARCHAR},",
          "create_Time = #{createTime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=BIGINT},",
          "update_Time = #{updateTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "depothead_Id = #{depotheadId,jdbcType=BIGINT},",
          "tenant_id = #{tenantId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(JshSerialNumber record);
}