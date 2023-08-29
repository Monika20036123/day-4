package com.example.Inventory.management.DTO;

import java.util.Date;

public class LocationUpdateDTO {
    private int  Location_id;
    private String Floor;
    private int Block;
    private String  Area ;
    private String Created_By;
    private Date Created_Date;

    public LocationUpdateDTO(int location_id, String floor, int block, String area, String created_By, Date created_Date) {
        Location_id = location_id;
        Floor = floor;
        Block = block;
        Area = area;
        Created_By = created_By;
        Created_Date = created_Date;
    }

    public LocationUpdateDTO() {
    }

    public int getLocation_id() {
        return Location_id;
    }

    public void setLocation_id(int location_id) {
        Location_id = location_id;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public int getBlock() {
        return Block;
    }

    public void setBlock(int block) {
        Block = block;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public Date getCreated_Date() {
        return Created_Date;
    }

    public void setCreated_Date(Date created_Date) {
        Created_Date = created_Date;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
                "Location_id=" + Location_id +
                ", Floor='" + Floor + '\'' +
                ", Block=" + Block +
                ", Area='" + Area + '\'' +
                ", Created_By='" + Created_By + '\'' +
                ", Created_Date=" + Created_Date +
                '}';
    }
}
