package com.example.Inventory.management.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Table(name="Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Location_id" ,length=50)
    private int  Location_id;

    @Column(name="Floor",length=50)
    private String Floor;

    @Column(name="Block",length=50)
    private int Block;

    @Column(name="Area" ,length=50)
    private String  Area ;

    @Column(name="Created_BY",length=50)
    private String Created_By;

    @Column(name="Created_Date" ,length=50)
    private Date Created_Date;

    public Location(int location_id, String floor, int block, String area, String created_By, Date created_Date) {
        Location_id = location_id;
        Floor = floor;
        Block = block;
        Area = area;
        Created_By = created_By;
        Created_Date = created_Date;
    }

    public Location(String floor, String area, int block, String createdBy, Date createdDate) {
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
        return "Location{" +
                "Location_id=" + Location_id +
                ", Floor='" + Floor + '\'' +
                ", Block=" + Block +
                ", Area='" + Area + '\'' +
                ", Created_By='" + Created_By + '\'' +
                ", Created_Date=" + Created_Date +
                '}';
    }
}
