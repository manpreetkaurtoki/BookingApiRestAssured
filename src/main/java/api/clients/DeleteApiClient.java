package api.clients;

import io.restassured.response.Response;

public class DeleteApiClient extends BaseApiClient {
private static final String DeleteBooking_ENDPOINT = "/booking/{id}";
	
	public static Response deleteBooking(int i)
	{
		return SendDeleteRequest(DeleteBooking_ENDPOINT,i);
		
	}
}
