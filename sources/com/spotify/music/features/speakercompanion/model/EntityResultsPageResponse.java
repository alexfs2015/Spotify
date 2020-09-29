package com.spotify.music.features.speakercompanion.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EntityResultsPageResponse implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Payload implements Parcelable, JacksonModel {
        @JsonCreator
        public static Payload create(@JsonProperty("fulfillment") qpt qpt, @JsonProperty("results") List<qpt> list) {
            return new AutoValue_EntityResultsPageResponse_Payload(qpt, list);
        }

        public abstract qpt fulfillment();

        public abstract List<qpt> results();
    }

    @JsonCreator
    public static EntityResultsPageResponse create(@JsonProperty("eligible") boolean z, @JsonProperty("uid") String str, @JsonProperty("payload") Payload payload) {
        return new AutoValue_EntityResultsPageResponse(z, str, payload);
    }

    public abstract boolean eligible();

    public abstract Payload payload();

    public abstract String uid();
}
