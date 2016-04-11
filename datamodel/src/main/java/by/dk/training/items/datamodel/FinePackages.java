package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.Date;

public class FinePackages extends IdRecipient {

	private PaymentsPackages trackingCode;
	private Date paymentDeadline;
	private Integer daysOfDelay;
	private BigDecimal fine;

	public PaymentsPackages getTrackingCode() {
		return trackingCode;
	}

	public void setTrackingCode(PaymentsPackages trackingCode) {
		this.trackingCode = trackingCode;
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

	public BigDecimal getFine() {
		return fine;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

}
