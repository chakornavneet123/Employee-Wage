package assignment;

public class EmployeePresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int isPresent = (int) (Math.random() * 10 % 2);
		
		if(isPresent == 1) {
			System.out.println("Employee is present!");
		} else {
			System.out.println("Employee is absent");
		}
		

	}

}
