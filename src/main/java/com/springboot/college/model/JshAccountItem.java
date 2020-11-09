package com.springboot.college.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class JshAccountItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.HeaderId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long headerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.AccountId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long accountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.InOutItemId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long inoutitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.EachAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal eachamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.Id
     *
     * @return the value of jsh_accountitem.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.Id
     *
     * @param id the value for jsh_accountitem.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.HeaderId
     *
     * @return the value of jsh_accountitem.HeaderId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getHeaderid() {
        return headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withHeaderid(Long headerid) {
        this.setHeaderid(headerid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.HeaderId
     *
     * @param headerid the value for jsh_accountitem.HeaderId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setHeaderid(Long headerid) {
        this.headerid = headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.AccountId
     *
     * @return the value of jsh_accountitem.AccountId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withAccountid(Long accountid) {
        this.setAccountid(accountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.AccountId
     *
     * @param accountid the value for jsh_accountitem.AccountId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.InOutItemId
     *
     * @return the value of jsh_accountitem.InOutItemId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getInoutitemid() {
        return inoutitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withInoutitemid(Long inoutitemid) {
        this.setInoutitemid(inoutitemid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.InOutItemId
     *
     * @param inoutitemid the value for jsh_accountitem.InOutItemId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setInoutitemid(Long inoutitemid) {
        this.inoutitemid = inoutitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.EachAmount
     *
     * @return the value of jsh_accountitem.EachAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getEachamount() {
        return eachamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withEachamount(BigDecimal eachamount) {
        this.setEachamount(eachamount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.EachAmount
     *
     * @param eachamount the value for jsh_accountitem.EachAmount
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setEachamount(BigDecimal eachamount) {
        this.eachamount = eachamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.Remark
     *
     * @return the value of jsh_accountitem.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.Remark
     *
     * @param remark the value for jsh_accountitem.Remark
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.tenant_id
     *
     * @return the value of jsh_accountitem.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withTenantId(Long tenantId) {
        this.setTenantId(tenantId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.tenant_id
     *
     * @param tenantId the value for jsh_accountitem.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.delete_Flag
     *
     * @return the value of jsh_accountitem.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshAccountItem withDeleteFlag(String deleteFlag) {
        this.setDeleteFlag(deleteFlag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.delete_Flag
     *
     * @param deleteFlag the value for jsh_accountitem.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
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
        sb.append(", headerid=").append(headerid);
        sb.append(", accountid=").append(accountid);
        sb.append(", inoutitemid=").append(inoutitemid);
        sb.append(", eachamount=").append(eachamount);
        sb.append(", remark=").append(remark);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}