package week1.day2;

public class IfElseStatements {

	public static void main(String[] args) {
		
		int x = 140;
		int y = 140;
		
		if (x>y) {
		System.out.println("x is greater");
    	}
		
		else if (y>x) {
		System.out.println("y is greater");
		}
		
		else if (x==y) {
		System.out.println("Both x and y are same");
			}
		
		else {
		System.out.println("All the 3 conditions are not satisfied");
		}

}
	
}