package com.grocery;

import java.io.Serializable;
import java.util.List;

import com.grocery.Element;

public class Ratings implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1885847882136497234L;

    //	@org.kie.api.definition.type.Label("rating")
	private Integer rating;
    //	@org.kie.api.definition.type.Label("points")
	private Integer points;
    //	@org.kie.api.definition.type.Label(value = "points breakup")
	private List<Element> pointsBreakup;

	public Ratings() {
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer starRating) {
		this.rating = starRating;
	}
	
	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public List<Element> getPointsBreakup() {
		return this.pointsBreakup;
	}

	public void setPointsBreakup(List<Element> arrayList) {
		this.pointsBreakup = arrayList;
	}
	
	public Ratings(Integer rating, Integer points, List<Element> pointsBreakup) {
		this.rating = rating;
		this.points = points;
		this.pointsBreakup = pointsBreakup;
	}

}
