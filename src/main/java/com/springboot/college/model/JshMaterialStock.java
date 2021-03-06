package com.springboot.college.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class JshMaterialStock implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.depot_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long depotId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private BigDecimal number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Long tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material_stock.delete_fag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String deleteFag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.id
     *
     * @return the value of jsh_material_stock.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.id
     *
     * @param id the value for jsh_material_stock.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.material_id
     *
     * @return the value of jsh_material_stock.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withMaterialId(Long materialId) {
        this.setMaterialId(materialId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.material_id
     *
     * @param materialId the value for jsh_material_stock.material_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.depot_id
     *
     * @return the value of jsh_material_stock.depot_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getDepotId() {
        return depotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withDepotId(Long depotId) {
        this.setDepotId(depotId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.depot_id
     *
     * @param depotId the value for jsh_material_stock.depot_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.number
     *
     * @return the value of jsh_material_stock.number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withNumber(BigDecimal number) {
        this.setNumber(number);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.number
     *
     * @param number the value for jsh_material_stock.number
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.tenant_id
     *
     * @return the value of jsh_material_stock.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withTenantId(Long tenantId) {
        this.setTenantId(tenantId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.tenant_id
     *
     * @param tenantId the value for jsh_material_stock.tenant_id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material_stock.delete_fag
     *
     * @return the value of jsh_material_stock.delete_fag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDeleteFag() {
        return deleteFag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public JshMaterialStock withDeleteFag(String deleteFag) {
        this.setDeleteFag(deleteFag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material_stock.delete_fag
     *
     * @param deleteFag the value for jsh_material_stock.delete_fag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDeleteFag(String deleteFag) {
        this.deleteFag = deleteFag == null ? null : deleteFag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material_stock
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
        sb.append(", depotId=").append(depotId);
        sb.append(", number=").append(number);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", deleteFag=").append(deleteFag);
        sb.append("]");
        return sb.toString();
    }
}