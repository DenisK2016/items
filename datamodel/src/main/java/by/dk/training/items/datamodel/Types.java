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

	@ManyToOne(targetEntity = Types.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "parent_type", referencedColumnName = "id")
	private Types parentType;

	public Types() {
		super();
	}

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

}
