/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prave.model;

import java.util.Objects;

/**
 *
 * @author prave
 */
public class DeviceLocation {
    
   private String PlaceName;//: "COGCONSR&D,"
   private String area;// ": "VarthurKodi",
   private String fullAddress;//": "7, WhitefieldMainRoad, Opp.VarthurLake, VarthurKodi, Bengaluru, Karnataka560066, India",
   private String pName;//": "COGCONSR&D",
   private String placeType;//": "Office",
   private String time_taken;//": 0,
   private String latitude;//": 12.9576044,
   private String mapPlaceName;//: "Office",
   private String is_not_tagged_place;//: 0,
   private String time;//": 1556189746495,
   private String PlaceTime;//": "25-Apr-201916: 25: 46",
   private String longitude;//": 77.7442255,
   private String city;//": "Bengaluru",
   private String mode;//": "Still"

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String PlaceName) {
        this.PlaceName = PlaceName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(String time_taken) {
        this.time_taken = time_taken;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getMapPlaceName() {
        return mapPlaceName;
    }

    public void setMapPlaceName(String mapPlaceName) {
        this.mapPlaceName = mapPlaceName;
    }

    public String getIs_not_tagged_place() {
        return is_not_tagged_place;
    }

    public void setIs_not_tagged_place(String is_not_tagged_place) {
        this.is_not_tagged_place = is_not_tagged_place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlaceTime() {
        return PlaceTime;
    }

    public void setPlaceTime(String PlaceTime) {
        this.PlaceTime = PlaceTime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
     public DeviceLocation() {
         
     }
     
    public DeviceLocation(String PlaceName, String area, String fullAddress, String pName, String placeType, String time_taken, String latitude, String mapPlaceName, String is_not_tagged_place, String time, String PlaceTime, String longitude, String city, String mode) {
        this.PlaceName = PlaceName;
        this.area = area;
        this.fullAddress = fullAddress;
        this.pName = pName;
        this.placeType = placeType;
        this.time_taken = time_taken;
        this.latitude = latitude;
        this.mapPlaceName = mapPlaceName;
        this.is_not_tagged_place = is_not_tagged_place;
        this.time = time;
        this.PlaceTime = PlaceTime;
        this.longitude = longitude;
        this.city = city;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "DeviceLocation{" + "PlaceName=" + PlaceName + ", area=" + area + ", fullAddress=" + fullAddress + ", pName=" + pName + ", placeType=" + placeType + ", time_taken=" + time_taken + ", latitude=" + latitude + ", mapPlaceName=" + mapPlaceName + ", is_not_tagged_place=" + is_not_tagged_place + ", time=" + time + ", PlaceTime=" + PlaceTime + ", longitude=" + longitude + ", city=" + city + ", mode=" + mode + '}';
    }
  
   
    
}
