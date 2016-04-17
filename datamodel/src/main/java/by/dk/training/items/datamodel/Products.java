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
import javax.validation.constraints.AssertTrue;

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
	@AssertTrue
	private Boolean status;

	@ManyToMany(targetEntity = Types.class, fetch = FetchType.LAZY)
	@JoinTable(name = "types_products", joinColumns = {
			@JoinColumn(name = "id_product", unique = true) }, inverseJoinColumns = {
					@JoinColumn(name = "id_types", unique = true) })
	private Set<Types> types = new HashSet<>();

	public Products() {
		super();
	}

	public Products(String nameProduct, String limit, BigDecimal priceProduct, Boolean status) {
		super();
		this.nameProduct = nameProduct;
		this.limit = limit;
		this.priceProduct = priceProduct;
		this.status = status;
	}

	public Set<Types> getTypes() {
		return types;
	}

	public void setTypes(Types types) {
		this.types.add(types);
	}

	public void deleteTypes(Types types) {
		this.types.remove(types);
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
		Products other = (Products) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (limit == null) {
			if (other.limit != null) {
				return false;
			}
		} else if (!limit.equals(other.limit)) {
			return false;
		}
		if (nameProduct == null) {
			if (other.nameProduct != null) {
				return false;
			}
		} else if (!nameProduct.equals(other.nameProduct)) {
			return false;
		}
		if (priceProduct == null) {
			if (other.priceProduct != null) {
				return false;
			}
		} else if (!priceProduct.equals(other.priceProduct)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (types == null) {
			if (other.types != null) {
				return false;
			}
		} else if (!types.equals(other.types)) {
			return false;
		}
		return true;
	}

}
