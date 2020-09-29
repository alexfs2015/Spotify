package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsTrack implements JacksonModel {
    @JsonProperty("album")
    public abstract RecsItem album();

    @JsonProperty("artists")
    public abstract List<RecsItem> artists();

    @JsonProperty("explicit")
    public abstract boolean explicit();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("preview_id")
    public abstract String previewId();

    @JsonProperty("uri")
    public abstract String uri();

    @JsonCreator
    public static RecsTrack create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("preview_id") String str3, @JsonProperty("album") RecsItem recsItem, @JsonProperty("artists") List<RecsItem> list, @JsonProperty("explicit") Boolean bool) {
        AutoValue_RecsTrack autoValue_RecsTrack = new AutoValue_RecsTrack(str, str2, (String) fav.a(str3, ""), recsItem, list != null ? ImmutableList.a((Collection<? extends E>) list) : ImmutableList.d(), ((Boolean) fav.a(bool, Boolean.FALSE)).booleanValue());
        return autoValue_RecsTrack;
    }

    @JsonIgnore
    public String getAlbumName() {
        RecsItem album = album();
        if (album != null) {
            return album.name();
        }
        return null;
    }

    @JsonIgnore
    public String getArtistName() {
        String str = "";
        if (artists().isEmpty()) {
            return str;
        }
        return (String) fav.a(((RecsItem) artists().get(0)).name(), str);
    }

    @JsonIgnore
    public ImmutableList<String> getArtistNames() {
        return ImmutableList.a(fcl.a((Iterable<F>) artists(), (Function<? super F, ? extends T>) $$Lambda$YZAgQM5gaPtlpzQ3D0xdj5pUiX0.INSTANCE));
    }

    @JsonIgnore
    public String getImage() {
        RecsItem album = album();
        String str = "";
        if (album == null) {
            return str;
        }
        return (String) fav.a(album.largeImageUrl(), fav.a(album.imageUrl(), str));
    }
}
