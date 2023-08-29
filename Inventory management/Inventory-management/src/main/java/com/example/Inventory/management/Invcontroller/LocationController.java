package com.example.Inventory.management.Invcontroller;


import com.example.Inventory.management.DTO.LocationDTO;
import com.example.Inventory.management.DTO.LocationSaveDTO;
import com.example.Inventory.management.Invsevice.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/Location")
@RestController
public class LocationController {

    @Autowired
    private LocationService LocationService;

    @PostMapping(path="/save")
    public String saveLocation (@RequestBody LocationSaveDTO LocationSaveDTO)
    {
        String id = LocationService.addLocation(LocationSaveDTO );
        return id ;
    }
}
