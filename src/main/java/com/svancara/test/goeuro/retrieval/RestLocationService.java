package com.svancara.test.goeuro.retrieval;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.svancara.test.goeuro.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.Collection;

public class RestLocationService implements LocationService {

    private static final String BASE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/{query}";

    private static final Logger logger = LoggerFactory.getLogger(RestLocationService.class);

    @Override
    public Collection<Location> find(String queryString) {
        try {
            HttpResponse<String> response = Unirest.get(BASE_URL).routeParam("query", queryString).asString();
            Collection<Location> result = fromResponse(response);

            logger.debug("Mapped object: {}", result);

            return result;
        } catch (UnirestException e) {
            throw new LocationRetrievalException("Could not retrieve location with query string '" + queryString + "'", e);
        }
    }

    private Collection<Location> fromResponse(HttpResponse<String> response) {
        logger.debug("JSON: {}", response.getBody());
        //
        Gson gson = new Gson();
        Type type = new TypeToken<Collection<Location>>(){}.getType();

        return gson.fromJson(response.getBody(), type);
    }
}
