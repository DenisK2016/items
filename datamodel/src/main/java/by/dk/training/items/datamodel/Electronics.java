package by.dk.training.items.datamodel;

public enum Electronics {
	TV("Телевизор"), PHONE("Телефон"), LAPTOP("Ноутбук"), COMPUTER("Компьютер"), TABLET("Планшет");

	private String electrcs;

	private Electronics(String electrcs) {
		this.electrcs = electrcs;
	}

	public String getElectrcs() {
		return electrcs;
	}
	
}
