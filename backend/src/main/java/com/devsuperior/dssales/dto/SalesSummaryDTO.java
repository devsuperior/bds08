package com.devsuperior.dssales.dto;

import java.io.Serializable;

public class SalesSummaryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double sum;
	private Double min;
	private Double max;
	private Double avg;
	private Long count;
	
	public SalesSummaryDTO() {
	}

	public SalesSummaryDTO(Double sum, Double min, Double max, Double avg, Long count) {
		super();
		this.sum = sum;
		this.min = min;
		this.max = max;
		this.avg = avg;
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
}
