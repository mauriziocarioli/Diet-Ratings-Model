package com.grocery;

import java.io.Serializable;

public class Element implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8886269221926063242L;

    //	@org.kie.api.definition.type.Label(value = "element Id")
	private Integer elementId;
    //	@org.kie.api.definition.type.Label(value = "element name")
	private String elementName;
    //	@org.kie.api.definition.type.Label(value = "quantity")
	private Double qty;
    //	@org.kie.api.definition.type.Label(value = "unit of measure")
	private String uom;
    //	@org.kie.api.definition.type.Label(value = "points")
	private Double points;

	public Element() {
	}

	public Integer getElementId() {
		return this.elementId;
	}

	public void setElementId(Integer elementId) {
		this.elementId = elementId;
	}

	public String getElementName() {
		return this.elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public Double getQty() {
		return this.qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}
	
	public Element(Integer elementId, String elementName, Double qty, String uom, Double points) {
		this.elementId = elementId;
		this.elementName = elementName;
		this.qty = qty;
		this.uom = uom;
		this.points = points;
	}

}
