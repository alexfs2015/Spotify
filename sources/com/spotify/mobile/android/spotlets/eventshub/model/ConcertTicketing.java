package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertTicketing implements Parcelable, JacksonModel {
    @JsonCreator
    public static ConcertTicketing create(@JsonProperty("minPrice") String str, @JsonProperty("maxPrice") String str2) {
        return new AutoValue_ConcertTicketing(str, str2);
    }

    @JsonProperty("maxPrice")
    public abstract String getMaxPrice();

    @JsonProperty("minPrice")
    public abstract String getMinPrice();
}
