/**
 * CustomerSpecifiedLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Allows customer-specified control of label content.
 */
public class CustomerSpecifiedLabelDetail  implements java.io.Serializable {
    /* If omitted, no doc tab will be produced (i.e. default = former
     * NONE type). */
    private com.fedex.ship.stub.DocTabContent docTabContent;

    /* Defines any custom content to print on the label. */
    private com.fedex.ship.stub.CustomLabelDetail customContent;

    /* Defines additional data to print in the Configurable portion
     * of the label, this allows you to print the same type information on
     * the label that can also be printed on the doc tab. */
    private com.fedex.ship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries;

    /* Data to exclude from printing on the label. */
    private com.fedex.ship.stub.LabelMaskableDataType[] maskedData;

    private com.fedex.ship.stub.Localization termsAndConditionsLocalization;

    private com.fedex.ship.stub.AdditionalLabelsDetail[] additionalLabels;

    private org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount;

    public CustomerSpecifiedLabelDetail() {
    }

    public CustomerSpecifiedLabelDetail(
           com.fedex.ship.stub.DocTabContent docTabContent,
           com.fedex.ship.stub.CustomLabelDetail customContent,
           com.fedex.ship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries,
           com.fedex.ship.stub.LabelMaskableDataType[] maskedData,
           com.fedex.ship.stub.Localization termsAndConditionsLocalization,
           com.fedex.ship.stub.AdditionalLabelsDetail[] additionalLabels,
           org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount) {
           this.docTabContent = docTabContent;
           this.customContent = customContent;
           this.configurableReferenceEntries = configurableReferenceEntries;
           this.maskedData = maskedData;
           this.termsAndConditionsLocalization = termsAndConditionsLocalization;
           this.additionalLabels = additionalLabels;
           this.airWaybillSuppressionCount = airWaybillSuppressionCount;
    }


