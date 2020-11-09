package com.springboot.college.mapper;

import com.springboot.college.model.JshdepotItem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshdepotItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_depotitem",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_depotitem (Id, HeaderId, ",
        "MaterialId, material_extend_id, ",
        "MUnit, OperNumber, ",
        "BasicNumber, UnitPrice, ",
        "TaxUnitPrice, AllPrice, ",
        "Remark, Img, Incidentals, ",
        "DepotId, AnotherDepotId, ",
        "TaxRate, TaxMoney, ",
        "TaxLastMoney, OtherField1, ",
        "OtherField2, OtherField3, ",
        "OtherField4, OtherField5, ",
        "MType, tenant_id, ",
        "delete_Flag)",
        "values (#{id,jdbcType=BIGINT}, #{headerid,jdbcType=BIGINT}, ",
        "#{materialid,jdbcType=BIGINT}, #{materialExtendId,jdbcType=BIGINT}, ",
        "#{munit,jdbcType=VARCHAR}, #{opernumber,jdbcType=DECIMAL}, ",
        "#{basicnumber,jdbcType=DECIMAL}, #{unitprice,jdbcType=DECIMAL}, ",
        "#{taxunitprice,jdbcType=DECIMAL}, #{allprice,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=VARCHAR}, #{img,jdbcType=VARCHAR}, #{incidentals,jdbcType=DECIMAL}, ",
        "#{depotid,jdbcType=BIGINT}, #{anotherdepotid,jdbcType=BIGINT}, ",
        "#{taxrate,jdbcType=DECIMAL}, #{taxmoney,jdbcType=DECIMAL}, ",
        "#{taxlastmoney,jdbcType=DECIMAL}, #{otherfield1,jdbcType=VARCHAR}, ",
        "#{otherfield2,jdbcType=VARCHAR}, #{otherfield3,jdbcType=VARCHAR}, ",
        "#{otherfield4,jdbcType=VARCHAR}, #{otherfield5,jdbcType=VARCHAR}, ",
        "#{mtype,jdbcType=VARCHAR}, #{tenantId,jdbcType=BIGINT}, ",
        "#{deleteFlag,jdbcType=VARCHAR})"
    })
    int insert(JshdepotItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshdepotItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int updateByPrimaryKeySelective(JshdepotItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_depotitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_depotitem",
        "set HeaderId = #{headerid,jdbcType=BIGINT},",
          "MaterialId = #{materialid,jdbcType=BIGINT},",
          "material_extend_id = #{materialExtendId,jdbcType=BIGINT},",
          "MUnit = #{munit,jdbcType=VARCHAR},",
          "OperNumber = #{opernumber,jdbcType=DECIMAL},",
          "BasicNumber = #{basicnumber,jdbcType=DECIMAL},",
          "UnitPrice = #{unitprice,jdbcType=DECIMAL},",
          "TaxUnitPrice = #{taxunitprice,jdbcType=DECIMAL},",
          "AllPrice = #{allprice,jdbcType=DECIMAL},",
          "Remark = #{remark,jdbcType=VARCHAR},",
          "Img = #{img,jdbcType=VARCHAR},",
          "Incidentals = #{incidentals,jdbcType=DECIMAL},",
          "DepotId = #{depotid,jdbcType=BIGINT},",
          "AnotherDepotId = #{anotherdepotid,jdbcType=BIGINT},",
          "TaxRate = #{taxrate,jdbcType=DECIMAL},",
          "TaxMoney = #{taxmoney,jdbcType=DECIMAL},",
          "TaxLastMoney = #{taxlastmoney,jdbcType=DECIMAL},",
          "OtherField1 = #{otherfield1,jdbcType=VARCHAR},",
          "OtherField2 = #{otherfield2,jdbcType=VARCHAR},",
          "OtherField3 = #{otherfield3,jdbcType=VARCHAR},",
          "OtherField4 = #{otherfield4,jdbcType=VARCHAR},",
          "OtherField5 = #{otherfield5,jdbcType=VARCHAR},",
          "MType = #{mtype,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "delete_Flag = #{deleteFlag,jdbcType=VARCHAR}",
        "where Id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(JshdepotItem record);
}