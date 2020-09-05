package pkg.service;

import java.util.List;
import pkg.model.Vehicle;


public interface ParkingLotService {

	List<Vehicle> getSearchResult(String number);

}
