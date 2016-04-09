package by.dk.training.items.datamodel;

import java.util.Date;

public class PackageInfo extends Id {

	private Packages pack;
	private Date date;
	private String description;
	private Long serialNumber;
	private String countrySender;

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

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCountrySender() {
		return countrySender;
	}

	public void setCountrySender(String countrySender) {
		this.countrySender = countrySender;
	}

}
