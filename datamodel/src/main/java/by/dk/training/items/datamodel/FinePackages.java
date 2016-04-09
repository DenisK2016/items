package by.dk.training.items.datamodel;

import java.util.Date;

public class FinePackages extends IdRecipient {

	private PaymentsPackages paymentPackege;
	private Date paymentDeadline;
	private Integer daysOfDelay;
	private Double fine;

	public PaymentsPackages getPaymentPackege() {
		return paymentPackege;
	}

	public void setPaymentPackege(PaymentsPackages paymentPackege) {
		this.paymentPackege = paymentPackege;
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

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

}
