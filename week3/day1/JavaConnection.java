package week3.day1;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnection jvc = new JavaConnection();
		jvc.connect();
		jvc.executeQuery();

	}
		
	@Override
	public void disconnect() {
		System.out.println("The database is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("The database update is executed");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("The query is executed");
		
	}

}
