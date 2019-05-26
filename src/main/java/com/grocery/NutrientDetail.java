package com.grocery;

import java.io.Serializable;

public class NutrientDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6472335711013153523L;
	
    //	@org.kie.api.definition.type.Label(value = "id")
	private Integer id;
    //	@org.kie.api.definition.type.Label(value = "description")
	private String description;
    //	@org.kie.api.definition.type.Label(value = "quantity")
	private Double qty;
    //	@org.kie.api.definition.type.Label(value = "unit of measure")
	private String uom;
    //	@org.kie.api.definition.type.Label(value = "percentage DV value")
	private Integer pctDVValue;
	
	public NutrientDetail() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public Integer getPctDVValue() {
		return pctDVValue;
	}
	public void setPctDVValue(Integer pctDVValue) {
		this.pctDVValue = pctDVValue;
	}

	public NutrientDetail(Integer id, String description,
			Double qty, String uom,
			Integer pctDVValue) {
		this.id = id;
		this.description = description;
		this.qty = qty;
		this.uom = uom;
		this.pctDVValue = pctDVValue;
	}

}
