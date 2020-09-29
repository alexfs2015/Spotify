package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.OfflineStateSerializer;

final class AutoValue_SongsMetadataFromTracks extends SongsMetadataFromTracks {
    private final boolean isLoading;
    private final int length;
    private final vli offlineState;

    static final class a extends com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a {
        private vli a;
        private Integer b;
        private Boolean c;

        a() {
        }

        private a(SongsMetadataFromTracks songsMetadataFromTracks) {
            this.a = songsMetadataFromTracks.offlineState();
            this.b = Integer.valueOf(songsMetadataFromTracks.length());
            this.c = Boolean.valueOf(songsMetadataFromTracks.isLoading());
        }

        /* synthetic */ a(SongsMetadataFromTracks songsMetadataFromTracks, byte b2) {
            this(songsMetadataFromTracks);
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a a(vli vli) {
            if (vli != null) {
                this.a = vli;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final SongsMetadataFromTracks a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" offlineState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" length");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isLoading");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SongsMetadataFromTracks(this.a, this.b.intValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SongsMetadataFromTracks(vli vli, int i, boolean z) {
        this.offlineState = vli;
        this.length = i;
        this.isLoading = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SongsMetadataFromTracks) {
            SongsMetadataFromTracks songsMetadataFromTracks = (SongsMetadataFromTracks) obj;
            return this.offlineState.equals(songsMetadataFromTracks.offlineState()) && this.length == songsMetadataFromTracks.length() && this.isLoading == songsMetadataFromTracks.isLoading();
        }
    }

    public final int hashCode() {
        return ((((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.length) * 1000003) ^ (this.isLoading ? 1231 : 1237);
    }

    @JsonProperty("is_loading")
    public final boolean isLoading() {
        return this.isLoading;
    }

    @JsonProperty("length")
    public final int length() {
        return this.length;
    }

    @JsonProperty("offline_state")
    @JsonSerialize(using = OfflineStateSerializer.class)
    public final vli offlineState() {
        return this.offlineState;
    }

    public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SongsMetadataFromTracks{offlineState=");
        sb.append(this.offlineState);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", isLoading=");
        sb.append(this.isLoading);
        sb.append("}");
        return sb.toString();
    }
}
