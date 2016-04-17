package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tracking_code", nullable = false, unique = true)
	private Long trackingCode;

	@ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
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

	@Column(name = "countrySender", nullable = false, length = 100)
	private String countrySender;

	@Column(name = "paymentDeadline", nullable = false)
	private Date paymentDeadline;

	@Column(name = "daysOfDelay", nullable = false)
	private Integer daysOfDelay;

	@Column(nullable = false)
	private BigDecimal debt;

	@Column(nullable = false)
	private BigDecimal fine;

	@ManyToMany(targetEntity = Products.class, fetch = FetchType.LAZY)
	@JoinTable(name = "packages_products", joinColumns = { @JoinColumn(name = "package") }, inverseJoinColumns = {
			@JoinColumn(name = "id_product") })
	private List<Products> products;

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
				+ ", countrySender=" + countrySender + ", paymentDeadline=" + paymentDeadline + ", daysOfDelay="
				+ daysOfDelay + ", debt=" + debt + ", fine=" + fine + ", products=" + products + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countrySender == null) ? 0 : countrySender.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((daysOfDelay == null) ? 0 : daysOfDelay.hashCode());
		result = prime * result + ((debt == null) ? 0 : debt.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fine == null) ? 0 : fine.hashCode());
		result = prime * result + ((idRecipient == null) ? 0 : idRecipient.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((paymentDeadline == null) ? 0 : paymentDeadline.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + ((trackingCode == null) ? 0 : trackingCode.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Packages other = (Packages) obj;
		if (trackingCode == null) {
			if (other.trackingCode != null) {
				return false;
			}
		} else if (!trackingCode.equals(other.trackingCode)) {
			return false;
		}
		return true;
	}

}