    /**
     * Gets the docTabContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @return docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public com.fedex.ship.stub.DocTabContent getDocTabContent() {
        return docTabContent;
    }


    /**
     * Sets the docTabContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @param docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public void setDocTabContent(com.fedex.ship.stub.DocTabContent docTabContent) {
        this.docTabContent = docTabContent;
    }


    /**
     * Gets the customContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @return customContent   * Defines any custom content to print on the label.
     */
    public com.fedex.ship.stub.CustomLabelDetail getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @param customContent   * Defines any custom content to print on the label.
     */
    public void setCustomContent(com.fedex.ship.stub.CustomLabelDetail customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the configurableReferenceEntries value for this CustomerSpecifiedLabelDetail.
     * 
     * @return configurableReferenceEntries   * Defines additional data to print in the Configurable portion
     * of the label, this allows you to print the same type information on
     * the label that can also be printed on the doc tab.
     */
    public com.fedex.ship.stub.ConfigurableLabelReferenceEntry[] getConfigurableReferenceEntries() {
        return configurableReferenceEntries;
    }


    /**
     * Sets the configurableReferenceEntries value for this CustomerSpecifiedLabelDetail.
     * 
     * @param configurableReferenceEntries   * Defines additional data to print in the Configurable portion
     * of the label, this allows you to print the same type information on
     * the label that can also be printed on the doc tab.
     */
    public void setConfigurableReferenceEntries(com.fedex.ship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries) {
        this.configurableReferenceEntries = configurableReferenceEntries;
    }

    public com.fedex.ship.stub.ConfigurableLabelReferenceEntry getConfigurableReferenceEntries(int i) {
        return this.configurableReferenceEntries[i];
    }

    public void setConfigurableReferenceEntries(int i, com.fedex.ship.stub.ConfigurableLabelReferenceEntry _value) {
        this.configurableReferenceEntries[i] = _value;
    }


    /**
     * Gets the maskedData value for this CustomerSpecifiedLabelDetail.
     * 
     * @return maskedData   * Data to exclude from printing on the label.
     */
    public com.fedex.ship.stub.LabelMaskableDataType[] getMaskedData() {
        return maskedData;
    }


    /**
     * Sets the maskedData value for this CustomerSpecifiedLabelDetail.
     * 
     * @param maskedData   * Data to exclude from printing on the label.
     */
    public void setMaskedData(com.fedex.ship.stub.LabelMaskableDataType[] maskedData) {
        this.maskedData = maskedData;
    }

    public com.fedex.ship.stub.LabelMaskableDataType getMaskedData(int i) {
        return this.maskedData[i];
    }

    public void setMaskedData(int i, com.fedex.ship.stub.LabelMaskableDataType _value) {
        this.maskedData[i] = _value;
    }


    /**
     * Gets the termsAndConditionsLocalization value for this CustomerSpecifiedLabelDetail.
     * 
     * @return termsAndConditionsLocalization
     */
    public com.fedex.ship.stub.Localization getTermsAndConditionsLocalization() {
        return termsAndConditionsLocalization;
    }


    /**
     * Sets the termsAndConditionsLocalization value for this CustomerSpecifiedLabelDetail.
     * 
     * @param termsAndConditionsLocalization
     */
    public void setTermsAndConditionsLocalization(com.fedex.ship.stub.Localization termsAndConditionsLocalization) {
        this.termsAndConditionsLocalization = termsAndConditionsLocalization;
    }


    /**
     * Gets the additionalLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @return additionalLabels
     */
    public com.fedex.ship.stub.AdditionalLabelsDetail[] getAdditionalLabels() {
        return additionalLabels;
    }


    /**
     * Sets the additionalLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @param additionalLabels
     */
    public void setAdditionalLabels(com.fedex.ship.stub.AdditionalLabelsDetail[] additionalLabels) {
        this.additionalLabels = additionalLabels;
    }

    public com.fedex.ship.stub.AdditionalLabelsDetail getAdditionalLabels(int i) {
        return this.additionalLabels[i];
    }

    public void setAdditionalLabels(int i, com.fedex.ship.stub.AdditionalLabelsDetail _value) {
        this.additionalLabels[i] = _value;
    }


    /**
     * Gets the airWaybillSuppressionCount value for this CustomerSpecifiedLabelDetail.
     * 
     * @return airWaybillSuppressionCount
     */
    public org.apache.axis.types.NonNegativeInteger getAirWaybillSuppressionCount() {
        return airWaybillSuppressionCount;
    }


    /**
     * Sets the airWaybillSuppressionCount value for this CustomerSpecifiedLabelDetail.
     * 
     * @param airWaybillSuppressionCount
     */
    public void setAirWaybillSuppressionCount(org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount) {
        this.airWaybillSuppressionCount = airWaybillSuppressionCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSpecifiedLabelDetail)) return false;
        CustomerSpecifiedLabelDetail other = (CustomerSpecifiedLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docTabContent==null && other.getDocTabContent()==null) || 
             (this.docTabContent!=null &&
              this.docTabContent.equals(other.getDocTabContent()))) &&
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              this.customContent.equals(other.getCustomContent()))) &&
            ((this.configurableReferenceEntries==null && other.getConfigurableReferenceEntries()==null) || 
             (this.configurableReferenceEntries!=null &&
              java.util.Arrays.equals(this.configurableReferenceEntries, other.getConfigurableReferenceEntries()))) &&
            ((this.maskedData==null && other.getMaskedData()==null) || 
             (this.maskedData!=null &&
              java.util.Arrays.equals(this.maskedData, other.getMaskedData()))) &&
            ((this.termsAndConditionsLocalization==null && other.getTermsAndConditionsLocalization()==null) || 
             (this.termsAndConditionsLocalization!=null &&
              this.termsAndConditionsLocalization.equals(other.getTermsAndConditionsLocalization()))) &&
            ((this.additionalLabels==null && other.getAdditionalLabels()==null) || 
             (this.additionalLabels!=null &&
              java.util.Arrays.equals(this.additionalLabels, other.getAdditionalLabels()))) &&
            ((this.airWaybillSuppressionCount==null && other.getAirWaybillSuppressionCount()==null) || 
             (this.airWaybillSuppressionCount!=null &&
              this.airWaybillSuppressionCount.equals(other.getAirWaybillSuppressionCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocTabContent() != null) {
            _hashCode += getDocTabContent().hashCode();
        }
        if (getCustomContent() != null) {
            _hashCode += getCustomContent().hashCode();
        }
        if (getConfigurableReferenceEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurableReferenceEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurableReferenceEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaskedData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaskedData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaskedData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTermsAndConditionsLocalization() != null) {
            _hashCode += getTermsAndConditionsLocalization().hashCode();
        }
        if (getAdditionalLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirWaybillSuppressionCount() != null) {
            _hashCode += getAirWaybillSuppressionCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSpecifiedLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "CustomerSpecifiedLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "DocTabContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "DocTabContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "CustomLabelDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurableReferenceEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "ConfigurableReferenceEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "ConfigurableLabelReferenceEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "MaskedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "LabelMaskableDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditionsLocalization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "TermsAndConditionsLocalization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "Localization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "AdditionalLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "AdditionalLabelsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airWaybillSuppressionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v7", "AirWaybillSuppressionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
