package com.spotify.music.libs.album.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlbumTrack implements Parcelable, JacksonModel {
    public static AlbumTrack create(AlbumTrack albumTrack, vli vli) {
        AutoValue_AlbumTrack autoValue_AlbumTrack = new AutoValue_AlbumTrack(albumTrack.isPlayable(), albumTrack.isExplicit(), albumTrack.getDuration(), albumTrack.getUri(), albumTrack.getName(), albumTrack.getArtists(), vli);
        return autoValue_AlbumTrack;
    }

    @JsonCreator
    public static AlbumTrack create(@JsonProperty("playable") boolean z, @JsonProperty("explicit") boolean z2, @JsonProperty("duration") int i, @JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("artists") List<AlbumArtist> list) {
        AutoValue_AlbumTrack autoValue_AlbumTrack = new AutoValue_AlbumTrack(z, z2, i, str, str2, gcn.a(list), new f());
        return autoValue_AlbumTrack;
    }

    public abstract List<AlbumArtist> getArtists();

    public abstract int getDuration();

    public abstract String getName();

    public abstract vli getOffline();

    public abstract String getUri();

    public abstract boolean isExplicit();

    public abstract boolean isPlayable();
}
