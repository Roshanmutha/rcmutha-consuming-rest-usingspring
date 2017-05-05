package com.roshantest.rcmutha_consuming_rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author roshankumarm 
 * 
 * 
 * Refer http://www.baeldung.com/rest-template for more
 *         information
 */
public class App {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
		
		
		RestTemplate restTemplate1 = new RestTemplate();
		String fooResourceUrl
		  = "http://172.27.44.59:8080/mynet/customers";
		ResponseEntity<String> response
		  = restTemplate1.getForEntity(fooResourceUrl + "/1", String.class);
		System.out.println(response.getBody());
		
		//POST
		/*ClientHttpRequestFactory requestFactory = getClientHttpRequestFactory();
		RestTemplate restTemplate3 = new RestTemplate(requestFactory);
		HttpEntity<Quote> request = new HttpEntity<>(new Quote());
		Quote foo = restTemplate.postForObject(fooResourceUrl, request, Quote.class);*/

	}

	
	
	/*public User createUserPost(final User newUser) {
	      final HttpEntity<User> userRequest = new HttpEntity<User>(newUser);
	      final URI createdURI = this.restTemplate.postForLocation(userServiceUrl
	            + "new", userRequest);
	      return this.restTemplate.getForObject(createdURI, User.class);
	   }*/
	
	/*private void putCall() {
		// TODO Auto-generated method stub
		Foo updatedInstance = new Foo("newName");
		updatedInstance.setId(createResponse.getBody().getId());
		String resourceUrl = 
		  fooResourceUrl + '/' + createResponse.getBody().getId();
		HttpEntity<Foo> requestUpdate = new HttpEntity<>(updatedInstance, headers);
		template.exchange(resourceUrl, HttpMethod.PUT, requestUpdate, Void.class);
	}*/
	
	private void postCreate() {
		// TODO Auto-generated method stub
		HttpEntity<Quote> request = new HttpEntity<>(new Quote());
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Quote> response = restTemplate
				.exchange("http://gturnquist-quoters.cfapps.io/api/random", HttpMethod.POST, request, Quote.class);
				//assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
	}
};
