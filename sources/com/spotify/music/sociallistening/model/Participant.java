package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Participant.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Participant implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        public abstract Participant build();

        @JsonProperty("display_name")
        public abstract Builder displayName(String str);

        @JsonProperty("id")
        public abstract Builder id(String str);

        @JsonProperty("image_url")
        public abstract Builder imageUrl(String str);

        @JsonProperty("is_host")
        public abstract Builder isHost(Boolean bool);

        @JsonProperty("large_image_url")
        public abstract Builder largeImageUrl(String str);

        @JsonProperty("username")
        public abstract Builder username(String str);

        @JsonCreator
        public static Builder create() {
            return Participant.builder();
        }
    }

    @JsonProperty("display_name")
    public abstract String displayName();

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("image_url")
    public abstract String imageUrl();

    @JsonProperty("is_host")
    public abstract Boolean isHost();

    @JsonProperty("large_image_url")
    public abstract String largeImageUrl();

    @JsonProperty("username")
    public abstract String username();

    public static Builder builder() {
        return new Builder();
    }
}
