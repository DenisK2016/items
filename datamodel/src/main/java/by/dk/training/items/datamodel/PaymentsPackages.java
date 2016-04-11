package by.dk.training.items.datamodel;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentsPackages extends IdRecipient {

	private Packages tacking_code;
	private Date paymentDeadline;
	private Integer daysOfDelay;
	private BigDecimal debt;
	private FinePackages finePack;

	public FinePackages getFinePack() {
		return finePack;
	}

	public void setFinePack(FinePackages finePack) {
		this.finePack = finePack;
	}

	public Packages getTacking_code() {
		return tacking_code;
	}

	public void setTacking_code(Packages tacking_code) {
		this.tacking_code = tacking_code;
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

	public BigDecimal getDebt() {
		return debt;
	}

	public void setDebt(BigDecimal debt) {
		this.debt = debt;
	}

}
