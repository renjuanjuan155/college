package com.springboot.college.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class JshAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.SerialNo
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String serialno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.InitialAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal initialamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.CurrentAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal currentamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.IsDefault
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Boolean isdefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Id
     *
     * @return the value of jsh_account.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Id
     *
     * @param id the value for jsh_account.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Name
     *
     * @return the value of jsh_account.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Name
     *
     * @param name the value for jsh_account.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.SerialNo
     *
     * @return the value of jsh_account.SerialNo
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withSerialno(String serialno) {
        this.setSerialno(serialno);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.SerialNo
     *
     * @param serialno the value for jsh_account.SerialNo
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.InitialAmount
     *
     * @return the value of jsh_account.InitialAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getInitialamount() {
        return initialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withInitialamount(BigDecimal initialamount) {
        this.setInitialamount(initialamount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.InitialAmount
     *
     * @param initialamount the value for jsh_account.InitialAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setInitialamount(BigDecimal initialamount) {
        this.initialamount = initialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.CurrentAmount
     *
     * @return the value of jsh_account.CurrentAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getCurrentamount() {
        return currentamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withCurrentamount(BigDecimal currentamount) {
        this.setCurrentamount(currentamount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.CurrentAmount
     *
     * @param currentamount the value for jsh_account.CurrentAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCurrentamount(BigDecimal currentamount) {
        this.currentamount = currentamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Remark
     *
     * @return the value of jsh_account.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Remark
     *
     * @param remark the value for jsh_account.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.IsDefault
     *
     * @return the value of jsh_account.IsDefault
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withIsdefault(Boolean isdefault) {
        this.setIsdefault(isdefault);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.IsDefault
     *
     * @param isdefault the value for jsh_account.IsDefault
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.tenant_id
     *
     * @return the value of jsh_account.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withTenantId(Long tenantId) {
        this.setTenantId(tenantId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.tenant_id
     *
     * @param tenantId the value for jsh_account.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.delete_Flag
     *
     * @return the value of jsh_account.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccount withDeleteFlag(String deleteFlag) {
        this.setDeleteFlag(deleteFlag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.delete_Flag
     *
     * @param deleteFlag the value for jsh_account.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_account
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
        sb.append(", name=").append(name);
        sb.append(", serialno=").append(serialno);
        sb.append(", initialamount=").append(initialamount);
        sb.append(", currentamount=").append(currentamount);
        sb.append(", remark=").append(remark);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}