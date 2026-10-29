package api.model;

public class BookingRequest {
	public String firstname;
	public String lastname;
	public int totalprice;
	public boolean depositpaid;
	public BookingDates bookingdates;
	public String additionalneeds;

	public BookingRequest(String firstname, String lastname, int totalprice, boolean depositpaid,
			String additionalneeds, BookingDates bookingdates) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.additionalneeds = additionalneeds;
		this.bookingdates = bookingdates;
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
