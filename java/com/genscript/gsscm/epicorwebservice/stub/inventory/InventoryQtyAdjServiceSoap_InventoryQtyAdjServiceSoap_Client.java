
package com.genscript.gsscm.epicorwebservice.stub.inventory;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Fri Jul 22 16:32:01 CST 2011
 * Generated source version: 2.2.6
 * 
 */

public final class InventoryQtyAdjServiceSoap_InventoryQtyAdjServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://epicor.com/webservices/", "InventoryQtyAdjService");

    private InventoryQtyAdjServiceSoap_InventoryQtyAdjServiceSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = InventoryQtyAdjService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        InventoryQtyAdjService ss = new InventoryQtyAdjService(wsdlURL, SERVICE_NAME);
        InventoryQtyAdjServiceSoap port = ss.getInventoryQtyAdjServiceSoap();  
        
        {
        System.out.println("Invoking validateSN...");
        java.lang.String _validateSN_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType _validateSN_ds = null;
        java.lang.String _validateSN_serialNumber = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _validateSN_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType> _validateSN_validateSNResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType>();
        javax.xml.ws.Holder<java.lang.Boolean> _validateSN_isVoided = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _validateSN_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.validateSN(_validateSN_companyID, _validateSN_ds, _validateSN_serialNumber, _validateSN_callContextIn, _validateSN_validateSNResult, _validateSN_isVoided, _validateSN_callContextOut);

        System.out.println("validateSN._validateSN_validateSNResult=" + _validateSN_validateSNResult.value);
        System.out.println("validateSN._validateSN_isVoided=" + _validateSN_isVoided.value);
        System.out.println("validateSN._validateSN_callContextOut=" + _validateSN_callContextOut.value);

        }
        {
        System.out.println("Invoking getSelectSerialNumbersParams...");
        java.lang.String _getSelectSerialNumbersParams_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType _getSelectSerialNumbersParams_ds = null;
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getSelectSerialNumbersParams_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.SelectSerialNumbersParamsDataSetType> _getSelectSerialNumbersParams_getSelectSerialNumbersParamsResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.SelectSerialNumbersParamsDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getSelectSerialNumbersParams_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getSelectSerialNumbersParams(_getSelectSerialNumbersParams_companyID, _getSelectSerialNumbersParams_ds, _getSelectSerialNumbersParams_callContextIn, _getSelectSerialNumbersParams_getSelectSerialNumbersParamsResult, _getSelectSerialNumbersParams_callContextOut);

        System.out.println("getSelectSerialNumbersParams._getSelectSerialNumbersParams_getSelectSerialNumbersParamsResult=" + _getSelectSerialNumbersParams_getSelectSerialNumbersParamsResult.value);
        System.out.println("getSelectSerialNumbersParams._getSelectSerialNumbersParams_callContextOut=" + _getSelectSerialNumbersParams_callContextOut.value);

        }
        {
        System.out.println("Invoking negativeInventoryTest...");
        java.lang.String _negativeInventoryTest_companyID = "";
        java.lang.String _negativeInventoryTest_pcPartNum = "";
        java.lang.String _negativeInventoryTest_pcWhseCode = "";
        java.lang.String _negativeInventoryTest_pcBinNum = "";
        java.lang.String _negativeInventoryTest_pcLotNum = "";
        java.lang.String _negativeInventoryTest_pcDimCode = "";
        java.math.BigDecimal _negativeInventoryTest_pdDimConvFactor = new java.math.BigDecimal("0");
        java.math.BigDecimal _negativeInventoryTest_pdTranQty = new java.math.BigDecimal("0");
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _negativeInventoryTest_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _negativeInventoryTest_negativeInventoryTestResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _negativeInventoryTest_pcNeqQtyAction = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _negativeInventoryTest_pcMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _negativeInventoryTest_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.negativeInventoryTest(_negativeInventoryTest_companyID, _negativeInventoryTest_pcPartNum, _negativeInventoryTest_pcWhseCode, _negativeInventoryTest_pcBinNum, _negativeInventoryTest_pcLotNum, _negativeInventoryTest_pcDimCode, _negativeInventoryTest_pdDimConvFactor, _negativeInventoryTest_pdTranQty, _negativeInventoryTest_callContextIn, _negativeInventoryTest_negativeInventoryTestResult, _negativeInventoryTest_pcNeqQtyAction, _negativeInventoryTest_pcMessage, _negativeInventoryTest_callContextOut);

        System.out.println("negativeInventoryTest._negativeInventoryTest_negativeInventoryTestResult=" + _negativeInventoryTest_negativeInventoryTestResult.value);
        System.out.println("negativeInventoryTest._negativeInventoryTest_pcNeqQtyAction=" + _negativeInventoryTest_pcNeqQtyAction.value);
        System.out.println("negativeInventoryTest._negativeInventoryTest_pcMessage=" + _negativeInventoryTest_pcMessage.value);
        System.out.println("negativeInventoryTest._negativeInventoryTest_callContextOut=" + _negativeInventoryTest_callContextOut.value);

        }
        {
        System.out.println("Invoking getMfgPartFromRowID...");
        java.lang.String _getMfgPartFromRowID_companyID = "";
        java.lang.String _getMfgPartFromRowID_ipRowType = "";
        java.lang.String _getMfgPartFromRowID_ipRowID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getMfgPartFromRowID_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _getMfgPartFromRowID_getMfgPartFromRowIDResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _getMfgPartFromRowID_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.Integer> _getMfgPartFromRowID_opMfgNum = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getMfgPartFromRowID_opMfgPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getMfgPartFromRowID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getMfgPartFromRowID(_getMfgPartFromRowID_companyID, _getMfgPartFromRowID_ipRowType, _getMfgPartFromRowID_ipRowID, _getMfgPartFromRowID_callContextIn, _getMfgPartFromRowID_getMfgPartFromRowIDResult, _getMfgPartFromRowID_opPartNum, _getMfgPartFromRowID_opMfgNum, _getMfgPartFromRowID_opMfgPartNum, _getMfgPartFromRowID_callContextOut);

        System.out.println("getMfgPartFromRowID._getMfgPartFromRowID_getMfgPartFromRowIDResult=" + _getMfgPartFromRowID_getMfgPartFromRowIDResult.value);
        System.out.println("getMfgPartFromRowID._getMfgPartFromRowID_opPartNum=" + _getMfgPartFromRowID_opPartNum.value);
        System.out.println("getMfgPartFromRowID._getMfgPartFromRowID_opMfgNum=" + _getMfgPartFromRowID_opMfgNum.value);
        System.out.println("getMfgPartFromRowID._getMfgPartFromRowID_opMfgPartNum=" + _getMfgPartFromRowID_opMfgPartNum.value);
        System.out.println("getMfgPartFromRowID._getMfgPartFromRowID_callContextOut=" + _getMfgPartFromRowID_callContextOut.value);

        }
        {
        System.out.println("Invoking getCustNumFromRowID...");
        java.lang.String _getCustNumFromRowID_companyID = "";
        java.lang.String _getCustNumFromRowID_ipRowType = "";
        java.lang.String _getCustNumFromRowID_ipRowID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getCustNumFromRowID_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _getCustNumFromRowID_getCustNumFromRowIDResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _getCustNumFromRowID_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.Integer> _getCustNumFromRowID_opCustNum = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getCustNumFromRowID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getCustNumFromRowID(_getCustNumFromRowID_companyID, _getCustNumFromRowID_ipRowType, _getCustNumFromRowID_ipRowID, _getCustNumFromRowID_callContextIn, _getCustNumFromRowID_getCustNumFromRowIDResult, _getCustNumFromRowID_opPartNum, _getCustNumFromRowID_opCustNum, _getCustNumFromRowID_callContextOut);

        System.out.println("getCustNumFromRowID._getCustNumFromRowID_getCustNumFromRowIDResult=" + _getCustNumFromRowID_getCustNumFromRowIDResult.value);
        System.out.println("getCustNumFromRowID._getCustNumFromRowID_opPartNum=" + _getCustNumFromRowID_opPartNum.value);
        System.out.println("getCustNumFromRowID._getCustNumFromRowID_opCustNum=" + _getCustNumFromRowID_opCustNum.value);
        System.out.println("getCustNumFromRowID._getCustNumFromRowID_callContextOut=" + _getCustNumFromRowID_callContextOut.value);

        }
        {
        System.out.println("Invoking setInventoryQtyAdj...");
        java.lang.String _setInventoryQtyAdj_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType _setInventoryQtyAdj_ds = null;
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _setInventoryQtyAdj_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType> _setInventoryQtyAdj_setInventoryQtyAdjResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType>();
        javax.xml.ws.Holder<java.lang.String> _setInventoryQtyAdj_partTranPKs = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _setInventoryQtyAdj_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.setInventoryQtyAdj(_setInventoryQtyAdj_companyID, _setInventoryQtyAdj_ds, _setInventoryQtyAdj_callContextIn, _setInventoryQtyAdj_setInventoryQtyAdjResult, _setInventoryQtyAdj_partTranPKs, _setInventoryQtyAdj_callContextOut);

        System.out.println("setInventoryQtyAdj._setInventoryQtyAdj_setInventoryQtyAdjResult=" + _setInventoryQtyAdj_setInventoryQtyAdjResult.value);
        System.out.println("setInventoryQtyAdj._setInventoryQtyAdj_partTranPKs=" + _setInventoryQtyAdj_partTranPKs.value);
        System.out.println("setInventoryQtyAdj._setInventoryQtyAdj_callContextOut=" + _setInventoryQtyAdj_callContextOut.value);

        }
        {
        System.out.println("Invoking getPartXRefInfo...");
        java.lang.String _getPartXRefInfo_companyID = "";
        java.lang.String _getPartXRefInfo_partNumVal = "";
        javax.xml.ws.Holder<java.lang.String> _getPartXRefInfo_partNum = new javax.xml.ws.Holder<java.lang.String>(_getPartXRefInfo_partNumVal);
        java.lang.String _getPartXRefInfo_sysRowID = "";
        java.lang.String _getPartXRefInfo_rowType = "";
        java.lang.String _getPartXRefInfo_uomCodeVal = "";
        javax.xml.ws.Holder<java.lang.String> _getPartXRefInfo_uomCode = new javax.xml.ws.Holder<java.lang.String>(_getPartXRefInfo_uomCodeVal);
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getPartXRefInfo_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _getPartXRefInfo_getPartXRefInfoResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _getPartXRefInfo_serialWarning = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _getPartXRefInfo_questionString = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.Boolean> _getPartXRefInfo_multipleMatch = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getPartXRefInfo_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getPartXRefInfo(_getPartXRefInfo_companyID, _getPartXRefInfo_partNum, _getPartXRefInfo_sysRowID, _getPartXRefInfo_rowType, _getPartXRefInfo_uomCode, _getPartXRefInfo_callContextIn, _getPartXRefInfo_getPartXRefInfoResult, _getPartXRefInfo_serialWarning, _getPartXRefInfo_questionString, _getPartXRefInfo_multipleMatch, _getPartXRefInfo_callContextOut);

        System.out.println("getPartXRefInfo._getPartXRefInfo_partNum=" + _getPartXRefInfo_partNum.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_uomCode=" + _getPartXRefInfo_uomCode.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_getPartXRefInfoResult=" + _getPartXRefInfo_getPartXRefInfoResult.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_serialWarning=" + _getPartXRefInfo_serialWarning.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_questionString=" + _getPartXRefInfo_questionString.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_multipleMatch=" + _getPartXRefInfo_multipleMatch.value);
        System.out.println("getPartXRefInfo._getPartXRefInfo_callContextOut=" + _getPartXRefInfo_callContextOut.value);

        }
        {
        System.out.println("Invoking getInventoryQtyAdjBrw...");
        java.lang.String _getInventoryQtyAdjBrw_companyID = "";
        java.lang.String _getInventoryQtyAdjBrw_partNum = "";
        java.lang.String _getInventoryQtyAdjBrw_wareHouseCode = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getInventoryQtyAdjBrw_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjBrwDataSetType> _getInventoryQtyAdjBrw_getInventoryQtyAdjBrwResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjBrwDataSetType>();
        javax.xml.ws.Holder<java.lang.String> _getInventoryQtyAdjBrw_primaryBin = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getInventoryQtyAdjBrw_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getInventoryQtyAdjBrw(_getInventoryQtyAdjBrw_companyID, _getInventoryQtyAdjBrw_partNum, _getInventoryQtyAdjBrw_wareHouseCode, _getInventoryQtyAdjBrw_callContextIn, _getInventoryQtyAdjBrw_getInventoryQtyAdjBrwResult, _getInventoryQtyAdjBrw_primaryBin, _getInventoryQtyAdjBrw_callContextOut);

        System.out.println("getInventoryQtyAdjBrw._getInventoryQtyAdjBrw_getInventoryQtyAdjBrwResult=" + _getInventoryQtyAdjBrw_getInventoryQtyAdjBrwResult.value);
        System.out.println("getInventoryQtyAdjBrw._getInventoryQtyAdjBrw_primaryBin=" + _getInventoryQtyAdjBrw_primaryBin.value);
        System.out.println("getInventoryQtyAdjBrw._getInventoryQtyAdjBrw_callContextOut=" + _getInventoryQtyAdjBrw_callContextOut.value);

        }
        {
        System.out.println("Invoking getInventoryQtyAdj...");
        java.lang.String _getInventoryQtyAdj_companyID = "";
        java.lang.String _getInventoryQtyAdj_partnumber = "";
        java.lang.String _getInventoryQtyAdj_uomCode = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getInventoryQtyAdj_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType> _getInventoryQtyAdj_getInventoryQtyAdjResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getInventoryQtyAdj_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getInventoryQtyAdj(_getInventoryQtyAdj_companyID, _getInventoryQtyAdj_partnumber, _getInventoryQtyAdj_uomCode, _getInventoryQtyAdj_callContextIn, _getInventoryQtyAdj_getInventoryQtyAdjResult, _getInventoryQtyAdj_callContextOut);

        System.out.println("getInventoryQtyAdj._getInventoryQtyAdj_getInventoryQtyAdjResult=" + _getInventoryQtyAdj_getInventoryQtyAdjResult.value);
        System.out.println("getInventoryQtyAdj._getInventoryQtyAdj_callContextOut=" + _getInventoryQtyAdj_callContextOut.value);

        }
        {
        System.out.println("Invoking checkSN...");
        java.lang.String _checkSN_companyID = "";
        java.lang.String _checkSN_partNum = "";
        java.lang.String _checkSN_warehouseCode = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _checkSN_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _checkSN_checkSNResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.Boolean> _checkSN_serialNumbersRequired = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _checkSN_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.checkSN(_checkSN_companyID, _checkSN_partNum, _checkSN_warehouseCode, _checkSN_callContextIn, _checkSN_checkSNResult, _checkSN_serialNumbersRequired, _checkSN_callContextOut);

        System.out.println("checkSN._checkSN_checkSNResult=" + _checkSN_checkSNResult.value);
        System.out.println("checkSN._checkSN_serialNumbersRequired=" + _checkSN_serialNumbersRequired.value);
        System.out.println("checkSN._checkSN_callContextOut=" + _checkSN_callContextOut.value);

        }
        {
        System.out.println("Invoking preSetInventoryQtyAdj...");
        java.lang.String _preSetInventoryQtyAdj_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType _preSetInventoryQtyAdj_ds = null;
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _preSetInventoryQtyAdj_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType> _preSetInventoryQtyAdj_preSetInventoryQtyAdjResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.InventoryQtyAdjDataSetType>();
        javax.xml.ws.Holder<java.lang.Boolean> _preSetInventoryQtyAdj_requiresUserInput = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _preSetInventoryQtyAdj_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.preSetInventoryQtyAdj(_preSetInventoryQtyAdj_companyID, _preSetInventoryQtyAdj_ds, _preSetInventoryQtyAdj_callContextIn, _preSetInventoryQtyAdj_preSetInventoryQtyAdjResult, _preSetInventoryQtyAdj_requiresUserInput, _preSetInventoryQtyAdj_callContextOut);

        System.out.println("preSetInventoryQtyAdj._preSetInventoryQtyAdj_preSetInventoryQtyAdjResult=" + _preSetInventoryQtyAdj_preSetInventoryQtyAdjResult.value);
        System.out.println("preSetInventoryQtyAdj._preSetInventoryQtyAdj_requiresUserInput=" + _preSetInventoryQtyAdj_requiresUserInput.value);
        System.out.println("preSetInventoryQtyAdj._preSetInventoryQtyAdj_callContextOut=" + _preSetInventoryQtyAdj_callContextOut.value);

        }
        {
        System.out.println("Invoking findPart...");
        java.lang.String _findPart_companyID = "";
        java.lang.String _findPart_ipPartNum = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _findPart_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _findPart_findPartResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _findPart_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findPart_opUOM = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findPart_opMatchType = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _findPart_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.findPart(_findPart_companyID, _findPart_ipPartNum, _findPart_callContextIn, _findPart_findPartResult, _findPart_opPartNum, _findPart_opUOM, _findPart_opMatchType, _findPart_callContextOut);

        System.out.println("findPart._findPart_findPartResult=" + _findPart_findPartResult.value);
        System.out.println("findPart._findPart_opPartNum=" + _findPart_opPartNum.value);
        System.out.println("findPart._findPart_opUOM=" + _findPart_opUOM.value);
        System.out.println("findPart._findPart_opMatchType=" + _findPart_opMatchType.value);
        System.out.println("findPart._findPart_callContextOut=" + _findPart_callContextOut.value);

        }
        {
        System.out.println("Invoking kitPartStatus...");
        java.lang.String _kitPartStatus_companyID = "";
        java.lang.String _kitPartStatus_partNum = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _kitPartStatus_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _kitPartStatus_kitPartStatusResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _kitPartStatus_kitMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _kitPartStatus_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.kitPartStatus(_kitPartStatus_companyID, _kitPartStatus_partNum, _kitPartStatus_callContextIn, _kitPartStatus_kitPartStatusResult, _kitPartStatus_kitMessage, _kitPartStatus_callContextOut);

        System.out.println("kitPartStatus._kitPartStatus_kitPartStatusResult=" + _kitPartStatus_kitPartStatusResult.value);
        System.out.println("kitPartStatus._kitPartStatus_kitMessage=" + _kitPartStatus_kitMessage.value);
        System.out.println("kitPartStatus._kitPartStatus_callContextOut=" + _kitPartStatus_callContextOut.value);

        }
        {
        System.out.println("Invoking getPartFromRowID...");
        java.lang.String _getPartFromRowID_companyID = "";
        java.lang.String _getPartFromRowID_ipRowType = "";
        java.lang.String _getPartFromRowID_ipRowID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getPartFromRowID_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _getPartFromRowID_getPartFromRowIDResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _getPartFromRowID_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _getPartFromRowID_opUOM = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getPartFromRowID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getPartFromRowID(_getPartFromRowID_companyID, _getPartFromRowID_ipRowType, _getPartFromRowID_ipRowID, _getPartFromRowID_callContextIn, _getPartFromRowID_getPartFromRowIDResult, _getPartFromRowID_opPartNum, _getPartFromRowID_opUOM, _getPartFromRowID_callContextOut);

        System.out.println("getPartFromRowID._getPartFromRowID_getPartFromRowIDResult=" + _getPartFromRowID_getPartFromRowIDResult.value);
        System.out.println("getPartFromRowID._getPartFromRowID_opPartNum=" + _getPartFromRowID_opPartNum.value);
        System.out.println("getPartFromRowID._getPartFromRowID_opUOM=" + _getPartFromRowID_opUOM.value);
        System.out.println("getPartFromRowID._getPartFromRowID_callContextOut=" + _getPartFromRowID_callContextOut.value);

        }
        {
        System.out.println("Invoking getAvailTranDocTypes...");
        java.lang.String _getAvailTranDocTypes_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _getAvailTranDocTypes_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _getAvailTranDocTypes_getAvailTranDocTypesResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _getAvailTranDocTypes_listAvailTranDocTypes = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _getAvailTranDocTypes_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.getAvailTranDocTypes(_getAvailTranDocTypes_companyID, _getAvailTranDocTypes_callContextIn, _getAvailTranDocTypes_getAvailTranDocTypesResult, _getAvailTranDocTypes_listAvailTranDocTypes, _getAvailTranDocTypes_callContextOut);

        System.out.println("getAvailTranDocTypes._getAvailTranDocTypes_getAvailTranDocTypesResult=" + _getAvailTranDocTypes_getAvailTranDocTypesResult.value);
        System.out.println("getAvailTranDocTypes._getAvailTranDocTypes_listAvailTranDocTypes=" + _getAvailTranDocTypes_listAvailTranDocTypes.value);
        System.out.println("getAvailTranDocTypes._getAvailTranDocTypes_callContextOut=" + _getAvailTranDocTypes_callContextOut.value);

        }
        {
        System.out.println("Invoking findPartAndGetRowID...");
        java.lang.String _findPartAndGetRowID_companyID = "";
        java.lang.String _findPartAndGetRowID_ipPartNum = "";
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _findPartAndGetRowID_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _findPartAndGetRowID_findPartAndGetRowIDResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _findPartAndGetRowID_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findPartAndGetRowID_opUOM = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findPartAndGetRowID_opMatchType = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findPartAndGetRowID_opRowID = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _findPartAndGetRowID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.findPartAndGetRowID(_findPartAndGetRowID_companyID, _findPartAndGetRowID_ipPartNum, _findPartAndGetRowID_callContextIn, _findPartAndGetRowID_findPartAndGetRowIDResult, _findPartAndGetRowID_opPartNum, _findPartAndGetRowID_opUOM, _findPartAndGetRowID_opMatchType, _findPartAndGetRowID_opRowID, _findPartAndGetRowID_callContextOut);

        System.out.println("findPartAndGetRowID._findPartAndGetRowID_findPartAndGetRowIDResult=" + _findPartAndGetRowID_findPartAndGetRowIDResult.value);
        System.out.println("findPartAndGetRowID._findPartAndGetRowID_opPartNum=" + _findPartAndGetRowID_opPartNum.value);
        System.out.println("findPartAndGetRowID._findPartAndGetRowID_opUOM=" + _findPartAndGetRowID_opUOM.value);
        System.out.println("findPartAndGetRowID._findPartAndGetRowID_opMatchType=" + _findPartAndGetRowID_opMatchType.value);
        System.out.println("findPartAndGetRowID._findPartAndGetRowID_opRowID=" + _findPartAndGetRowID_opRowID.value);
        System.out.println("findPartAndGetRowID._findPartAndGetRowID_callContextOut=" + _findPartAndGetRowID_callContextOut.value);

        }
        {
        System.out.println("Invoking findFirstPart...");
        java.lang.String _findFirstPart_companyID = "";
        java.lang.String _findFirstPart_ipPartNum = "";
        int _findFirstPart_ipCustNum = 0;
        com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType _findFirstPart_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _findFirstPart_findFirstPartResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _findFirstPart_opPartNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findFirstPart_opUOM = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findFirstPart_opMatchType = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _findFirstPart_opRowID = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType> _findFirstPart_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.inventory.CallContextDataSetType>();
        port.findFirstPart(_findFirstPart_companyID, _findFirstPart_ipPartNum, _findFirstPart_ipCustNum, _findFirstPart_callContextIn, _findFirstPart_findFirstPartResult, _findFirstPart_opPartNum, _findFirstPart_opUOM, _findFirstPart_opMatchType, _findFirstPart_opRowID, _findFirstPart_callContextOut);

        System.out.println("findFirstPart._findFirstPart_findFirstPartResult=" + _findFirstPart_findFirstPartResult.value);
        System.out.println("findFirstPart._findFirstPart_opPartNum=" + _findFirstPart_opPartNum.value);
        System.out.println("findFirstPart._findFirstPart_opUOM=" + _findFirstPart_opUOM.value);
        System.out.println("findFirstPart._findFirstPart_opMatchType=" + _findFirstPart_opMatchType.value);
        System.out.println("findFirstPart._findFirstPart_opRowID=" + _findFirstPart_opRowID.value);
        System.out.println("findFirstPart._findFirstPart_callContextOut=" + _findFirstPart_callContextOut.value);

        }

        System.exit(0);
    }

}
