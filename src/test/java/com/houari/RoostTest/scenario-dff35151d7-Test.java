// ********RoostGPT********
/*
Test generated by RoostGPT for test elasticLogStash using AI Type Open AI and AI Model gpt-4

{
  background: 'Given the base URL is "http://localhost:8080"',
  rule: null,
  scenario: 'Create my account \r\n' +
    '    When the client sends a POST request "/accounts" with the accounts_body payload\r\n' +
    '    Then create an account with the specified informatio\r\n' +
    '    And verify the account created using GET request for "/me"',
  title: 'Create my account'
}

*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class scenario_dff35151d7_Test {
    private String baseUrl;

    @BeforeEach
    public void setup() throws IOException, ParseException {
        baseUrl = "http://localhost:8080";

        Path path = FileSystems.getDefault().getPath("src", "test", "java", "com", "houari", "RoostTest", "scenario-dff35151d7-Test.csv");
        BufferedReader br = new BufferedReader(new FileReader(path.toString()));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            String[] data = line.split("\\^\\|\\^");
            if (data.length < 6) continue;

            String method = data[0];
            String url = data[1];
            Headers headers = new Headers(data[2]);
            JSONObject body = (JSONObject) new JSONParser().parse(data[3]);
            int responseCode = Integer.parseInt(data[4]);
            JSONObject responseBody = (JSONObject) new JSONParser().parse(data[5]);

            executeTest(method, url, headers, body, responseCode, responseBody);
        }
        br.close();
    }

    private void executeTest(String method, String url, Headers headers, JSONObject body, int responseCode, JSONObject responseBody) {
        Response response = given().baseUri(baseUrl).headers(headers).body(body).when().request(method, url);

        assertEquals(responseCode, response.getStatusCode());

        JSONObject responseJson = response.getBody().jsonPath().getJsonObject("$");
        assertEquals(responseBody.toJSONString(), responseJson.toJSONString());
    }
}
