package by.dk.training.items.datamodel;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Integer id;

	@Column(nullable = false, length = 100, unique = true, updatable = false)
	private String login;

	@Column(nullable = false, length = 100)
	private String password;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY, optional = false, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(nullable = false, updatable = false, name = "id")
	private UserCredentials userCredentials;

	@OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
	private Set<Packages> packages = new HashSet<>();

	public User() {
		super();
	}

	public User(String login, String password, UserCredentials userCredentials) {
		super();
		this.login = login;
		this.password = password;
		this.userCredentials = userCredentials;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Packages pack) {
		this.packages.add(pack);
	}

	public void deletePackage(Packages pack) {
		packages.remove(pack);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", userCredentials="
				+ getUserCredentials() + ", packages=" + getPackages() + "]";
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (packages == null) {
			if (other.packages != null) {
				return false;
			}
		} else if (!packages.equals(other.packages)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (userCredentials == null) {
			if (other.userCredentials != null) {
				return false;
			}
		} else if (!userCredentials.equals(other.userCredentials)) {
			return false;
		}
		return true;
	}

}
