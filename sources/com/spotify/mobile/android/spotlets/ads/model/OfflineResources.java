package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineResources implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Resources implements JacksonModel {
        public abstract String offlineAvailability();

        public abstract String uri();

        @JsonCreator
        public static Resources create(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
            return new AutoValue_OfflineResources_Resources(str, str2);
        }
    }

    public abstract Resources resources();

    @JsonCreator
    public static OfflineResources create(@JsonProperty("resources") Resources resources) {
        return new AutoValue_OfflineResources(resources);
    }
}
