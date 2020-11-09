package com.springboot.college.model;

import java.io.Serializable;
import java.util.Date;

public class ImgsInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.sysName
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String sysname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.imgType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String imgtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.imgSize
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String imgsize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.imgPath
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String imgpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.directoryId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String directoryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.tag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Integer tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.imgPathType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String imgpathtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.REMARK
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.CREATER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.CREATE_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.MODIFIER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.MODIFY_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.DISABLED
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String disabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imgs_info.VERSION
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.id
     *
     * @return the value of imgs_info.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.id
     *
     * @param id the value for imgs_info.id
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.name
     *
     * @return the value of imgs_info.name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.name
     *
     * @param name the value for imgs_info.name
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.sysName
     *
     * @return the value of imgs_info.sysName
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getSysname() {
        return sysname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withSysname(String sysname) {
        this.setSysname(sysname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.sysName
     *
     * @param sysname the value for imgs_info.sysName
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.imgType
     *
     * @return the value of imgs_info.imgType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getImgtype() {
        return imgtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withImgtype(String imgtype) {
        this.setImgtype(imgtype);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.imgType
     *
     * @param imgtype the value for imgs_info.imgType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setImgtype(String imgtype) {
        this.imgtype = imgtype == null ? null : imgtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.imgSize
     *
     * @return the value of imgs_info.imgSize
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getImgsize() {
        return imgsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withImgsize(String imgsize) {
        this.setImgsize(imgsize);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.imgSize
     *
     * @param imgsize the value for imgs_info.imgSize
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setImgsize(String imgsize) {
        this.imgsize = imgsize == null ? null : imgsize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.imgPath
     *
     * @return the value of imgs_info.imgPath
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withImgpath(String imgpath) {
        this.setImgpath(imgpath);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.imgPath
     *
     * @param imgpath the value for imgs_info.imgPath
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.directoryId
     *
     * @return the value of imgs_info.directoryId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDirectoryid() {
        return directoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withDirectoryid(String directoryid) {
        this.setDirectoryid(directoryid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.directoryId
     *
     * @param directoryid the value for imgs_info.directoryId
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDirectoryid(String directoryid) {
        this.directoryid = directoryid == null ? null : directoryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.tag
     *
     * @return the value of imgs_info.tag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Integer getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withTag(Integer tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.tag
     *
     * @param tag the value for imgs_info.tag
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setTag(Integer tag) {
        this.tag = tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.imgPathType
     *
     * @return the value of imgs_info.imgPathType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getImgpathtype() {
        return imgpathtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withImgpathtype(String imgpathtype) {
        this.setImgpathtype(imgpathtype);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.imgPathType
     *
     * @param imgpathtype the value for imgs_info.imgPathType
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setImgpathtype(String imgpathtype) {
        this.imgpathtype = imgpathtype == null ? null : imgpathtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.REMARK
     *
     * @return the value of imgs_info.REMARK
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.REMARK
     *
     * @param remark the value for imgs_info.REMARK
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.CREATER
     *
     * @return the value of imgs_info.CREATER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withCreater(String creater) {
        this.setCreater(creater);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.CREATER
     *
     * @param creater the value for imgs_info.CREATER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.CREATE_TIME
     *
     * @return the value of imgs_info.CREATE_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.CREATE_TIME
     *
     * @param createTime the value for imgs_info.CREATE_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.MODIFIER
     *
     * @return the value of imgs_info.MODIFIER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withModifier(String modifier) {
        this.setModifier(modifier);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.MODIFIER
     *
     * @param modifier the value for imgs_info.MODIFIER
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.MODIFY_TIME
     *
     * @return the value of imgs_info.MODIFY_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.MODIFY_TIME
     *
     * @param modifyTime the value for imgs_info.MODIFY_TIME
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.DISABLED
     *
     * @return the value of imgs_info.DISABLED
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withDisabled(String disabled) {
        this.setDisabled(disabled);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.DISABLED
     *
     * @param disabled the value for imgs_info.DISABLED
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled == null ? null : disabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imgs_info.VERSION
     *
     * @return the value of imgs_info.VERSION
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public ImgsInfo withVersion(String version) {
        this.setVersion(version);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imgs_info.VERSION
     *
     * @param version the value for imgs_info.VERSION
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs_info
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
        sb.append(", sysname=").append(sysname);
        sb.append(", imgtype=").append(imgtype);
        sb.append(", imgsize=").append(imgsize);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", directoryid=").append(directoryid);
        sb.append(", tag=").append(tag);
        sb.append(", imgpathtype=").append(imgpathtype);
        sb.append(", remark=").append(remark);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", disabled=").append(disabled);
        sb.append(", version=").append(version);
        sb.append("]");
        return sb.toString();
    }


}