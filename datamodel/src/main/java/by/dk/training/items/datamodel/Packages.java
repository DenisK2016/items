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

	public void creatingPackage(Long trackingCode, Recipient idRecipient, BigDecimal price, Double weight, User idUser,
			Date date, String description, String countrySender, Date paymentDeadline, BigDecimal fine, Boolean paid) {

		this.trackingCode = trackingCode;
		this.idRecipient = idRecipient;
		this.price = price;
		this.weight = weight;
		this.idUser = idUser;
		this.date = date;
		this.description = description;
		this.countrySender = countrySender;
		this.paymentDeadline = paymentDeadline;
		this.fine = fine;
		this.paid = paid;

		idRecipient.setPackages(this);
		idUser.setPackages(this);
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

	public void setProducts(Products products) {
		this.products.add(products);
	}

	public void deleteProduct(Products product) {
		products.remove(product);
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
		if (countrySender == null) {
			if (other.countrySender != null) {
				return false;
			}
		} else if (!countrySender.equals(other.countrySender)) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (fine == null) {
			if (other.fine != null) {
				return false;
			}
		} else if (!fine.equals(other.fine)) {
			return false;
		}
		if (idRecipient == null) {
			if (other.idRecipient != null) {
				return false;
			}
		} else if (!idRecipient.equals(other.idRecipient)) {
			return false;
		}
		if (idUser == null) {
			if (other.idUser != null) {
				return false;
			}
		} else if (!idUser.equals(other.idUser)) {
			return false;
		}
		if (paid == null) {
			if (other.paid != null) {
				return false;
			}
		} else if (!paid.equals(other.paid)) {
			return false;
		}
		if (paymentDeadline == null) {
			if (other.paymentDeadline != null) {
				return false;
			}
		} else if (!paymentDeadline.equals(other.paymentDeadline)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		if (products == null) {
			if (other.products != null) {
				return false;
			}
		} else if (!products.equals(other.products)) {
			return false;
		}
		if (trackingCode == null) {
			if (other.trackingCode != null) {
				return false;
			}
		} else if (!trackingCode.equals(other.trackingCode)) {
			return false;
		}
		if (weight == null) {
			if (other.weight != null) {
				return false;
			}
		} else if (!weight.equals(other.weight)) {
			return false;
		}
		return true;
	}

	// @Override
	// public String toString() {
	// return "Packages [trackingCode=" + trackingCode + ", idRecipient=" +
	// idRecipient + ", price=" + price
	// + ", weight=" + weight + ", idUser=" + idUser + ", date=" + date + ",
	// description=" + description
	// + ", countrySender=" + countrySender + ", paymentDeadline=" +
	// paymentDeadline + ", daysOfDelay="
	// + daysOfDelay + ", debt=" + debt + ", fine=" + fine + ", products=" +
	// products + "]";
	// }

}
