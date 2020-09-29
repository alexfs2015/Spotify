package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_TrackAnnotationSet extends TrackAnnotationSet {
    private final List<TrackAnnotation> annotations;
    private final String artistName;
    private final int geniusTrackId;
    private final String spotifyTrackId;
    private final String trackTitle;

    AutoValue_TrackAnnotationSet(String str, int i, String str2, String str3, List<TrackAnnotation> list) {
        if (str != null) {
            this.spotifyTrackId = str;
            this.geniusTrackId = i;
            if (str2 != null) {
                this.artistName = str2;
                if (str3 != null) {
                    this.trackTitle = str3;
                    if (list != null) {
                        this.annotations = list;
                        return;
                    }
                    throw new NullPointerException("Null annotations");
                }
                throw new NullPointerException("Null trackTitle");
            }
            throw new NullPointerException("Null artistName");
        }
        throw new NullPointerException("Null spotifyTrackId");
    }

    @JsonProperty("spotify_uuid")
    public final String getSpotifyTrackId() {
        return this.spotifyTrackId;
    }

    @JsonProperty("genius_song_id")
    public final int getGeniusTrackId() {
        return this.geniusTrackId;
    }

    @JsonProperty("artist")
    public final String getArtistName() {
        return this.artistName;
    }

    @JsonProperty("title")
    public final String getTrackTitle() {
        return this.trackTitle;
    }

    @JsonProperty("annotations")
    public final List<TrackAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackAnnotationSet{spotifyTrackId=");
        sb.append(this.spotifyTrackId);
        sb.append(", geniusTrackId=");
        sb.append(this.geniusTrackId);
        sb.append(", artistName=");
        sb.append(this.artistName);
        sb.append(", trackTitle=");
        sb.append(this.trackTitle);
        sb.append(", annotations=");
        sb.append(this.annotations);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackAnnotationSet) {
            TrackAnnotationSet trackAnnotationSet = (TrackAnnotationSet) obj;
            return this.spotifyTrackId.equals(trackAnnotationSet.getSpotifyTrackId()) && this.geniusTrackId == trackAnnotationSet.getGeniusTrackId() && this.artistName.equals(trackAnnotationSet.getArtistName()) && this.trackTitle.equals(trackAnnotationSet.getTrackTitle()) && this.annotations.equals(trackAnnotationSet.getAnnotations());
        }
    }

    public final int hashCode() {
        return ((((((((this.spotifyTrackId.hashCode() ^ 1000003) * 1000003) ^ this.geniusTrackId) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.trackTitle.hashCode()) * 1000003) ^ this.annotations.hashCode();
    }
}
