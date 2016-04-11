package by.dk.training.items.datamodel;

import java.math.BigInteger;
import java.util.Date;

public class PackageInfo extends Id {

	private Packages pack;
	private Date date;
	private String description;
	private BigInteger serialNumber;
	private String countrySender;
	private Type type;
	private SubType<?> subType;
	private Boolean banned;
	private BannedPackages ban;

	public PackageInfo() {
		super();
		if (type.getTypeBanned() != null) {
			banned = true;
			ban = new BannedPackages();
		}
	}

	public BannedPackages getBan() {
		return ban;
	}

	public void setBan(BannedPackages ban) {
		this.ban = ban;
	}

	public Boolean getBanned() {
		return banned;
	}

	public void setBanned(Boolean banned) {
		this.banned = banned;
	}

	public SubType<?> getSubType() {
		return subType;
	}

	public void setSubType(SubType<?> subType) {
		this.subType = subType;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Packages getPack() {
		return pack;
	}

	public void setPack(Packages pack) {
		this.pack = pack;
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

	public BigInteger getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(BigInteger serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCountrySender() {
		return countrySender;
	}

	public void setCountrySender(String countrySender) {
		this.countrySender = countrySender;
	}

}
