package by.dk.training.items.datamodel;

public enum HouseholdChemicals {
	WASHING_POWDER("Стиральный порошек"), DETERGENT("Моющее средство"), 
	SOAP("Мыло"), SHAMPOO("Шампунь");
	
	private String chem;

	private HouseholdChemicals(String chem) {
		this.chem = chem;
	}

	public String getChem() {
		return chem;
	}
	
}
