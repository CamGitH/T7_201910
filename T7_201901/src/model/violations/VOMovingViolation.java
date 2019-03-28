package model.violations;


import java.util.Comparator;

public class VOMovingViolation implements Comparable<VOMovingViolation>{


	private String OBJECTID;
	private String ROW_;
	private String LOCATION;
	private String ADDRESSID;
	private String STREETSEGID;
	private String XCOORD;
	private String YCOORD;
	private String TICKETTYPE;
	private String FINEAMT;
	private String TOTALPAID;
	private String PENALTY1;
	private String PENALTY2;
	private String ACCIDENTINDICATOR;
	private String TICKETISSUEDATE;
	private String VIOLATIONCODE;
	private String VIOLATIONDESC;
	private String ROW_ID;

	public VOMovingViolation(String pObjectID, String pRow, String pLocation, String pAddressID, String pStreetSeg, String pXCoor,
			String pYCoor, String pTicketType, String pFineAtm, String tOTALPAID, String pPenalty1, String pPenalty2,
			String pAccidentIndicator, String pTicketIssueDate, String pViolationCode, String pViolationDescription, String pRowID) {
		super();
		OBJECTID = pObjectID;
		ROW_ = pRow;
		LOCATION = pLocation;
		ADDRESSID = pAddressID;
		STREETSEGID = pStreetSeg;
		XCOORD = pXCoor;
		YCOORD = pYCoor;
		TICKETTYPE = pTicketType;
		FINEAMT = pFineAtm;
		TOTALPAID = tOTALPAID;
		PENALTY1 = pPenalty1;
		PENALTY2 = pPenalty2;
		ACCIDENTINDICATOR = pAccidentIndicator;
		TICKETISSUEDATE = pTicketIssueDate;
		VIOLATIONCODE = pViolationCode;
		VIOLATIONDESC = pViolationDescription;
		ROW_ID = pRowID;
	}

	/**
	 * @return the objectID
	 */
	public String getObjectID() {
		return OBJECTID;
	}

	/**
	 * @param objectID the objectID to set
	 */
	public void setObjectID(String objectID) {
		this.OBJECTID = objectID;
	}

