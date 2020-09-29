package com.spotify.music.lyrics.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackLyrics implements Parcelable, JacksonModel {
    public static final String KIND_LINE = "LINE";
    public static final String KIND_TEXT = "TEXT";

    public abstract String getKind();

    public abstract List<LyricsLineData> getLines();

    public abstract String getProvider();

    public abstract ProviderAndroidIntent getProviderAndroidIntent();

    public abstract String getPublishersCredits();

    public abstract String getTrackId();

    public abstract String getWriters();

    @JsonCreator
    public static TrackLyrics create(@JsonProperty("lines") List<LyricsLineData> list, @JsonProperty("kind") String str, @JsonProperty("trackId") String str2, @JsonProperty("provider") String str3, @JsonProperty("providerAndroidIntent") ProviderAndroidIntent providerAndroidIntent, @JsonProperty("writers") String str4, @JsonProperty("publisherCredits") String str5) {
        AutoValue_TrackLyrics autoValue_TrackLyrics = new AutoValue_TrackLyrics(list, str, str2, str3, providerAndroidIntent, str4, str5);
        return autoValue_TrackLyrics;
    }
}
