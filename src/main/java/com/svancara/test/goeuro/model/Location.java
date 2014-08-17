package com.svancara.test.goeuro.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("_type")
    private String locType;
    @SerializedName("_id")
    private Long locId;
    private String key;
    private String name;
    private String fullName;
    @SerializedName("iata_airport_code")
    private String iataAirportCode;
    private String type;
    private String country;
    @SerializedName("geo_position")
    private GeoPosition geoPosition;
    @SerializedName("location_id")
    private Long locationId;
    private Boolean inEurope;
    private String countryCode;
    private Boolean coreCountry;
    private String distance;

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

    public Long getLocId() {
        return locId;
    }

    public void setLocId(Long locId) {
        this.locId = locId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("locType='").append(locType).append('\'');
        sb.append(", locId=").append(locId);
        sb.append(", key='").append(key).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", iataAirportCode='").append(iataAirportCode).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", geoPosition=").append(geoPosition);
        sb.append(", locationId=").append(locationId);
        sb.append(", inEurope=").append(inEurope);
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", coreCountry=").append(coreCountry);
        sb.append(", distance='").append(distance).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
