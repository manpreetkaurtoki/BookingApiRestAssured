package api.clients;

import api.model.BookingRequest;
import io.restassured.response.Response;

public class CreateBookingApiClient extends BaseApiClient {
private static final String Booking_ENDPOINT = "/booking";
	
	public static Response GetBookingResponse(BookingRequest bookingRequest)
	{
		return SendPostRequest(Booking_ENDPOINT, bookingRequest);
		
	}

}
