package by.dk.training.items.datamodel;

import java.util.*;

public class AdditionalPayments extends IdRecipient {

	private Double paymentsForTheCurrentMonth;
	private Double paymentsAll;
	private Double overallDebt;
	private Set<String> noPayments;

	public Double getPaymentsForTheCurrentMonth() {
		return paymentsForTheCurrentMonth;
	}

	public void setPaymentsForTheCurrentMonth(Double paymentsForTheCurrentMonth) {
		this.paymentsForTheCurrentMonth = paymentsForTheCurrentMonth;
	}

	public Double getPaymentsAll() {
		return paymentsAll;
	}

	public void setPaymentsAll(Double paymentsAll) {
		this.paymentsAll = paymentsAll;
	}

	public Double getOverallDebt() {
		return overallDebt;
	}

	public void setOverallDebt(Double overallDebt) {
		this.overallDebt = overallDebt;
	}

	public Set<String> getNoPayments() {
		return noPayments;
	}

	public void setNoPayments(Set<String> noPayments) {
		this.noPayments = noPayments;
	}

}
