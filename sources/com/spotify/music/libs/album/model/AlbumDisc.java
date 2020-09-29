package com.spotify.music.libs.album.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlbumDisc implements Parcelable, JacksonModel {
    public abstract List<AlbumTrack> getTracks();

    @JsonCreator
    public static AlbumDisc create(@JsonProperty("tracks") List<AlbumTrack> list) {
        return new AutoValue_AlbumDisc(gbp.a(list));
    }
}
