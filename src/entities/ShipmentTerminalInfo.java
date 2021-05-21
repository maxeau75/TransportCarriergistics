package entities;

public class ShipmentTerminalInfo {
	
	  private String TerminalType;
	  private String Origin;
	  private String Destination;
	  private String EquipmentList;
	  private String ScheduledEquipment;
	    
	public ShipmentTerminalInfo() {
		super();
		
	}
	public ShipmentTerminalInfo(String terminalType, String origin, String destination, String equipmentList,
			String scheduledEquipment) {
		super();
		TerminalType = terminalType;
		Origin = origin;
		Destination = destination;
		EquipmentList = equipmentList;
		ScheduledEquipment = scheduledEquipment;
	}
	public String getTerminalType() {
		return TerminalType;
	}
	public void setTerminalType(String terminalType) {
		TerminalType = terminalType;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getEquipmentList() {
		return EquipmentList;
	}
	public void setEquipmentList(String equipmentList) {
		EquipmentList = equipmentList;
	}
	public String getScheduledEquipment() {
		return ScheduledEquipment;
	}
	public void setScheduledEquipment(String scheduledEquipment) {
		ScheduledEquipment = scheduledEquipment;
	}
	  
	  

}
