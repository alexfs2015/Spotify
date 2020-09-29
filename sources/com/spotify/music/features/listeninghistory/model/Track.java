package com.spotify.music.features.listeninghistory.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class Track implements Parcelable, JacksonModel {

    public interface a {
    }

    @JsonProperty("albumName")
    public abstract String getAlbumName();

    @JsonProperty("coverArtUri")
    public abstract String getCoverArtUri();

    @JsonProperty("mainArtistName")
    public abstract String getMainArtistName();

    @JsonProperty("mainArtistUri")
    public abstract String getMainArtistUri();

    @JsonProperty("playContext")
    public abstract String getPlayContext();

    @JsonProperty("timestamp")
    public abstract String getTimestamp();

    @JsonProperty("trackName")
    public abstract String getTrackName();

    @JsonProperty("trackUri")
    public abstract String getTrackUri();

    public abstract a toBuilder();

    @JsonCreator
    public static Track create(@JsonProperty("trackUri") String str, @JsonProperty("trackName") String str2, @JsonProperty("mainArtistUri") String str3, @JsonProperty("mainArtistName") String str4, @JsonProperty("timestamp") String str5, @JsonProperty("albumName") String str6, @JsonProperty("playContext") String str7, @JsonProperty("coverArtUri") String str8) {
        AutoValue_Track autoValue_Track = new AutoValue_Track(str, str2, str3, str4, str5, str6, str7, str8);
        return autoValue_Track;
    }

    public static a builder() {
        return new a();
    }
}
