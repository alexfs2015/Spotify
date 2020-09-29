package com.spotify.music.features.listeninghistory.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

public abstract class Session implements Parcelable, JacksonModel {

    public interface a {
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static Session create(@JsonProperty("session") List<Track> list, @JsonProperty("sessionEndTime") String str, @JsonProperty("sessionStartTime") String str2) {
        return new AutoValue_Session(ImmutableList.a((Collection<? extends E>) list), str, str2);
    }

    public abstract List<Track> getSession();

    public abstract String getSessionEndTime();

    public abstract String getSessionStartTime();

    public abstract a toBuilder();
}