	/**
	 * @return the row
	 */
	public String getRow() {
		return ROW_;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(String row) {
		this.ROW_ = row;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return LOCATION;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.LOCATION = location;
	}

	/**
	 * @return the addressID
	 */
	public String getAddressID() {
		return ADDRESSID;
	}

	/**
	 * @param addressID the addressID to set
	 */
	public void setAddressID(String addressID) {
		this.ADDRESSID = addressID;
	}

	/**
	 * @return the streetSeg
	 */
	public String getStreetSeg() {
		return STREETSEGID;
	}

	/**
	 * @param streetSeg the streetSeg to set
	 */
	public void setStreetSeg(String streetSeg) {
		this.STREETSEGID = streetSeg;
	}

	/**
	 * @return the xCoor
	 */
	public String getxCoor() {
		return XCOORD;
	}

	/**
	 * @param xCoor the xCoor to set
	 */
	public void setxCoor(String xCoor) {
		this.XCOORD = xCoor;
	}

	/**
	 * @return the yCoor
	 */
	public String getyCoor() {
		return YCOORD;
	}

	/**
	 * @param yCoor the yCoor to set
	 */
	public void setyCoor(String yCoor) {
		this.YCOORD = yCoor;
	}

	/**
	 * @return the ticketType
	 */
	public String getTicketType() {
		return TICKETTYPE;
	}

	/**
	 * @param ticketType the ticketType to set
	 */
	public void setTicketType(String ticketType) {
		this.TICKETTYPE = ticketType;
	}

	/**
	 * @return the fineAtm
	 */
	public String getFineAtm() {
		return FINEAMT;
	}

	/**
	 * @param fineAtm the fineAtm to set
	 */
	public void setFineAtm(String fineAtm) {
		this.FINEAMT = fineAtm;
	}

	/**
	 * @return the totalPaid
	 */
	public String getTotalPaid() {
		return TOTALPAID;
	}

	/**
	 * @param totalPaid the totalPaid to set
	 */
	public void setTotalPaid(String totalPaid) {
		this.TOTALPAID = totalPaid;
	}

	/**
	 * @return the penalty1
	 */
	public String getPenalty1() {
		return PENALTY1;
	}

	/**
	 * @param penalty1 the penalty1 to set
	 */
	public void setPenalty1(String penalty1) {
		this.PENALTY1 = penalty1;
	}

	/**
	 * @return the penalty2
	 */
	public String getPenalty2() {
		return PENALTY2;
	}

	/**
	 * @param penalty2 the penalty2 to set
	 */
	public void setPenalty2(String penalty2) {
		this.PENALTY2 = penalty2;
	}

	/**
	 * @return the accidentIndicator
	 */
	public String getAccidentIndicator() {
		return ACCIDENTINDICATOR;
	}

	/**
	 * @param accidentIndicator the accidentIndicator to set
	 */
	public void setAccidentIndicator(String accidentIndicator) {
		this.ACCIDENTINDICATOR = accidentIndicator;
	}

	/**
	 * @return the ticketIssueDate
	 */
	public String getTicketIssueDate() {
		return TICKETISSUEDATE;
	}

	/**
	 * @param ticketIssueDate the ticketIssueDate to set
	 */
	public void setTicketIssueDate(String ticketIssueDate) {
		this.TICKETISSUEDATE = ticketIssueDate;
	}

	/**
	 * @return the violationCode
	 */
	public String getViolationCode() {
		return VIOLATIONCODE;
	}

	/**
	 * @param violationCode the violationCode to set
	 */
	public void setViolationCode(String violationCode) {
		this.VIOLATIONCODE = violationCode;
	}

	/**
	 * @return the violationDescription
	 */
	public String getViolationDescription() {
		return VIOLATIONDESC;
	}

	/**
	 * @param violationDescription the violationDescription to set
	 */
	public void setViolationDescription(String violationDescription) {
		this.VIOLATIONDESC = violationDescription;
	}

	/**
	 * @return the rowID
	 */
	public String getRowID() {
		return ROW_ID;
	}

	/**
	 * @param rowID the rowID to set
	 */
	public void setRowID(String rowID) {
		this.ROW_ID = rowID;
	}

	public static class TicketIssueDate implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object1.getTicketIssueDate().compareToIgnoreCase(object2.getTicketIssueDate());
		}

	}

	public static class ObjectID implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object1.getObjectID().compareToIgnoreCase(object2.getObjectID());
		}

	}

	public static class StreetSeg implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object2.getStreetSeg().compareToIgnoreCase(object1.getStreetSeg());
		}

	}

	public static class AddressID implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object1.getAddressID().compareToIgnoreCase(object2.getAddressID());
		}

	}

	public static class TotalPaidAscendente implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object1.getTotalPaid().compareToIgnoreCase(object2.getTotalPaid());
		}

	}

	public static class TotalPaidDescendente implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object2.getTotalPaid().compareToIgnoreCase(object1.getTotalPaid());
		}

	}

	public static class ViolationDesc implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object1.getViolationDescription().compareToIgnoreCase(object2.getViolationDescription());
		}

	}

	public static class ViolationCode implements Comparator<VOMovingViolation>{

		@Override
		public int compare(VOMovingViolation object1, VOMovingViolation object2) {
			return object2.getViolationCode().compareToIgnoreCase(object1.getViolationCode());
		}

	}

	@Override
	public int compareTo(VOMovingViolation o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String ToString(){
		return 
				
		"OBJECTID:" + getObjectID() +
		" ,LOCATION: "+ getLocation() +
		" ,TICKETISSUEDATE: " + getTicketIssueDate() +
		" ,VIOLATIONCODE: " + getViolationCode() +
		" ,FINEAMT: " + getFineAtm();
	
	}

}
