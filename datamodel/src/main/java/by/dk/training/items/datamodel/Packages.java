package by.dk.training.items.datamodel;

import java.math.BigDecimal;

public class Packages extends IdRecipient {

	private Long trackingCode;
	private User user;
	private BigDecimal price;
	private Double weight;
	private PackageInfo packageInfo;
	private PaymentsPackages paymentPackage;

	public Long getTrackingCode() {
		return trackingCode;
	}

	public void setTrackingCode(Long trackingCode) {
		this.trackingCode = trackingCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public PackageInfo getPackageInfo() {
		return packageInfo;
	}

	public void setPackageInfo(PackageInfo packageInfo) {
		this.packageInfo = packageInfo;
	}

	public PaymentsPackages getPaymentPackage() {
		return paymentPackage;
	}

	public void setPaymentPackage(PaymentsPackages paymentPackage) {
		this.paymentPackage = paymentPackage;
	}
}
