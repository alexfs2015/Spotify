package com.spotify.music.features.quicksilver.triggers.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.quicksilver.triggers.models.$AutoValue_PlaybackStartedTrigger reason: invalid class name */
abstract class C$AutoValue_PlaybackStartedTrigger extends PlaybackStartedTrigger {
    private final boolean cache;
    private final String format;
    private final String pattern;

    /* renamed from: com.spotify.music.features.quicksilver.triggers.models.$AutoValue_PlaybackStartedTrigger$a */
    static final class a implements com.spotify.music.features.quicksilver.triggers.models.PlaybackStartedTrigger.a {
        private String a;
        private Boolean b;
        private String c;

        /* synthetic */ a(PlaybackStartedTrigger playbackStartedTrigger, byte b2) {
            this(playbackStartedTrigger);
        }

        a() {
        }

        private a(PlaybackStartedTrigger playbackStartedTrigger) {
            this.a = playbackStartedTrigger.getPattern();
            this.b = Boolean.valueOf(playbackStartedTrigger.isCache());
            this.c = playbackStartedTrigger.getFormat();
        }
    }

    C$AutoValue_PlaybackStartedTrigger(String str, boolean z, String str2) {
        if (str != null) {
            this.pattern = str;
            this.cache = z;
            if (str2 != null) {
                this.format = str2;
                return;
            }
            throw new NullPointerException("Null format");
        }
        throw new NullPointerException("Null pattern");
    }

    @JsonProperty("pattern")
    public String getPattern() {
        return this.pattern;
    }

    @JsonProperty("cache")
    public boolean isCache() {
        return this.cache;
    }

    @JsonProperty("format")
    public String getFormat() {
        return this.format;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackStartedTrigger{pattern=");
        sb.append(this.pattern);
        sb.append(", cache=");
        sb.append(this.cache);
        sb.append(", format=");
        sb.append(this.format);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackStartedTrigger) {
            PlaybackStartedTrigger playbackStartedTrigger = (PlaybackStartedTrigger) obj;
            return this.pattern.equals(playbackStartedTrigger.getPattern()) && this.cache == playbackStartedTrigger.isCache() && this.format.equals(playbackStartedTrigger.getFormat());
        }
    }

    public int hashCode() {
        return ((((this.pattern.hashCode() ^ 1000003) * 1000003) ^ (this.cache ? 1231 : 1237)) * 1000003) ^ this.format.hashCode();
    }

    public com.spotify.music.features.quicksilver.triggers.models.PlaybackStartedTrigger.a toBuilder() {
        return new a(this, 0);
    }
}
