public class PartTimeEmployee implements Employee {
	private int hour;
	
	@Override
	public void calSalary() {
		System.out.println(hour * 20000);
	}
}
