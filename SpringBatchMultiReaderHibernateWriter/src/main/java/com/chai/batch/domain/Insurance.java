package com.chai.batch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_type")
public class Insurance {
	
	
	@Id
	private int id;
	@Column(name="membership_type")
	private String membershipType;
	@Column(name="metallic_type")
	private String metallicType;
	private int premium;
	private int deductible;
	@Column(name="co_insurance")
	private int coInsurance;
	private int copay;
	@Column(name="out_of_pocket")
	private int outOfPocket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public int getDeductible() {
		return deductible;
	}
	public void setDeductible(int deductible) {
		this.deductible = deductible;
	}
	public int getCoInsurance() {
		return coInsurance;
	}
	public void setCoInsurance(int coInsurance) {
		this.coInsurance = coInsurance;
	}
	public int getCopay() {
		return copay;
	}
	public void setCopay(int copay) {
		this.copay = copay;
	}
	public int getOutOfPocket() {
		return outOfPocket;
	}
	public void setOutOfPocket(int outOfPocket) {
		this.outOfPocket = outOfPocket;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
