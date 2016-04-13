package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="packages")
public class Packages {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private Long trackingCode;
	
	@ManyToOne
	@JoinColumn(name="id_recipient")
	private Recipient idRecipient;
	
	@Column(nullable=false)
	private BigDecimal price;
	
	@Column(nullable=false)
	private Double weight;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User idUser;
	
	@Column(nullable=false)
	private Date date;
	
	@Column(length=1000)
	private String description;
	
	@Column(nullable=false, length=100)
	private String countrySender;
	
	@Column(nullable=false)
	private Date paymentDeadline;
	
	@Column(nullable=false)
	private Integer daysOfDelay;
	
	@Column(nullable=false)
	private BigDecimal debt;
	
	@Column(nullable=false)
	private BigDecimal fine;
	
	@ManyToMany
	@JoinTable(name="packages_products", 
	joinColumns={@JoinColumn(name="package")}, 
	inverseJoinColumns={@JoinColumn(name="id_product")})
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

}
