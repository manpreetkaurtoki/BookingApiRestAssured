package api.model;

public class BookingDates {
	
    public String checkin;
    public String checkout;
    public BookingDates() {
	}

    public BookingDates(String checkin, String checkout)
	{
		this.checkin=checkin;
		this.checkout=checkout;
	}
	
    public String getCheckIn() {
		return checkin;
	}

	public void setCheckIn(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckOut() {
		return checkout;
	}

	public void setCheckOut(String checkout) {
		this.checkout = checkout;
	}
}
