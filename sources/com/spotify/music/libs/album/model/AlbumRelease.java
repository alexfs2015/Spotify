package com.spotify.music.libs.album.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlbumRelease implements Parcelable, JacksonModel {
    @JsonCreator
    public static AlbumRelease create(@JsonProperty("year") int i, @JsonProperty("cover") AlbumImage albumImage, @JsonProperty("uri") String str, @JsonProperty("name") String str2) {
        return new AutoValue_AlbumRelease(i, albumImage, str, str2);
    }

    /* access modifiers changed from: 0000 */
    public abstract AlbumImage getCover();

    public String getCoverUri() {
        AlbumImage cover = getCover();
        return cover != null ? cover.getUri() : "";
    }

    public abstract String getName();

    public abstract String getUri();

    public abstract int getYear();
}
