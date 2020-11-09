package com.springboot.college.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JshMaterialExtend implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.bar_code
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String barCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.commodity_unit
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String commodityUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.purchase_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal purchaseDecimal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.commodity_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal commodityDecimal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.wholesale_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal wholesaleDecimal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.low_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal lowDecimal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.create_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.create_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String createSerial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.update_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String updateSerial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.update_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_extend.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.id
     *
     * @return the value of jsh_material_extend.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.id
     *
     * @param id the value for jsh_material_extend.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.material_id
     *
     * @return the value of jsh_material_extend.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withMaterialId(Long materialId) {
        this.setMaterialId(materialId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.material_id
     *
     * @param materialId the value for jsh_material_extend.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.bar_code
     *
     * @return the value of jsh_material_extend.bar_code
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withBarCode(String barCode) {
        this.setBarCode(barCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.bar_code
     *
     * @param barCode the value for jsh_material_extend.bar_code
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.commodity_unit
     *
     * @return the value of jsh_material_extend.commodity_unit
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getCommodityUnit() {
        return commodityUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withCommodityUnit(String commodityUnit) {
        this.setCommodityUnit(commodityUnit);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.commodity_unit
     *
     * @param commodityUnit the value for jsh_material_extend.commodity_unit
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCommodityUnit(String commodityUnit) {
        this.commodityUnit = commodityUnit == null ? null : commodityUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.purchase_decimal
     *
     * @return the value of jsh_material_extend.purchase_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getPurchaseDecimal() {
        return purchaseDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withPurchaseDecimal(BigDecimal purchaseDecimal) {
        this.setPurchaseDecimal(purchaseDecimal);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.purchase_decimal
     *
     * @param purchaseDecimal the value for jsh_material_extend.purchase_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setPurchaseDecimal(BigDecimal purchaseDecimal) {
        this.purchaseDecimal = purchaseDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.commodity_decimal
     *
     * @return the value of jsh_material_extend.commodity_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getCommodityDecimal() {
        return commodityDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withCommodityDecimal(BigDecimal commodityDecimal) {
        this.setCommodityDecimal(commodityDecimal);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.commodity_decimal
     *
     * @param commodityDecimal the value for jsh_material_extend.commodity_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCommodityDecimal(BigDecimal commodityDecimal) {
        this.commodityDecimal = commodityDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.wholesale_decimal
     *
     * @return the value of jsh_material_extend.wholesale_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getWholesaleDecimal() {
        return wholesaleDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withWholesaleDecimal(BigDecimal wholesaleDecimal) {
        this.setWholesaleDecimal(wholesaleDecimal);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.wholesale_decimal
     *
     * @param wholesaleDecimal the value for jsh_material_extend.wholesale_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setWholesaleDecimal(BigDecimal wholesaleDecimal) {
        this.wholesaleDecimal = wholesaleDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.low_decimal
     *
     * @return the value of jsh_material_extend.low_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getLowDecimal() {
        return lowDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withLowDecimal(BigDecimal lowDecimal) {
        this.setLowDecimal(lowDecimal);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.low_decimal
     *
     * @param lowDecimal the value for jsh_material_extend.low_decimal
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setLowDecimal(BigDecimal lowDecimal) {
        this.lowDecimal = lowDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.create_time
     *
     * @return the value of jsh_material_extend.create_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.create_time
     *
     * @param createTime the value for jsh_material_extend.create_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.create_serial
     *
     * @return the value of jsh_material_extend.create_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getCreateSerial() {
        return createSerial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withCreateSerial(String createSerial) {
        this.setCreateSerial(createSerial);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.create_serial
     *
     * @param createSerial the value for jsh_material_extend.create_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCreateSerial(String createSerial) {
        this.createSerial = createSerial == null ? null : createSerial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.update_serial
     *
     * @return the value of jsh_material_extend.update_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getUpdateSerial() {
        return updateSerial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withUpdateSerial(String updateSerial) {
        this.setUpdateSerial(updateSerial);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.update_serial
     *
     * @param updateSerial the value for jsh_material_extend.update_serial
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setUpdateSerial(String updateSerial) {
        this.updateSerial = updateSerial == null ? null : updateSerial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.update_time
     *
     * @return the value of jsh_material_extend.update_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withUpdateTime(Long updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.update_time
     *
     * @param updateTime the value for jsh_material_extend.update_time
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.tenant_id
     *
     * @return the value of jsh_material_extend.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withTenantId(Long tenantId) {
        this.setTenantId(tenantId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.tenant_id
     *
     * @param tenantId the value for jsh_material_extend.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_extend.delete_Flag
     *
     * @return the value of jsh_material_extend.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialExtend withDeleteFlag(String deleteFlag) {
        this.setDeleteFlag(deleteFlag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_extend.delete_Flag
     *
     * @param deleteFlag the value for jsh_material_extend.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_extend
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", materialId=").append(materialId);
        sb.append(", barCode=").append(barCode);
        sb.append(", commodityUnit=").append(commodityUnit);
        sb.append(", purchaseDecimal=").append(purchaseDecimal);
        sb.append(", commodityDecimal=").append(commodityDecimal);
        sb.append(", wholesaleDecimal=").append(wholesaleDecimal);
        sb.append(", lowDecimal=").append(lowDecimal);
        sb.append(", createTime=").append(createTime);
        sb.append(", createSerial=").append(createSerial);
        sb.append(", updateSerial=").append(updateSerial);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}