package by.dk.training.items.datamodel;


import java.math.BigDecimal;
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

	@Column(name = "nameProduct", nullable = false, unique = true)
	private String nameProduct;

	@Column(name = "\"limit\"", nullable = false)
	private String limit;

	@Column(name = "priceProduct", nullable = false)
	private BigDecimal priceProduct;

	@Column(nullable = false)
	@AssertTrue
	private Boolean status;

	@ManyToMany(targetEntity = Types.class, fetch = FetchType.LAZY)
	@JoinTable(name = "types_products", joinColumns = {
			@JoinColumn(name = "id_product", unique = true) }, inverseJoinColumns = {
					@JoinColumn(name = "id_types", unique = true) })
	private Set<Types> types;

	public Set<Types> getTypes() {
		return types;
	}

	public void setTypes(Set<Types> types) {
		this.types = types;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
		result = prime * result + ((priceProduct == null) ? 0 : priceProduct.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((types == null) ? 0 : types.hashCode());
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
