
package com.genscript.gsscm.epicorwebservice.stub.lot;

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
 * Wed Aug 24 10:20:01 CST 2011
 * Generated source version: 2.2.6
 * 
 */

public final class LotSelectUpdateServiceSoap_LotSelectUpdateServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://epicor.com/webservices/", "LotSelectUpdateService");

    private LotSelectUpdateServiceSoap_LotSelectUpdateServiceSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = LotSelectUpdateService.WSDL_LOCATION;
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
      
        LotSelectUpdateService ss = new LotSelectUpdateService(wsdlURL, SERVICE_NAME);
        LotSelectUpdateServiceSoap port = ss.getLotSelectUpdateServiceSoap12();  
        
        {
        System.out.println("Invoking update...");
        java.lang.String _update_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType _update_lotSelectUpdateData = null;
        boolean _update_continueProcessingOnError = false;
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _update_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _update_updateResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<java.lang.Boolean> _update_errorsOccurred = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _update_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.update(_update_companyID, _update_lotSelectUpdateData, _update_continueProcessingOnError, _update_callContextIn, _update_updateResult, _update_errorsOccurred, _update_callContextOut);

        System.out.println("update._update_updateResult=" + _update_updateResult.value);
        System.out.println("update._update_errorsOccurred=" + _update_errorsOccurred.value);
        System.out.println("update._update_callContextOut=" + _update_callContextOut.value);

        }
        {
        System.out.println("Invoking getByID...");
        java.lang.String _getByID_companyID = "";
        java.lang.String _getByID_partNum = "";
        java.lang.String _getByID_lotNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _getByID_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _getByID_getByIDResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _getByID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.getByID(_getByID_companyID, _getByID_partNum, _getByID_lotNum, _getByID_callContextIn, _getByID_getByIDResult, _getByID_callContextOut);

        System.out.println("getByID._getByID_getByIDResult=" + _getByID_getByIDResult.value);
        System.out.println("getByID._getByID_callContextOut=" + _getByID_callContextOut.value);

        }
        {
        System.out.println("Invoking checkDupLotNum...");
        java.lang.String _checkDupLotNum_companyID = "";
        java.lang.String _checkDupLotNum_vLotNum = "";
        java.lang.String _checkDupLotNum_vPartNum = "";
        java.lang.String _checkDupLotNum_vRowid = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _checkDupLotNum_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _checkDupLotNum_checkDupLotNumResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _checkDupLotNum_vMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _checkDupLotNum_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.checkDupLotNum(_checkDupLotNum_companyID, _checkDupLotNum_vLotNum, _checkDupLotNum_vPartNum, _checkDupLotNum_vRowid, _checkDupLotNum_callContextIn, _checkDupLotNum_checkDupLotNumResult, _checkDupLotNum_vMessage, _checkDupLotNum_callContextOut);

        System.out.println("checkDupLotNum._checkDupLotNum_checkDupLotNumResult=" + _checkDupLotNum_checkDupLotNumResult.value);
        System.out.println("checkDupLotNum._checkDupLotNum_vMessage=" + _checkDupLotNum_vMessage.value);
        System.out.println("checkDupLotNum._checkDupLotNum_callContextOut=" + _checkDupLotNum_callContextOut.value);

        }
        {
        System.out.println("Invoking getNewPartLot...");
        java.lang.String _getNewPartLot_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType _getNewPartLot_ds = null;
        java.lang.String _getNewPartLot_partNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _getNewPartLot_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _getNewPartLot_getNewPartLotResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _getNewPartLot_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.getNewPartLot(_getNewPartLot_companyID, _getNewPartLot_ds, _getNewPartLot_partNum, _getNewPartLot_callContextIn, _getNewPartLot_getNewPartLotResult, _getNewPartLot_callContextOut);

        System.out.println("getNewPartLot._getNewPartLot_getNewPartLotResult=" + _getNewPartLot_getNewPartLotResult.value);
        System.out.println("getNewPartLot._getNewPartLot_callContextOut=" + _getNewPartLot_callContextOut.value);

        }
        {
        System.out.println("Invoking deleteByID...");
        java.lang.String _deleteByID_companyID = "";
        java.lang.String _deleteByID_partNum = "";
        java.lang.String _deleteByID_lotNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _deleteByID_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _deleteByID_deleteByIDResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _deleteByID_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.deleteByID(_deleteByID_companyID, _deleteByID_partNum, _deleteByID_lotNum, _deleteByID_callContextIn, _deleteByID_deleteByIDResult, _deleteByID_callContextOut);

        System.out.println("deleteByID._deleteByID_deleteByIDResult=" + _deleteByID_deleteByIDResult.value);
        System.out.println("deleteByID._deleteByID_callContextOut=" + _deleteByID_callContextOut.value);

        }
        {
        System.out.println("Invoking getNewPartLotAttch...");
        java.lang.String _getNewPartLotAttch_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType _getNewPartLotAttch_ds = null;
        java.lang.String _getNewPartLotAttch_partNum = "";
        java.lang.String _getNewPartLotAttch_lotNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _getNewPartLotAttch_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _getNewPartLotAttch_getNewPartLotAttchResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _getNewPartLotAttch_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.getNewPartLotAttch(_getNewPartLotAttch_companyID, _getNewPartLotAttch_ds, _getNewPartLotAttch_partNum, _getNewPartLotAttch_lotNum, _getNewPartLotAttch_callContextIn, _getNewPartLotAttch_getNewPartLotAttchResult, _getNewPartLotAttch_callContextOut);

        System.out.println("getNewPartLotAttch._getNewPartLotAttch_getNewPartLotAttchResult=" + _getNewPartLotAttch_getNewPartLotAttchResult.value);
        System.out.println("getNewPartLotAttch._getNewPartLotAttch_callContextOut=" + _getNewPartLotAttch_callContextOut.value);

        }
        {
        System.out.println("Invoking chkForNeedsLotAttrs...");
        java.lang.String _chkForNeedsLotAttrs_companyID = "";
        java.lang.String _chkForNeedsLotAttrs_pcPartNum = "";
        java.lang.String _chkForNeedsLotAttrs_pcLotNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _chkForNeedsLotAttrs_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _chkForNeedsLotAttrs_chkForNeedsLotAttrsResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.Boolean> _chkForNeedsLotAttrs_needsLotAttrs = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _chkForNeedsLotAttrs_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.chkForNeedsLotAttrs(_chkForNeedsLotAttrs_companyID, _chkForNeedsLotAttrs_pcPartNum, _chkForNeedsLotAttrs_pcLotNum, _chkForNeedsLotAttrs_callContextIn, _chkForNeedsLotAttrs_chkForNeedsLotAttrsResult, _chkForNeedsLotAttrs_needsLotAttrs, _chkForNeedsLotAttrs_callContextOut);

        System.out.println("chkForNeedsLotAttrs._chkForNeedsLotAttrs_chkForNeedsLotAttrsResult=" + _chkForNeedsLotAttrs_chkForNeedsLotAttrsResult.value);
        System.out.println("chkForNeedsLotAttrs._chkForNeedsLotAttrs_needsLotAttrs=" + _chkForNeedsLotAttrs_needsLotAttrs.value);
        System.out.println("chkForNeedsLotAttrs._chkForNeedsLotAttrs_callContextOut=" + _chkForNeedsLotAttrs_callContextOut.value);

        }
        {
        System.out.println("Invoking generateNewLotNum...");
        java.lang.String _generateNewLotNum_companyID = "";
        java.lang.String _generateNewLotNum_vPartNum = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _generateNewLotNum_callContextIn = null;
        javax.xml.ws.Holder<java.lang.Boolean> _generateNewLotNum_generateNewLotNumResult = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.String> _generateNewLotNum_vNewLotNum = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _generateNewLotNum_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.generateNewLotNum(_generateNewLotNum_companyID, _generateNewLotNum_vPartNum, _generateNewLotNum_callContextIn, _generateNewLotNum_generateNewLotNumResult, _generateNewLotNum_vNewLotNum, _generateNewLotNum_callContextOut);

        System.out.println("generateNewLotNum._generateNewLotNum_generateNewLotNumResult=" + _generateNewLotNum_generateNewLotNumResult.value);
        System.out.println("generateNewLotNum._generateNewLotNum_vNewLotNum=" + _generateNewLotNum_vNewLotNum.value);
        System.out.println("generateNewLotNum._generateNewLotNum_callContextOut=" + _generateNewLotNum_callContextOut.value);

        }
        {
        System.out.println("Invoking validateLotAttributes...");
        java.lang.String _validateLotAttributes_companyID = "";
        com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType _validateLotAttributes_ds = null;
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _validateLotAttributes_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _validateLotAttributes_validateLotAttributesResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _validateLotAttributes_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.validateLotAttributes(_validateLotAttributes_companyID, _validateLotAttributes_ds, _validateLotAttributes_callContextIn, _validateLotAttributes_validateLotAttributesResult, _validateLotAttributes_callContextOut);

        System.out.println("validateLotAttributes._validateLotAttributes_validateLotAttributesResult=" + _validateLotAttributes_validateLotAttributesResult.value);
        System.out.println("validateLotAttributes._validateLotAttributes_callContextOut=" + _validateLotAttributes_callContextOut.value);

        }
        {
        System.out.println("Invoking getRows...");
        java.lang.String _getRows_companyID = "";
        java.lang.String _getRows_whereClausePartLot = "";
        java.lang.String _getRows_whereClausePartLotAttch = "";
        int _getRows_pageSize = 0;
        int _getRows_absolutePage = 0;
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _getRows_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType> _getRows_getRowsResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.LotSelectUpdateDataSetType>();
        javax.xml.ws.Holder<java.lang.Boolean> _getRows_morePages = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _getRows_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.getRows(_getRows_companyID, _getRows_whereClausePartLot, _getRows_whereClausePartLotAttch, _getRows_pageSize, _getRows_absolutePage, _getRows_callContextIn, _getRows_getRowsResult, _getRows_morePages, _getRows_callContextOut);

        System.out.println("getRows._getRows_getRowsResult=" + _getRows_getRowsResult.value);
        System.out.println("getRows._getRows_morePages=" + _getRows_morePages.value);
        System.out.println("getRows._getRows_callContextOut=" + _getRows_callContextOut.value);

        }
        {
        System.out.println("Invoking getList...");
        java.lang.String _getList_companyID = "";
        java.lang.String _getList_whereClause = "";
        int _getList_pageSize = 0;
        int _getList_absolutePage = 0;
        com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType _getList_callContextIn = null;
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.PartLotListDataSetType> _getList_getListResult = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.PartLotListDataSetType>();
        javax.xml.ws.Holder<java.lang.Boolean> _getList_morePages = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType> _getList_callContextOut = new javax.xml.ws.Holder<com.genscript.gsscm.epicorwebservice.stub.lot.CallContextDataSetType>();
        port.getList(_getList_companyID, _getList_whereClause, _getList_pageSize, _getList_absolutePage, _getList_callContextIn, _getList_getListResult, _getList_morePages, _getList_callContextOut);

        System.out.println("getList._getList_getListResult=" + _getList_getListResult.value);
        System.out.println("getList._getList_morePages=" + _getList_morePages.value);
        System.out.println("getList._getList_callContextOut=" + _getList_callContextOut.value);

        }

        System.exit(0);
    }

}
