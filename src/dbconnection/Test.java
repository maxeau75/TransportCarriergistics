package dbconnection;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import entities.EntityImplementation;
import entities.ExtraShipmentDetails;
import entities.ExtractRequestInfo;
import entities.HeaderDetails;
import entities.LoadAddressGeoLoc;
import entities.LoadAudits;
import entities.LoadBillingAddress;
import entities.LoadCarrierAddress;
import entities.LoadCarrierGeoLocation;
import entities.LoadCarrierTerminalInfo;
import entities.LoadCarriers;
import entities.LoadContacts;
import entities.LoadDetails;
import entities.LoadDimensions;
import entities.LoadDropDates;
import entities.LoadEventActivities;
import entities.LoadEventAddress;
import entities.LoadEventLocation;
import entities.LoadEventPlan;
import entities.LoadEventWeights;
import entities.LoadExtraDetails;
import entities.LoadExtraLineItemDetails;
import entities.LoadFreightClass;
import entities.LoadGeoLocation;
import entities.LoadInsuranceType;
import entities.LoadItemGroups;
import entities.LoadItemQuantities;
import entities.LoadItemWeights;
import entities.LoadLineItemDetails;
import entities.LoadLineItemDimensions;
import entities.LoadPODRecieved;
import entities.LoadPackageDimensions;
import entities.LoadPackageWeights;
import entities.LoadPaymentMethod;
import entities.LoadPickupDates;
import entities.LoadQuantities;
import entities.LoadReferenceNumbers;
import entities.LoadShipmentPlan;
import entities.LoadWeights;
import entities.ShipmentActivities;
import entities.ShipmentCarrierAddress;
import entities.ShipmentCarrierInfo;
import entities.ShipmentConsigneeAddress;
import entities.ShipmentConsigneeGeoLoc;
import entities.ShipmentConsigneePackageGeoLoc;
import entities.ShipmentDetails;
import entities.ShipmentDimensions;
import entities.ShipmentDropDate;
import entities.ShipmentInsuranceGeoloc;
import entities.ShipmentInsuranceTypes;
import entities.ShipmentItemGroupDimensions;
import entities.ShipmentItemGroupFreightClass;
import entities.ShipmentItemGroupQuantities;
import entities.ShipmentItemGroupWeights;
import entities.ShipmentItemGroups;
import entities.ShipmentLineItemNumberAndWeights;
import entities.ShipmentLineItemQuantities;
import entities.ShipmentMargins;
import entities.ShipmentPackageDimensions;
import entities.ShipmentPackageWeight;
import entities.ShipmentPickupDate;
import entities.ShipmentPriceSheetCharges;
import entities.ShipmentPriceSheets;
import entities.ShipmentQuantities;
import entities.ShipmentTerminalInfo;
import entities.ShipmentWeights;
import entities.Shipments;
import entities.ShipperAddress;
import entities.ShipperGeoLoc;
import entities.UserDetails;

public class Test {
	//static EntityImplementation hd = null;

