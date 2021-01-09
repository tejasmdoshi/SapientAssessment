package com.sapient.assessment.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeatherSummary {

	private Double high;

	private Double low;

	private Set<String> suggestion;

	public void addSuggestion(String suggest) {

		if (this.suggestion == null)
			this.suggestion = new HashSet<>();

		this.suggestion.add(suggest);
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Set<String> getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(Set<String> suggestion) {
		this.suggestion = suggestion;
	}

}
