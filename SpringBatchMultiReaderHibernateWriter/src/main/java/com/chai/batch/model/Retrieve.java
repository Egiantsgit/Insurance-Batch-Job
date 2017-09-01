package com.chai.batch.model;

import java.util.List;

import com.chai.batch.domain.Insurance;

public class Retrieve {
	
	
	private List<Insurance> insuranceList;
	private List<Provider> providerList;
	
	
	
	public List<Insurance> getInsuranceList() {
		return insuranceList;
	}
	public void setInsuranceList(List<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}
	public List<Provider> getProviderList() {
		return providerList;
	}
	public void setProviderList(List<Provider> providerList) {
		this.providerList = providerList;
	}
	
	private String membershipType;
    private String metallicType;
	private String premium;
	private String deductible;
	private String coInsurance;
	private String copay;
	
	private String totalAmount;
	private String doctorVisit;
	private String mettallicType;
	private String membershiptType;
	private String claim;
	
	
	
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public String getMetallicType() {
		return metallicType;
	}
	public void setMetallicType(String metallicType) {
		this.metallicType = metallicType;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getDeductible() {
		return deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}
	public String getCoInsurance() {
		return coInsurance;
	}
	public void setCoInsurance(String coInsurance) {
		this.coInsurance = coInsurance;
	}
	public String getCopay() {
		return copay;
	}
	public void setCopay(String copay) {
		this.copay = copay;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDoctorVisit() {
		return doctorVisit;
	}
	public void setDoctorVisit(String doctorVisit) {
		this.doctorVisit = doctorVisit;
	}
	public String getMettallicType() {
		return mettallicType;
	}
	public void setMettallicType(String mettallicType) {
		this.mettallicType = mettallicType;
	}
	public String getMembershiptType() {
		return membershiptType;
	}
	public void setMembershiptType(String membershiptType) {
		this.membershiptType = membershiptType;
	}
	public String getClaim() {
		return claim;
	}
	public void setClaim(String claim) {
		this.claim = claim;
	}
	public Retrieve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
