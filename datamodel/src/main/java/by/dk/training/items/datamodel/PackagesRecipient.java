package by.dk.training.items.datamodel;

public class PackagesRecipient extends IdRecipient {

	private Double priceForTheLastMonth; // Цена всех посылок за последний месяц
	private Float weightForTheLastMonth;
	private Double limitPrice;
	private Double limitWeight;
	private Integer allPackages;

	public Double getPriceForTheLastMonth() {
		return priceForTheLastMonth;
	}

	public void setPriceForTheLastMonth(Double priceForTheLastMonth) {
		this.priceForTheLastMonth = priceForTheLastMonth;
	}

	public Float getWeightForTheLastMonth() {
		return weightForTheLastMonth;
	}

	public void setWeightForTheLastMonth(Float weightForTheLastMonth) {
		this.weightForTheLastMonth = weightForTheLastMonth;
	}

	public Double getLimitPrice() {
		return limitPrice;
	}

	public void setLimitPrice(Double limitPrice) {
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
