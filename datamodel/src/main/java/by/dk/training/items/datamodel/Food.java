package by.dk.training.items.datamodel;

public enum Food {
	VEGETABLES("Овощи"), FRUIT("Фрукты"), SWEETS("Сладости"), MEAT("Мясное");

	private String food;

	private Food(String food) {
		this.food = food;
	}

	public String getFood() {
		return food;
	}

}
