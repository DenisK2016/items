package by.dk.training.items.datamodel;

public class Type {

	private PermittedTypesPackage typePermitted;
	private BannedTypesPackage typeBanned;

	public Type(PermittedTypesPackage typePermitted) {
		this.typePermitted = typePermitted;
	}

	public Type(BannedTypesPackage typeBanned) {
		this.typeBanned = typeBanned;
	}

	public PermittedTypesPackage getTypePermitted() {
		return typePermitted;
	}

	public void setTypePermitted(PermittedTypesPackage typePermitted) {
		this.typePermitted = typePermitted;
	}

	public BannedTypesPackage getTypeBanned() {
		return typeBanned;
	}

	public void setTypeBanned(BannedTypesPackage typeBanned) {
		this.typeBanned = typeBanned;
	}

	public enum PermittedTypesPackage {
		HOUSEHOLD_APPLIANCES("Бытовая техника"), ELECTRONICS("Электроника"), 
		CLOTHING("Одежда"), FOOD("Продукты"), 
		HOUSEHOLD_CHEMICALS("Бытовая химия");

		private String PermittedTypesPackage;

		private PermittedTypesPackage(String PermittedTypesPackage) {
			this.PermittedTypesPackage = PermittedTypesPackage;
		}

		public String getPermittedTypesPackage() {
			return PermittedTypesPackage;
		}

	}

	public enum BannedTypesPackage {

		WEAPONS("Оружие"), DRUGS("Наркотики");

		private String BannedTypesPackage;

		private BannedTypesPackage(String BannedTypesPackage) {
			this.BannedTypesPackage = BannedTypesPackage;
		}

		public String getBannedTypesPackage() {
			return BannedTypesPackage;
		}

	}
}
