package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(builder = a.class)
public abstract class PlaceboBannerControl implements JacksonModel {

    public static abstract class a {
        @JsonCreator
        static a create() {
            return PlaceboBannerControl.builder();
        }

        @JsonProperty("type")
        public abstract a a(String str);

        public abstract PlaceboBannerControl a();

        @JsonProperty("text")
        public abstract a b(String str);

        @JsonProperty("url")
        public abstract a c(String str);
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static PlaceboBannerControl create(@JsonProperty("type") String str, @JsonProperty("text") String str2, @JsonProperty("url") String str3) {
        return builder().a(str).b(str2).c(str3).a();
    }

    @JsonProperty("text")
    public abstract String text();

    public abstract a toBuilder();

    @JsonProperty("type")
    public abstract String type();

    @JsonProperty("url")
    public abstract String url();
}
