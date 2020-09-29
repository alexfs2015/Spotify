package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Display implements Parcelable, JacksonModel {

    public static final class a extends upv<Display> {
        public a() {
            super(Display.getCreator());
        }
    }

    @JsonProperty("media")
    public abstract String displayMedia();

    @JsonProperty("height")
    public abstract int getHeight();

    @JsonProperty("width")
    public abstract int getWidth();

    @JsonCreator
    public static Display create(@JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("media") String str) {
        return new AutoValue_Display(i, i2, str);
    }

    public String getMedia() {
        return displayMedia() == null ? "" : displayMedia();
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Display> getCreator() {
        return AutoValue_Display.CREATOR;
    }
}
