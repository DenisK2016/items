package by.dk.training.items.datamodel;

import java.util.*;

public class Fine extends IdRecipient {

	private Double overallFine;
	private Set<String> finePackages;

	public Double getOverallFine() {
		return overallFine;
	}

	public void setOverallFine(Double overallFine) {
		this.overallFine = overallFine;
	}

	public Set<String> getFinePackages() {
		return finePackages;
	}

	public void setFinePackages(Set<String> finePackages) {
		this.finePackages = finePackages;
	}

}
