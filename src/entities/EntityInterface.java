package entities;

import java.io.File;
import java.util.List;

public interface EntityInterface {
	
	
	public List<HeaderDetails> getHeaderDetails();
	public void addHeaderDetails(HeaderDetails hd);
	
	public List<ExtractRequestInfo> getExtractRequestInfo();
	public void addExtractRequestInfo(ExtractRequestInfo eri);
	
	public List<UserDetails> getUserDetails();
	public void addUserDetails(UserDetails ud);
	
	public List<LoadDetails> getLoadDetails();
	public void addLoadDetails(LoadDetails ld);
	
	public List<LoadExtraDetails> getLoadExtraDetails();
	public void addLoadExtraDetails(LoadExtraDetails led);
	
	public List<LoadPackageDimensions> getLoadPackageDimensions();
	public void addLoadPackageDimensions(LoadPackageDimensions lpd);
	
	public List<LoadPackageWeights> getLoadPackageWeights();
	public void addLoadPackageWeights(LoadPackageWeights lpw);
	
	public List<LoadItemGroups> getLoadItemGroups();
	public void addLoadItemGroups(LoadItemGroups lig);
	
	public List<LoadWeights> getLoadWeights();
	public void addLoadWeights(LoadWeights lw);
	
	public List<LoadQuantities> getLoadQuantities();
	public void addLoadQuantities(LoadQuantities lq);
	
	public List<LoadDimensions> getLoadDimensions();
	public void addLoadDimensions(LoadDimensions ld);
	
	public List<LoadFreightClass> getLoadFreightClass();
	public void addLoadFreightClass(LoadFreightClass lfc);
	
	public List<LoadReferenceNumbers> getLoadReferenceNumbers();
	public void addLoadReferenceNumbers(LoadReferenceNumbers lrn);
	
	public List<LoadItemWeights> getLoadItemWeights();
	public void addLoadItemWeights(LoadItemWeights liw);
	
	public List<LoadItemQuantities> getLoadItemQuantities();
	public void addLoadItemQuantities(LoadItemQuantities liq);
	
	public List<LoadLineItemDetails> getLoadLineItemDetails();
	public void addLoadLineItemDetails(LoadLineItemDetails llineid);
	
	public List<LoadExtraLineItemDetails> getLoadExtraLineItemDetails();
	public void addLoadExtraLineItemDetails(LoadExtraLineItemDetails leid);
	
	public List<LoadLineItemDimensions> getLoadLineItemDimensions();
	public void addLoadLineItemDimensions(LoadLineItemDimensions llid);
	
	public List<LoadPaymentMethod> getLoadPaymentMethod();
	public void addLoadPaymentMethod(LoadPaymentMethod lpm);
	
	public List<LoadBillingAddress> getLoadBillingAddress();
	public void addLoadBillingAddress(LoadBillingAddress lba);
	
	public List<LoadGeoLocation> getLoadGeoLocation();
	public void addLoadGeoLocation(LoadGeoLocation lgl);
	
	public List<LoadPODRecieved> getLoadPODRecieved();
	public void addLoadPODRecieved(LoadPODRecieved lpr);
	
	public List<LoadAudits> getLoadAudits();
	public void addLoadAudits(LoadAudits la);
	
	public List<LoadCarriers> getLoadCarriers();
	public void addLoadCarriers(LoadCarriers lc);
	
	public List<LoadInsuranceType> getLoadInsuranceType();
	public void addLoadInsuranceType(LoadInsuranceType lit);
	
	public List<LoadCarrierAddress> getLoadCarrierAddress();
	public void addLoadCarrierAddress(LoadCarrierAddress lca);
	
	public List<LoadCarrierGeoLocation> getLoadCarrierGeoLocation();
	public void addLoadCarrierGeoLocation(LoadCarrierGeoLocation lcgl);
	
	public List<LoadContacts> getLoadContacts();
	public void addLoadContacts(LoadContacts lco);
	
	public List<LoadPickupDates> getLoadPickupDates();
	public void addLoadPickupDates(LoadPickupDates lpd);
	
	public List<LoadCarrierTerminalInfo> getLoadCarrierTerminalInfo();
	public void addLoadCarrierTerminalInfo(LoadCarrierTerminalInfo lcti);
	
	public List<LoadDropDates> getLoadDropDates();
	public void addLoadDropDates(LoadDropDates ldd);
	
	public List<LoadEventPlan> getLoadEventPlan();
	public void addLoadEventPlan(LoadEventPlan lep);
	
	public List<LoadEventAddress> getLoadEventAddress();
	public void addLoadEventAddress(LoadEventAddress lea);
	
	public List<LoadEventWeights> getLoadEventWeights();
	public void addLoadEventWeights(LoadEventWeights lew);
	
	public List<LoadShipmentPlan> getLoadShipmentPlan();
	public void addLoadShipmentPlan(LoadShipmentPlan lsp);
	
	public List<LoadEventActivities> getLoadEventActivities();
	public void addLoadEventActivities(LoadEventActivities leac);
	
	public List<LoadEventLocation> getLoadEventLocation();
	public void addLoadEventLocation(LoadEventLocation lel);
	
