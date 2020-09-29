package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.LinkType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Sponsorship implements Parcelable, JacksonModel {
    public boolean mViewedDuringSession;

    @JsonCreator
    public static Sponsorship create(@JsonProperty("startTime") long j, @JsonProperty("endTime") long j2, @JsonProperty("spotifyUri") String str) {
        return new AutoValue_Sponsorship(Long.valueOf(j), Long.valueOf(j2), str);
    }

    public void displayedDuringSession() {
        this.mViewedDuringSession = true;
    }

    @JsonProperty("endTime")
    public abstract Long endTime();

    public boolean isEqual(String str) {
        jva a = jva.a(uri());
        jva a2 = jva.a(str);
        return a.b != LinkType.DUMMY && a2.b != LinkType.DUMMY && a.b == a2.b && a.b().equals(a2.b());
    }

    @JsonProperty("startTime")
    public abstract Long startTime();

    @JsonProperty("spotifyUri")
    public abstract String uri();

    public boolean wasDisplayedDuringSession() {
        return this.mViewedDuringSession;
    }
}
