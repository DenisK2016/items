package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.*;

public class Fine extends IdRecipient {

	private BigDecimal overallFine;
	private Set<String> finePackages;

	public BigDecimal getOverallFine() {
		return overallFine;
	}

	public void setOverallFine(BigDecimal overallFine) {
		this.overallFine = overallFine;
	}

	public Set<String> getFinePackages() {
		return finePackages;
	}

	public void setFinePackages(Set<String> finePackages) {
		this.finePackages = finePackages;
	}

}
