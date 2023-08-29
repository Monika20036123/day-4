package com.example.Inventory.management.Invsevice;

import com.example.Inventory.management.DTO.LocationDTO;
import com.example.Inventory.management.DTO.LocationSaveDTO;
import com.example.Inventory.management.Entity.Location;
import com.example.Inventory.management.Invrepo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class LocationServiceimpl implements  LocationService {

    @Autowired
    private LocationRepo LocationRepo;

    @Override
    public String addLocation(LocationSaveDTO locationSaveDTO) {
         Location Location =new Location(
             LocationSaveDTO.getFloor(),
             LocationSaveDTO.getArea(),
             LocationSaveDTO.getBlock(),
             LocationSaveDTO.getCreated_By(),
             LocationSaveDTO.getCreated_Date()
         );
         LocationRepo.save(Location);
         return Location .getArea();
    }
}