	public List<LoadAddressGeoLoc> getLoadAddressGeoLoc();
	public void addLoadAddressGeoLoc(LoadAddressGeoLoc lac);
	
	public List<Shipments> getShipments();
	public void addShipments(Shipments sh);
	
	public List<ShipmentDetails> getShipmentDetails();
	public void addShipmentDetails(ShipmentDetails sd);
	
	public List<ExtraShipmentDetails> getExtraShipmentDetails();
	public void addExtraShipmentDetails(ExtraShipmentDetails esd);
	
	public List<ShipmentTerminalInfo> getShipmentTerminalInfo();
	public void addShipmentTerminalInfo(ShipmentTerminalInfo sti);
	
	public List<ShipmentQuantities> getShipmentQuantities();
	public void addShipmentQuantities(ShipmentQuantities sq);
	
	public List<ShipmentWeights> getShipmentWeights();
	public void addShipmentWeights(ShipmentWeights sw);
	
	public List<ShipmentDimensions> getShipmentDimensions();
	public void addShipmentDimensions(ShipmentDimensions sdim);
	
	public List<ShipmentPickupDate> getShipmentPickupDate();
	public void addShipmentPickupDate(ShipmentPickupDate spd);
	
	public List<ShipmentDropDate> getShipmentDropDate();
	public void addShipmentDropDate(ShipmentDropDate sdd);
	
	public List<ShipperAddress> getShipperAddress();
	public void addShipperAddress(ShipperAddress sa);
	
	public List<ShipperGeoLoc> getShipperGeoLoc();
	public void addShipperGeoLoc(ShipperGeoLoc sgl);
	
	public List<ShipmentConsigneeAddress> getShipmentConsigneeAddress();
	public void addShipmentConsigneeAddress(ShipmentConsigneeAddress sca);
	
	public List<ShipmentConsigneeGeoLoc> getShipmentConsigneeGeoLoc();
	public void addShipmentConsigneeGeoLoc(ShipmentConsigneeGeoLoc scgl);
	
	public List<ShipmentConsigneePackageGeoLoc> getShipmentConsigneePackageGeoLoc();
	public void addShipmentConsigneePackageGeoLoc(ShipmentConsigneePackageGeoLoc scp);
	
	public List<ShipmentPackageDimensions> getShipmentPackageDimensions();
	public void addShipmentPackageDimensions(ShipmentPackageDimensions spdim);
	
	public List<ShipmentPackageWeight> getShipmentPackageWeight();
	public void addShipmentPackageWeight(ShipmentPackageWeight spw);
	
	public List<ShipmentItemGroups> getShipmentItemGroups();
	public void addShipmentItemGroups(ShipmentItemGroups sig);
	
	public List<ShipmentItemGroupWeights> getShipmentItemGroupWeights();
	public void addShipmentItemGroupWeights(ShipmentItemGroupWeights sigw);
	
	public List<ShipmentItemGroupQuantities> getShipmentItemGroupQuantities();
	public void addShipmentItemGroupQuantities(ShipmentItemGroupQuantities sigq);
	
	public List<ShipmentItemGroupDimensions> getShipmentItemGroupDimensions();
	public void addShipmentItemGroupDimensions(ShipmentItemGroupDimensions sigd);
	
	public List<ShipmentItemGroupFreightClass> getShipmentItemGroupFreightClass();
	public void addShipmentItemGroupFreightClass(ShipmentItemGroupFreightClass sigfc);
	
	public List<ShipmentLineItemNumberAndWeights> getShipmentLineItemNumberAndWeights();
	public void addShipmentLineItemNumberAndWeights(ShipmentLineItemNumberAndWeights slinw);
	
	public List<ShipmentLineItemQuantities> getShipmentLineItemQuantities();
	public void addShipmentLineItemQuantities(ShipmentLineItemQuantities sliq);
	
	public List<ShipmentLineItemDimensions> getShipmentLineItemDimensions();
	public void addShipmentLineItemDimensions(ShipmentLineItemDimensions slid);
	
	public List<ShipmentPriceSheets> getShipmentPriceSheets();
	public void addShipmentPriceSheets(ShipmentPriceSheets sps);
	
	public List<ShipmentCarrierInfo> getShipmentCarrierInfo();
	public void addShipmentCarrierInfo(ShipmentCarrierInfo sci);
	
	public List<ShipmentInsuranceTypes> getShipmentInsuranceTypes();
	public void addShipmentInsuranceTypes(ShipmentInsuranceTypes sit);
	
	public List<ShipmentCarrierAddress> getShipmentCarrierAddress();
	public void addShipmentCarrierAddress(ShipmentCarrierAddress sca);
	
	public List<ShipmentInsuranceGeoloc> getShipmentInsuranceGeoloc();
	public void addShipmentInsuranceGeoloc(ShipmentInsuranceGeoloc sigl);
	
	public List<ShipmentPriceSheetCharges> getShipmentPriceSheetCharges();
	public void addShipmentPriceSheetCharges(ShipmentPriceSheetCharges spsc);
	
	public List<ShipmentActivities> getShipmentActivities();
	public void addShipmentActivities(ShipmentActivities shac);
	
	public List<ShipmentMargins> getShipmentMargins();
	public void addShipmentMargins(ShipmentMargins sm);
	
	

}
