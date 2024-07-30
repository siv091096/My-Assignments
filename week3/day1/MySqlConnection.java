package week3.day1;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public abstract void executeQuery();
	
	public void connect() {
		
		System.out.println("The database is connected");
		
	}

}
