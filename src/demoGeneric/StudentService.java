package demoGeneric;

public class StudentService implements IBaseGeneric<Students>{
	@Override
	public Students[] findAll() {
		return new Students[0];
	}
}
