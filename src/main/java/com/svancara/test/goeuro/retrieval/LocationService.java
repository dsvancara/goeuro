package com.svancara.test.goeuro.retrieval;

import com.svancara.test.goeuro.model.Location;

import java.util.Collection;

public interface LocationService {

    Collection<Location> find(String queryString);
}
