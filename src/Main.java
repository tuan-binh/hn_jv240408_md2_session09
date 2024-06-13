import demoGeneric.Students;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Students[] arr = new Students[3];
		arr[0] = new Students(1, "huấn", 18);
		arr[1] = new Students(2, "bình", 11);
		arr[2] = new Students(3, "dương", 19);
		System.out.println("before: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: " + Arrays.toString(arr));
		
		Employee fulltime = new FullTimeEmployee();
		fulltime.calSalary();
		Employee parttime = new PartTimeEmployee();
		parttime.calSalary();
		
	}
}