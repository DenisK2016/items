package by.dk.training.items.datamodel;


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
@Table(name = "recipient")
public class Recipient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Integer id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, length = 100)
	private String city;

	@Column(nullable = false, length = 100)
	private String address;

	@OneToMany(mappedBy = "idRecipient", fetch = FetchType.LAZY)
	private Set<Packages> packages = new HashSet<>();

	public Recipient() {
		super();
	}

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<Packages> pack) {
		this.packages=pack;
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

	@Override
	public String toString() {
		return "Recipient [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", packages="
				+ packages + "]";
	}

}
