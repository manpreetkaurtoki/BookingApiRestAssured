package api.clients;

import api.model.TokenRequest;
import io.restassured.response.Response;

public class TokenApiClient extends BaseApiClient{

	private static final String Token_ENDPOINT = "/auth";
	
	public static Response getLoginResponse(TokenRequest tokenRequest)
	{
		return SendPostRequest(Token_ENDPOINT, tokenRequest);
		
	}

	
}
