package com.genscript.gsscm.quote.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.genscript.core.orm.hibernate.BaseEntity;

/**
 * The persistent class for the quote_plasmid_preparation database table.
 * 
 * @author WANGSF
 */
@Entity
@Table(name="quote_plasmid_preparation", catalog="order")
public class QuotePlasmidPreparation extends BaseEntity {
	@Id
	private Integer quoteItemId;
	private String additionalAnalysis;
	private String antibioticResistance;
	private String copyNumber;
	private String geneUsage;
	private Integer quoteNo;
	private String otherDescription;
    @Lob()
	private String otherRequirement;
	private String plasmidName;
	private Integer plasmidSize;
	private BigDecimal prepWeight;
	private String prepWtUom;
	private String qualityGrade;
	private String readingFrame;
	private String seqMapDocFlag;
	private String startingMaterical;
	private String storageCondition;
	private String restrictionAnalysis;
	private String fragment;
	private String desiredBuffer;
	private String typicalYield;
	private String aliquotSamples;
	private String bioBurdenAssay;
	private String customSequencing;
	private String requiredConcentration;
	private String comments;
	private String serviceDocFlag;

    @Lob()
	private String sequence;
    
    private String cloningReadyFlag;
    private String accessionNo;

	public String getAntibioticResistance() {
		return antibioticResistance;
	}

	public void setAntibioticResistance(String antibioticResistance) {
		this.antibioticResistance = antibioticResistance;
	}

	public String getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(String copyNumber) {
		this.copyNumber = copyNumber;
	}

	public String getGeneUsage() {
		return geneUsage;
	}

	public void setGeneUsage(String geneUsage) {
		this.geneUsage = geneUsage;
	}

	public String getOtherDescription() {
		return otherDescription;
	}

	public void setOtherDescription(String otherDescription) {
		this.otherDescription = otherDescription;
	}

	public String getOtherRequirement() {
		return otherRequirement;
	}

	public void setOtherRequirement(String otherRequirement) {
		this.otherRequirement = otherRequirement;
	}

	public String getPlasmidName() {
		return plasmidName;
	}

	public void setPlasmidName(String plasmidName) {
		this.plasmidName = plasmidName;
	}

	public Integer getPlasmidSize() {
		return plasmidSize;
	}

	public void setPlasmidSize(Integer plasmidSize) {
		this.plasmidSize = plasmidSize;
	}

	public BigDecimal getPrepWeight() {
		return prepWeight;
	}

	public void setPrepWeight(BigDecimal prepWeight) {
		this.prepWeight = prepWeight;
	}

	public String getPrepWtUom() {
		return prepWtUom;
	}

	public void setPrepWtUom(String prepWtUom) {
		this.prepWtUom = prepWtUom;
	}

	public String getQualityGrade() {
		return qualityGrade;
	}

	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}

	public String getReadingFrame() {
		return readingFrame;
	}

	public void setReadingFrame(String readingFrame) {
		this.readingFrame = readingFrame;
	}

	public String getSeqMapDocFlag() {
		return seqMapDocFlag;
	}

	public void setSeqMapDocFlag(String seqMapDocFlag) {
		this.seqMapDocFlag = seqMapDocFlag;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Integer getQuoteItemId() {
		return quoteItemId;
	}

	public void setQuoteItemId(Integer quoteItemId) {
		this.quoteItemId = quoteItemId;
	}

	public Integer getQuoteNo() {
		return quoteNo;
	}

	public void setQuoteNo(Integer quoteNo) {
		this.quoteNo = quoteNo;
	}

	public String getCloningReadyFlag() {
		return cloningReadyFlag;
	}

	public void setCloningReadyFlag(String cloningReadyFlag) {
		this.cloningReadyFlag = cloningReadyFlag;
	}

	public String getAccessionNo() {
		return accessionNo;
	}

	public void setAccessionNo(String accessionNo) {
		this.accessionNo = accessionNo;
	}

	public String getAdditionalAnalysis() {
		return additionalAnalysis;
	}

	public void setAdditionalAnalysis(String additionalAnalysis) {
		this.additionalAnalysis = additionalAnalysis;
	}

	public String getStartingMaterical() {
		return startingMaterical;
	}

	public void setStartingMaterical(String startingMaterical) {
		this.startingMaterical = startingMaterical;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

	public String getRestrictionAnalysis() {
		return restrictionAnalysis;
	}

	public void setRestrictionAnalysis(String restrictionAnalysis) {
		this.restrictionAnalysis = restrictionAnalysis;
	}

	public String getFragment() {
		return fragment;
	}

	public void setFragment(String fragment) {
		this.fragment = fragment;
	}

	public String getDesiredBuffer() {
		return desiredBuffer;
	}

	public void setDesiredBuffer(String desiredBuffer) {
		this.desiredBuffer = desiredBuffer;
	}

	public String getTypicalYield() {
		return typicalYield;
	}

	public void setTypicalYield(String typicalYield) {
		this.typicalYield = typicalYield;
	}

	public String getAliquotSamples() {
		return aliquotSamples;
	}

	public void setAliquotSamples(String aliquotSamples) {
		this.aliquotSamples = aliquotSamples;
	}

	public String getBioBurdenAssay() {
		return bioBurdenAssay;
	}

	public void setBioBurdenAssay(String bioBurdenAssay) {
		this.bioBurdenAssay = bioBurdenAssay;
	}

	public String getCustomSequencing() {
		return customSequencing;
	}

	public void setCustomSequencing(String customSequencing) {
		this.customSequencing = customSequencing;
	}

	public String getRequiredConcentration() {
		return requiredConcentration;
	}

	public void setRequiredConcentration(String requiredConcentration) {
		this.requiredConcentration = requiredConcentration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getServiceDocFlag() {
		return serviceDocFlag;
	}

	public void setServiceDocFlag(String serviceDocFlag) {
		this.serviceDocFlag = serviceDocFlag;
	}
}
