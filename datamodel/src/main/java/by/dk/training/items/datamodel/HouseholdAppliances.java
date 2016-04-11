package by.dk.training.items.datamodel;

public enum HouseholdAppliances {
	REFRIGERATOR("холодильник"), WASHING_MACHINE("стиральная машина"), 
	GAS_HOB("газовая плита"), MICROWAVE("микроволновка");
	
	private String subtype;

	private HouseholdAppliances(String subtype) {
		this.subtype = subtype;
	}

	public String getSubtype() {
		return subtype;
	}
	
}
