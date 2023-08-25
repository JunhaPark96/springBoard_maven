package springdi.assignment1.tv;

public interface TVRepository {
	TV findByBrand(TVBrand tvBrand);
}
