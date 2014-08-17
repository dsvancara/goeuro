package com.svancara.test.goeuro.exporter;

import com.googlecode.jcsv.writer.CSVWriter;
import com.googlecode.jcsv.writer.internal.CSVWriterBuilder;
import com.svancara.test.goeuro.converter.CSVLocationEntryConverter;
import com.svancara.test.goeuro.model.Location;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class CsvOutputStreamExporter implements OutputStreamExporter {

    @Override
    public void export(Collection<Location> locations, OutputStream stream) {
        try (Writer out = new OutputStreamWriter(stream)) {
            CSVWriter<Location> writer = new CSVWriterBuilder<Location>(out).entryConverter(new CSVLocationEntryConverter()).build();
            writer.writeAll(new ArrayList<>(locations));

        } catch (IOException ex) {
            throw new FileExporterException("Invalid", ex);
        }
    }
}
