package api.model;

public class Booking {
	public String firstname;
	public String lastname;
	public int totalprice;
	public boolean depositpaid;
	public BookingDates bookingdates;
	public String additionalneeds;

	public Booking() {
	}

	

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getTotalPrice() {
		return totalprice;
	}

	public void setTotalPrice(int totalprice) {
		this.totalprice = totalprice;
	}

	public String getAdditionalNeeds() {
		return additionalneeds;
	}

	public void setAdditionalNeeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}

	public boolean getDepositPaid() {
		return depositpaid;
	}

	public void setDepositPaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
}
