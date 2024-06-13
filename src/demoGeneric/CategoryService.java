package demoGeneric;

public class CategoryService implements IBaseGeneric<Category> {
	@Override
	public Category[] findAll() {
		return new Category[0];
	}
}
