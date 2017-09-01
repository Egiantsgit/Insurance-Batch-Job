package com.chai.batch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;


@Entity
@Table(name="bill_info")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="membership_type")
	private String membershiptType;
	@Column(name="hospital_visits")
	private String hospitalVisits;
	@Column(name="total_amount")
	private int totalAmount;
	@Column(name="metallic_type")
	private String mettallicType;
	@Column(name="service_covered")
	private String serviceCovered;
	@Column(name="doctor_visit")
	private String doctorVisit;
	@Column(name="operation")
	private String operation;
	@Column(name="claim_num")
	private int claim;
	private int deductible;
	@Column(name="provider_name")
	private String providerName;
	
    @Column(name = "date_of_visit", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate DateOfVisit;
    
    @Column(name = "processeddate", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate processedDate;
     @Column(name="p_id")
	private int pid;
	  

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMembershiptType() {
		return membershiptType;
	}

	public void setMembershiptType(String membershiptType) {
		this.membershiptType = membershiptType;
	}

	public String getHospitalVisits() {
		return hospitalVisits;
	}

	public void setHospitalVisits(String hospitalVisits) {
		this.hospitalVisits = hospitalVisits;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMettallicType() {
		return mettallicType;
	}

	public void setMettallicType(String mettallicType) {
		this.mettallicType = mettallicType;
	}

	public String getServiceCovered() {
		return serviceCovered;
	}

	public void setServiceCovered(String serviceCovered) {
		this.serviceCovered = serviceCovered;
	}

	public String getDoctorVisit() {
		return doctorVisit;
	}

	public void setDoctorVisit(String doctorVisit) {
		this.doctorVisit = doctorVisit;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getClaim() {
		return claim;
	}

	public void setClaim(int claim) {
		this.claim = claim;
	}

	public int getDeductible() {
		return deductible;
	}

	public void setDeductible(int deductible) {
		this.deductible = deductible;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public LocalDate getDateOfVisit() {
		return DateOfVisit;
	}

	public void setDateOfVisit(LocalDate dateOfVisit) {
		DateOfVisit = dateOfVisit;
	}
	

	public LocalDate getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(LocalDate processedDate) {
		this.processedDate = processedDate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
    
    
    
   
	

}




