package com.svancara.test.goeuro.exporter;

public class FileExporterException extends RuntimeException {
    public FileExporterException() {
    }

    public FileExporterException(String message) {
        super(message);
    }

    public FileExporterException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileExporterException(Throwable cause) {
        super(cause);
    }
}
