package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.*;

public class AdditionalPayments extends IdRecipient {

	private BigDecimal paymentsForTheLastMonth;
	private BigDecimal paymentsAll;
	private BigDecimal overallDebt;
	private Set<String> noPayments;

	public BigDecimal getPaymentsForTheLastMonth() {
		return paymentsForTheLastMonth;
	}

	public void setPaymentsForTheLastMonth(BigDecimal paymentsForTheLastMonth) {
		this.paymentsForTheLastMonth = paymentsForTheLastMonth;
	}

	public BigDecimal getPaymentsAll() {
		return paymentsAll;
	}

	public void setPaymentsAll(BigDecimal paymentsAll) {
		this.paymentsAll = paymentsAll;
	}

	public BigDecimal getOverallDebt() {
		return overallDebt;
	}

	public void setOverallDebt(BigDecimal overallDebt) {
		this.overallDebt = overallDebt;
	}

	public Set<String> getNoPayments() {
		return noPayments;
	}

	public void setNoPayments(Set<String> noPayments) {
		this.noPayments = noPayments;
	}
}
