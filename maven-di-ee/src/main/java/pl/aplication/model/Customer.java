package pl.aplication.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_CODE")
	private String custCode;

	@Column(name="AGENT_CODE")
	private String agentCode;

	@Column(name="CUST_CITY")
	private String custCity;

	@Column(name="CUST_COUNTRY")
	private String custCountry;

	@Column(name="CUST_NAME")
	private String custName;

	private BigDecimal grade;

	@Column(name="OPENING_AMT")
	private BigDecimal openingAmt;

	@Column(name="OUTSTANDING_AMT")
	private BigDecimal outstandingAmt;

	@Column(name="PAYMENT_AMT")
	private BigDecimal paymentAmt;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="RECEIVE_AMT")
	private BigDecimal receiveAmt;

	@Column(name="WORKING_AREA")
	private String workingArea;

	public Customer() {
	}

	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getCustCity() {
		return this.custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustCountry() {
		return this.custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	public BigDecimal getOpeningAmt() {
		return this.openingAmt;
	}

	public void setOpeningAmt(BigDecimal openingAmt) {
		this.openingAmt = openingAmt;
	}

	public BigDecimal getOutstandingAmt() {
		return this.outstandingAmt;
	}

	public void setOutstandingAmt(BigDecimal outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public BigDecimal getPaymentAmt() {
		return this.paymentAmt;
	}

	public void setPaymentAmt(BigDecimal paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public BigDecimal getReceiveAmt() {
		return this.receiveAmt;
	}

	public void setReceiveAmt(BigDecimal receiveAmt) {
		this.receiveAmt = receiveAmt;
	}

	public String getWorkingArea() {
		return this.workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

}