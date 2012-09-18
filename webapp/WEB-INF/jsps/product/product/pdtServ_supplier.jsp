<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<base href="${global_url}" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${global_css_url}scm.css" rel="stylesheet" type="text/css" />
<link href="${global_css_url }SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
<link href="${global_css_url }tab-view.css" rel="stylesheet" type="text/css" />
<link href="${global_css_url}table.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="${global_js_url}jquery/themes/base/ui.all.css" rel="stylesheet" />
<script language="javascript" type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script src="${global_js_url}jquery/external/bgiframe/jquery.bgiframe.min.js" type="text/javascript"></script>
<link type="text/css" href="${global_js_url}jquery/themes/base/ui.all.css" rel="stylesheet" />
<script src="${global_js_url}jquery/ui/ui.core.js" type="text/javascript"></script>
<script src="${global_js_url}jquery/ui/ui.draggable.js" type="text/javascript"></script>
<script src="${global_js_url}jquery/ui/ui.resizable.js" type="text/javascript"></script>
<script src="${global_js_url}jquery/ui/ui.dialog.js" type="text/javascript"></script>
<script src="${global_js_url}jquery/jquery.validate.js?v=1" type="text/javascript"></script>
<script src="${global_js_url}util/util.js"
	type="text/javascript"></script>
<script>
var type = "Product";
</script>

<script>
function modifyUnitCost(){
	if($("#unitCost").attr("disabled")==false){
		$("#unitCost").attr("disabled","disabled");
	}else{
		$("#unitCost").removeAttr("disabled");
	}
	
	
}

$(function(){

	$("#saveApprovedTrigger").click(function(){
		var approved = $("#approved").val();
		approved = $.trim(approved);
		var approvedReason = $("#approvedReason").val();
		approvedReason = $.trim(approvedReason);
		var approvedType = $("#approvedType").val();
		var catalogId = $("#catalogId").val();
		var sessionProductId = $("#sessionProductId").val();
		var oldApproved = $("#oldApproved").val();
		if(oldApproved==approved){
			alert("You do not make any changes.");return;
		}
		if(!approved){
			alert("Please enter the Unit Cost.");return;
		}
		if(isNaN(approved)) {
			alert("Please enter the correct Unit Cost.");return;
		}
		if(!approvedReason){
			alert("Please enter the reason.");return;
		}
		$.ajax({
			url:"product/product!productApprovedSaveSession.action",
			type:"get",
			data:"approved="+approved+"&approvedReason="+approvedReason+"&approvedType="+approvedType+"&sessionProductId="+sessionProductId+"&catalogId="+catalogId,
			dataType:"json",
			success:function(data){
				if(hasException(data)){
					$('#saveApprovedTrigger').attr("disabled", false);	
				}else{
					if(data.message == "success"){
						alert("The modification is ready to be submitted for the evaluation and will be applied only after it’s approved.");
					}else{
						alert("System error!Please contact system administrator for help.");
					}
				}
			},
			error:function(data){
				alert("System error! Please contact system administrator for help.");
			},
			async:false
		});
		$("#modifyUnitCostDialog").dialog("close");
	});
	$('#supplierForm').validate({
		errorClass:"validate_error",
		highlight: function(element, errorClass) {
		$(element).addClass(errorClass);
		},
		unhighlight: function(element, errorClass, validClass) {
		$(element).removeClass(errorClass);
		},
			 invalidHandler: function(form, validator) {
				 $.each(validator.invalid, function(key,value){
		            alert(value);
		            $("#"+key).focus();
		            return false;
		        });
			 },
			 rules: {
				 leadTime: { number:true },
				 saftyStock: { number:true },
				 minOrderQty: { number:true },
				 unitCost: { number:true }
			 },
			 messages: {
				 leadTime: { number: "This 'leadTime' must be a digit!" },
			     saftyStock: { number:"This 'saftyStock' must be a digit!" },
			     minOrderQty: { number:"This 'minOrderQty' must be a digit!" },
			     unitCost: { number:"This 'unitCost' must be a digit!" }
			 },
			 errorPlacement: function(error, element) {
			 }
		});
});
function editSupplier(id, vendorName){
	$("#supplierEditTrigger").attr("vendorName", vendorName);
	$("#supplierEditTrigger").attr("supplierId", id);
	$("#supplierEditTrigger").trigger("click");
}
$(document).ready(function(){
	 $('#supplierTable tr:odd >td').addClass('list_td2');
	 $('#orderTable tr:odd >td').addClass('list_td2');
	$("#delSupplierTrigger").click(function(){
		var tmpArr = [];
		$("#supplierTable :checkbox[checked]").each(function(i, n){
			tmpArr.push($(n).val());
		});
		var supplierIdStr = tmpArr.toString();
		if(supplierIdStr == ""){
			alert("Please select one item to continue your operation.");
			return;
		}
		if(!confirm("Are you sure to delete?")){
			return;
		}
		var psId = $("#psId").val();
		$.ajax({
			url: "${ctx}/product/product!delSupplierSession.action",
			type: "post",
			dataType: "text", 
			data: "id="+psId+"&type=product&supplierIdStr="+supplierIdStr+"&sessionProductId=${sessionProductId}",
			success : function(data){
				if(data == "success"){
					
					var del = supplierIdStr.split(",");
					for(var i=0;i<del.length;i++){
						$("#del_"+del[i]).remove();
					}
				}else{
					alert("System error! Please contact system administrator for help.");
				}
				
			},
			error: function(data){
				alert("System error! Please contact system administrator for help.");
			}
		});
	});

	$("#vendorListCheckAll").click(function(){
		if($(this).attr("checked") == true){
			$("[name='supplierId']").attr("checked", true);
		}else{
			$("[name='supplierId']").attr("checked", false);
		}
	});

		var psId = $("#psId").val();
		//ship area add trigger
		$("#supplierAddTrigger").click(function(){
			parent.$('#supplierEditDialog').attr("title", "Add New Supplier");	
			parent.$('#supplierEditDialog').dialog("option","open", function(){
				var url = "${ctx}/product/product!showEditSuppler.action?id="+psId+"&type="+type+"&sessionProductId=${sessionProductId}";
				var htmlStr = '<iframe src="'+url+'" height="300" width="570" scrolling="no" style="border:0px" frameborder="0"></iframe>';
				parent.$('#supplierEditDialog').html(htmlStr);
			});	
			parent.$('#supplierEditDialog').dialog("option", "title", "Add New Supplier");	
			parent.$('#supplierEditDialog').dialog("open");	
		});
		//ship area edit trigger
		$("#supplierEditTrigger").click(function(){
			var vendorName = $(this).attr("vendorName");
			var supplierId = $(this).attr("supplierId");
			parent.$('#supplierEditDialog').attr("title", "Supplier-"+vendorName);
			parent.$('#supplierEditDialog').dialog("option", "open",function(){
				var supplierInfo = $("#"+supplierId+"_supplierInfo").val();
				var url = "${ctx}/product/product!showEditSuppler.action?id="+psId+"&type="+type+"&supplierId="+supplierId+"&sessionProductId=${sessionProductId}";
				var htmlStr = '<iframe src="'+url+'" height="300" width="570" scrolling="no" style="border:0px" frameborder="0"></iframe>';
				parent.$('#supplierEditDialog').html(htmlStr);
			});
			parent.$('#supplierEditDialog').dialog("option", "title", "Supplier-"+vendorName);
			parent.$('#supplierEditDialog').dialog("open");
		});
});
//修改unitCodst
function modifyUnitCostClick() {
	if($("#unitCostAppr").val()=="true"){
		alert("The Unit Cost have been modified");return;
	}
	$("#modifyUnitCostDialog").dialog({
		autoOpen: false,
		height: 400,
		width: 600,
		modal: true,
		bgiframe: true,
		buttons: {}
	});	
	$('#modifyUnitCostDialog').dialog("option", "open",function(){
		
	});
	$('#modifyUnitCostDialog').dialog('open');
}
</script>
</head>

