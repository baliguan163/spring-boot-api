package com.company.project.model;

import javax.persistence.*;

@Table(name = "tian_mao_goods")
public class TianMaoGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "goods_1_category")
    private String goods1Category;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "platform_type")
    private String platformType;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_url")
    private String goodsUrl;

    @Column(name = "goods_pic_url")
    private String goodsPicUrl;

    @Column(name = "goods_price")
    private String goodsPrice;

    @Column(name = "income_rate")
    private String incomeRate;

    @Column(name = "sale_date")
    private String saleDate;

    private String denomination;

    @Column(name = "discount_coupon_price")
    private String discountCouponPrice;

    @Column(name = "discount_coupon_sum")
    private String discountCouponSum;

    @Column(name = "discount_coupon_residue")
    private String discountCouponResidue;

    @Column(name = "discount_coupon_begin_date")
    private String discountCouponBeginDate;

    @Column(name = "discount_coupon_end_date")
    private String discountCouponEndDate;

    @Column(name = "generalize_url")
    private String generalizeUrl;

    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return goods_1_category
     */
    public String getGoods1Category() {
        return goods1Category;
    }

    /**
     * @param goods1Category
     */
    public void setGoods1Category(String goods1Category) {
        this.goods1Category = goods1Category;
    }

    /**
     * @return shop_name
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * @return platform_type
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * @param platformType
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * @return goods_id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * @return goods_name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * @return goods_url
     */
    public String getGoodsUrl() {
        return goodsUrl;
    }

    /**
     * @param goodsUrl
     */
    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    /**
     * @return goods_pic_url
     */
    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    /**
     * @param goodsPicUrl
     */
    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
    }

    /**
     * @return goods_price
     */
    public String getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * @param goodsPrice
     */
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * @return income_rate
     */
    public String getIncomeRate() {
        return incomeRate;
    }

    /**
     * @param incomeRate
     */
    public void setIncomeRate(String incomeRate) {
        this.incomeRate = incomeRate;
    }

    /**
     * @return sale_date
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * @param saleDate
     */
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * @return denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * @param denomination
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    /**
     * @return discount_coupon_price
     */
    public String getDiscountCouponPrice() {
        return discountCouponPrice;
    }

    /**
     * @param discountCouponPrice
     */
    public void setDiscountCouponPrice(String discountCouponPrice) {
        this.discountCouponPrice = discountCouponPrice;
    }

    /**
     * @return discount_coupon_sum
     */
    public String getDiscountCouponSum() {
        return discountCouponSum;
    }

    /**
     * @param discountCouponSum
     */
    public void setDiscountCouponSum(String discountCouponSum) {
        this.discountCouponSum = discountCouponSum;
    }

    /**
     * @return discount_coupon_residue
     */
    public String getDiscountCouponResidue() {
        return discountCouponResidue;
    }

    /**
     * @param discountCouponResidue
     */
    public void setDiscountCouponResidue(String discountCouponResidue) {
        this.discountCouponResidue = discountCouponResidue;
    }

    /**
     * @return discount_coupon_begin_date
     */
    public String getDiscountCouponBeginDate() {
        return discountCouponBeginDate;
    }

    /**
     * @param discountCouponBeginDate
     */
    public void setDiscountCouponBeginDate(String discountCouponBeginDate) {
        this.discountCouponBeginDate = discountCouponBeginDate;
    }

    /**
     * @return discount_coupon_end_date
     */
    public String getDiscountCouponEndDate() {
        return discountCouponEndDate;
    }

    /**
     * @param discountCouponEndDate
     */
    public void setDiscountCouponEndDate(String discountCouponEndDate) {
        this.discountCouponEndDate = discountCouponEndDate;
    }

    /**
     * @return generalize_url
     */
    public String getGeneralizeUrl() {
        return generalizeUrl;
    }

    /**
     * @param generalizeUrl
     */
    public void setGeneralizeUrl(String generalizeUrl) {
        this.generalizeUrl = generalizeUrl;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}