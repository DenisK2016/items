package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "packages")
public class Packages {

	@Id
	@Column(name = "tracking_code", nullable = false, unique = true)
	private Long trackingCode;

	@ManyToOne(targetEntity = Recipient.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_recipient", nullable = false)
	private Recipient idRecipient;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(nullable = false)
	private Double weight;

	@ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	private User idUser;

	@Column(nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date date;

	@Column(length = 1000)
	private String description;

	@Column(name = "country_sender", nullable = false, length = 100)
	private String countrySender;

	@Column(name = "payment_deadline", nullable = false)
	private Date paymentDeadline;

	@Column(nullable = false)
	private BigDecimal fine;

	@Column(nullable = false)
	private Boolean paid;

	@ManyToMany(targetEntity = Products.class, fetch = FetchType.LAZY)
	@JoinTable(name = "packages_products", joinColumns = { @JoinColumn(name = "package") }, inverseJoinColumns = {
			@JoinColumn(name = "id_product") })
	private List<Products> products = new ArrayList<>();

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

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

	public BigDecimal getFine() {
		return fine;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Packages [trackingCode=" + trackingCode + ", idRecipient=" + idRecipient + ", price=" + price
				+ ", weight=" + weight + ", idUser=" + idUser + ", date=" + date + ", description=" + description
				+ ", countrySender=" + countrySender + ", paymentDeadline=" + paymentDeadline + ", fine=" + fine
				+ ", paid=" + paid + ", products=" + products + "]";
	}

}
