package by.dk.training.items.datamodel;

public class SubType<T> {
	private T subType;

	public SubType(T subType) {
		this.subType = subType;
	}

	public T getSubType() {
		return subType;
	}

	public void setSubType(T subType) {
		this.subType = subType;
	}

}
