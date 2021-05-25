package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbconnection.SingletonConnection;

public class EntityImplementation implements EntityInterface{

	@Override
	public List<HeaderDetails> getHeaderDetailsByKeyword(String kw) {
		List <HeaderDetails> headerdetails = new ArrayList<HeaderDetails>();
		Connection conn=SingletonConnection.getConnection();
		
			try {
				PreparedStatement ps= conn.prepareStatement("select * from HeaderDetails where DocTypeID like ? ");
				ps.setString(1, "%"+kw+"%");
				ResultSet rs= ps.executeQuery();
				
				while(rs.next())
				{
					HeaderDetails hd= new HeaderDetails();
					
					hd.setSenderID(rs.getString("SenderID"));
					hd.setReceiverID(rs.getString("ReceiverID"));
					hd.setDocTypeID(rs.getString("DocTypeID"));
					hd.setDocCount(rs.getString("DocCount"));
					hd.setDate(rs.getString("Date"));
					headerdetails.add(hd);
				}
				
				ps.close(); 
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return headerdetails;
	}
	
	@Override
	public List<ExtractRequestInfo> getExtractRequestInfo(){
		List <ExtractRequestInfo>  exreqinf = new ArrayList<ExtractRequestInfo>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ExtractRequestInfo");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
						ExtractRequestInfo erif= new ExtractRequestInfo();
						
						erif.setReason(rs.getString("Reason"));
						erif.setDate(rs.getString("Date"));
						 exreqinf.add(erif);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return  exreqinf;
	}

	@Override
	public List<UserDetails> getUserDetails()
	{
	List <UserDetails>  uDetails = new ArrayList<UserDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from UserDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
						UserDetails ud= new UserDetails();
						
						ud.setInternalId(rs.getString("internalId"));
						ud.setLastName(rs.getString("LastName"));
						ud.setFirstName(rs.getString("FirstName"));
						ud.setUserId(rs.getString("UserId"));
						ud.setSequenceNum(rs.getInt("sequenceNum"));
						ud.setType(rs.getString("type"));
						ud.setContactMethod(rs.getString("ContactMethod"));
						uDetails.add(ud);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return uDetails;

	}
	
	@Override
	public List<LoadDetails> getLoadDetails()
	{
	List <LoadDetails>  lDetails = new ArrayList<LoadDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
						LoadDetails ld= new LoadDetails();
						
						ld.setLoadRefNumber (rs.getString("loadRefNumber"));
						ld.setInternalId(rs.getString("internalId"));
						ld.setType(rs.getString("type"));
						ld.setCreateBy(rs.getString("createBy"));
						ld.setCreateDate(rs.getString("createDate"));
						ld.setUpdateDate(rs.getString("updateDate"));
						ld.setLoadRefInternalId(rs.getString("loadRefInternalId"));
						ld.setLoadRefIsPrimary(rs.getString("loadRefIsPrimary"));
						ld.setLoadRefType(rs.getString("loadRefType"));
						lDetails.add(ld);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lDetails;
	}
	
	@Override
	public List<LoadExtraDetails> getLoadExtraDetails()
	{
	List <LoadExtraDetails>  lExDetails = new ArrayList<LoadExtraDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadExtraDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
						LoadExtraDetails led= new LoadExtraDetails();
						
						led.setHandlingUnits(rs.getDouble("HandlingUnits"));
						led.setRelatedCustomerLoads(rs.getString("RelatedCustomerLoads"));
						led.setComments(rs.getString("Comments"));
						led.setServices(rs.getString("Services"));
						lExDetails.add(led);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lExDetails;
	}
	
	
	@Override
	public List<LoadPackageDimensions> getLoadPackageDimensions()
	{
	List <LoadPackageDimensions>  lopadim = new ArrayList<LoadPackageDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadPackageDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadPackageDimensions lpd= new LoadPackageDimensions();
						
						lpd.setPackagetype(rs.getString("packagetype"));
						lpd.setInternalId(rs.getString("internalId"));
						lpd.setType(rs.getString("type"));
						lpd.setUom(rs.getString("uom"));
						lpd.setDim(rs.getString("dim"));
						lpd.setDimension(rs.getDouble("Dimension"));
						lopadim.add(lpd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lopadim;
	}
	
	
	@Override
	public List<LoadPackageWeights> getLoadPackageWeights()
	{
	List <LoadPackageWeights>  lopawei = new ArrayList<LoadPackageWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadPackageWeights");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadPackageWeights lpw= new LoadPackageWeights();
						
						lpw.setPackagetype(rs.getString("packagetype"));
						lpw.setInternalId(rs.getString("internalId"));
						lpw.setType(rs.getString("type"));
						lpw.setUom(rs.getString("uom"));
						lpw.setWeight(rs.getString("Weight"));
						lopawei.add(lpw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lopawei;
	}
	
	@Override
	public List<LoadItemGroups> getLoadItemGroups()
	{
	List <LoadItemGroups>  lodig = new ArrayList<LoadItemGroups>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadItemGroups");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadItemGroups lig= new LoadItemGroups();
						
						lig.setInternalId(rs.getString("internalId"));
						lig.setSequence(rs.getString("sequence"));
						lig.setIsHandlingUnit(rs.getString("isHandlingUnit"));
						lig.setIsShipUnit(rs.getString("isShipUnit"));
						lig.setDescription(rs.getString("Description"));
						lig.setContainmentId(rs.getString("ContainmentId"));
						lodig.add(lig);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lodig;
	
	}
	
	
	@Override
	public List<LoadWeights> getLoadWeights()
	{
	List <LoadWeights>  lWeights = new ArrayList<LoadWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadWeights");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadWeights lw= new LoadWeights();
						
						lw.setType(rs.getString("type"));
						lw.setUom(rs.getString("uom"));
						lw.setWeight(rs.getDouble("Weight"));
						lWeights.add(lw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lWeights;
	
	}
	
	@Override
	public List<LoadQuantities> getLoadQuantities()
	{
	List <LoadQuantities>  lQuantities = new ArrayList<LoadQuantities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadQuantities");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadQuantities lq= new LoadQuantities();
						
						lq.setType(rs.getString("type"));
						lq.setUom(rs.getString("uom"));
						lq.setQuantity(rs.getDouble("Quantity"));
						lQuantities.add(lq);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lQuantities;
	}
	
	
	@Override
	public List<LoadDimensions> getLoadDimensions()
	{
	List <LoadDimensions>  lDimensions = new ArrayList<LoadDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadDimensions ld= new LoadDimensions();
						
						ld.setType(rs.getString("type"));
						ld.setUom(rs.getString("uom"));
						ld.setDim(rs.getString("dim"));
						ld.setDimension(rs.getDouble("Dimension"));
						lDimensions.add(ld);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lDimensions;
	}
	
	
	@Override
	public List<LoadFreightClass> getLoadFreightClass()
	{
	List <LoadFreightClass>  lFClass = new ArrayList<LoadFreightClass>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadFreightClass");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadFreightClass lfc= new LoadFreightClass();
						
						lfc.setType(rs.getString("type"));
						lfc.setFreightClass(rs.getString("FreightClass"));
						lfc.setTrackingNumber(rs.getString("TrackingNumber"));
						lfc.setDeliveryStatus(rs.getString("DeliveryStatus"));
						lfc.setEquipmentRequired(rs.getString("EquipmentRequired"));
						lFClass.add(lfc);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lFClass;
	}
	
	
	@Override
	public List<LoadReferenceNumbers> getLoadReferenceNumbers()
	{
	List <LoadReferenceNumbers>  lRefNum = new ArrayList<LoadReferenceNumbers>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadReferenceNumbers");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadReferenceNumbers lrn= new LoadReferenceNumbers();
						
						lrn.setType(rs.getString("type"));
						lrn.setInternalId(rs.getString("internalId"));
						lrn.setIsPrimary(rs.getString("isPrimary"));
						lrn.setReferenceNumber(rs.getString("ReferenceNumber"));
						lRefNum.add(lrn);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lRefNum;
	}
	
	
	@Override
	public List<LoadItemWeights> getLoadItemWeights()
	{
	List <LoadItemWeights>  lItWeights = new ArrayList<LoadItemWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadItemWeights ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadItemWeights liw= new LoadItemWeights();
					
					    liw.setInternalId(rs.getString("internalId"));
						liw.setLineNumber(rs.getString("lineNumber"));
						liw.setType(rs.getString("type"));
						liw.setUom(rs.getString("uom"));
						liw.setWeight(rs.getDouble("Weight"));
						lItWeights.add(liw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lItWeights;
	}

	
	@Override
	public List<LoadItemQuantities> getLoadItemQuantities()
	{
	List <LoadItemQuantities>  lItQuantities = new ArrayList<LoadItemQuantities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadItemQuantities ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadItemQuantities liq= new LoadItemQuantities();
					
					    liq.setInternalId(rs.getString("internalId"));
						liq.setLineNumber(rs.getString("lineNumber"));
						liq.setType(rs.getString("type"));
						liq.setUom(rs.getString("uom"));
						liq.setQuantity(rs.getDouble("Quantity"));
						lItQuantities.add(liq);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lItQuantities;
	}
	
	
	
	@Override
	public List<LoadLineItemDetails> getLoadLineItemDetails()
	{
	List <LoadLineItemDetails>  lliDetails = new ArrayList<LoadLineItemDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadLineItemDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadLineItemDetails llineid= new LoadLineItemDetails();
					
					llineid.setItemId(rs.getString("ItemId"));
					llineid.setDescription(rs.getString("Description"));
					llineid.setFreightClass(rs.getDouble("FreightClass"));
					llineid.setCommodity(rs.getString("Commodity"));
					llineid.setNmfcCode(rs.getString("NmfcCode"));
					llineid.setStccCode(rs.getString("StccCode"));
					llineid.setCustomerPartNum(rs.getString("CustomerPartNum"));
					llineid.setManufacturerPartNum(rs.getString("ManufacturerPartNum"));
					llineid.setDistributorPartNum(rs.getString("DistributorPartNum"));
					llineid.setUom(rs.getString("uom"));
					llineid.setCube(rs.getString("Cube"));
					llineid.setHazardousMaterial(rs.getString("HazardousMaterial"));
					lliDetails.add(llineid);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lliDetails;
	}
	
	
	
	@Override
	public List<LoadExtraLineItemDetails> getLoadExtraLineItemDetails()
	{
	List <LoadExtraLineItemDetails>  lExid = new ArrayList<LoadExtraLineItemDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadExtraLineItemDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadExtraLineItemDetails leid= new LoadExtraLineItemDetails();
					
					leid.setHazMatDetail(rs.getString("HazMatDetail"));
					leid.setProperShippingName(rs.getString("ProperShippingName"));
					leid.setHazMatID(rs.getString("HazMatID"));
					leid.setPackageGroup(rs.getString("PackageGroup"));
					leid.setHazMatClass(rs.getString("HazMatClass"));
					leid.setContactName(rs.getString("ContactName"));
					leid.setContactPhone(rs.getString("ContactPhone"));
					leid.setHazMatPlacards(rs.getString("HazMatPlacards"));
					leid.setHazMatPlacardsDetails(rs.getString("HazMatPlacardsDetails"));
					leid.setHazMatEMSNumber(rs.getString("HazMatEMSNumber"));
					leid.setHazMatFlashPointTemp(rs.getString("HazMatFlashPointTemp"));
					leid.setComments(rs.getString("Comments"));
					lExid.add(leid);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lExid;
	}
	
	
	
	@Override
	public List<LoadLineItemDimensions> getLoadLineItemDimensions()
	{
	List <LoadLineItemDimensions>  lLidim = new ArrayList<LoadLineItemDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadLineItemDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadLineItemDimensions llid= new LoadLineItemDimensions();
					
					llid.setType(rs.getString("type"));
					llid.setUom(rs.getString("uom"));
					llid.setDim(rs.getString("dim"));
					llid.setDimension(rs.getDouble("Dimension"));
					llid.setHarmonizedTariffCode(rs.getString("HarmonizedTariffCode"));
					llid.setPortOfLading(rs.getString("PortOfLading"));
					llid.setCountryOfOrigin(rs.getString("CountryOfOrigin"));
					llid.setCountryOfManufacture(rs.getString("CountryOfManufacture"));
					llid.setCustomsValue(rs.getString("CustomsValue"));
					llid.setCustomsValueCurrency(rs.getString("CustomsValueCurrency"));
					llid.setInsuredValue(rs.getString("InsuredValue"));
					llid.setInsuredValueCurrency(rs.getString("InsuredValueCurrency"));
					llid.setAESExportCode(rs.getString("AESExportCode"));
					llid.setScheduleBNumber(rs.getString("ScheduleBNumber"));
					llid.setDomestic(rs.getString("Domestic"));
					llid.setECCN(rs.getString("ECCN"));
					llid.setOriginationCountry(rs.getString("OriginationCountry"));
					llid.setManufacturingCountry(rs.getString("ManufacturingCountry"));
					llid.setLicenseNumber(rs.getString("LicenseNumber"));
					llid.setLicenseType(rs.getString("LicenseType"));
					llid.setEquipmentList(rs.getString("EquipmentList"));
					llid.setScheduledEquipment(rs.getString("ScheduledEquipment"));
					lLidim.add(llid);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lLidim;
	}
	
	
	@Override
	public List<LoadPaymentMethod> getLoadPaymentMethod()
	{
	List <LoadPaymentMethod>  lPMethod = new ArrayList<LoadPaymentMethod>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadPaymentMethod ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadPaymentMethod lpm= new LoadPaymentMethod();
					
					    lpm.setMethod(rs.getString("Method"));
					    lpm.setContact(rs.getString("Contact"));
						lpm.setComments(rs.getString("Comments"));
						lPMethod.add(lpm);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lPMethod;
	}
	
	
	@Override
	public List<LoadBillingAddress> getLoadBillingAddress()
	{
	List <LoadBillingAddress>  lBAddrs = new ArrayList<LoadBillingAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadBillingAddress ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadBillingAddress lba= new LoadBillingAddress();
					
					    lba.setInternalId(rs.getString("internalId"));
					    lba.setType(rs.getString("type"));
						lba.setIsPrimary(rs.getString("isPrimary"));
						lba.setIsResidential(rs.getString("isResidential"));
						lba.setOwner(rs.getString("Owner"));
						lba.setCustomerAcctNum(rs.getString("CustomerAcctNum"));
						lba.setLocationCode(rs.getString("LocationCode"));
						lba.setName(rs.getString("Name"));
						lba.setAddrLine1(rs.getString("AddrLine1"));
						lba.setAddrLine2(rs.getString("AddrLine2"));
						lba.setCity(rs.getString("City"));
						lba.setStateProvince(rs.getString("StateProvince"));
						lba.setPostalCode(rs.getString("PostalCode"));
						lba.setCountryCode(rs.getString("CountryCode"));
						 lBAddrs.add(lba);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return  lBAddrs ;
	}
	
	
	
	@Override
	public List<LoadGeoLocation> getLoadGeoLocation()
	{
	List <LoadGeoLocation>  lGLocation = new ArrayList<LoadGeoLocation>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadGeoLocation");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadGeoLocation lgl= new LoadGeoLocation();
					
					    lgl.setLongDirection(rs.getString("longDirection"));
					    lgl.setLongDegrees(rs.getString("longDegrees"));
						lgl.setLatDirection(rs.getString("latDirection"));
						lgl.setLatDegrees(rs.getString("latDegrees"));
						lGLocation.add(lgl);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lGLocation;
	}
	
	
	
	@Override
	public List<LoadPODRecieved> getLoadPODRecieved()
	{
	List <LoadPODRecieved>  lPODR = new ArrayList<LoadPODRecieved>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadPODRecieved");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadPODRecieved lpr= new LoadPODRecieved();
					
					    lpr.setPODReceived(rs.getString("PODReceived"));
					    lpr.setProofOfPickupReceived(rs.getString("ProofOfPickupReceived"));
						lpr.setStatus(rs.getString("Status"));
						lpr.setAssignedTo(rs.getString("AssignedTo"));
						lpr.setOwner(rs.getString("Owner"));
						lPODR.add(lpr);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lPODR;
	}
	
	
	@Override
	public List<LoadAudits> getLoadAudits()
	{
	List <LoadAudits>  lAudits = new ArrayList<LoadAudits>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadAudits");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadAudits la= new LoadAudits();
					
					    la.setAction(rs.getString("action"));
					    la.setUser(rs.getString("user"));
						la.setTimestamp(rs.getString("timestamp"));
						la.setAudit(rs.getString("Audit"));
						lAudits.add(la);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lAudits;
	}
	
	
	@Override
	public List<LoadCarriers> getLoadCarriers()
	{
	List <LoadCarriers>  lCarriers = new ArrayList<LoadCarriers>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadCarriers");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadCarriers lc= new LoadCarriers();
					
					    lc.setInternalId(rs.getString("internalId"));
					    lc.setType(rs.getString("type"));
						lc.setCarrierId(rs.getString("CarrierId"));
						lc.setCarrierName(rs.getString("CarrierName"));
						lc.setSCAC(rs.getString("SCAC"));
						lc.setMode(rs.getString("Mode"));
						lc.setService(rs.getString("Service"));
						lc.setServiceDays(rs.getString("ServiceDays"));
						lc.setId(rs.getString("Id"));
						lc.setMCNumber(rs.getString("MCNumber"));
						lc.setUSDOT(rs.getString("USDOT"));
						lCarriers.add(lc);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lCarriers;
	}
	
	
	@Override
	public List<LoadInsuranceType> getLoadInsuranceType()
	{
	List <LoadInsuranceType>  lIType = new ArrayList<LoadInsuranceType>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadInsuranceType");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadInsuranceType lit= new LoadInsuranceType();
					
					    lit.setType(rs.getString("type"));
					    lit.setContactPhone(rs.getString("contactPhone"));
						lit.setContactName(rs.getString("contactName"));
						lit.setExpirationDate(rs.getString("expirationDate"));
						lit.setCompany(rs.getString("company"));
						lit.setAmount(rs.getString("amount"));
						lIType.add(lit);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lIType;
	}
	
	
	
	@Override
	public List<LoadCarrierAddress> getLoadCarrierAddress()
	{
	List <LoadCarrierAddress>  lCAddress = new ArrayList<LoadCarrierAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadCarrierAddress");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadCarrierAddress lca= new LoadCarrierAddress();
					
					lca.setInternalId(rs.getString("internalId"));
					lca.setType(rs.getString("type"));
					lca.setIsPrimary(rs.getString("isPrimary"));
					lca.setIsResidential(rs.getString("isResidential"));
					lca.setOwner(rs.getString("Owner"));
					lca.setCustomerAcctNum(rs.getString("CustomerAcctNum"));
					lca.setLocationCode(rs.getString("LocationCode"));
					lca.setName(rs.getString("Name"));
					lca.setAddrLine1(rs.getString("AddrLine1"));
					lca.setAddrLine2(rs.getString("AddrLine2"));
					lca.setCity(rs.getString("City"));
					lca.setStateProvince(rs.getString("StateProvince"));
					lca.setPostalCode(rs.getString("PostalCode"));
					lca.setCountryCode(rs.getString("CountryCode"));
					lCAddress.add(lca);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lCAddress;
	}
	
	
	@Override
	public List<LoadCarrierGeoLocation> getLoadCarrierGeoLocation()
	{
	List <LoadCarrierGeoLocation>  lCGLocation = new ArrayList<LoadCarrierGeoLocation>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadCarrierGeoLocation");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadCarrierGeoLocation lcgl= new LoadCarrierGeoLocation();
					
					    lcgl.setLongDirection(rs.getString("longDirection"));
					    lcgl.setLongDegrees(rs.getString("longDegrees"));
						lcgl.setLatDirection(rs.getString("latDirection"));
						lcgl.setLatDegrees(rs.getString("latDegrees"));
						lCGLocation.add(lcgl);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lCGLocation;
	}
	
	
	@Override
	public List<LoadContacts> getLoadContacts(){
		List <LoadContacts>  lContacts = new ArrayList<LoadContacts>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadContacts");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadContacts lco= new LoadContacts();
						
						lco.setOid(rs.getString("oid"));
						lco.setType(rs.getString("type"));
						lco.setName(rs.getString("Name"));
						lco.setContactMethods(rs.getString("ContactMethods"));
						lContacts.add(lco);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lContacts;
	}
	
	@Override
	public List<LoadCarrierTerminalInfo> getLoadCarrierTerminalInfo(){
		List <LoadCarrierTerminalInfo>  lCTInfo = new ArrayList<LoadCarrierTerminalInfo>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadCarrierTerminalInfo");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadCarrierTerminalInfo lcti= new LoadCarrierTerminalInfo();
						
						lcti.setTerminalType(rs.getString("TerminalType"));
						lcti.setOrigin(rs.getString("Origin"));
						lcti.setDestination(rs.getString("Destination"));
						lCTInfo.add(lcti);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lCTInfo;
	}
	
	
	@Override
	public List<LoadPickupDates> getLoadPickupDates(){
		List <LoadPickupDates>  lPDates = new ArrayList<LoadPickupDates>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadPickupDates");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadPickupDates lpd= new LoadPickupDates();
						
						lpd.setPickupType(rs.getString("PickupType"));
						lpd.setDateTime(rs.getString("Date/Time"));
						lPDates.add(lpd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lPDates;
	}
	
	@Override
	public List<LoadDropDates> getLoadDropDates(){
		List<LoadDropDates>  lDDates = new ArrayList<LoadDropDates>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadDropDates");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadDropDates ldd= new LoadDropDates();
						
						ldd.setDropOffType(rs.getString("DropOffType"));
						ldd.setDateTime(rs.getString("Date/Time"));
						lDDates.add(ldd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lDDates;
	}
	
	
	@Override
	public List<LoadEventPlan> getLoadEventPlan()
	{
	List <LoadEventPlan>  lEPlan = new ArrayList<LoadEventPlan>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadEventPlan");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadEventPlan lep= new LoadEventPlan();
						
						
						lep.setInternalId(rs.getString("internalId"));
						lep.setCount(rs.getString("count"));
						lep.setSequenceNum(rs.getString("sequenceNum"));
						lep.setEventtype(rs.getString("eventtype"));
						lep.setCarrierActionCode(rs.getString("CarrierActionCode"));
						lep.setAppointmentNumber(rs.getString("AppointmentNumber"));
						lep.setLateReason(rs.getString("LateReason"));
						lep.setAppointmentType(rs.getString("AppointmentType"));
						lep.setDateType(rs.getString("DateType"));
						lep.setDate(rs.getString("Date"));
						lEPlan.add(lep);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lEPlan;
	}
	
	
	@Override
	public List<LoadEventAddress> getLoadEventAddress()
	{
	List <LoadEventAddress>  lEAddrs = new ArrayList<LoadEventAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadEventAddress");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadEventAddress lea= new LoadEventAddress();
					
					    lea.setAdresstype(rs.getString("adresstype"));
					    lea.setInternalId(rs.getString("internalId"));
						lea.setIsPrimary(rs.getString("isPrimary"));
						lea.setIsResidential(rs.getString("isResidential"));
						lea.setLocationCode(rs.getString("LocationCode"));
						lea.setName(rs.getString("Name"));
						lea.setAddrLine1(rs.getString("AddrLine1"));
						lea.setAddrLine2(rs.getString("AddrLine2"));
						lea.setCity(rs.getString("City"));
						lea.setStateProvince(rs.getString("StateProvince"));
						lea.setPostalCode(rs.getString("PostalCode"));
						lea.setCountryCode(rs.getString("CountryCode"));
						lea.setContact(rs.getString("Contact"));
						lea.setComments(rs.getString("Comments"));
						 lEAddrs.add(lea);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return  lEAddrs ;
	}
	
	
	@Override
	public List<LoadEventWeights> getLoadEventWeights(){
		List<LoadEventWeights>  lEWeights = new ArrayList<LoadEventWeights>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadEventWeights");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadEventWeights lew= new LoadEventWeights();
						
						lew.setWeightType(rs.getString("WeightType"));
						lew.setUom(rs.getString("uom"));
						lew.setWeight(rs.getString("Weight"));
						 lEWeights.add(lew);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lEWeights;
	}
	
	
	@Override
	public List<LoadShipmentPlan> getLoadShipmentPlan(){
		List<LoadShipmentPlan>  lSPlan = new ArrayList<LoadShipmentPlan>();
		Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadShipmentPlan");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadShipmentPlan lsp= new LoadShipmentPlan();
						
						lsp.setReferenceNumber(rs.getString("ReferenceNumber"));
						lsp.setType(rs.getString("type"));
						lsp.setInternalId(rs.getString("internalId"));
						lsp.setIsPrimary(rs.getString("isPrimary"));
						lSPlan.add(lsp);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lSPlan;
	}
	
	
	@Override
	public List<LoadEventActivities> getLoadEventActivities()
	{
	List <LoadEventActivities>  lEActivities = new ArrayList<LoadEventActivities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadEventActivities");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadEventActivities leac= new LoadEventActivities();
					
					leac.setType(rs.getString("type"));
					leac.setInternalId(rs.getString("internalId"));
					leac.setUpdateDate(rs.getString("updateDate"));
					leac.setUpdateBy(rs.getString("updateBy"));
					leac.setCreateDate(rs.getString("createDate"));
					leac.setCreateBy(rs.getString("createBy"));
					leac.setActivityID(rs.getString("ActivityID"));
					leac.setSummary(rs.getString("Summary"));
					leac.setPriority(rs.getString("Priority"));
					leac.setRequired(rs.getString("Required"));
					leac.setStatus(rs.getString("Status"));
					leac.setAssignedTo(rs.getString("AssignedTo"));
					leac.setPlannedDate(rs.getString("PlannedDate"));
					leac.setPercentageComplete(rs.getString("PercentageComplete"));
					leac.setCompletedDate(rs.getString("CompletedDate"));
					leac.setTimeZone(rs.getString("TimeZone"));
					leac.setStatusDetails(rs.getString("StatusDetails"));
					lEActivities.add(leac);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lEActivities;
	}
	
	
	@Override
	public List<LoadEventLocation> getLoadEventLocation()
	{
	List <LoadEventLocation>  lELocation = new ArrayList<LoadEventLocation>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadEventLocation");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadEventLocation lel= new LoadEventLocation();
					
					    lel.setType(rs.getString("type"));
					    lel.setInternalId(rs.getString("internalId"));
						lel.setIsPrimary(rs.getString("isPrimary"));
						lel.setIsResidential(rs.getString("isResidential"));
						lel.setLocationCode(rs.getString("LocationCode"));
						lel.setName(rs.getString("Name"));
						lel.setAddrLine1(rs.getString("AddrLine1"));
						lel.setAddrLine2(rs.getString("AddrLine2"));
						lel.setCity(rs.getString("City"));
						lel.setStateProvince(rs.getString("StateProvince"));
						lel.setPostalCode(rs.getString("PostalCode"));
						lel.setCountryCode(rs.getString("CountryCode"));
						lel.setContact(rs.getString("Contact"));
						lel.setComments(rs.getString("Comments"));
						lELocation.add(lel);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lELocation;
	}
	
	
	@Override
	public List<LoadAddressGeoLoc> getLoadAddressGeoLoc()
	{
	List <LoadAddressGeoLoc>  lAGeoLoc = new ArrayList<LoadAddressGeoLoc>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadAddressGeoLoc");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					LoadAddressGeoLoc lac= new LoadAddressGeoLoc();
					
					    lac.setLongDirection(rs.getString("longDirection"));
					    lac.setLongDegrees(rs.getString("longDegrees"));
						lac.setLatDirection(rs.getString("latDirection"));
						lac.setLatDegrees(rs.getString("latDegrees"));
						lAGeoLoc.add(lac);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return lAGeoLoc;
	}
	
	
	@Override
	public List<Shipments> getShipments()
	{
	List <Shipments>  shipments = new ArrayList<Shipments>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from Shipments");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					Shipments sh= new Shipments();
					
					    sh.setCreateBy(rs.getString("createBy"));
					    sh.setCreateDate(rs.getString("createDate"));
						sh.setUpdateBy(rs.getString("updateBy"));
						sh.setUpdateDate(rs.getString("updateDate"));
						sh.setInternalId(rs.getString("internalId"));
						sh.setType(rs.getString("type"));
						shipments.add(sh);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return shipments;
	}
	
	
	@Override
	public List<ShipmentDetails> getShipmentDetails()
	{
	List <ShipmentDetails>  sDetails = new ArrayList<ShipmentDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentDetails sd= new ShipmentDetails();
					
					    sd.setCreatedBy(rs.getString("createdBy"));
					    sd.setCreateDate(rs.getString("createDate"));
						sd.setUpdateBy(rs.getString("updateBy"));
						sd.setUpdateDate(rs.getString("updateDate"));
						sd.setInternalId(rs.getString("internalId"));
						sd.setType(rs.getString("type"));
						sd.setShipmentRefNumber(rs.getString("shipmentRefNumber"));
						sd.setShipmentRefInternalId(rs.getString("shipmentRefInternalId"));
						sd.setShipmentRefIsPrimary(rs.getString("shipmentRefIsPrimary"));	
						sd.setShipmentRefType(rs.getString("shipmentRefType"));
						sDetails.add(sd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sDetails;
	}
	
	
	@Override
	public List<ExtraShipmentDetails> getExtraShipmentDetails()
	{
	List <ExtraShipmentDetails>  eSDetails = new ArrayList<ExtraShipmentDetails>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ExtraShipmentDetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ExtraShipmentDetails esd= new ExtraShipmentDetails();
					
					    esd.setComments(rs.getString("Comments"));
					    esd.setStatus(rs.getString("Status"));
						esd.setAssignedTo(rs.getString("AssignedTo"));
						esd.setOwner(rs.getString("Owner"));
						esd.setAudits(rs.getString("Audits"));
						esd.setQuoteDetail(rs.getString("QuoteDetail"));
						esd.setQuotedTo(rs.getString("QuotedTo"));
						esd.setQuotePhone(rs.getString("QuotePhone"));
						esd.setQuoteFax(rs.getString("QuoteFax"));	
						esd.setQuoteEmail(rs.getString("QuoteEmail"));
						esd.setQuoteDate(rs.getString("QuoteDate"));
						esd.setQuoteBy(rs.getString("QuoteBy"));
						eSDetails.add(esd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return eSDetails;
	}
	
	
	@Override
	public List<ShipmentTerminalInfo> getShipmentTerminalInfo()
	{
	List <ShipmentTerminalInfo>  sTInfo = new ArrayList<ShipmentTerminalInfo>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentTerminalInfo ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentTerminalInfo sti= new ShipmentTerminalInfo();
					
					    sti.setTerminalType(rs.getString("TerminalType"));
						sti.setOrigin(rs.getString("Origin"));
						sti.setDestination(rs.getString("Destination"));
						sti.setEquipmentList(rs.getString("EquipmentList"));
						sti.setScheduledEquipment(rs.getString("ScheduledEquipment"));
						sTInfo.add(sti);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sTInfo;
	}
	
	
	@Override
	public List<ShipmentQuantities> getShipmentQuantities()
	{
	List <ShipmentQuantities>  sQuantities = new ArrayList<ShipmentQuantities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentQuantities ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentQuantities sq= new ShipmentQuantities();
					
					    sq.setType(rs.getString("type"));
						sq.setUom(rs.getString("uom"));
						sq.setQuantity(rs.getString("Quantity"));
						sQuantities.add(sq);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sQuantities;
	}
	
	
	@Override
	public List<ShipmentWeights> getShipmentWeights()
	{
	List <ShipmentWeights>  sWeights = new ArrayList<ShipmentWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentWeights ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentWeights sw= new ShipmentWeights();
					
					    sw.setType(rs.getString("type"));
						sw.setUom(rs.getString("uom"));
						sw.setWeight(rs.getString("Weight"));
						sWeights.add(sw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sWeights;
	}
	
	
	@Override
	public List<ShipmentDimensions> getShipmentDimensions()
	{
	List <ShipmentDimensions>  sDimensions = new ArrayList<ShipmentDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentDimensions ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentDimensions sdim= new ShipmentDimensions();
					
					    sdim.setType(rs.getString("type"));
						sdim.setUom(rs.getString("uom"));
						sdim.setDim(rs.getString("dim"));
						sdim.setDimension(rs.getString("Dimension"));
						sDimensions.add(sdim);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sDimensions;
	}
	
	@Override
	public List<ShipmentPickupDate> getShipmentPickupDate()
	{
	List <ShipmentPickupDate>  sPDate = new ArrayList<ShipmentPickupDate>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentPickupDate");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentPickupDate spd= new ShipmentPickupDate();
					
					    spd.setPickuptype(rs.getString("pickuptype"));
						spd.setDate(rs.getString("Date"));
						sPDate.add(spd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sPDate;
	}
	
	
	@Override
	public List<ShipmentDropDate> getShipmentDropDate()
	{
	List <ShipmentDropDate>  sDDate = new ArrayList<ShipmentDropDate>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentDropDate");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentDropDate sdd= new ShipmentDropDate();
					
					    sdd.setDroptype(rs.getString("droptype"));
						sdd.setDate(rs.getString("Date"));
						sdd.setPriceSheets (rs.getString("PriceSheets"));
						sDDate.add(sdd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sDDate;
	}
	
	
	@Override
	public List<ShipperAddress> getShipperAddress()
	{
	List <ShipperAddress>  sAddrs = new ArrayList<ShipperAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipperAddress");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipperAddress sa= new ShipperAddress();
					
					    sa.setType(rs.getString("type"));
					    sa.setInternalId(rs.getString("internalId"));
						sa.setIsPrimary(rs.getString("isPrimary"));
						sa.setIsResidential(rs.getString("isResidential"));
						sa.setLocationCode(rs.getString("LocationCode"));
						sa.setName(rs.getString("Name"));
						sa.setAddrLine1(rs.getString("AddrLine1"));
						sa.setAddrLine2(rs.getString("AddrLine2"));
						sa.setCity(rs.getString("City"));
						sa.setStateProvince(rs.getString("StateProvince"));
						sa.setPostalCode(rs.getString("PostalCode"));
						sa.setCountryCode(rs.getString("CountryCode"));
						sa.setContact(rs.getString("Contact"));
						sa.setComments(rs.getString("Comments"));
						sAddrs .add(sa);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sAddrs;
	}
	
	
	@Override
	public List<ShipperGeoLoc> getShipperGeoLoc()
	{
	List <ShipperGeoLoc>  sGLoc = new ArrayList<ShipperGeoLoc>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from LoadGeoLocation");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipperGeoLoc sgl= new ShipperGeoLoc();
					
					    sgl.setLongDirection(rs.getString("longDirection"));
					    sgl.setLongDegrees(rs.getString("longDegrees"));
						sgl.setLatDirection(rs.getString("latDirection"));
						sgl.setLatDegrees(rs.getString("latDegrees"));
						sGLoc.add(sgl);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sGLoc;
	}
	
	@Override
	public List<ShipmentConsigneeAddress> getShipmentConsigneeAddress()
	{
	List <ShipmentConsigneeAddress>  sCAddrs = new ArrayList<ShipmentConsigneeAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentConsigneeAddress");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentConsigneeAddress sca= new ShipmentConsigneeAddress();
					
					    sca.setType(rs.getString("type"));
					    sca.setInternalId(rs.getString("internalId"));
						sca.setIsPrimary(rs.getString("isPrimary"));
						sca.setIsResidential(rs.getString("isResidential"));
						sca.setLocationCode(rs.getString("LocationCode"));
						sca.setName(rs.getString("Name"));
						sca.setAddrLine1(rs.getString("AddrLine1"));
						sca.setAddrLine2(rs.getString("AddrLine2"));
						sca.setCity(rs.getString("City"));
						sca.setStateProvince(rs.getString("StateProvince"));
						sca.setPostalCode(rs.getString("PostalCode"));
						sca.setCountryCode(rs.getString("CountryCode"));
						sca.setContact(rs.getString("Contact"));
						sca.setComments(rs.getString("Comments"));
						sca.setServices(rs.getString("Services"));
						sCAddrs .add(sca);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sCAddrs;
	}
	
	@Override
	public List<ShipmentConsigneeGeoLoc> getShipmentConsigneeGeoLoc()
	{
	List <ShipmentConsigneeGeoLoc>  sCGLoc = new ArrayList<ShipmentConsigneeGeoLoc>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentConsigneeGeoLoc");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentConsigneeGeoLoc scgl= new ShipmentConsigneeGeoLoc();
					
					    scgl.setLongDirection(rs.getString("longDirection"));
					    scgl.setLongDegrees(rs.getString("longDegrees"));
						scgl.setLatDirection(rs.getString("latDirection"));
						scgl.setLatDegrees(rs.getString("latDegrees"));
						sCGLoc.add(scgl);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sCGLoc;
	}
	
	
	@Override
	public List<ShipmentConsigneePackageGeoLoc> getShipmentConsigneePackageGeoLoc()
	{
	List <ShipmentConsigneePackageGeoLoc>  sCPackage = new ArrayList<ShipmentConsigneePackageGeoLoc>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentConsigneePackageGeoLoc");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentConsigneePackageGeoLoc scp= new ShipmentConsigneePackageGeoLoc();
						
						scp.setType(rs.getString("type"));
						scp.setInternalId(rs.getString("internalId"));
						sCPackage.add(scp);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sCPackage;
	
	}
	
	
	@Override
	public List<ShipmentPackageDimensions> getShipmentPackageDimensions()
	{
	List<ShipmentPackageDimensions>  sPDimensions = new ArrayList<ShipmentPackageDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentPackageDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentPackageDimensions spdim= new ShipmentPackageDimensions();
						
						spdim.setType(rs.getString("type"));
						spdim.setUom(rs.getString("uom"));
						spdim.setDim(rs.getString("dim"));
						spdim.setDimension(rs.getString("Dimension"));
						sPDimensions.add(spdim);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sPDimensions;
	
	}
	
	
	@Override
	public List<ShipmentPackageWeight> getShipmentPackageWeight()
	{
	List<ShipmentPackageWeight>  sPWeight = new ArrayList<ShipmentPackageWeight>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentPackageWeight");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentPackageWeight spw= new ShipmentPackageWeight();
						
						spw.setType(rs.getString("type"));
						spw.setUom(rs.getString("uom"));
						spw.setWeight(rs.getString("Weight"));
						sPWeight.add(spw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sPWeight;
	
	}
	
	
	@Override
	public List<ShipmentItemGroups> getShipmentItemGroups()
	{
	List<ShipmentItemGroups>  sIGroups = new ArrayList<ShipmentItemGroups>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentItemGroups");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentItemGroups sig= new ShipmentItemGroups();
						
						sig.setInternalId(rs.getString("internalId"));
						sig.setSequence(rs.getString("sequence"));
						sig.setIsHandlingUnit(rs.getString("isHandlingUnit"));
						sig.setIsShipUnit(rs.getString("isShipUnit"));
						sig.setDescription(rs.getString("Description"));
						sig.setContainmentId(rs.getString("ContainmentId"));
						sIGroups.add(sig);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIGroups;
	}
	
	
	@Override
	public List<ShipmentItemGroupWeights> getShipmentItemGroupWeights()
	{
	List<ShipmentItemGroupWeights>  sIGWeights = new ArrayList<ShipmentItemGroupWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentItemGroupWeights");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentItemGroupWeights sigw= new ShipmentItemGroupWeights();
						
						sigw.setType(rs.getString("type"));
						sigw.setUom(rs.getString("uom"));
						sigw.setWeight(rs.getString("Weight"));
						sIGWeights.add(sigw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIGWeights;
	}
	
	
	@Override
	public List<ShipmentItemGroupQuantities> getShipmentItemGroupQuantities()
	{
	List<ShipmentItemGroupQuantities>  sIGQuantities = new ArrayList<ShipmentItemGroupQuantities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentItemGroupQuantities");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentItemGroupQuantities sigq= new ShipmentItemGroupQuantities();
						
						sigq.setType(rs.getString("type"));
						sigq.setUom(rs.getString("uom"));
						sigq.setQuantity(rs.getString("Quantity"));
						 sIGQuantities.add(sigq);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return  sIGQuantities;
	
	}
	
	@Override
	public List<ShipmentItemGroupDimensions> getShipmentItemGroupDimensions()
	{
	List<ShipmentItemGroupDimensions>  sIGDimensions = new ArrayList<ShipmentItemGroupDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentItemGroupDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentItemGroupDimensions sigd= new ShipmentItemGroupDimensions();
						
						sigd.setType(rs.getString("type"));
						sigd.setUom(rs.getString("uom"));
						sigd.setDim(rs.getString("dim"));
						sigd.setDimension(rs.getString("Dimension"));
						sIGDimensions.add(sigd);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIGDimensions;
	}
	
	
	@Override
	public List<ShipmentItemGroupFreightClass> getShipmentItemGroupFreightClass()
	{
	List<ShipmentItemGroupFreightClass>  sIGFClass = new ArrayList<ShipmentItemGroupFreightClass>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentItemGroupFreightClass");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentItemGroupFreightClass sigfc= new ShipmentItemGroupFreightClass();
						
						sigfc.setFreightClass(rs.getString("FreightClass"));
						sigfc.setStackability(rs.getString("Stackability"));
						sigfc.setTrackingNumber(rs.getString("TrackingNumber"));
						sigfc.setDeliveryStatus(rs.getString("DeliveryStatus"));
						sigfc.setEquipmentRequired(rs.getString("EquipmentRequired"));
						sIGFClass .add(sigfc);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIGFClass;
	}
	
	
	@Override
	public List<ShipmentLineItemNumberAndWeights> getShipmentLineItemNumberAndWeights()
	{
	List <ShipmentLineItemNumberAndWeights>  sINWeights = new ArrayList<ShipmentLineItemNumberAndWeights>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentLineItemNumberAndWeights");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentLineItemNumberAndWeights slinw= new ShipmentLineItemNumberAndWeights();
						
					slinw.setLineNumber (rs.getString("lineNumber"));
					slinw.setInternalId(rs.getString("internalId"));
					slinw.setType(rs.getString("type"));
					slinw.setUom(rs.getString("uom"));
					slinw.setWeight(rs.getString("Weight"));
						sINWeights.add(slinw);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sINWeights;
	}
	
	
	@Override
	public List<ShipmentLineItemQuantities> getShipmentLineItemQuantities()
	{
	List <ShipmentLineItemQuantities>  sLIQuanties = new ArrayList<ShipmentLineItemQuantities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentLineItemQuantities");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentLineItemQuantities sliq= new ShipmentLineItemQuantities();
						
					sliq.setQuantity(rs.getString("Quantity"));
					sliq.setUom(rs.getString("uom"));
					sliq.setType(rs.getString("type"));
					sliq.setItemId(rs.getString("ItemId"));
					sliq.setDescription(rs.getString("Description"));
					sliq.setFreightClass(rs.getString("FreightClass"));
					sliq.setCommodity(rs.getString("Commodity"));
					sliq.setNmfcCode(rs.getString("NmfcCode"));
					sliq.setStccCode(rs.getString("StccCode"));
					sliq.setCustomerPartNum(rs.getString("CustomerPartNum"));
					sliq.setDistributorPartNum (rs.getString("DistributorPartNum"));
					sliq.setCube(rs.getString("Cube"));
					sliq.setTemperatureRange(rs.getString("TemperatureRange"));
					sliq.setHazardousMaterial(rs.getString("HazardousMaterial"));
					sliq.setInternalId(rs.getString("internalId"));
					sliq.setHazMatDetail(rs.getString("HazMatDetail"));
					sliq.setProperShippingName(rs.getString("ProperShippingName"));
					sliq.setHazMatID(rs.getString("HazMatID"));
					sliq.setPackageGroup(rs.getString("PackageGroup"));
					sliq.setHazMatClass(rs.getString("HazMatClass"));
					sliq.setContactName(rs.getString("ContactName"));
					sliq.setContactPhone(rs.getString("ContactPhone"));
					sliq.setHazMatPlacards(rs.getString("HazMatPlacards"));
					sliq.setHazMatPlacardsDetails(rs.getString("HazMatPlacardsDetails"));
					sliq.setHazMatEMSNumber(rs.getString("HazMatEMSNumber"));
					sliq.setHazMatFlashPointTemp(rs.getString("HazMatFlashPointTemp"));
					sliq.setComments(rs.getString("Comments"));
					sLIQuanties.add(sliq);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sLIQuanties;
	}
	
	
	@Override
	public List<ShipmentLineItemDimensions> getShipmentLineItemDimensions()
	{
	List <ShipmentLineItemDimensions>  sLIDimensions = new ArrayList<ShipmentLineItemDimensions>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentLineItemDimensions");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentLineItemDimensions slid= new ShipmentLineItemDimensions();
						
					slid.setDimension(rs.getString("Dimension"));
					slid.setDim(rs.getString("dim"));
					slid.setUom(rs.getString("uom"));
					slid.setType(rs.getString("type"));
					slid.setHarmonizedTariffCode(rs.getString("HarmonizedTariffCode"));
					slid.setPortOfLading(rs.getString("PortOfLading"));
					slid.setCountryOfOrigin(rs.getString("CountryOfOrigin"));
					slid.setCountryOfManufacture(rs.getString("CountryOfManufacture"));
					slid.setCustomsValue(rs.getString(" CustomsValue"));
					slid.setCustomsValueCurrency(rs.getString("CustomsValueCurrency"));
					slid.setInsuredValue(rs.getString("InsuredValue"));
					slid.setInsuredValueCurrency(rs.getString("InsuredValueCurrency"));
					slid.setAESExportCode (rs.getString("AESExportCode"));
					slid.setScheduleBNumber(rs.getString("ScheduleBNumber"));
					slid.setDomestic(rs.getString("Domestic"));
					slid.setECCN(rs.getString("ECCN"));
					slid.setOriginationCountry(rs.getString("OriginationCountry"));
					slid.setManufacturingCountry(rs.getString("ManufacturingCountry"));
					slid.setLicenseNumber(rs.getString("LicenseNumber"));
					slid.setLicenseType(rs.getString("LicenseType"));
					sLIDimensions.add(slid);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sLIDimensions;
	}
	
	
	@Override
	public List<ShipmentPriceSheets> getShipmentPriceSheets()
	{
	List <ShipmentPriceSheets>  sPSheets = new ArrayList<ShipmentPriceSheets>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentPriceSheets");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentPriceSheets sps= new ShipmentPriceSheets();
					
					sps.setChargeModel(rs.getString("chargeModel"));
					sps.setIsSelected(rs.getString("isSelected"));
					sps.setIsAllocated(rs.getString("isAllocated"));
					sps.setCurrencyCode(rs.getString("currencyCode"));
					sps.setExchangeDate(rs.getString("exchangeDate"));
					sps.setCreateBy(rs.getString("createBy"));
					sps.setCreateDate(rs.getString("createDate"));
					sps.setUpdateDate(rs.getString("updateBy"));
					sps.setInternalId(rs.getString("internalId"));
					sps.setType(rs.getString("type"));
					sps.setAccessorialTotal(rs.getString("AccessorialTotal"));
					sps.setSubTotal(rs.getString("SubTotal"));
					sps.setNormalizedTotal(rs.getString("NormalizedTotal"));
					sps.setContractId(rs.getString("ContractId"));
					sps.setContractName(rs.getString("ContractName"));
					sPSheets.add(sps);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sPSheets;
	}
	
	
	
	@Override
	public List<ShipmentCarrierInfo> getShipmentCarrierInfo()
	{
	List <ShipmentCarrierInfo>  sCInfo = new ArrayList<ShipmentCarrierInfo>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentCarrierInfo");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentCarrierInfo sci= new ShipmentCarrierInfo();
					
					    sci.setInternalId(rs.getString("internalId"));
						sci.setCarrierId(rs.getString("CarrierId"));
						sci.setCarrierName(rs.getString("CarrierName"));
						sci.setSCAC(rs.getString("SCAC"));
						sci.setMode(rs.getString("Mode"));
						sci.setService(rs.getString("Service"));
						sci.setServiceDays(rs.getString("ServiceDays"));
						sci.setDistance(rs.getString("Distance"));
						sci.setId(rs.getString("Id"));
						sci.setMCNumber(rs.getString("MCNumber"));
						sci.setUSDOT(rs.getString("USDOT"));
						sCInfo.add(sci);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sCInfo;
	}
	
	@Override
	public List<ShipmentInsuranceTypes> getShipmentInsuranceTypes()
	{
	List <ShipmentInsuranceTypes>  sIType = new ArrayList<ShipmentInsuranceTypes>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentInsuranceTypes");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentInsuranceTypes sit= new ShipmentInsuranceTypes();
						
						sit.setAmount(rs.getString("amount"));
						sit.setCompany(rs.getString("company"));
						sit.setExpirationDate(rs.getString("expirationDate"));
						sit.setContactName(rs.getString("contactName"));
						sit.setContactPhone(rs.getString("contactPhone"));
						sit.setType(rs.getString("type"));
						sIType.add(sit);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIType;
	}
	
	
	@Override
	public List<ShipmentCarrierAddress> getShipmentCarrierAddress()
	{
	List <ShipmentCarrierAddress>  sCAddrs = new ArrayList<ShipmentCarrierAddress>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentCarrierAddress");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentCarrierAddress sca= new ShipmentCarrierAddress();
					
					    sca.setInternalId(rs.getString("internalId"));
					    sca.setType(rs.getString("type"));
						sca.setIsPrimary(rs.getString("isPrimary"));
						sca.setIsResidential(rs.getString("isResidential"));
						sca.setOwner(rs.getString("Owner"));
						sca.setCustomerAcctNum(rs.getString("CustomerAcctNum"));
						sca.setLocationCode(rs.getString("LocationCode"));
						sca.setName(rs.getString("Name"));
						sca.setAddrLine1(rs.getString("AddrLine1"));
						sca.setAddrLine2(rs.getString("AddrLine2"));
						sca.setCity(rs.getString("City"));
						sca.setStateProvince(rs.getString("StateProvince"));
						sca.setPostalCode(rs.getString("PostalCode"));
						sca.setCountryCode(rs.getString("CountryCode"));
						sca.setContacts(rs.getString("Contacts"));
						 sCAddrs.add(sca);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return  sCAddrs ;
	}
	
	
	@Override
	public List<ShipmentInsuranceGeoloc> getShipmentInsuranceGeoloc()
	{
	List <ShipmentInsuranceGeoloc>  sIGLoc = new ArrayList<ShipmentInsuranceGeoloc>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentInsuranceGeoloc");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentInsuranceGeoloc sigl= new ShipmentInsuranceGeoloc();
					
					    sigl.setLongDirection(rs.getString("longDirection"));
					    sigl.setLongDegrees(rs.getString("longDegrees"));
						sigl.setLatDirection(rs.getString("latDirection"));
						sigl.setLatDegrees(rs.getString("latDegrees"));
						sIGLoc.add(sigl);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sIGLoc;
	}
	
	
	@Override
	public List<ShipmentPriceSheetCharges> getShipmentPriceSheetCharges()
	{
	List <ShipmentPriceSheetCharges>  sPSCharges = new ArrayList<ShipmentPriceSheetCharges>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentPriceSheetCharges");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentPriceSheetCharges spsc= new ShipmentPriceSheetCharges();
					
					spsc.setItemGroupId(rs.getString("itemGroupId"));
					spsc.setSequenceNum(rs.getString("sequenceNum"));
					spsc.setInternalId(rs.getString("internalId"));
					spsc.setType(rs.getString("type"));
					spsc.setDescription(rs.getString("Description"));
					spsc.setEdiCode(rs.getString("EdiCode"));
					spsc.setAmount(rs.getString("Amount"));
					spsc.setRate(rs.getString("Rate"));
					spsc.setRateQualifier(rs.getString("RateQualifier"));
					spsc.setQuantity(rs.getString("Quantity"));
					spsc.setWeight(rs.getString("Weight"));
					spsc.setDimWeight(rs.getString("DimWeight"));
					spsc.setFreightClass(rs.getString("FreightClass"));
					spsc.setFakFreightClass(rs.getString("FakFreightClass"));
					spsc.setIsMin(rs.getString("IsMin"));
					spsc.setIsMax(rs.getString("IsMax"));
					spsc.setIsNontaxable(rs.getString("IsNontaxable"));
					spsc.setComments(rs.getString("Comments"));
					sPSCharges.add(spsc);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sPSCharges;
	}
	
	
	@Override
	public List<ShipmentActivities> getShipmentActivities()
	{
	List <ShipmentActivities>  sActivities = new ArrayList<ShipmentActivities>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentActivities");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentActivities shac= new ShipmentActivities();
					
					shac.setType(rs.getString("type"));
					shac.setInternalId(rs.getString("internalId"));
					shac.setUpdateDate(rs.getString("updateDate"));
					shac.setUpdateBy(rs.getString("updateBy"));
					shac.setCreateDate(rs.getString("createDate"));
					shac.setCreateBy(rs.getString("createBy"));
					shac.setActivityID(rs.getString("ActivityID"));
					shac.setSummary(rs.getString("Summary"));
					shac.setPriority(rs.getString("Priority"));
					shac.setRequired(rs.getString("Required"));
					shac.setStatus(rs.getString("Status"));
					shac.setAssignedTo(rs.getString("AssignedTo"));
					shac.setPlannedDate(rs.getString("PlannedDate"));
					shac.setPercentageComplete(rs.getString("PercentageComplete"));		
					shac.setStatusDetails(rs.getString("StatusDetails"));
					shac.setLocation(rs.getString("Location"));
					shac.setContact(rs.getString("Contact"));
					shac.setDocuments(rs.getString("Documents"));
					sActivities.add(shac);
					}		
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sActivities;
	}
	
	
	
	@Override
	public List<ShipmentMargins> getShipmentMargins()
	{
	List <ShipmentMargins>  sMargins = new ArrayList<ShipmentMargins>();
	Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps= conn.prepareStatement("select * from ShipmentMargins");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
					{
					ShipmentMargins sm= new ShipmentMargins();
						
						sm.setType(rs.getString("type"));
						sm.setCurrencyCode(rs.getString("currencyCode"));
						sm.setMarginRevenue(rs.getString("MarginRevenue"));
						sm.setMarginCost(rs.getString("MarginCost"));
						sm.setMarginValue(rs.getString("MarginValue"));
						sMargins.add(sm);
					}
					
					ps.close(); 
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return sMargins;
	}
	
	
	
	
//----------------------------------------------------------------------------------------------------------------------------------------------------	
	
	@Override
	public void addHeaderDetails(HeaderDetails hd) {
		Connection conn=SingletonConnection.getConnection();
		
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=TransportCarriergisticsDB;user=admin;password=angeline08");
			PreparedStatement ps= conn.prepareStatement("insert into HeaderDetails(SenderID,ReceiverID,DocTypeID,DocCount,Date)values(?,?,?,?,?");
			
			ps.setString(1, hd.getSenderID());
			ps.setString(2, hd.getReceiverID());
			ps.setString(3, hd.getDocTypeID());
			ps.setString(4, hd.getDocCount());
			ps.setString(5, hd.getDate());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void addExtractRequestInfo(ExtractRequestInfo eri) {
		
Connection conn=SingletonConnection.getConnection();
	
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=TransportCarriergisticsDB;user=admin;password=angeline08");
			PreparedStatement ps= conn.prepareStatement("insert into ExtractRequestInfo values(?,?)");
			
			ps.setString(1, eri.getDate());
			ps.setString(2, eri.getReason());
			ps.executeUpdate();
		
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
		
	@Override
	public void addUserDetails(UserDetails ud) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=TransportCarriergisticsDB;user=admin;password=angeline08");
			PreparedStatement ps= conn.prepareStatement("insert into UserDetails(internalId,LastName,FirstName,UserId,sequenceNum,type)values(?,?,?,?,?,?)");
			
			ps.setString(1, ud.getInternalId());
			ps.setString(2, ud.getLastName());
			ps.setString(3, ud.getFirstName());
			ps.setString(4, ud.getUserId());
			ps.setInt(5, ud.getSequenceNum());
			ps.setString(6, ud.getType());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
			

	@Override
	public void addLoadDetails(LoadDetails ld) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into UserDetails(loadRefNumber,InternalId,type,createBy,createDate,updateBy,"
					+ "updateDate,loadRefInternalId,loadRefIsPrimary,loadRefType )values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, ld.getLoadRefNumber());
			ps.setString(2, ld.getInternalId());
			ps.setString(3, ld.getType());
			ps.setString(4, ld.getCreateBy());
			ps.setString(5, ld.getCreateDate());
			ps.setString(6, ld.getUpdateDate());
			ps.setString(7, ld.getLoadRefInternalId());
			ps.setString(8, ld.getLoadRefIsPrimary());
			ps.setString(9, ld.getLoadRefType());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addLoadExtraDetails(entities.LoadExtraDetails led) {
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadExtraDetails(HandlingUnits,RelatedCustomerLoads,Comments,Services)values(?,?,?,?)");
			
			ps.setDouble(1, led.getHandlingUnits());
			ps.setString(2, led.getRelatedCustomerLoads());
			ps.setString(3, led.getComments());
			ps.setString(4, led.getServices());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void addLoadPackageDimensions(LoadPackageDimensions lpd) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadPackageDimensions(packagetype,internalId,type,uom,dim,Dimension)values(?,?,?,?,?,?)");
			
			ps.setString(1, lpd.getPackagetype());
			ps.setString(2, lpd.getInternalId());
			ps.setString(3, lpd.getType());
			ps.setString(4, lpd.getUom());
			ps.setString(5, lpd.getDim());
			ps.setDouble(6, lpd.getDimension());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void addLoadPackageWeights(LoadPackageWeights lpw) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadPackageWeights(packagetype,internalId,type,uom,Weight)values(?,?,?,?,?)");
			
			ps.setString(1, lpw.getPackagetype());
			ps.setString(2, lpw.getInternalId());
			ps.setString(3, lpw.getType());
			ps.setString(4, lpw.getUom());
			ps.setString(5, lpw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addLoadItemGroups(LoadItemGroups lig) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadItemGroups(internalId,sequence,isHandlingUnit,isShipUnit,Description,ContainmentId)values(?,?,?,?,?,?)");
			
			ps.setString(1, lig.getInternalId());
			ps.setString(2, lig.getSequence());
			ps.setString(3, lig.getIsHandlingUnit());
			ps.setString(4, lig.getIsShipUnit());
			ps.setString(5, lig.getDescription());
			ps.setString(6, lig.getContainmentId());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void addLoadWeights(LoadWeights lw) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadWeights(type,uom,Weight)values(?,?,?)");
		
			ps.setString(1, lw.getType());
			ps.setString(2, lw.getUom());
			ps.setDouble(3, lw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	}
	
	@Override
	public void addLoadQuantities(LoadQuantities lq) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadQuantities(type,uom,Quantity)values(?,?,?)");
		
			ps.setString(1, lq.getType());
			ps.setString(2, lq.getUom());
			ps.setDouble(3, lq.getQuantity());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}


	@Override
	public void addLoadDimensions(LoadDimensions ld) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadDimensions(type,uom,dim,Dimension)values(?,?,?,?)");
		
			ps.setString(1, ld.getType());
			ps.setString(2, ld.getUom());
			ps.setString(3, ld.getDim());
			ps.setDouble(4, ld.getDimension());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addLoadFreightClass(LoadFreightClass lfc) {
			
	Connection conn=SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps= conn.prepareStatement("insert into LoadFreightClass(type,FreightClass,TrackingNumber,DeliveryStatus,EquipmentRequired)values(?,?,?,?,?)");
			
				ps.setString(1, lfc.getType());
				ps.setString(2, lfc.getFreightClass());
				ps.setString(3, lfc.getTrackingNumber());
				ps.setString(4, lfc.getDeliveryStatus());
				ps.setString(5, lfc.getEquipmentRequired());
				ps.executeUpdate();
				
				ps.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		
	@Override
	public void addLoadReferenceNumbers(LoadReferenceNumbers lrn) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadReferenceNumbers(type,internalId,isPrimary,ReferenceNumber)values(?,?,?,?)");
		
			ps.setString(1, lrn.getType());
			ps.setString(2, lrn.getInternalId());
			ps.setString(3, lrn.getIsPrimary());
			ps.setString(4, lrn.getReferenceNumber());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addLoadItemWeights(LoadItemWeights liw){
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadItemWeights(internalId,lineNumber,type,uom,Weight)values(?,?,?,?,?)");
			
			ps.setString(1, liw.getInternalId());
			ps.setString(2, liw.getLineNumber());
			ps.setString(3, liw.getType());
			ps.setString(4, liw.getUom());
			ps.setDouble(5, liw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadItemQuantities(LoadItemQuantities liq) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadItemQuantities(internalId,lineNumber,type,uom,Weight)values(?,?,?,?,?)");
			
			ps.setString(1, liq.getInternalId());
			ps.setString(2, liq.getLineNumber());
			ps.setString(3, liq.getType());
			ps.setString(4, liq.getUom());
			ps.setDouble(5, liq.getQuantity());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadLineItemDetails(LoadLineItemDetails llineid) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadLineItemDetails(ItemId,Description ,FreightClass,Commodity,NmfcCode"
					+"StccCode, CustomerPartNum,ManufacturerPartNum,DistributorPartNum,uom,Cube,HazardousMaterial)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, llineid.getItemId());
			ps.setString(2, llineid.getDescription());
			ps.setDouble(3, llineid.getFreightClass());
			ps.setString(4, llineid.getCommodity());
			ps.setString(5, llineid.getNmfcCode());
			ps.setString(6, llineid.getStccCode());
			ps.setString(7, llineid.getCustomerPartNum());
			ps.setString(8, llineid.getManufacturerPartNum());
			ps.setString(9, llineid.getDistributorPartNum());
			ps.setString(10, llineid.getUom());
			ps.setString(11, llineid.getCube());
			ps.setString(12, llineid.getHazardousMaterial());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}			
		
	}

	@Override
	public void addLoadExtraLineItemDetails(LoadExtraLineItemDetails leid) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadExtraLineItemDetails(HazMatDetail,ProperShippingName,HazMatID,PackageGroup,HazMatClass"
					+"ContactName,ContactPhone,HazMatPlacards,HazMatPlacardsDetails,HazMatEMSNumber,HazMatFlashPointTemp,Comments)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, leid.getHazMatDetail());
			ps.setString(2, leid.getProperShippingName());
			ps.setString(3, leid.getHazMatID());
			ps.setString(4, leid.getPackageGroup());
			ps.setString(5, leid.getHazMatClass());
			ps.setString(6, leid.getContactName());
			ps.setString(7, leid.getContactPhone());
			ps.setString(8, leid.getHazMatPlacards());
			ps.setString(9, leid.getHazMatPlacardsDetails());
			ps.setString(10, leid.getHazMatEMSNumber());
			ps.setString(11, leid.getHazMatFlashPointTemp());
			ps.setString(12, leid.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}			
		
	}

	@Override
	public void addLoadLineItemDimensions(LoadLineItemDimensions llid) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadLineItemDimensions(type,uom,dim,Dimension,HarmonizedTariffCode,PortOfLading"
					+"CountryOfOrigin,CountryOfManufacture,CustomsValue,CustomsValueCurrency,InsuredValue,InsuredValueCurrency,AESExportCode,ScheduleBNumber"
					+"Domestic,ECCN,OriginationCountry,ManufacturingCountry,LicenseNumber,LicenseType,EquipmentList,ScheduledEquipment)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, llid.getType());
			ps.setString(2, llid.getUom());
			ps.setString(3, llid.getDim());
			ps.setDouble(4, llid.getDimension());
			ps.setString(5, llid.getHarmonizedTariffCode());
			ps.setString(6, llid.getPortOfLading());
			ps.setString(7, llid.getCountryOfOrigin());
			ps.setString(8, llid.getCountryOfManufacture());
			ps.setString(9, llid.getCustomsValue());
			ps.setString(10, llid.getCustomsValueCurrency());
			ps.setString(11, llid.getInsuredValue());
			ps.setString(12, llid.getInsuredValueCurrency());
			ps.setString(13, llid.getAESExportCode());
			ps.setString(14, llid.getScheduleBNumber());
			ps.setString(15, llid.getDomestic());
			ps.setString(16, llid.getECCN());
			ps.setString(17, llid.getOriginationCountry());
			ps.setString(18, llid.getManufacturingCountry());
			ps.setString(19, llid.getLicenseNumber());
			ps.setString(20, llid.getLicenseType());
			ps.setString(21, llid.getEquipmentList());
			ps.setString(22, llid.getScheduledEquipment());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}			
		
	}

	@Override
	public void addLoadPaymentMethod(LoadPaymentMethod lpm) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadPaymentMethod(Method,Contact,Comments)values(?,?,?)");
		
			ps.setString(1, lpm.getMethod());
			ps.setString(2, lpm.getContact());
			ps.setString(3, lpm.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadBillingAddress(LoadBillingAddress lba) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadBillingAddress(Method,Contact,Comments)values(?,?,?)");
		
			ps.setString(1, lba.getInternalId());
			ps.setString(2, lba.getType());
			ps.setString(3, lba.getIsPrimary());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadGeoLocation(LoadGeoLocation lgl) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadGeoLocation(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, lgl.getLongDirection());
			ps.setString(2, lgl.getLongDegrees());
			ps.setString(3, lgl.getLatDirection());
			ps.setString(4, lgl.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadPODRecieved(LoadPODRecieved lpr) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadPODRecieved(PODReceived,ProofOfPickupReceived,Status,AssignedTo,Owner)VALUES(?,?,?,?,?)");
		
			ps.setString(1, lpr.getPODReceived());
			ps.setString(2, lpr.getProofOfPickupReceived());
			ps.setString(3, lpr.getStatus());
			ps.setString(4, lpr.getAssignedTo());
			ps.setString(5, lpr.getOwner());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadAudits(LoadAudits la) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadAudits(action,user,timestamp,Audit)VALUES(?,?,?,?)");
		
			ps.setString(1, la.getAction());
			ps.setString(2, la.getUser());
			ps.setString(3, la.getTimestamp());
			ps.setString(4, la.getAudit());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}

	@Override
	public void addLoadCarriers(LoadCarriers lc) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadCarriers(internalId,type,CarrierId,CarrierName,SCAC,Mode,Service,ServiceDays"
					+ "Id,MCNumber,USDOT)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, lc.getInternalId());
			ps.setString(2, lc.getType());
			ps.setString(3, lc.getCarrierId());
			ps.setString(4, lc.getCarrierName());
			ps.setString(5, lc.getSCAC());
			ps.setString(6, lc.getMode());
			ps.setString(7, lc.getService());
			ps.setString(8, lc.getServiceDays());
			ps.setString(9, lc.getId());
			ps.setString(10, lc.getMCNumber());
			ps.setString(11, lc.getUSDOT());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadInsuranceType(LoadInsuranceType lit) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadInsuranceType(type,contactPhone,contactName,expirationDate,company,amount)VALUES(?,?,?,?,?,?)");
		
			ps.setString(1, lit.getType());
			ps.setString(2, lit.getContactPhone());
			ps.setString(3, lit.getContactName());
			ps.setString(4, lit.getExpirationDate ());
			ps.setString(5, lit.getCompany());
			ps.setString(6, lit.getAmount());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadCarrierAddress(LoadCarrierAddress lca) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadCarrierAddress(internald,type,isPrimary,isResidential,Owner,CustomerAcctNum"
					+ "LocationCode,Name,AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, lca.getInternalId());
			ps.setString(2, lca.getType());
			ps.setString(3, lca.getIsPrimary());
			ps.setString(4, lca.getIsResidential());
			ps.setString(5, lca.getOwner());
			ps.setString(6, lca.getCustomerAcctNum());
			ps.setString(7, lca.getLocationCode());
			ps.setString(8, lca.getName());
			ps.setString(9, lca.getAddrLine1());
			ps.setString(10, lca.getAddrLine2());
			ps.setString(11, lca.getCity());
			ps.setString(12, lca.getStateProvince());
			ps.setString(13, lca.getPostalCode());
			ps.setString(14, lca.getCountryCode());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadCarrierGeoLocation(LoadCarrierGeoLocation lcgl) {
	
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadCarrierGeoLocation(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, lcgl.getLongDirection());
			ps.setString(2, lcgl.getLongDegrees());
			ps.setString(3, lcgl.getLatDirection());
			ps.setString(4, lcgl.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadContacts(LoadContacts lco) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadContacts(oid,type,Name,ContactMethods)VALUES(?,?,?,?)");
		
			ps.setString(1, lco.getOid());
			ps.setString(2, lco.getType());
			ps.setString(3, lco.getName());
			ps.setString(4, lco.getContactMethods());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadCarrierTerminalInfo(LoadCarrierTerminalInfo lcti) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadCarrierTerminalInfo(TerminalType,Origin,Destination)VALUES(?,?,?)");
		
			ps.setString(1, lcti.getTerminalType());
			ps.setString(2, lcti.getOrigin());
			ps.setString(3, lcti.getDestination());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadPickupDates(LoadPickupDates lpd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadPickupDates(PickupType,Date/Time)VALUES(?,?)");
		
			ps.setString(1, lpd.getPickupType());
			ps.setString(2, lpd.getDateTime());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadDropDates(LoadDropDates ldd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadDropDate(DropOffType,Date/Time)VALUES(?,?)");
		
			ps.setString(1, ldd.getDropOffType());
			ps.setString(2, ldd.getDateTime());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadEventPlan(LoadEventPlan lep) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadEventPlan(internalId,sequenceNum,eventtype,CarrierActionCode,AppointmentNumber"
					+",LateReason,AppointmentType,DateType,Date)values(?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, lep.getInternalId());
			ps.setString(2, lep.getCount());
			ps.setString(3, lep.getSequenceNum());
			ps.setString(4, lep.getEventtype());
			ps.setString(5, lep.getCarrierActionCode());
			ps.setString(6, lep.getAppointmentNumber());
			ps.setString(7, lep.getLateReason());
			ps.setString(8, lep.getAppointmentType());
			ps.setString(9, lep.getDateType());
			ps.setString(10, lep.getDate());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addLoadEventAddress(LoadEventAddress lea) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadEventAddress(internald,type,isPrimary,isResidential,LocationCode,Name,"
					+ "AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode,Contact,Comments)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, lea.getAdresstype());
			ps.setString(2, lea.getInternalId());
			ps.setString(3, lea.getIsPrimary());
			ps.setString(4, lea.getIsResidential());
			ps.setString(5, lea.getLocationCode());
			ps.setString(6, lea.getName());
			ps.setString(7, lea.getAddrLine1());
			ps.setString(8, lea.getAddrLine2());
			ps.setString(9, lea.getCity());
			ps.setString(10, lea.getStateProvince());
			ps.setString(11, lea.getPostalCode());
			ps.setString(12, lea.getCountryCode());
			ps.setString(13, lea.getContact());
			ps.setString(14, lea.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadEventWeights(LoadEventWeights lew) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadEventWeights(WeightType,uom,Weight)VALUES(?,?,?)");
		
			ps.setString(1, lew.getWeightType());
			ps.setString(2, lew.getUom());
			ps.setString(3, lew.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addLoadShipmentPlan(LoadShipmentPlan lsp) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadShipmentPlan(ReferenceNumber,type,internalId,isPrimary)VALUES(?,?,?,?)");
		
			ps.setString(1, lsp.getReferenceNumber());
			ps.setString(2, lsp.getType());
			ps.setString(3, lsp.getInternalId());
			ps.setString(4, lsp.getIsPrimary());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadEventActivities(LoadEventActivities leac) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into LoadEventActivities(type,InternalId,createBy,updateDate,updateBy,createDate,createBy,"
					+ "ActivityID,Summary,Priority,Required,Status,AssignedTo,PlannedDate,PercentageComplete,CompletedDate,TimeZone,StatusDetails)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, leac.getType());
			ps.setString(2, leac.getInternalId());
			ps.setString(3, leac.getUpdateDate());
			ps.setString(4, leac.getUpdateBy());
			ps.setString(5, leac.getCreateDate());
			ps.setString(6, leac.getCreateBy());
			ps.setString(7, leac.getActivityID());
			ps.setString(8, leac.getSummary());
			ps.setString(9, leac.getPriority());
			ps.setString(10, leac.getRequired());
			ps.setString(11, leac.getStatus());
			ps.setString(12, leac.getAssignedTo());
			ps.setString(13, leac.getPlannedDate());
			ps.setString(14, leac.getPercentageComplete());
			ps.setString(15, leac.getCompletedDate());
			ps.setString(16, leac.getTimeZone());
			ps.setString(17, leac.getStatusDetails());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addLoadEventLocation(LoadEventLocation lel) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadEventLocation(type,internald,isPrimary,isResidential,"
					+ "LocationCode,Name,AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode,Contact,Comments)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, lel.getType());
			ps.setString(2, lel.getInternalId());
			ps.setString(3, lel.getIsPrimary());
			ps.setString(4, lel.getIsResidential());
			ps.setString(5, lel.getLocationCode());
			ps.setString(6, lel.getName());
			ps.setString(7, lel.getAddrLine1());
			ps.setString(8, lel.getAddrLine2());
			ps.setString(9, lel.getCity());
			ps.setString(10, lel.getStateProvince());
			ps.setString(11, lel.getPostalCode());
			ps.setString(12, lel.getCountryCode());
			ps.setString(13, lel.getContact());
			ps.setString(14, lel.getComments());
			ps.executeUpdate();
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addLoadAddressGeoLoc(LoadAddressGeoLoc lac) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LoadAddressGeoLoc(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, lac.getLongDirection());
			ps.setString(2, lac.getLongDegrees());
			ps.setString(3, lac.getLatDirection());
			ps.setString(4, lac.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipments(Shipments sh) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into Shipments(createBy,createDate,updateBy,updateDate,InternalId,type)VALUES(?,?,?,?,?,?)");
			
			ps.setString(6, sh.getCreateBy());
			ps.setString(5, sh.getCreateDate());
			ps.setString(4, sh.getUpdateBy());
			ps.setString(3, sh.getUpdateDate());
			ps.setString(2, sh.getInternalId());
			ps.setString(1, sh.getType());				
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentDetails(ShipmentDetails sd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentDetails(createdBy,createDate,updateBy,updateDate,InternalId,type,"
					+ "shipmentRefNumber,shipmentRefInternalId,shipmentRefIsPrimary,shipmentRefType)VALUES(?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, sd.getCreatedBy());
			ps.setString(2, sd.getCreateDate());
			ps.setString(3, sd.getUpdateBy());
			ps.setString(4, sd.getUpdateDate());
			ps.setString(5, sd.getInternalId());
			ps.setString(6, sd.getType());
			ps.setString(7, sd.getShipmentRefNumber());	
			ps.setString(8, sd.getShipmentRefInternalId());	
			ps.setString(9, sd.getShipmentRefIsPrimary ());	
			ps.setString(10, sd.getShipmentRefType ());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addExtraShipmentDetails(ExtraShipmentDetails esd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ExtraShipmentDetails(Comments,Status,AssignedTo,Owner,Audits,QuoteDetail,"
					+ " QuotedTo,QuotePhone,QuoteFax, QuoteEmail,QuoteDate, QuoteBy)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, esd.getComments());
			ps.setString(2, esd.getStatus());
			ps.setString(3, esd.getAssignedTo());
			ps.setString(4, esd.getOwner());
			ps.setString(5, esd.getAudits());
			ps.setString(6, esd.getQuoteDetail());
			ps.setString(7, esd.getQuotedTo());	
			ps.setString(8, esd.getQuotePhone());	
			ps.setString(9, esd.getQuoteFax());	
			ps.setString(10, esd.getQuoteEmail());
			ps.setString(11, esd.getQuoteDate());
			ps.setString(12, esd.getQuoteBy());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentTerminalInfo(ShipmentTerminalInfo sti) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentTerminalInfo(TerminalType,Origin,Destination,EquipmentList,ScheduledEquipment)VALUES(?,?,?,?,?)");
			
			ps.setString(1, sti.getTerminalType());
			ps.setString(2, sti.getOrigin());
			ps.setString(3, sti.getDestination());
			ps.setString(4, sti.getEquipmentList());
			ps.setString(5, sti.getScheduledEquipment ());			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addShipmentQuantities(ShipmentQuantities sq) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentQuantities(type,uom,Quantity)VALUES(?,?,?)");
			
			ps.setString(1, sq.getType());
			ps.setString(2, sq.getUom());
			ps.setString(3, sq.getQuantity());			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentWeights(ShipmentWeights sw) {
	
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentWeights(type,uom,Weight)VALUES(?,?,?)");
			
			ps.setString(1, sw.getType());
			ps.setString(2, sw.getUom());
			ps.setString(3, sw.getWeight());			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentDimensions(ShipmentDimensions sdim) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentDimensions(type,uom,dim,Dimension)VALUES(?,?,?,?)");
			
			ps.setString(1, sdim.getType());
			ps.setString(2, sdim.getUom());
			ps.setString(3, sdim.getDim());
			ps.setString(4, sdim.getDimension());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentPickupDate(ShipmentPickupDate spd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentPickupDate(pickuptype,Date)VALUES(?,?)");
			
			ps.setString(1, spd.getPickuptype());
			ps.setString(2, spd.getDate());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentDropDate(ShipmentDropDate sdd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentDropDate(droptype,Date,PriceSheets)VALUES(?,?,?)");
			
			ps.setString(1, sdd.getDroptype());
			ps.setString(2, sdd.getDate());
			ps.setString(3, sdd.getPriceSheets());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipperAddress(ShipperAddress sa) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipperAddress(type,internald,isPrimary,isResidential,LocationCode,Name"
					+ ",AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode,Contact,Comments)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, sa.getType());
			ps.setString(2, sa.getInternalId());
			ps.setString(3, sa.getIsPrimary());
			ps.setString(4, sa.getIsResidential());
			ps.setString(5, sa.getLocationCode());
			ps.setString(6, sa.getName());
			ps.setString(7, sa.getAddrLine1());
			ps.setString(8, sa.getAddrLine2());
			ps.setString(9, sa.getCity());
			ps.setString(10, sa.getStateProvince());
			ps.setString(11, sa.getPostalCode());
			ps.setString(12, sa.getCountryCode());
			ps.setString(13, sa.getContact());
			ps.setString(14, sa.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipperGeoLoc(ShipperGeoLoc sgl) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipperGeoLoc(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, sgl.getLongDirection());
			ps.setString(2, sgl.getLongDegrees());
			ps.setString(3, sgl.getLatDirection());
			ps.setString(4, sgl.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentConsigneeAddress(ShipmentConsigneeAddress sca) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentConsigneeAddress(type,internald,isPrimary,isResidential,LocationCode,Name"
					+ ",AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode,Contact,Comments,Services)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, sca.getType());
			ps.setString(2, sca.getInternalId());
			ps.setString(3, sca.getIsPrimary());
			ps.setString(4, sca.getIsResidential());
			ps.setString(5, sca.getLocationCode());
			ps.setString(6, sca.getName());
			ps.setString(7, sca.getAddrLine1());
			ps.setString(8, sca.getAddrLine2());
			ps.setString(9, sca.getCity());
			ps.setString(10, sca.getStateProvince());
			ps.setString(11, sca.getPostalCode());
			ps.setString(12, sca.getCountryCode());
			ps.setString(13, sca.getContact());
			ps.setString(14, sca.getComments());
			ps.setString(15, sca.getServices());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentConsigneeGeoLoc(ShipmentConsigneeGeoLoc scgl) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentConsigneeGeoLoc(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, scgl.getLongDirection());
			ps.setString(2, scgl.getLongDegrees());
			ps.setString(3, scgl.getLatDirection());
			ps.setString(4, scgl.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentConsigneePackageGeoLoc(ShipmentConsigneePackageGeoLoc scp) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentConsigneePackageGeoLoc(type,internald)VALUES(?,?)");
		
			ps.setString(1, scp.getType());
			ps.setString(2, scp.getInternalId());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentPackageDimensions(ShipmentPackageDimensions spdim) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentPackageDimensions(type,uom,dim,Dimension)VALUES(?,?,?,?)");
			
			ps.setString(1, spdim.getType());
			ps.setString(2, spdim.getUom());
			ps.setString(3, spdim.getDim());
			ps.setString(4, spdim.getDimension());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentPackageWeight(ShipmentPackageWeight spw) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentPackageWeight(type,uom,Weight)VALUES(?,?,?)");
			
			ps.setString(1, spw.getType());
			ps.setString(2, spw.getUom());
			ps.setString(3, spw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentItemGroups(ShipmentItemGroups sig) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentItemGroups(internalId,sequence,isHandlingUnit,isShipUnit,Description,ContainmentId)values(?,?,?,?,?,?)");
			
			ps.setString(1, sig.getInternalId());
			ps.setString(2, sig.getSequence());
			ps.setString(3, sig.getIsHandlingUnit());
			ps.setString(4, sig.getIsShipUnit());
			ps.setString(5, sig.getDescription());
			ps.setString(6, sig.getContainmentId());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentItemGroupWeights(ShipmentItemGroupWeights sigw) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentItemGroupWeights(type,uom,Weight)VALUES(?,?,?)");
			
			ps.setString(1, sigw.getType());
			ps.setString(2, sigw.getUom());
			ps.setString(3, sigw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentItemGroupQuantities(ShipmentItemGroupQuantities sigq) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentItemGroupQuantities(type,uom,Quantity)VALUES(?,?,?)");
			
			ps.setString(1, sigq.getType());
			ps.setString(2, sigq.getUom());
			ps.setString(3, sigq.getQuantity());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentItemGroupDimensions(ShipmentItemGroupDimensions sigd) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentItemGroupDimensions(type,uom,dim,Dimension)VALUES(?,?,?,?)");
			
			ps.setString(1, sigd.getType());
			ps.setString(2, sigd.getUom());
			ps.setString(3, sigd.getDim());
			ps.setString(4, sigd.getDimension());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentItemGroupFreightClass(ShipmentItemGroupFreightClass sigfc) {
		
		Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentItemGroupFreightClass(type,FreightClass, Stackability,TrackingNumber,DeliveryStatus,EquipmentRequired)values(?,?,?,?,?,?)");
		
			ps.setString(1, sigfc.getType());
			ps.setString(2, sigfc.getFreightClass());
			ps.setString(3, sigfc.getStackability());
			ps.setString(4, sigfc.getTrackingNumber());
			ps.setString(5, sigfc.getDeliveryStatus());
			ps.setString(6, sigfc.getEquipmentRequired());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void addShipmentLineItemNumberAndWeights(ShipmentLineItemNumberAndWeights slinw) {
	
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentLineItemNumberAndWeights(lineNumber,internalId,type,uom,Weight)values(?,?,?,?,?)");
					
			ps.setString(1, slinw.getLineNumber());
			ps.setString(2, slinw.getInternalId());
			ps.setString(3, slinw.getType());
			ps.setString(4, slinw.getUom());
			ps.setString(5, slinw.getWeight());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentLineItemQuantities(ShipmentLineItemQuantities sliq) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentLineItemQuantities(Quantity,uom,type,ItemId,Description ,FreightClass,Commodity,NmfcCode,StccCode,"
					+"CustomerPartNum,ManufacturerPartNum,DistributorPartNum,Cube,TemperatureRange,HazardousMaterial,internalId,HazMatDetail,ProperShippingName,HazMatID,PackageGroup, HazMatClass,"
					+"ContactName,ContactPhone,HazMatPlacards,HazMatPlacardsDetails,HazMatEMSNumber,HazMatFlashPointTemp,Comments)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, sliq.getQuantity());
			ps.setString(2, sliq.getUom());
			ps.setString(3, sliq.getType());		
			ps.setString(4, sliq.getItemId());
			ps.setString(5, sliq.getDescription());
			ps.setString(6, sliq.getFreightClass());
			ps.setString(7, sliq.getCommodity());
			ps.setString(8, sliq.getNmfcCode());
			ps.setString(9, sliq.getStccCode());
			ps.setString(10, sliq.getCustomerPartNum());
			ps.setString(11, sliq.getManufacturerPartNum());
			ps.setString(12, sliq.getDistributorPartNum());
			ps.setString(13, sliq.getCube());
			ps.setString(14, sliq.getTemperatureRange());
			ps.setString(15, sliq.getHazardousMaterial());
			ps.setString(16, sliq.getInternalId());
			ps.setString(17, sliq.getHazMatDetail());
			ps.setString(18, sliq.getProperShippingName());
			ps.setString(19, sliq.getHazMatID());
			ps.setString(20, sliq.getPackageGroup());
			ps.setString(21, sliq.getHazMatClass());
			ps.setString(22, sliq.getContactName());
			ps.setString(23, sliq.getContactPhone());
			ps.setString(24, sliq.getHazMatPlacards());
			ps.setString(25, sliq.getHazMatPlacardsDetails());
			ps.setString(26, sliq.getHazMatEMSNumber());
			ps.setString(27, sliq.getHazMatFlashPointTemp());
			ps.setString(28, sliq.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
	
	
	@Override
	public void addShipmentLineItemDimensions(ShipmentLineItemDimensions slid) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentLineItemDimensions(Dimension,dim,uom,type, HarmonizedTariffCode,PortOfLading,"
					+ "CountryOfOrigin,CountryOfManufacture,CustomsValue,CustomsValueCurrency,InsuredValue,InsuredValueCurrency, AESExportCode,ScheduleBNumber,"
					+ "Domestic,ECCN,OriginationCountry,ManufacturingCountry,LicenseNumber,LicenseType)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, slid.getDimension());
			ps.setString(2, slid.getDim());
			ps.setString(3, slid.getUom());
			ps.setString(4, slid.getType());
			ps.setString(5, slid.getHarmonizedTariffCode());
			ps.setString(6, slid.getPortOfLading());
			ps.setString(7, slid.getCountryOfOrigin());
			ps.setString(8, slid.getCountryOfManufacture());
			ps.setString(9, slid.getCustomsValue());
			ps.setString(10, slid.getCustomsValueCurrency ());
			ps.setString(11, slid.getInsuredValue());
			ps.setString(12, slid.getInsuredValueCurrency());
			ps.setString(13, slid.getAESExportCode());
			ps.setString(14, slid.getScheduleBNumber());
			ps.setString(15, slid.getDomestic());
			ps.setString(16, slid.getECCN());
			ps.setString(17, slid.getOriginationCountry());
			ps.setString(18, slid.getManufacturingCountry());
			ps.setString(19, slid.getLicenseNumber ());
			ps.setString(20, slid.getLicenseType ());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentPriceSheets(ShipmentPriceSheets sps) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentPriceSheets(chargeModel,isSelected,isAllocated,currencyCode,exchangeDate,createBy,"
					+"createDate,updateBy,updateDate,internalId,type,AccessorialTotal,SubTotal,NormalizedTotal,ContractId,ContractName)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, sps.getChargeModel());
			ps.setString(2, sps.getIsSelected());
			ps.setString(3, sps.getIsAllocated());
			ps.setString(4, sps.getCurrencyCode());
			ps.setString(5, sps.getExchangeDate());
			ps.setString(6, sps.getCreateBy());
			ps.setString(7, sps.getCreateDate());
			ps.setString(8, sps.getUpdateBy());
			ps.setString(9, sps.getUpdateDate());
			ps.setString(10, sps.getInternalId());
			ps.setString(11, sps.getType());
			ps.setString(12, sps.getAccessorialTotal());
			ps.setString(13, sps.getSubTotal());
			ps.setString(14, sps.getNormalizedTotal());
			ps.setString(15, sps.getContractId());
			ps.setString(16, sps.getContractName());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentCarrierInfo(ShipmentCarrierInfo sci) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentCarrierInfo(internalId,CarrierId,CarrierName,SCAC,Mode,Service,ServiceDays"
					+ "Distance,Id,MCNumber,USDOT)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, sci.getInternalId());
			ps.setString(2, sci.getCarrierId());
			ps.setString(3, sci.getCarrierName());
			ps.setString(4, sci.getSCAC());
			ps.setString(5, sci.getMode());
			ps.setString(6, sci.getService());
			ps.setString(7, sci.getServiceDays());
			ps.setString(8, sci.getDistance());
			ps.setString(9, sci.getId());
			ps.setString(10, sci.getMCNumber());
			ps.setString(11, sci.getUSDOT());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentInsuranceTypes(ShipmentInsuranceTypes sit) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentInsuranceTypes(amount,company,expirationDate,contactName,contactPhone,type)VALUES(?,?,?,?,?,?)");
		
			ps.setString(1, sit.getAmount());
			ps.setString(2, sit.getCompany());
			ps.setString(3, sit.getExpirationDate ());
			ps.setString(4, sit.getContactName());
			ps.setString(5, sit.getContactPhone());
			ps.setString(6, sit.getType());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentCarrierAddress(ShipmentCarrierAddress sca) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentCarrierAddress(internald,type,isPrimary,isResidential,Owner,CustomerAcctNum"
					+ "LocationCode,Name,AddrLine1,AddrLine2,City,StateProvince,PostalCode,CountryCode,Contacts)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, sca.getInternalId());
			ps.setString(2, sca.getType());
			ps.setString(3, sca.getIsPrimary());
			ps.setString(4, sca.getIsResidential());
			ps.setString(5, sca.getOwner());
			ps.setString(6, sca.getCustomerAcctNum());
			ps.setString(7, sca.getLocationCode());
			ps.setString(8, sca.getName());
			ps.setString(9, sca.getAddrLine1());
			ps.setString(10, sca.getAddrLine2());
			ps.setString(11, sca.getCity());
			ps.setString(12, sca.getStateProvince());
			ps.setString(13, sca.getPostalCode());
			ps.setString(14, sca.getCountryCode());
			ps.setString(15, sca.getContacts());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentInsuranceGeoloc(ShipmentInsuranceGeoloc sigl) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentInsuranceGeoloc(longDirection ,longDegrees, latDirection, latDegrees)VALUES(?,?,?,?)");
		
			ps.setString(1, sigl.getLongDirection());
			ps.setString(2, sigl.getLongDegrees());
			ps.setString(3, sigl.getLatDirection());
			ps.setString(4, sigl.getLatDegrees());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentPriceSheetCharges(ShipmentPriceSheetCharges spsc) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ShipmentPriceSheetCharges(itemGroupId,sequenceNum,internalId,type,Description,EdiCode,Amount,"
					+ "Rate,RateQualifier,Quantity,Weight,DimWeight,FreightClass,IsMin,IsMax,IsNontaxable,Comments)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
			ps.setString(1, spsc.getItemGroupId());
			ps.setString(2, spsc.getSequenceNum());
			ps.setString(3, spsc.getInternalId());
			ps.setString(4, spsc.getType());
			ps.setString(4, spsc.getDescription());
			ps.setString(4, spsc.getEdiCode());
			ps.setString(4, spsc.getAmount());
			ps.setString(4, spsc.getRate());
			ps.setString(4, spsc.getRateQualifier());
			ps.setString(4, spsc.getQuantity());
			ps.setString(4, spsc.getWeight());
			ps.setString(4, spsc.getDimWeight());
			ps.setString(4, spsc.getFreightClass());
			ps.setString(4, spsc.getFakFreightClass());
			ps.setString(4, spsc.getIsMin());
			ps.setString(4, spsc.getIsMax());
			ps.setString(4, spsc.getIsNontaxable());
			ps.setString(4, spsc.getComments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addShipmentActivities(ShipmentActivities shac) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentActivities(type,InternalId,createBy,updateDate,updateBy,createDate,createBy,"
					+ "ActivityID,Summary,Priority,Required,Status,AssignedTo,PlannedDate,PercentageComplete,StatusDetails,Location,Contact,Comments)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, shac.getType());
			ps.setString(2, shac.getInternalId());
			ps.setString(3, shac.getUpdateDate());
			ps.setString(4, shac.getUpdateBy());
			ps.setString(5, shac.getCreateDate());
			ps.setString(6, shac.getCreateBy());
			ps.setString(7, shac.getActivityID());
			ps.setString(8, shac.getSummary());
			ps.setString(9, shac.getPriority());
			ps.setString(10, shac.getRequired());
			ps.setString(11, shac.getStatus());
			ps.setString(12, shac.getAssignedTo());
			ps.setString(13, shac.getPlannedDate());
			ps.setString(14, shac.getPercentageComplete());
			ps.setString(15, shac.getStatusDetails());
			ps.setString(16, shac.getLocation());
			ps.setString(17, shac.getContact());
			ps.setString(18, shac.getDocuments());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addShipmentMargins(ShipmentMargins sm) {
		
Connection conn=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps= conn.prepareStatement("insert into ShipmentMargins(type,currencyCode,MarginRevenue,MarginCost,MarginValue)values(?,?,?,?,?)");
					
			ps.setString(1, sm.getType());
			ps.setString(2, sm.getCurrencyCode());
			ps.setString(3, sm.getMarginRevenue());
			ps.setString(4, sm.getMarginCost());
			ps.setString(5, sm.getMarginValue());
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

}
