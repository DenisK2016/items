package by.dk.training.items.datamodel;

import java.math.BigDecimal;

public class PackagesRecipient extends IdRecipient {

	private BigDecimal priceForTheLastMonth; // Цена всех посылок за последний месяц
	private Double weightForTheLastMonth;
	private BigDecimal limitPrice;
	private Double limitWeight;
	private Integer allPackages;

	public BigDecimal getPriceForTheLastMonth() {
		return priceForTheLastMonth;
	}

	public void setPriceForTheLastMonth(BigDecimal priceForTheLastMonth) {
		this.priceForTheLastMonth = priceForTheLastMonth;
	}

	public Double getWeightForTheLastMonth() {
		return weightForTheLastMonth;
	}

	public void setWeightForTheLastMonth(Double weightForTheLastMonth) {
		this.weightForTheLastMonth = weightForTheLastMonth;
	}

	public BigDecimal getLimitPrice() {
		return limitPrice;
	}

	public void setLimitPrice(BigDecimal limitPrice) {
		this.limitPrice = limitPrice;
	}

	public Double getLimitWeight() {
		return limitWeight;
	}

	public void setLimitWeight(Double limitWeight) {
		this.limitWeight = limitWeight;
	}

	public Integer getAllPackages() {
		return allPackages;
	}

	public void setAllPackages(Integer allPackages) {
		this.allPackages = allPackages;
	}

}
