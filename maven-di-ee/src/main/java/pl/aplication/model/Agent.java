package pl.aplication.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;


/**
 * The persistent class for the Agents database table.
 * 
 */
@XmlRootElement
@Entity
@Table(name="Agents")
@NamedQuery(name="Agent.findAll", query="SELECT a FROM Agent a")
public class Agent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	

	@Id
	@Column(name="AGENT_CODE")
	private Long agentCode;

	@Column(name="AGENT_NAME")
	private String agentName;

	private BigDecimal commission;

	private String country;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="WORKING_AREA")
	private String workingArea;

	public Agent() {
	}
	
	
	
	
	
	

	public Agent(Long agentCode, String agentName, BigDecimal commission, String country, String phoneNo,
			String workingArea) {
		super();
		this.agentCode = agentCode;
		this.agentName = agentName;
		this.commission = commission;
		this.country = country;
		this.phoneNo = phoneNo;
		this.workingArea = workingArea;
	}







	public Long getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(Long agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getWorkingArea() {
		return this.workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

	
	
	
}