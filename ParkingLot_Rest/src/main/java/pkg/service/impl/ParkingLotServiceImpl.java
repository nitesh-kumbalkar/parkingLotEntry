package pkg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pkg.model.Vehicle;
import pkg.repository.VehicleRepository;
import pkg.service.ParkingLotService;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

	@Autowired
	VehicleRepository vehicleRepo;

	public List<Vehicle> getSearchResult(String number) {

		List<Vehicle> list = vehicleRepo.findVehicle(number);

		return list;

	}

}