	public static void main(String[] args) {
		
	Connection conn= SingletonConnection.getConnection();
	EntityImplementation entities= new EntityImplementation();
	
	
	try {
	
	/*List <HeaderDetails> headerdetails = entities.getHeaderDetails();
	for(HeaderDetails hd:headerdetails)
	{
		System.out.println(hd.getSenderID());
	}*/
	
	
	
	/*List <UserDetails>  uDetails= entities.getUserDetails();
	for(UserDetails ud:uDetails)
	{
		System.out.println(ud.getInternalId());
		System.out.println(ud.getLastName());
	}*/
	
	
	List <ExtractRequestInfo>  exreqinf= entities.getExtractRequestInfo();
	for(ExtractRequestInfo erif:exreqinf)
	{
		System.out.println(erif.getReason());
		System.out.println(erif.getDate());
	}
	
	
	
	/*List <LoadDetails>  loadDetails= entities.getLoadDetails();
	for(LoadDetails ld:loadDetails)
	{
		System.out.println(ld.getLoadRefNumber());
	}*/
	
	
	/*List <LoadExtraDetails>  lExDetails= entities.getLoadExtraDetails();
	for(LoadExtraDetails led:lExDetails)
	{
		System.out.println(led.getHandlingUnits());
		System.out.println(led.getComments());
	}*/
	
	
	/*List <LoadPackageDimensions>  lopadim= entities.getLoadPackageDimensions();
	for(LoadPackageDimensions lpd:lopadim)
	{
		System.out.println(lpd.getType());
		System.out.println(lpd.getInternalId());
		System.out.println(	lpd.getDimension());
	}*/
	
	/*List <LoadPackageWeights>  lopawei= entities.getLoadPackageWeights();
	for(LoadPackageWeights lpw:lopawei)
	{
		System.out.println(lpw.getType());
		System.out.println(lpw.getInternalId());
		System.out.println(	lpw.getType());
	}*/
	
	
	/*List <LoadItemGroups>  lodig= entities.getLoadItemGroups();
	for(LoadItemGroups lig:lodig)
	{
		System.out.println(lig.getInternalId());
		System.out.println(	lig.getSequence());
	}*/
	
	
	/*List <LoadWeights>  lWeights= entities.getLoadWeights();
	for(LoadWeights lw:lWeights)
	{
		System.out.println(lw.getType());
		System.out.println(	lw.getUom());
		System.out.println(	lw.getWeight());
	}*/
	
	/*List <LoadQuantities>  lQuantities= entities.getLoadQuantities();
	for(LoadQuantities lq:lQuantities)
	{
		System.out.println(lq.getType());
		System.out.println(	lq.getUom());
		System.out.println(	lq.getQuantity());
	}*/
	
	/*List <LoadDimensions>  lDimensions= entities.getLoadDimensions();
	for(LoadDimensions ld:lDimensions)
	{
		System.out.println(ld.getType());
		System.out.println(	ld.getUom());
		System.out.println(	ld.getDim());
		System.out.println(	ld.getDimension());
	}*/
	
	/*List <LoadFreightClass>  lFClass= entities.getLoadFreightClass();
	for(LoadFreightClass lfc:lFClass)
	{
		System.out.println(lfc.getType());
		System.out.println(	lfc.getFreightClass());
		System.out.println(lfc.getTrackingNumber());
		System.out.println(	lfc.getDeliveryStatus());
		System.out.println(	lfc.getEquipmentRequired());
	}*/
	
	/*List <LoadReferenceNumbers>  lRefNum= entities.getLoadReferenceNumbers();
	for(LoadReferenceNumbers lrn:lRefNum)
	{
		System.out.println(lrn.getType());
		System.out.println(	lrn.getInternalId());
		System.out.println(lrn.getIsPrimary());
		System.out.println(	lrn.getReferenceNumber());
	}*/
	
	
	/*List <LoadItemWeights>  lItWeights= entities.getLoadItemWeights();
	for(LoadItemWeights liw: lItWeights)
	{
		System.out.println(liw.getInternalId());
		System.out.println(	liw.getLineNumber());
		System.out.println(liw.getType());
		System.out.println(	liw.getUom());
		System.out.println(	liw.getWeight());
	}*/
	
	/*List <LoadItemQuantities>  lItQuantities= entities.getLoadItemQuantities();
	for(LoadItemQuantities liq: lItQuantities)
	{
		System.out.println(liq.getInternalId());
		System.out.println(liq.getLineNumber());
		System.out.println(liq.getType());
		System.out.println(liq.getUom());
		System.out.println(liq.getQuantity());
	}*/
	
	
	/*List <LoadLineItemDetails>   lliDetails= entities.getLoadLineItemDetails();
	for(LoadLineItemDetails llineid:  lliDetails)
	{
		System.out.println(llineid.getItemId());
		System.out.println(llineid.getDescription());
		System.out.println(llineid.getFreightClass());
		System.out.println(llineid.getCommodity ());
		System.out.println(llineid.getNmfcCode());
	}*/
	
	
	/*List <LoadExtraLineItemDetails>   lExid= entities.getLoadExtraLineItemDetails();
	for(LoadExtraLineItemDetails leid:lExid)
	{
		System.out.println(leid.getHazMatDetail());
		System.out.println(leid.getProperShippingName());
		System.out.println(leid.getHazMatID());
		
	}*/
	
	
	/*List <LoadLineItemDimensions> lLidim = entities.getLoadLineItemDimensions();
	for(LoadLineItemDimensions llid:lLidim)
	{
		System.out.println(llid.getType());
		System.out.println(llid.getUom());
		System.out.println(llid.getDim());
		System.out.println(llid.getDimension());	
	}*/

	
	/*List <LoadPaymentMethod> lPMethod = entities.getLoadPaymentMethod();
	for(LoadPaymentMethod lpm:lPMethod)
	{
		System.out.println(lpm.getMethod());
		System.out.println(lpm.getContact());
		System.out.println(lpm.getComments());	
	}*/
	
	
	/*List <LoadBillingAddress> lBAddrs = entities.getLoadBillingAddress();
	for(LoadBillingAddress lba:lBAddrs)
	{
		System.out.println(lba.getInternalId());
		System.out.println(lba.getType());
		System.out.println(lba.getIsPrimary());	
	}*/
	
	
	/*List <LoadGeoLocation> lGLocation = entities.getLoadGeoLocation();
	for(LoadGeoLocation lgl:lGLocation)
	{
		System.out.println(lgl.getLongDirection());
		System.out.println(lgl.getLongDegrees());
		System.out.println(lgl.getLatDirection());
		System.out.println(lgl.getLatDegrees());	
	}*/

	
	/*List <LoadPODRecieved> lPODR = entities.getLoadPODRecieved();
	for(LoadPODRecieved lpr:lPODR)
	{
		System.out.println(lpr.getPODReceived());
		System.out.println(lpr.getProofOfPickupReceived());
		System.out.println(lpr.getStatus());
		System.out.println(lpr.getAssignedTo());
		System.out.println(lpr.getOwner());
	}*/

	/*List <LoadAudits> lAudits = entities.getLoadAudits();
	for(LoadAudits la:lAudits)
	{
		System.out.println(la.getAction());
		System.out.println(la.getUser());
		System.out.println(la.getTimestamp());
		System.out.println(la.getAudit());
	}*/
	
	/*List <LoadCarriers> lCarriers = entities.getLoadCarriers();
	for(LoadCarriers lc:lCarriers)
	{
		System.out.println(lc.getInternalId());
		System.out.println(lc.getType());
		System.out.println(lc.getCarrierId());
		System.out.println(lc.getCarrierName());
	}*/
	
	/*List <LoadInsuranceType> lIType = entities.getLoadInsuranceType();
	for(LoadInsuranceType lit:lIType)
	{
		System.out.println(lit.getType());
		System.out.println(lit.getContactPhone());
		System.out.println(lit.getContactName());
		System.out.println(lit.getExpirationDate());
	}*/
	
	
	/*List <LoadCarrierAddress> lCAddress = entities.getLoadCarrierAddress();
	for(LoadCarrierAddress lca:lCAddress)
	{
		System.out.println(lca.getInternalId());
		System.out.println(lca.getType());
		System.out.println(lca.getIsPrimary());
		System.out.println(lca.getIsResidential());
	}*/
	

	/*List <LoadCarrierGeoLocation> lCGLocation = entities.getLoadCarrierGeoLocation();
	for(LoadCarrierGeoLocation lcgl:lCGLocation)
	{
		System.out.println(lcgl.getLongDirection());
		System.out.println(lcgl.getLongDegrees());
		System.out.println(lcgl.getLatDirection());
		System.out.println(lcgl.getLatDegrees());	
	}*/
	
	
	/*List <LoadContacts> lContacts = entities.getLoadContacts();
	for(LoadContacts lco:lContacts)
	{
		System.out.println(lco.getOid());
		System.out.println(lco.getType());
		System.out.println(lco.getName());
		System.out.println(lco.getContactMethods());	
	}*/
	
	/*List <LoadCarrierTerminalInfo> lCTInfo = entities.getLoadCarrierTerminalInfo();
	for(LoadCarrierTerminalInfo lcti:lCTInfo)
	{
		System.out.println(lcti.getTerminalType());
		System.out.println(lcti.getOrigin());
		System.out.println(lcti.getDestination());	
	}*/
	
	/*List <LoadPickupDates> lPDates = entities.getLoadPickupDates();
	for(LoadPickupDates lpd:lPDates)
	{
		System.out.println(lpd.getPickupType());
		System.out.println(lpd.getDateTime());
	}*/
	
	/*List <LoadDropDates> lDDates = entities.getLoadDropDates();
	for(LoadDropDates ldd:lDDates)
	{
		System.out.println(ldd.getDropOffType());
		System.out.println(ldd.getDateTime());
	}*/
	
	
	/*List <LoadEventPlan> lEPlan = entities.getLoadEventPlan();
	for(LoadEventPlan lep:lEPlan)
	{
		System.out.println(lep.getInternalId());
		System.out.println(lep.getCount());
	}*/
	
	/*List <LoadEventAddress>  lEAddrs = entities.getLoadEventAddress();
	for(LoadEventAddress lea: lEAddrs)
	{
		System.out.println(lea.getAdresstype());
		System.out.println(lea.getInternalId());
		
	}*/
	
	/*List <LoadEventWeights>  lEWeights = entities.getLoadEventWeights();
	for(LoadEventWeights lew: lEWeights)
	{
		System.out.println(lew.getWeightType());
		System.out.println(lew.getUom());
		System.out.println(lew.getWeight());	
	}*/
	
	/*List <LoadShipmentPlan>  lSPlan = entities.getLoadShipmentPlan();
	for(LoadShipmentPlan lsp: lSPlan)
	{
		System.out.println(lsp.getReferenceNumber());
		System.out.println(lsp.getType());
		System.out.println(lsp.getInternalId());
		System.out.println(lsp.getIsPrimary());
	}*/
	
	/*List <LoadEventActivities>  lEActivities = entities.getLoadEventActivities();
	for(LoadEventActivities leac: lEActivities)
	{
		System.out.println(leac.getType());
		System.out.println(leac.getInternalId());
		System.out.println(leac.getUpdateDate());
		System.out.println(leac.getUpdateBy());
	}*/
	
	
	/*List <LoadEventLocation>  lELocation = entities.getLoadEventLocation();
	for(LoadEventLocation lel: lELocation)
	{
		System.out.println(lel.getType());
		System.out.println(lel.getInternalId());
		System.out.println(lel.getIsPrimary());
		System.out.println(lel.getIsResidential());
	}*/
	
	/*List <LoadAddressGeoLoc> lAGeoLoc = entities.getLoadAddressGeoLoc();
	for(LoadAddressGeoLoc lac:lAGeoLoc)
	{
		System.out.println(lac.getLongDirection());
		System.out.println(lac.getLongDegrees());
		System.out.println(lac.getLatDirection());
		System.out.println(lac.getLatDegrees());	
	}*/
	
	/*List <Shipments> shipments = entities.getShipments();
	for(Shipments sh:shipments)
	{
		System.out.println(sh.getCreateBy());
		System.out.println(sh.getCreateDate());
		System.out.println(sh.getUpdateBy());
		System.out.println(sh.getUpdateDate());
		System.out.println(sh.getInternalId());
		System.out.println(sh.getType());
	}*/
	
	/*List <ShipmentDetails> sDetails = entities.getShipmentDetails();
	for(ShipmentDetails sd:sDetails)
	{
		System.out.println(sd.getCreatedBy());
		System.out.println(sd.getCreateDate());
		System.out.println(sd.getUpdateBy());
	}*/
	
	/*List <ExtraShipmentDetails> eSDetails = entities.getExtraShipmentDetails();
	for(ExtraShipmentDetails esd:eSDetails)
	{
		System.out.println(esd.getComments());
		System.out.println(esd.getStatus());
		System.out.println(esd.getAssignedTo());
	}*/
	
	
	/*List <ShipmentTerminalInfo> sTInfo = entities.getShipmentTerminalInfo();
	for(ShipmentTerminalInfo sti:sTInfo)
	{
		System.out.println(sti.getTerminalType());
		System.out.println(sti.getOrigin());
		System.out.println(sti.getDestination());
	}*/
	
	/*List <ShipmentQuantities> sQuantities = entities.getShipmentQuantities();
	for(ShipmentQuantities sq:sQuantities)
	{
		System.out.println(sq.getType());
		System.out.println(sq.getUom());
		System.out.println(sq.getQuantity());
	}*/
	
	
	/*List <ShipmentWeights> sWeights = entities.getShipmentWeights();
	for(ShipmentWeights sw:sWeights)
	{
		System.out.println(sw.getType());
		System.out.println(sw.getUom());
		System.out.println(sw.getWeight());
	}*/
	
	/*List <ShipmentDimensions> sDimensions = entities.getShipmentDimensions();
	for(ShipmentDimensions sdim:sDimensions)
	{
		System.out.println(sdim.getType());
		System.out.println(sdim.getUom());
		System.out.println(sdim.getDim());
		System.out.println(sdim.getDimension());
	}*/
	
	/*List <ShipmentPickupDate> sPDate = entities.getShipmentPickupDate();
	for(ShipmentPickupDate spd:sPDate)
	{
		System.out.println(spd.getPickuptype());
		System.out.println(spd.getDate());
	}*/
	
	/*List <ShipmentDropDate> sDDate = entities.getShipmentDropDate();
	for(ShipmentDropDate spd:sDDate)
	{
		System.out.println(spd.getDroptype());
		System.out.println(spd.getDate());
		System.out.println(spd.getPriceSheets());
	}*/
	
	/*List <ShipperAddress> sAddrs = entities.getShipperAddress();
	for(ShipperAddress sa:sAddrs)
	{
		System.out.println(sa.getType());
		System.out.println(sa.getInternalId());
		System.out.println(sa.getIsPrimary());
	}*/
	
	/*List <ShipperGeoLoc> sGLoc = entities.getShipperGeoLoc();
	for(ShipperGeoLoc sgl:sGLoc)
	{
		System.out.println(sgl.getLongDirection());
		System.out.println(sgl.getLongDegrees());
		System.out.println(sgl.getLatDirection());
		System.out.println(sgl.getLatDegrees());	
	}*/
	
	/*List <ShipmentConsigneeAddress> sCAddrs = entities.getShipmentConsigneeAddress();
	for(ShipmentConsigneeAddress sca:sCAddrs)
	{
		System.out.println(sca.getType());
		System.out.println(sca.getInternalId());
		System.out.println(sca.getIsPrimary());
	}*/
	

	/*List <ShipmentConsigneeGeoLoc> sCGLoc = entities.getShipmentConsigneeGeoLoc();
	for(ShipmentConsigneeGeoLoc scgl:sCGLoc)
	{
		System.out.println(scgl.getLongDirection());
		System.out.println(scgl.getLongDegrees());
		System.out.println(scgl.getLatDirection());
		System.out.println(scgl.getLatDegrees());	
	}*/
	
	/*List <ShipmentConsigneePackageGeoLoc> sCPackage = entities.getShipmentConsigneePackageGeoLoc();
	for(ShipmentConsigneePackageGeoLoc scp:sCPackage)
	{
		System.out.println(scp.getType());
		System.out.println(scp.getInternalId());
	}*/
	
	/*List<ShipmentPackageDimensions> sPDimensions = entities.getShipmentPackageDimensions();
	for(ShipmentPackageDimensions spdim:sPDimensions)
	{
		System.out.println(spdim.getType());
		System.out.println(spdim.getUom());
		System.out.println(spdim.getDim());
		System.out.println(spdim.getDimension());
	}*/
	
	/*List<ShipmentPackageWeight> sPWeight = entities.getShipmentPackageWeight();
	for(ShipmentPackageWeight spw:sPWeight)
	{
		System.out.println(spw.getType());
		System.out.println(spw.getUom());
		System.out.println(spw.getWeight());
	}*/
	
	/*List<ShipmentItemGroups> sIGroups = entities.getShipmentItemGroups();
	for(ShipmentItemGroups sig:sIGroups)
	{
		System.out.println(sig.getInternalId());
		System.out.println(sig.getSequence());
		System.out.println(sig.getIsHandlingUnit());
	}*/
	
	/*List<ShipmentItemGroupWeights> sIGWeights = entities.getShipmentItemGroupWeights();
	for(ShipmentItemGroupWeights sigw:sIGWeights)
	{
		System.out.println(sigw.getType());
		System.out.println(sigw.getUom());
		System.out.println(sigw.getWeight());
	}*/
	
	/*List<ShipmentItemGroupQuantities> sIGQuantities = entities.getShipmentItemGroupQuantities();
	for(ShipmentItemGroupQuantities sigq:sIGQuantities)
	{
		System.out.println(sigq.getType());
		System.out.println(sigq.getUom());
		System.out.println(sigq.getQuantity());
	}*/
	
	/*List<ShipmentItemGroupDimensions> sIGDimensions = entities.getShipmentItemGroupDimensions();
	for(ShipmentItemGroupDimensions sigd:sIGDimensions)
	{
		System.out.println(sigd.getType());
		System.out.println(sigd.getUom());
		System.out.println(sigd.getDim());
		System.out.println(sigd.getDimension());
	}*/
	
	/*List<ShipmentItemGroupFreightClass> sIGDFClass = entities.getShipmentItemGroupFreightClass();
	for(ShipmentItemGroupFreightClass sigfc:sIGDFClass)
	{
		System.out.println(sigfc.getFreightClass());
		System.out.println(sigfc.getStackability());
		System.out.println(sigfc.getTrackingNumber());
		System.out.println(sigfc.getDeliveryStatus());
		System.out.println(sigfc.getEquipmentRequired());
	}*/
	
	/*List<ShipmentLineItemNumberAndWeights> sINWeights = entities.getShipmentLineItemNumberAndWeights();
	for(ShipmentLineItemNumberAndWeights slinw:sINWeights)
	{
		System.out.println(slinw.getLineNumber());
		System.out.println(slinw.getInternalId());
		System.out.println(slinw.getType());
		System.out.println(slinw.getUom());
		System.out.println(slinw.getWeight());
	}*/
	
	/*List<ShipmentLineItemQuantities> sLIQuantities = entities.getShipmentLineItemQuantities();
	for(ShipmentLineItemQuantities sliq:sLIQuantities)
	{
		System.out.println(sliq.getQuantity());
		System.out.println(sliq.getType());
		System.out.println(sliq.getUom());
		System.out.println(sliq.getItemId());		
	}*/
	
	/*List<ShipmentPriceSheets> sPSheets = entities.getShipmentPriceSheets();
	for(ShipmentPriceSheets sps:sPSheets)
	{
		System.out.println(sps.getChargeModel());
		System.out.println(sps.getIsSelected());
		System.out.println(sps.getIsAllocated());
		System.out.println(sps.getCurrencyCode());		
	}*/
	
	/*List <ShipmentCarrierInfo> sCInfo = entities.getShipmentCarrierInfo();
	for(ShipmentCarrierInfo sci:sCInfo)
	{
		System.out.println(sci.getInternalId());
		System.out.println(sci.getCarrierId());
		System.out.println(sci.getCarrierName());
	}*/
	
	/*List <ShipmentInsuranceTypes> sIType = entities.getShipmentInsuranceTypes();
	for(ShipmentInsuranceTypes sit:sIType)
	{
		System.out.println(sit.getExpirationDate());
		System.out.println(sit.getContactName());
		System.out.println(sit.getContactPhone());
		System.out.println(sit.getType());
	}*/
	
	/*List <ShipmentCarrierAddress> sCAddrs = entities.getShipmentCarrierAddress();
	for(ShipmentCarrierAddress sca:sCAddrs)
	{
		System.out.println(sca.getInternalId());
		System.out.println(sca.getType());
		System.out.println(sca.getIsPrimary());	
	}*/
	
	/*List <ShipmentInsuranceGeoloc> sIGLoc = entities.getShipmentInsuranceGeoloc();
	for(ShipmentInsuranceGeoloc sigl:sIGLoc)
	{
		System.out.println(sigl.getLongDirection());
		System.out.println(sigl.getLongDegrees());
		System.out.println(sigl.getLatDirection());
		System.out.println(sigl.getLatDegrees());	
	}*/
	
	/*List <ShipmentPriceSheetCharges> sPSCharges = entities.getShipmentPriceSheetCharges();
	for(ShipmentPriceSheetCharges spsc:sPSCharges)
	{
		System.out.println(spsc.getItemGroupId());
		System.out.println(spsc.getSequenceNum());
		System.out.println(spsc.getInternalId());
		System.out.println(spsc.getType());	
	}*/
	
	/*List <ShipmentActivities> sActivities = entities.getShipmentActivities();
	for(ShipmentActivities shac:sActivities)
	{
		System.out.println(shac.getType());
		System.out.println(shac.getInternalId());
		System.out.println(shac.getUpdateDate());
		System.out.println(shac.getCreateDate());	
	}*/
	
	/*List <ShipmentMargins> sMargins = entities.getShipmentMargins();
	for(ShipmentMargins sm:sMargins)
	{
		System.out.println(sm.getType());
		System.out.println(sm.getCurrencyCode());
		System.out.println(sm.getMarginRevenue());
		System.out.println(sm.getMarginCost());
		System.out.println(sm.getMarginValue());
	}*/
	
	//entities.addExtractRequestInfo(new ExtractRequestInfo("01/30/2021 21:45", "Manual Extract From FreightBill List Screen"));
	//entities.addExtractRequestInfo(new ExtractRequestInfo("03/05/2021 09:38", "Manual Extract From MBL List Screen"));
	
	}
	catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println();
		}

}

}