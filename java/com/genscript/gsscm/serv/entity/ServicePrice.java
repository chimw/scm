package com.genscript.gsscm.serv.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *ServicePrice
 * 
 * 
 * @author Wangsf
 */
@Entity
@Table(name = "service_price", catalog="product")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ServicePrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7909503879716501002L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "price_id")
	private Integer priceId;
	private Integer serviceId;
	private Integer categoryId;
	private String catalogId;
	private String status;
	private Double standardPrice;
	private Double listPrice;
	private Double limitPrice;
	private Integer priceRuleGroup;
	@Column(insertable=true,updatable=false)
	private Date creationDate = new Date();
	@Column(insertable=true,updatable=false)
	private Integer createdBy;
	private Date modifyDate = new Date();
	private Integer modifiedBy;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public Double getLimitPrice() {
		return limitPrice;
	}
	public void setLimitPrice(Double limitPrice) {
		this.limitPrice = limitPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public Double getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}
	public Double getListPrice() {
		return listPrice;
	}
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Integer getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Integer getPriceRuleGroup() {
		return priceRuleGroup;
	}
	public void setPriceRuleGroup(Integer priceRuleGroup) {
		this.priceRuleGroup = priceRuleGroup;
	}
}
