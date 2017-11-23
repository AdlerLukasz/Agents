package pl.aplication.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORD_NUM")
	private long ordNum;

	@Column(name="ADVANCE_AMOUNT")
	private BigDecimal advanceAmount;

	@Column(name="AGENT_CODE")
	private String agentCode;

	@Column(name="CUST_CODE")
	private String custCode;

	@Column(name="ORD_AMOUNT")
	private BigDecimal ordAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_DATE")
	private Date ordDate;

	@Column(name="ORD_DESCRIPTION")
	private String ordDescription;

	public Order() {
	}

	public long getOrdNum() {
		return this.ordNum;
	}

	public void setOrdNum(long ordNum) {
		this.ordNum = ordNum;
	}

	public BigDecimal getAdvanceAmount() {
		return this.advanceAmount;
	}

	public void setAdvanceAmount(BigDecimal advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public BigDecimal getOrdAmount() {
		return this.ordAmount;
	}

	public void setOrdAmount(BigDecimal ordAmount) {
		this.ordAmount = ordAmount;
	}

	public Date getOrdDate() {
		return this.ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public String getOrdDescription() {
		return this.ordDescription;
	}

	public void setOrdDescription(String ordDescription) {
		this.ordDescription = ordDescription;
	}

}