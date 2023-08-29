package com.example.Inventory.management.DTO;

import java.util.Date;

public class LocationSaveDTO {

    private String Floor;
    private int Block;
    private String  Area ;
    private String Created_By;
    private Date Created_Date;

    public LocationSaveDTO( String floor, int block, String area, String created_By, Date created_Date) {

        Floor = floor;
        Block = block;
        Area = area;
        Created_By = created_By;
        Created_Date = created_Date;
    }

    public LocationSaveDTO() {
    }

    public static String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public static int getBlock() {
        return Block;
    }

    public void setBlock(int block) {
        Block = block;
    }

    public static String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public static String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public static Date getCreated_Date() {
        return Created_Date;
    }

    public void setCreated_Date(Date created_Date) {
        Created_Date = created_Date;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +

                ", Floor='" + Floor + '\'' +
                ", Block=" + Block +
                ", Area='" + Area + '\'' +
                ", Created_By='" + Created_By + '\'' +
                ", Created_Date=" + Created_Date +
                '}';
    }
}
