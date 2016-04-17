package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recipient")
public class Recipient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, unique=true)
	private Integer id;
	
	@Column(nullable=false, length=100)
	private String name;
	
	@Column(nullable=false, length=100)
	private String city;
	
	@Column(nullable=false, length=100)
	private String address;
	
	@Column(nullable=false)
	private BigDecimal debt;
	
	@Column(nullable=false)
	private BigDecimal fine;
	
	@OneToMany(mappedBy="idRecipient", fetch = FetchType.LAZY)
	private Set<Packages> packages;

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Recipient [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", debt=" + debt
				+ ", fine=" + fine + ", packages=" + packages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((debt == null) ? 0 : debt.hashCode());
		result = prime * result + ((fine == null) ? 0 : fine.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((packages == null) ? 0 : packages.hashCode());
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
		Recipient other = (Recipient) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (debt == null) {
			if (other.debt != null) {
				return false;
			}
		} else if (!debt.equals(other.debt)) {
			return false;
		}
		if (fine == null) {
			if (other.fine != null) {
				return false;
			}
		} else if (!fine.equals(other.fine)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (packages == null) {
			if (other.packages != null) {
				return false;
			}
		} else if (!packages.equals(other.packages)) {
			return false;
		}
		return true;
	}

}
