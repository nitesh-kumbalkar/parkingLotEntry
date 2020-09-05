package pkg.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import pkg.model.Vehicle;

@Repository
public class VehicleRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class VehicletRowMapper implements RowMapper<Vehicle> {
		public Vehicle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Vehicle vehicle = new Vehicle();
			
			vehicle.setNumber(rs.getString("number"));
			vehicle.setType(rs.getString("type"));
			vehicle.setTime(rs.getTimestamp("time"));
			
			return vehicle;
		}

	}
	
	public List<Vehicle> findVehicle(String vehicleNumber) {
		return (List<Vehicle>) jdbcTemplate.query("select * from ParkingLot where number=?", new Object[] {vehicleNumber},
				new VehicletRowMapper());
	}
}
