package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonDeserialize(builder = a.class)
public abstract class PlaceboBannerView implements JacksonModel {
    public static final String TWO_BUTTONS = "twobuttons";
    public static final String V1 = "v1";

    public static abstract class a {
        @JsonCreator
        static a create() {
            return PlaceboBannerView.builder();
        }

        @JsonProperty("type")
        public abstract a a(String str);

        @JsonProperty("controls")
        public abstract a a(List<PlaceboBannerControl> list);

        public abstract PlaceboBannerView a();

        @JsonProperty("title")
        public abstract a b(String str);

        @JsonProperty("description")
        public abstract a c(String str);
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static PlaceboBannerView create(@JsonProperty("type") String str, @JsonProperty("title") String str2, @JsonProperty("description") String str3, @JsonProperty("controls") List<PlaceboBannerControl> list) {
        return builder().a(str).b(str2).c(str3).a(list).a();
    }

    @JsonProperty("controls")
    public abstract List<PlaceboBannerControl> controls();

    @JsonProperty("description")
    public abstract String description();

    @JsonProperty("title")
    public abstract String title();

    public abstract a toBuilder();

    @JsonProperty("type")
    public abstract String type();
}
