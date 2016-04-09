package by.dk.training.items.datamodel;

import java.util.*;

public class Recipient extends Id {
	private String name;
	private String address;
	private Set<Packages> packages;
	private Set<PaymentsPackages> payPackeges;
	private Set<FinePackages> finePackeges;
	private Fine fine;
	private AdditionalPayments additionalPayments;
	private PackagesRecipient packagesRecipient;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
	}

	public Set<PaymentsPackages> getPayPackeges() {
		return payPackeges;
	}

	public void setPayPackeges(Set<PaymentsPackages> payPackeges) {
		this.payPackeges = payPackeges;
	}

	public Set<FinePackages> getFinePackeges() {
		return finePackeges;
	}

	public void setFinePackeges(Set<FinePackages> finePackeges) {
		this.finePackeges = finePackeges;
	}

	public Fine getFine() {
		return fine;
	}

	public void setFine(Fine fine) {
		this.fine = fine;
	}

	public AdditionalPayments getAdditionalPayments() {
		return additionalPayments;
	}

	public void setAdditionalPayments(AdditionalPayments additionalPayments) {
		this.additionalPayments = additionalPayments;
	}

	public PackagesRecipient getPackagesRecipient() {
		return packagesRecipient;
	}

	public void setPackagesRecipient(PackagesRecipient packagesRecipient) {
		this.packagesRecipient = packagesRecipient;
	}

}
