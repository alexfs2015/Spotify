package com.spotify.music.features.listeninghistory.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.listeninghistory.model.$AutoValue_Track reason: invalid class name */
abstract class C$AutoValue_Track extends Track {
    private final String albumName;
    private final String coverArtUri;
    private final String mainArtistName;
    private final String mainArtistUri;
    private final String playContext;
    private final String timestamp;
    private final String trackName;
    private final String trackUri;

    /* renamed from: com.spotify.music.features.listeninghistory.model.$AutoValue_Track$a */
    static final class a implements com.spotify.music.features.listeninghistory.model.Track.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        /* synthetic */ a(Track track, byte b2) {
            this(track);
        }

        a() {
        }

        private a(Track track) {
            this.a = track.getTrackUri();
            this.b = track.getTrackName();
            this.c = track.getMainArtistUri();
            this.d = track.getMainArtistName();
            this.e = track.getTimestamp();
            this.f = track.getAlbumName();
            this.g = track.getPlayContext();
            this.h = track.getCoverArtUri();
        }
    }

    C$AutoValue_Track(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str != null) {
            this.trackUri = str;
            if (str2 != null) {
                this.trackName = str2;
                if (str3 != null) {
                    this.mainArtistUri = str3;
                    if (str4 != null) {
                        this.mainArtistName = str4;
                        if (str5 != null) {
                            this.timestamp = str5;
                            if (str6 != null) {
                                this.albumName = str6;
                                if (str7 != null) {
                                    this.playContext = str7;
                                    if (str8 != null) {
                                        this.coverArtUri = str8;
                                        return;
                                    }
                                    throw new NullPointerException("Null coverArtUri");
                                }
                                throw new NullPointerException("Null playContext");
                            }
                            throw new NullPointerException("Null albumName");
                        }
                        throw new NullPointerException("Null timestamp");
                    }
                    throw new NullPointerException("Null mainArtistName");
                }
                throw new NullPointerException("Null mainArtistUri");
            }
            throw new NullPointerException("Null trackName");
        }
        throw new NullPointerException("Null trackUri");
    }

    @JsonProperty("trackUri")
    public String getTrackUri() {
        return this.trackUri;
    }

    @JsonProperty("trackName")
    public String getTrackName() {
        return this.trackName;
    }

    @JsonProperty("mainArtistUri")
    public String getMainArtistUri() {
        return this.mainArtistUri;
    }

    @JsonProperty("mainArtistName")
    public String getMainArtistName() {
        return this.mainArtistName;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("albumName")
    public String getAlbumName() {
        return this.albumName;
    }

    @JsonProperty("playContext")
    public String getPlayContext() {
        return this.playContext;
    }

    @JsonProperty("coverArtUri")
    public String getCoverArtUri() {
        return this.coverArtUri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Track{trackUri=");
        sb.append(this.trackUri);
        sb.append(", trackName=");
        sb.append(this.trackName);
        sb.append(", mainArtistUri=");
        sb.append(this.mainArtistUri);
        sb.append(", mainArtistName=");
        sb.append(this.mainArtistName);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", albumName=");
        sb.append(this.albumName);
        sb.append(", playContext=");
        sb.append(this.playContext);
        sb.append(", coverArtUri=");
        sb.append(this.coverArtUri);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return this.trackUri.equals(track.getTrackUri()) && this.trackName.equals(track.getTrackName()) && this.mainArtistUri.equals(track.getMainArtistUri()) && this.mainArtistName.equals(track.getMainArtistName()) && this.timestamp.equals(track.getTimestamp()) && this.albumName.equals(track.getAlbumName()) && this.playContext.equals(track.getPlayContext()) && this.coverArtUri.equals(track.getCoverArtUri());
        }
    }

    public int hashCode() {
        return ((((((((((((((this.trackUri.hashCode() ^ 1000003) * 1000003) ^ this.trackName.hashCode()) * 1000003) ^ this.mainArtistUri.hashCode()) * 1000003) ^ this.mainArtistName.hashCode()) * 1000003) ^ this.timestamp.hashCode()) * 1000003) ^ this.albumName.hashCode()) * 1000003) ^ this.playContext.hashCode()) * 1000003) ^ this.coverArtUri.hashCode();
    }

    public com.spotify.music.features.listeninghistory.model.Track.a toBuilder() {
        return new a(this, 0);
    }
}
