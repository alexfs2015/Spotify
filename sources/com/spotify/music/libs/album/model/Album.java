package com.spotify.music.libs.album.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Album implements Parcelable, JacksonModel {
    public abstract List<AlbumArtist> getArtists();

    public abstract List<String> getCopyrights();

    /* access modifiers changed from: 0000 */
    public abstract AlbumImage getCover();

    public abstract int getDay();

    /* access modifiers changed from: 0000 */
    public abstract List<AlbumDisc> getDiscs();

    public abstract int getMonth();

    public abstract String getName();

    /* access modifiers changed from: 0000 */
    public abstract AlbumRelated getRelated();

    public abstract int getTrackCount();

    public abstract List<AlbumTrack> getTracks();

    public abstract AlbumType getType();

    public abstract String getUri();

    public abstract int getYear();

    public static Album create(Album album, List<AlbumTrack> list) {
        AutoValue_Album autoValue_Album = new AutoValue_Album(album.getDay(), album.getMonth(), album.getYear(), album.getTrackCount(), album.getType(), album.getName(), album.getUri(), album.getCover(), album.getRelated(), album.getCopyrights(), album.getDiscs(), album.getArtists(), list);
        return autoValue_Album;
    }

    @JsonCreator
    public static Album create(@JsonProperty("day") int i, @JsonProperty("month") int i2, @JsonProperty("year") int i3, @JsonProperty("track_count") int i4, @JsonProperty("type") AlbumType albumType, @JsonProperty("name") String str, @JsonProperty("uri") String str2, @JsonProperty("cover") AlbumImage albumImage, @JsonProperty("related") AlbumRelated albumRelated, @JsonProperty("copyrights") List<String> list, @JsonProperty("discs") List<AlbumDisc> list2, @JsonProperty("artists") List<AlbumArtist> list3) {
        AutoValue_Album autoValue_Album = new AutoValue_Album(i, i2, i3, i4, albumType, str, str2, albumImage, albumRelated, gbp.a(list), gbp.a(list2), gbp.a(list3), createTracks(gbp.a(list2)));
        return autoValue_Album;
    }

    public String getCoverUri() {
        AlbumImage cover = getCover();
        return cover != null ? cover.getUri() : "";
    }

    public List<AlbumRelease> getReleases() {
        AlbumRelated related = getRelated();
        return related != null ? related.getReleases() : Collections.emptyList();
    }

    public String getFirstArtistName() {
        return !getArtists().isEmpty() ? ((AlbumArtist) getArtists().get(0)).getName() : "";
    }

    public String getAllArtistNames() {
        ArrayList arrayList = new ArrayList(getArtists().size());
        for (AlbumArtist name : getArtists()) {
            arrayList.add(name.getName());
        }
        return fau.a(", ").a((Iterable<?>) arrayList);
    }

    public String getFirstArtistUri() {
        return !getArtists().isEmpty() ? ((AlbumArtist) getArtists().get(0)).getUri() : "";
    }

    public AlbumImage getArtistImage() {
        if (!getArtists().isEmpty()) {
            return ((AlbumArtist) getArtists().get(0)).getImage();
        }
        return null;
    }

    private static List<AlbumTrack> createTracks(List<AlbumDisc> list) {
        ArrayList a = Lists.a();
        for (AlbumDisc tracks : list) {
            a.addAll(tracks.getTracks());
        }
        return a;
    }

    public int getTotalDuration() {
        int i = 0;
        for (AlbumTrack duration : getTracks()) {
            i += duration.getDuration();
        }
        return i;
    }
}
