package entities;

public class LoadEventPlan {
	
	private String internalId;
	private String count;
	private String sequenceNum;
	private String eventtype;
	private String CarrierActionCode;
	private String AppointmentNumber;
	private String LateReason;
	private String AppointmentType;
	private String DateType;
	private String Date;
	
	public LoadEventPlan() {
		super();
		
	}
	public LoadEventPlan(String internalId, String count, String sequenceNum, String eventtype,
			String carrierActionCode, String appointmentNumber, String lateReason, String appointmentType,
			String dateType, String date) {
		super();
		this.internalId = internalId;
		this.count = count;
		this.sequenceNum = sequenceNum;
		this.eventtype = eventtype;
		CarrierActionCode = carrierActionCode;
		AppointmentNumber = appointmentNumber;
		LateReason = lateReason;
		AppointmentType = appointmentType;
		DateType = dateType;
		Date = date;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getSequenceNum() {
		return sequenceNum;
	}
	public void setSequenceNum(String sequenceNum) {
		this.sequenceNum = sequenceNum;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getCarrierActionCode() {
		return CarrierActionCode;
	}
	public void setCarrierActionCode(String carrierActionCode) {
		CarrierActionCode = carrierActionCode;
	}
	public String getAppointmentNumber() {
		return AppointmentNumber;
	}
	public void setAppointmentNumber(String appointmentNumber) {
		AppointmentNumber = appointmentNumber;
	}
	public String getLateReason() {
		return LateReason;
	}
	public void setLateReason(String lateReason) {
		LateReason = lateReason;
	}
	public String getAppointmentType() {
		return AppointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		AppointmentType = appointmentType;
	}
	public String getDateType() {
		return DateType;
	}
	public void setDateType(String dateType) {
		DateType = dateType;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	

}
