package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Notification.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Notification implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return Notification.builder();
        }

        public abstract Notification build();

        @JsonProperty("reason")
        public abstract Builder reason(Reason reason);

        @JsonProperty("session")
        public abstract Builder session(Session session);
    }

    public enum Reason {
        a(r2),
        b(r3),
        c(r4);
        
        private final String mType;

        private Reason(String str) {
            this.mType = str;
        }

        public final String toString() {
            return this.mType;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("reason")
    public abstract Reason reason();

    @JsonProperty("session")
    public abstract Session session();
}
