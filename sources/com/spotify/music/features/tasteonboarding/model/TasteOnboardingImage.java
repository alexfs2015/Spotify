package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TasteOnboardingImage implements Parcelable, JacksonModel {

    public static final class a extends upv<TasteOnboardingImage> {
        public a() {
            super(AutoValue_TasteOnboardingImage.CREATOR);
        }
    }

    public abstract int height();

    public abstract String uri();

    public abstract int width();

    @JsonCreator
    public static TasteOnboardingImage create(@JsonProperty("uri") String str, @JsonProperty("height") int i, @JsonProperty("width") int i2) {
        return new AutoValue_TasteOnboardingImage(str, i, i2);
    }
}
