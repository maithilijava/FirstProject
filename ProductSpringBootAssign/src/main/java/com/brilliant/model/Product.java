package com.brilliant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pId;
	private String pName;
	private String pDescription;
		

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDescription=" + pDescription + "]";
	}

	public void setpName(String pName) {
		this.pName = pName;
	}



	public Product(Integer pId, String pName, String pDescription) {

		this.pId = pId;
		this.pName = pName;
		this.pDescription = pDescription;
		System.out.println(pDescription);
	}

	public Product() {

	}

}
