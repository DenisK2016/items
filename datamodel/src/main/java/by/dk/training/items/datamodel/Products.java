package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;

	@Column(name = "name_product", nullable = false, unique = true)
	private String nameProduct;

	@Column(name = "\"limit\"", nullable = false)
	private String limit;

	@Column(name = "price_product", nullable = false)
	private BigDecimal priceProduct;

	@Column(nullable = false)
	private Boolean status;

	@ManyToMany(targetEntity = Types.class, fetch = FetchType.LAZY)
	@JoinTable(name = "types_products", joinColumns = {
			@JoinColumn(name = "id_product", unique = true) }, inverseJoinColumns = {
					@JoinColumn(name = "id_types", unique = true) })
	private Set<Types> types = new HashSet<>();

	public Products() {
		super();
	}

	public Set<Types> getTypes() {
		return types;
	}

	public void setTypes(Set<Types> types) {
		this.types=types;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public BigDecimal getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(BigDecimal priceProduct) {
		this.priceProduct = priceProduct;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", nameProduct=" + nameProduct + ", limit=" + limit + ", priceProduct="
				+ priceProduct + ", status=" + status + ", types=" + types + "]";
	}

}
