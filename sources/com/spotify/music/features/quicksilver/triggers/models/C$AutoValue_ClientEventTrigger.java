package com.spotify.music.features.quicksilver.triggers.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.quicksilver.triggers.models.$AutoValue_ClientEventTrigger reason: invalid class name */
abstract class C$AutoValue_ClientEventTrigger extends ClientEventTrigger {
    private final boolean cache;
    private final String format;
    private final String pattern;

    /* renamed from: com.spotify.music.features.quicksilver.triggers.models.$AutoValue_ClientEventTrigger$a */
    static final class a implements com.spotify.music.features.quicksilver.triggers.models.ClientEventTrigger.a {
        private String a;
        private Boolean b;
        private String c;

        a() {
        }

        private a(ClientEventTrigger clientEventTrigger) {
            this.a = clientEventTrigger.getPattern();
            this.b = Boolean.valueOf(clientEventTrigger.isCache());
            this.c = clientEventTrigger.getFormat();
        }

        /* synthetic */ a(ClientEventTrigger clientEventTrigger, byte b2) {
            this(clientEventTrigger);
        }
    }

    C$AutoValue_ClientEventTrigger(String str, boolean z, String str2) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientEventTrigger) {
            ClientEventTrigger clientEventTrigger = (ClientEventTrigger) obj;
            return this.pattern.equals(clientEventTrigger.getPattern()) && this.cache == clientEventTrigger.isCache() && this.format.equals(clientEventTrigger.getFormat());
        }
    }

    @JsonProperty("format")
    public String getFormat() {
        return this.format;
    }

    @JsonProperty("pattern")
    public String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        return ((((this.pattern.hashCode() ^ 1000003) * 1000003) ^ (this.cache ? 1231 : 1237)) * 1000003) ^ this.format.hashCode();
    }

    @JsonProperty("cache")
    public boolean isCache() {
        return this.cache;
    }

    public com.spotify.music.features.quicksilver.triggers.models.ClientEventTrigger.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientEventTrigger{pattern=");
        sb.append(this.pattern);
        sb.append(", cache=");
        sb.append(this.cache);
        sb.append(", format=");
        sb.append(this.format);
        sb.append("}");
        return sb.toString();
    }
}
