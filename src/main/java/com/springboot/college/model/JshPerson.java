package com.springboot.college.model;

import java.io.Serializable;

public class JshPerson implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_person.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_person.Type
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_person.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_person.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_person.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_person.Id
     *
     * @return the value of jsh_person.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshPerson withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_person.Id
     *
     * @param id the value for jsh_person.Id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_person.Type
     *
     * @return the value of jsh_person.Type
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshPerson withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_person.Type
     *
     * @param type the value for jsh_person.Type
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_person.Name
     *
     * @return the value of jsh_person.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshPerson withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_person.Name
     *
     * @param name the value for jsh_person.Name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_person.tenant_id
     *
     * @return the value of jsh_person.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshPerson withTenantId(Long tenantId) {
        this.setTenantId(tenantId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_person.tenant_id
     *
     * @param tenantId the value for jsh_person.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_person.delete_Flag
     *
     * @return the value of jsh_person.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshPerson withDeleteFlag(String deleteFlag) {
        this.setDeleteFlag(deleteFlag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_person.delete_Flag
     *
     * @param deleteFlag the value for jsh_person.delete_Flag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_person
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
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}