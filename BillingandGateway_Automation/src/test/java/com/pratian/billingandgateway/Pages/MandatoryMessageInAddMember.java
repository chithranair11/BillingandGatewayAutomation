package com.pratian.billingandgateway.Pages;

public enum MandatoryMessageInAddMember {
	
	AddressLine1 ("Address Line 1 is Required"), 
	City ("City is Required"), 
	State ("State is Required"), 
	Country ("Country is Required"), 
	ZipCode ("Zip Code is Required"), 
	PhoneNumber ("Phone Number is Required"), 
	AddrEffDate("Add Eff Date is Required"),
	InsuranceCompany("Insurance Company is Required"),
	PlanName("Plan Name is Required"),
	PlanEffDate("Plan Eff Date is Required"),
	IPAName ("IPA Name is Required"), 
	PCPName ("PCP Name is Required"), 
	PCPEffFrom("PCP Eff From is Required"),
	UploadDocument("Document is Required");
	
	private String value;
	 
	private MandatoryMessageInAddMember(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
