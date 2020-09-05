package pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pkg.model.Vehicle;
import pkg.service.ParkingLotService;

@RestController
public class ParkingLotController {
	
	@Autowired
	ParkingLotService searchService;
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
    public List <Vehicle> getResults(@RequestParam String number) {
        
        return searchService.getSearchResult(number);
    }
}
