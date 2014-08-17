package com.svancara.test.goeuro;

import com.svancara.test.goeuro.exporter.CsvOutputStreamExporter;
import com.svancara.test.goeuro.exporter.OutputStreamExporter;
import com.svancara.test.goeuro.model.Location;
import com.svancara.test.goeuro.retrieval.LocationService;
import com.svancara.test.goeuro.retrieval.RestLocationService;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use exactly one argument - the query string.");
            System.exit(1);
        }

        LocationService ls = new RestLocationService();
        OutputStreamExporter ex = new CsvOutputStreamExporter();

        Collection<Location> locations = ls.find(args[0]);
        ex.export(locations, System.out);

        System.exit(0);
    }
}
