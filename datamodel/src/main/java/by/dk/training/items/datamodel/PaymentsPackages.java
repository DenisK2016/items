package by.dk.training.items.datamodel;

import java.util.Date;

public class PaymentsPackages extends IdRecipient {

	private Packages pack;
	private Date paymentDeadline;
	private Integer daysOfDelay;
	private Double debt;

	public Packages getPack() {
		return pack;
	}

	public void setPack(Packages pack) {
		this.pack = pack;
	}

	public Date getPaymentDeadline() {
		return paymentDeadline;
	}

	public void setPaymentDeadline(Date paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}

	public Integer getDaysOfDelay() {
		return daysOfDelay;
	}

	public void setDaysOfDelay(Integer daysOfDelay) {
		this.daysOfDelay = daysOfDelay;
	}

	public Double getDebt() {
		return debt;
	}

	public void setDebt(Double debt) {
		this.debt = debt;
	}

}
