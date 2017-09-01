package com.chai.batch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@Entity
@Table(name="claims")
public class Claims {
	
	@Id
	@Column(name="claimid" )
	private int id;
	@Column(name="provider")
	private String providerName; 

    @Column(name = "dateofservice", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate DateOfService;
    

    @Column(name = "processeddate", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate processedDate;
    @Column(name="billedamount")
    private int billedAmount;
    @Column(name="patientresponsibility")
    private int patientResponsibility;
    @Column(name="id")
    private int pid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public LocalDate getDateOfService() {
		return DateOfService;
	}
	public void setDateOfService(LocalDate dateOfService) {
		DateOfService = dateOfService;
	}
	public LocalDate getProcessedDate() {
		return processedDate;
	}
	public void setProcessedDate(LocalDate processedDate) {
		this.processedDate = processedDate;
	}
	public int getBilledAmount() {
		return billedAmount;
	}
	public void setBilledAmount(int billedAmount) {
		this.billedAmount = billedAmount;
	}
	public int getPatientResponsibility() {
		return patientResponsibility;
	}
	public void setPatientResponsibility(int patientResponsibility) {
		this.patientResponsibility = patientResponsibility;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public Claims() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
}
