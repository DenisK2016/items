package by.dk.training.items.datamodel;

public enum Clothings {
	JACKET("Куртка"), PANTS("Штаны"), DRESSES("Платья"), SUITS("Костюм"), SHOES("Обувь");

	private String clothing;

	private Clothings(String clothing) {
		this.clothing = clothing;
	}

	public String getClothing() {
		return clothing;
	}	
	
}
