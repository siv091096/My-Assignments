package week2.day4;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("Request Processed");

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println("Request Status is Success");

	}

	public static void main(String[] args) {
		
		APIClient apc = new APIClient();
		apc.sendRequest("https://platform.testleaf.com/#/");
		apc.sendRequest("https://platform.testleaf.com/#/", "key1=value1&key2=value2", true);

	}

}
