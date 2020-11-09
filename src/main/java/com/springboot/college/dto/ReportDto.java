package com.springboot.college.dto;

import java.io.Serializable;

public class ReportDto implements Serializable {


    public ReportDto() {
    }

    public ReportDto(String channel, String promoType, String offerId, String dept, String category, String fineline, String upc, String upcDesc, String city, String storeId, String costCenter, String discountType, String vendorNbr, String vendorNbr9, String vendorName, String units, String discount, String merchSales, String compensationNumber, String compensationRatio, String compensationTotal, String beginDate, String endDate, String updateTime) {
        this.channel = channel;
        this.promoType = promoType;

        this.offerId = offerId;
        this.dept = dept;
        this.category = category;
        this.fineline = fineline;
        this.upc = upc;
        this.upcDesc = upcDesc;
        this.city = city;
        this.storeId = storeId;
        this.costCenter = costCenter;
        this.discountType = discountType;
        this.vendorNbr = vendorNbr;
        this.vendorNbr9 = vendorNbr9;
        this.vendorName = vendorName;
        this.units = units;
        this.discount = discount;
        this.merchSales = merchSales;
        this.compensationNumber = compensationNumber;
        this.compensationRatio = compensationRatio;
        this.compensationTotal = compensationTotal;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.updateTime = updateTime;
    }

    private String channel;
    private String promoType;
    private String offerId;
    private String dept;
    private String category;
    private String fineline;
    private String upc;
    private String upcDesc;
    private String city;
    private String storeId;
    private String costCenter;
    private String discountType;
    private String vendorNbr;
    private String vendorNbr9;
    private String vendorName;
    private String units;
    private String discount;
    private String merchSales;
    private String compensationNumber;
    private String compensationRatio;
    private String compensationTotal;
    private String beginDate;
    private String endDate;
    private String updateTime;

    /* not database model filed start */

//    private String datePart;

    /* not database model filed end */

    public ReportDto(String promoType, String offerId ) {
        this.promoType = promoType;
        this.offerId = offerId;

    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getFineline() {
        return fineline;
    }

    public void setFineline(String fineline) {
        this.fineline = fineline;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpcDesc() {
        return upcDesc;
    }

    public void setUpcDesc(String upcDesc) {
        this.upcDesc = upcDesc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getVendorNbr() {
        return vendorNbr;
    }

    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr;
    }

    public String getVendorNbr9() {
        return vendorNbr9;
    }

    public void setVendorNbr9(String vendorNbr9) {
        this.vendorNbr9 = vendorNbr9;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMerchSales() {
        return merchSales;
    }

    public void setMerchSales(String merchSales) {
        this.merchSales = merchSales;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompensationNumber() {
        return compensationNumber;
    }

    public void setCompensationNumber(String compensationNumber) {
        this.compensationNumber = compensationNumber;
    }

    public String getCompensationRatio() {
        return compensationRatio;
    }

    public void setCompensationRatio(String compensationRatio) {
        this.compensationRatio = compensationRatio;
    }

    public String getCompensationTotal() {
        return compensationTotal;
    }

    public void setCompensationTotal(String compensationTotal) {
        this.compensationTotal = compensationTotal;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /* Setter and Getter */


}
