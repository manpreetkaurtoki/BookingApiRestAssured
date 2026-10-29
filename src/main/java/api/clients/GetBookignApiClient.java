package api.clients;

import io.restassured.response.Response;

public class GetBookignApiClient extends BaseApiClient {
private static final String getBooking_ENDPOINT = "/booking/{id}";
	
	public static Response getBookingDetailResponse(int i)
	{
		return SendGetRequestWithID(getBooking_ENDPOINT,i);
		
	}

}
