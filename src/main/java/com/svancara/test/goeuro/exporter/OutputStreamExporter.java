package com.svancara.test.goeuro.exporter;

import com.svancara.test.goeuro.model.Location;

import java.io.File;
import java.io.OutputStream;
import java.util.Collection;

public interface OutputStreamExporter {

    void export(Collection<Location> locations, OutputStream stream);
}
