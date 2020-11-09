package com.springboot.college.mapper;

import com.springboot.college.model.JshMaterial;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshMaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_material",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_material (Id, CategoryId, ",
        "Name, Mfrs, Packing, ",
        "SafetyStock, Model, ",
        "Standard, Color, ",
        "Unit, Remark, RetailPrice, ",
        "LowPrice, PresetPriceOne, ",
        "PresetPriceTwo, UnitId, ",
        "FirstOutUnit, FirstInUnit, ",
        "PriceStrategy, Enabled, ",
        "OtherField1, OtherField2, ",
        "OtherField3, enableSerialNumber, ",
        "tenant_id, delete_Flag)",
        "values (#{id,jdbcType=BIGINT}, #{categoryid,jdbcType=BIGINT}, ",
        "#{name,jdbcType=VARCHAR}, #{mfrs,jdbcType=VARCHAR}, #{packing,jdbcType=DECIMAL}, ",
        "#{safetystock,jdbcType=DECIMAL}, #{model,jdbcType=VARCHAR}, ",
        "#{standard,jdbcType=VARCHAR}, #{color,jdbcType=VARCHAR}, ",
        "#{unit,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, #{retailprice,jdbcType=DECIMAL}, ",
        "#{lowprice,jdbcType=DECIMAL}, #{presetpriceone,jdbcType=DECIMAL}, ",
        "#{presetpricetwo,jdbcType=DECIMAL}, #{unitid,jdbcType=BIGINT}, ",
        "#{firstoutunit,jdbcType=VARCHAR}, #{firstinunit,jdbcType=VARCHAR}, ",
        "#{pricestrategy,jdbcType=VARCHAR}, #{enabled,jdbcType=BIT}, ",
        "#{otherfield1,jdbcType=VARCHAR}, #{otherfield2,jdbcType=VARCHAR}, ",
        "#{otherfield3,jdbcType=VARCHAR}, #{enableserialnumber,jdbcType=VARCHAR}, ",
        "#{tenantId,jdbcType=BIGINT}, #{deleteFlag,jdbcType=VARCHAR})"
    })
    int insert(JshMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int updateByPrimaryKeySelective(JshMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_material",
        "set CategoryId = #{categoryid,jdbcType=BIGINT},",
          "Name = #{name,jdbcType=VARCHAR},",
          "Mfrs = #{mfrs,jdbcType=VARCHAR},",
          "Packing = #{packing,jdbcType=DECIMAL},",
          "SafetyStock = #{safetystock,jdbcType=DECIMAL},",
          "Model = #{model,jdbcType=VARCHAR},",
          "Standard = #{standard,jdbcType=VARCHAR},",
          "Color = #{color,jdbcType=VARCHAR},",
          "Unit = #{unit,jdbcType=VARCHAR},",
          "Remark = #{remark,jdbcType=VARCHAR},",
          "RetailPrice = #{retailprice,jdbcType=DECIMAL},",
          "LowPrice = #{lowprice,jdbcType=DECIMAL},",
          "PresetPriceOne = #{presetpriceone,jdbcType=DECIMAL},",
          "PresetPriceTwo = #{presetpricetwo,jdbcType=DECIMAL},",
          "UnitId = #{unitid,jdbcType=BIGINT},",
          "FirstOutUnit = #{firstoutunit,jdbcType=VARCHAR},",
          "FirstInUnit = #{firstinunit,jdbcType=VARCHAR},",
          "PriceStrategy = #{pricestrategy,jdbcType=VARCHAR},",
          "Enabled = #{enabled,jdbcType=BIT},",
          "OtherField1 = #{otherfield1,jdbcType=VARCHAR},",
          "OtherField2 = #{otherfield2,jdbcType=VARCHAR},",
          "OtherField3 = #{otherfield3,jdbcType=VARCHAR},",
          "enableSerialNumber = #{enableserialnumber,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "delete_Flag = #{deleteFlag,jdbcType=VARCHAR}",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(JshMaterial record);
}