package com.nt.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Req {

	public static void main(String[] args) {
		Response res=RestAssured.get("https://reqres.in/api/users/2");
		int statusCode=res.getStatusCode();
		System.out.println("statusCode::"+statusCode);
		System.out.println("response Time::"+res.getTime());
		System.out.println("data of the request::"+res.asString());

	}

}
