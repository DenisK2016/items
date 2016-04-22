package by.dk.training.items.dataaccess;

public interface PackagesDao {
	Package get(Long trackingCode);

	Package save();
}
