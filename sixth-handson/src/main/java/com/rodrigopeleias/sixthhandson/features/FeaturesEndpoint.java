package com.rodrigopeleias.sixthhandson.features;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeaturesEndpoint {

    Map<String, Feature> features = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Feature> getFeatures() {
        return features;
    }

    @ReadOperation
    public Feature getFeature(@Selector String name) {
        return features.get(name);
    }

    @WriteOperation
    public void configureFeature(@Selector String name, Boolean enabled) {
        features.put(name, new Feature(enabled));
    }

    @DeleteOperation
    public void deleteFeature(@Selector String name) {
        features.remove(name);
    }
}
