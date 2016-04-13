package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Packages {

	private Long trackingCode;
	private Recipient idRecipient;
	private BigDecimal price;
	private Double weight;
	private User idUser;
	private Date date;
	private String description;
	private String countrySender;
	private Date paymentDeadline;
	private Integer daysOfDelay;
	private BigDecimal debt;
	private BigDecimal fine;
	private Set<Products> products;

	public Long getTrackingCode() {
		return trackingCode;
	}

	public void setTrackingCode(Long trackingCode) {
		this.trackingCode = trackingCode;
	}

	public Recipient getIdRecipient() {
		return idRecipient;
	}

	public void setIdRecipient(Recipient idRecipient) {
		this.idRecipient = idRecipient;
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

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountrySender() {
		return countrySender;
	}

	public void setCountrySender(String countrySender) {
		this.countrySender = countrySender;
	}

	public Date getPaymentDeadline() {
		return paymentDeadline;
	}

	public void setPaymentDeadline(Date paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}

	public Integer getDaysOfDelay() {
		return daysOfDelay;
	}

	public void setDaysOfDelay(Integer daysOfDelay) {
		this.daysOfDelay = daysOfDelay;
	}

	public BigDecimal getDebt() {
		return debt;
	}

	public void setDebt(BigDecimal debt) {
		this.debt = debt;
	}

	public BigDecimal getFine() {
		return fine;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

}
