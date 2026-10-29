package httpscalls;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.clients.CreateBookingApiClient;
import api.clients.DeleteApiClient;
import api.clients.GetBookignApiClient;
import api.clients.TokenApiClient;
import api.model.BookingDates;
import api.model.BookingRequest;
import api.model.BookingResponse;
import api.model.TokenRequest;
import api.model.TokenResponse;
import api.utils.TokenManager;
import io.restassured.response.Response;

public class TestApiCalls {
	BookingResponse bookingresponse;

	@Test
	public void testALogin() {
		// get token api
		TokenRequest tokenreq = new TokenRequest("admin", "password123");
		Response response = TokenApiClient.getLoginResponse(tokenreq);
		Assert.assertEquals(response.getStatusCode(), 200, "Expected code is 200");

		TokenResponse loginResponse = response.as(TokenResponse.class);
		TokenManager.setToken(loginResponse.getToken());
		
		System.out.println(TokenManager.getToken());

	}

	@Test
	public void testCreateBooking() {
		// creating booking
		BookingDates dates = new BookingDates("2026-11-01", "2026-11-05");

		BookingRequest bookingreq = new BookingRequest("Test", "Sample", 120, true, "towel extra", dates);
		Response response = CreateBookingApiClient.GetBookingResponse(bookingreq);
		System.out.println(response.asString());
		Assert.assertEquals(response.getStatusCode(), 200, "Expected code is 200");

		bookingresponse = response.as(BookingResponse.class);
		System.out.println("Booking ID:" + bookingresponse.getBookingid());

		// get booking detail based on ID
		Response specificBookingResponse = GetBookignApiClient.getBookingDetailResponse(bookingresponse.getBookingid());
		System.out.println(specificBookingResponse.asString());

		BookingResponse bookResponse = response.as(BookingResponse.class);
		System.out.println(bookResponse.getBooking().getFirstName());
		System.out.println(bookResponse.getBooking().getLastName());
		System.out.println(bookResponse.getBooking().bookingdates.checkin);

		// Delete booking

		Response deleteResponse = DeleteApiClient.deleteBooking(bookingresponse.getBookingid());
		System.out.println(deleteResponse.asString());
	}

}
