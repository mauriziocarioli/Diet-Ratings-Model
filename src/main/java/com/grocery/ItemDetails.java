package com.grocery;

import java.io.Serializable;
import java.util.List;

import com.grocery.NutrientDetail;
import com.grocery.Ratings;

public class ItemDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5559187568689320948L;

    //	@org.kie.api.definition.type.Label("UPC")
	private String upc;
    //	@org.kie.api.definition.type.Label("name")
	private String name;
    //	@org.kie.api.definition.type.Label("algorithm Id")
	private String algorithmId;
    //	@org.kie.api.definition.type.Label("ingredient text")
	private String ingredientTxt;
    //	@org.kie.api.definition.type.Label("nutrient detail")
	private List<NutrientDetail> nutrientDetails;
    //	@org.kie.api.definition.type.Label(value = "ratings")
	private Ratings ratings;

	public ItemDetails() {
	}

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

	public String getIngredientTxt() {
		return this.ingredientTxt;
	}

	public void setIngredientTxt(String ingredientTxt) {
		this.ingredientTxt = ingredientTxt;
	}

	public List<NutrientDetail> getNutrientDetails() {
		return this.nutrientDetails;
	}

	public void setNutrientDetails(
			List<NutrientDetail> nutrientDetail) {
		this.nutrientDetails = nutrientDetail;
	}

	public Ratings getRatings() {
		return this.ratings;
	}

	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	
	public ItemDetails(String upc, String name,
			String algorithmId, String ingredientTxt,
			List<NutrientDetail> nutrientDetail,
			Ratings ratings) {
		this.upc = upc;
		this.name = name;
		this.algorithmId = algorithmId;
		this.ingredientTxt = ingredientTxt;
		this.nutrientDetails = nutrientDetail;
		this.ratings = ratings;
	}

}
