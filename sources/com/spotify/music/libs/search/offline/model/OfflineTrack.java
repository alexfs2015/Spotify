package com.spotify.music.libs.search.offline.model;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class OfflineTrack extends OfflineSearchEntity {
    private static final long serialVersionUID = 6471750226925609451L;
    public final OfflineTrackAlbum album;
    public final List<OfflineTrackArtist> artists;
    @JsonIgnoreProperties
    private String mArtistsString;

    @JsonCreator
    public OfflineTrack(@JsonProperty("artists") List<OfflineTrackArtist> list, @JsonProperty("album") OfflineTrackAlbum offlineTrackAlbum, @JsonProperty("name") String str, @JsonProperty("uri") String str2) {
        super(str, str2, null);
        this.artists = gbp.a(list);
        this.album = offlineTrackAlbum;
    }

    public final String artists() {
        if (this.mArtistsString == null) {
            this.mArtistsString = TextUtils.join(", ", this.artists);
        }
        return this.mArtistsString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTrack) || !super.equals(obj)) {
            return false;
        }
        OfflineTrack offlineTrack = (OfflineTrack) obj;
        if (!this.artists.equals(offlineTrack.artists)) {
            return false;
        }
        OfflineTrackAlbum offlineTrackAlbum = this.album;
        if (offlineTrackAlbum == null ? offlineTrack.album != null : !offlineTrackAlbum.equals(offlineTrack.album)) {
            return false;
        }
        String str = this.mArtistsString;
        return str == null ? offlineTrack.mArtistsString == null : str.equals(offlineTrack.mArtistsString);
    }

    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.artists.hashCode()) * 31;
        OfflineTrackAlbum offlineTrackAlbum = this.album;
        int i = 0;
        int hashCode2 = (hashCode + (offlineTrackAlbum != null ? offlineTrackAlbum.hashCode() : 0)) * 31;
        String str = this.mArtistsString;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
