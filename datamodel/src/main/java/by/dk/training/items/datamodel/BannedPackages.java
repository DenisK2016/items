package by.dk.training.items.datamodel;

public class BannedPackages extends IdRecipient {

	private PackageInfo trackingCode;
	private Type.BannedTypesPackage typeBanned;

	public BannedPackages() {

	}
	
	public BannedPackages(PackageInfo trackingCode){
		this.trackingCode=trackingCode;
		typeBanned = trackingCode.getType().getTypeBanned();
	}

	public Type.BannedTypesPackage getTypeBanned() {
		return typeBanned;
	}

	public void setTypeBanned(Type.BannedTypesPackage typeBanned) {
		this.typeBanned = typeBanned;
	}

	public PackageInfo getTrackingCode() {
		return trackingCode;
	}

	public void setTrackingCode(PackageInfo trackingCode) {
		this.trackingCode = trackingCode;
	}

}
