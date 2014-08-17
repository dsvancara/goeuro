package com.svancara.test.goeuro.converter;

import com.googlecode.jcsv.writer.CSVEntryConverter;
import com.svancara.test.goeuro.model.Location;

public class CSVLocationEntryConverter implements CSVEntryConverter<Location> {

    @Override
    public String[] convertEntry(Location location) {
        String[] columns = new String[6];

        //_type, _id, name, type, latitude, longitude
        columns[0] = String.valueOf(location.getLocType());
        columns[1] = String.valueOf(location.getLocId());
        columns[2] = String.valueOf(location.getName());
        columns[3] = String.valueOf(location.getType());
        columns[4] = location.getGeoPosition() == null ? "null" : String.valueOf(location.getGeoPosition().getLatitude());
        columns[5] = location.getGeoPosition() == null ? "null" : String.valueOf(location.getGeoPosition().getLongitude());

        return columns;
    }
}
