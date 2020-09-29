package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.OfflineStateSerializer;

final class AutoValue_SongsMetadata extends SongsMetadata {
    private final boolean isLoading;
    private final int length;
    private final uzf offlineState;

    static final class a extends com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.a {
        private uzf a;
        private Integer b;
        private Boolean c;

        /* synthetic */ a(SongsMetadata songsMetadata, byte b2) {
            this(songsMetadata);
        }

        a() {
        }

        private a(SongsMetadata songsMetadata) {
            this.a = songsMetadata.offlineState();
            this.b = Integer.valueOf(songsMetadata.length());
            this.c = Boolean.valueOf(songsMetadata.isLoading());
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.a a(uzf uzf) {
            if (uzf != null) {
                this.a = uzf;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final SongsMetadata a() {
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
                return new AutoValue_SongsMetadata(this.a, this.b.intValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SongsMetadata(uzf uzf, int i, boolean z) {
        this.offlineState = uzf;
        this.length = i;
        this.isLoading = z;
    }

    @JsonProperty("offline_state")
    @JsonSerialize(using = OfflineStateSerializer.class)
    public final uzf offlineState() {
        return this.offlineState;
    }

    @JsonProperty("length")
    public final int length() {
        return this.length;
    }

    @JsonProperty("is_loading")
    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SongsMetadata{offlineState=");
        sb.append(this.offlineState);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", isLoading=");
        sb.append(this.isLoading);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SongsMetadata) {
            SongsMetadata songsMetadata = (SongsMetadata) obj;
            return this.offlineState.equals(songsMetadata.offlineState()) && this.length == songsMetadata.length() && this.isLoading == songsMetadata.isLoading();
        }
    }

    public final int hashCode() {
        return ((((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.length) * 1000003) ^ (this.isLoading ? 1231 : 1237);
    }

    public final com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata.a toBuilder() {
        return new a(this, 0);
    }
}
