package entities;

public class LoadCarrierTerminalInfo {
	
	private String TerminalType;
	private String Origin;
	private String Destination;
	
	public LoadCarrierTerminalInfo() {
		super();
		
	}
	public LoadCarrierTerminalInfo(String terminalType, String origin, String destination) {
		super();
		TerminalType = terminalType;
		Origin = origin;
		Destination = destination;
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
	
	

}