<body>
  	  <table width="970" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="70">
          <form id="supplierForm">
          <table width="700" border="0" align="center" cellpadding="0" cellspacing="0" class="General_table">
            <tr>
              <th width="300"><span class="important">*</span> Lead Times(Days) </th>
              <td><input id="leadTime" name="leadTime" type="text" class="NFText" size="20" value="${leadTime}" /></td>
              <th width="300">Next Expected Delivery Date </th>
              <td><input name="delivery" type="text" class="pickdate NFText" value="" size="20" disabled="disabled" /></td>
            </tr>
            <tr>
              <th><span class="important">*</span> Re-Order When Stock Is Below</th>
              <td><input id="saftyStock" name="saftyStock" type="text" class="NFText" value="${saftyStock}" size="20"/></td>
              <th>Minimum Re-Order Quantity </th>
              <td><input id="minOrderQty" name="minOrderQty" type="text" class="NFText" value="${minOrderQty}" size="20" /></td>
            </tr>
            <tr>
              <th>Units On Order</th>
              <td><input name="house" type="text" class="NFText" value="" size="20" disabled="disabled" /></td>
              <th><span class="important">*</span> Current Unit Cost Basis </th>
              <td>
              <s:if test="id==null">
               <input id="unitCost" name="unitCost" type="text" class="NFText2" value="${unitCost}" size="6"/>
					
              </s:if>
              <s:else>
               <input id="unitCost" name="unitCost" type="text" class="NFText2" value="${unitCost}" size="6" disabled="disabled"/>
					<input type="button" value="Modify" class="style_botton" id="modifyTrigger" name="modifyTrigger" onclick="modifyUnitCostClick()"/>
              </s:else>
             
			
			 <div id="modifyUnitCostDialog" title="Modify UnitCost" style="display:none;">
                  		<table id="whole_table" width="492" border="0" cellpadding="0" cellspacing="0" class="General_table" style="margin-left:40px;">
							  <tr>
							   <th width="100" align="left">Current Unit Cost Basis</th>
							   <td width="414"><input type="text" size='35' class="NFText" name="approved" id="approved" value="${unitCost }" /></td>
							  </tr>
							  <tr>
					            <th height="24" colspan="2"><div align="left"> Choose the reason to modify the Unit Cost: </div></th>
					          </tr>
					          <tr>
					            <th colspan="2"><div align="left"><textarea name="approvedReason" id="approvedReason" cols="70" rows="2" class="content_textarea"></textarea></div></th>
					          </tr>
					          <tr>
					            <th align="right" colspan="2">
								<div align="center" style="margin:10px;">
						            <div id="cat_name" style='display:block;'>
						            	<input type="hidden" name="approvedType" id="approvedType" value="ApprovedUnitCost" />
										<input type="hidden" name="oldApproved" id="oldApproved" value="${unitCost }" />
										<input type="button"  class="style_botton" value="Modify" id="saveApprovedTrigger"/>	
									  	<input type="button" value="Cancel"  class="style_botton" onclick="$('#modifyUnitCostDialog').dialog('close');" />
						            </div>
								 </div>
								 </th>
					          </tr>
						</table>
                  </div>
                  </td>
            </tr>
          </table>
          <input id="unitCostAppr" type="hidden" name="unitCostAppr" value="${unitCostAppr}"/>
          <input id="sessionProductId" type="hidden" name="sessionProductId" value="${sessionProductId}"/>
          </form>
          </td>
        </tr>
        <tr>
          <td><table width="940" border="0" cellpadding="0" cellspacing="0" class="list_table">
            <tr>
              <th width="80">Order No </th>
              <th width="80">Order Date </th>
              <th>Supplier</th>
              <th width="80">Qty.</th>
              <th width="80">PO No </th>
              <th width="80">PO Date</th>
              <th width="100">Expected Date</th>
            </tr>
          </table> 
            <div  class="frame_pr2">
              <table width="940" border="0" cellpadding="0" cellspacing="0" class="list_table" id="orderTable">
               <s:iterator value="purchaseOrderList">

				<tr>
                  <td width="80">
                  	<div align="center">
                  		<a href=""  target="mainFrame">${orderNo}</a>
                  	</div>
                  </td>
                  <td width="80"><div align="center"><s:date name="orderDate" format="yyyy-MM-dd" /></div></td>
                  <td>${vendorName}</td>
                  <td width="80">${catalogQty}</td>
                  <td width="80">${poNo}</td>
                  <td width="80"><div align="center"><s:date name="poDate" format="yyyy-MM-dd" /></div></td>
                  <td width="100"><div align="center"><s:date name="expectedDate" format="yyyy-MM-dd" /></div></td>
                </tr>
                               
               </s:iterator>
              </table>
           </div>
          </td>
        </tr>
        <tr>
          <td height="35" valign="bottom"  class="blue_price"><div align="center">Purchasing Level and Supplier List </div></td>
        </tr>
        <tr>
          <td>
          <table width="940" border="0" cellpadding="0" cellspacing="0" class="list_table">
            <tr>
              <th width="46">
              	<div align="left">
                	<input type="checkbox" id="vendorListCheckAll" />
                	<img id="delSupplierTrigger" src="images/file_delete.gif" alt="Delete" width="16" height="16" border="0" />
                </div>
                </th>
              <th width="140">Supplier</th>
              <th width="120">Catalog No </th>
              <th width="100">Name</th>
              <th width="50">Sell Qty</th>
              <th width="50">Buy Qty </th>
              <th width="80">Unit Price </th>
              <th width="80">Discount</th>
              <th width="80">Lead Time </th>
              <th>Comments</th>
            </tr>
          </table>
          <div class="frame_pr2">
              <table width="940" border="0" cellpadding="0" cellspacing="0" class="list_table2" id="supplierTable">
                <s:iterator value="verdonProductList">
                <tr id="del_${id }">
                  <td width="46">&nbsp;                    
                	<input type="checkbox" name="supplierId" value="${id}" />                  
                  </td>
                  <td  width="140">&nbsp;
                  	<a href="javascript:void(0);" onclick="editSupplier('${id}', '${vendorName}');" title="${vendorName}">
                  		${vendorName}
                  	</a>
                  	<input type="hidden" value="${supplierInfo}" id="${id}_supplierInfo" />
                  </td>
                  <td width="120">&nbsp;${vendorCatalogNo}</td>
                  <td width="100">&nbsp;${name}</td>
                  <td width="50">&nbsp;${sellQuantity}</td>
                  <td width="50">&nbsp;${buyQuantity}</td>
                  <td width="80">
                  	<div align="right">&nbsp;
                  	${standardPrice}
                  	</div>
                  </td>
                  <td width="80">&nbsp;${discount}</td>
                  <td width="80">&nbsp;${leadTime}</td>
                  <td>&nbsp;${comment}</td>
                </tr>
              </s:iterator>
              </table>
            </div>
            </td>
        </tr>
        <tr>
          <td height="35" valign="bottom">
          	<div align="center">
          		<input id="psId" type="hidden" value="${id}" />
           		<input id="supplierEditTrigger" type="hidden" class="style_botton" value="" />
           		<input id="supplierAddTrigger" type="button" class="style_botton" value="New" />
           	</div>
           </td>
        </tr>
      </table>
</body>
</html>