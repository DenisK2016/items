package by.dk.training.items.datamodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class Types {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;

	@Column(name = "type_name", nullable = false)
	private String typeName;

	@ManyToOne(targetEntity = Types.class, fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "parent_type", referencedColumnName = "id")
	private Types parentType;

	public Types getParentType() {
		return parentType;
	}

	public void setParentType(Types parentType) {
		this.parentType = parentType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Types [id=" + id + ", typeName=" + typeName + ", parentType=" + parentType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((parentType == null) ? 0 : parentType.hashCode());
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
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
		Types other = (Types) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (parentType == null) {
			if (other.parentType != null) {
				return false;
			}
		} else if (!parentType.equals(other.parentType)) {
			return false;
		}
		if (typeName == null) {
			if (other.typeName != null) {
				return false;
			}
		} else if (!typeName.equals(other.typeName)) {
			return false;
		}
		return true;
	}

}
