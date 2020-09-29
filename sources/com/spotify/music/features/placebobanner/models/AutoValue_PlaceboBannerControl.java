package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PlaceboBannerControl extends PlaceboBannerControl {
    private final String text;
    private final String type;
    private final String url;

    static final class a extends com.spotify.music.features.placebobanner.models.PlaceboBannerControl.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        private a(PlaceboBannerControl placeboBannerControl) {
            this.a = placeboBannerControl.type();
            this.b = placeboBannerControl.text();
            this.c = placeboBannerControl.url();
        }

        /* synthetic */ a(PlaceboBannerControl placeboBannerControl, byte b2) {
            this(placeboBannerControl);
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerControl.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final PlaceboBannerControl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlaceboBannerControl(this.a, this.b, this.c);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerControl.a b(String str) {
            this.b = str;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerControl.a c(String str) {
            this.c = str;
            return this;
        }
    }

    private AutoValue_PlaceboBannerControl(String str, String str2, String str3) {
        this.type = str;
        this.text = str2;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceboBannerControl) {
            PlaceboBannerControl placeboBannerControl = (PlaceboBannerControl) obj;
            if (this.type.equals(placeboBannerControl.type())) {
                String str = this.text;
                if (str != null ? str.equals(placeboBannerControl.text()) : placeboBannerControl.text() == null) {
                    String str2 = this.url;
                    return str2 != null ? str2.equals(placeboBannerControl.url()) : placeboBannerControl.url() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        String str = this.text;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("text")
    public final String text() {
        return this.text;
    }

    public final com.spotify.music.features.placebobanner.models.PlaceboBannerControl.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceboBannerControl{type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", url=");
        sb.append(this.url);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("type")
    public final String type() {
        return this.type;
    }

    @JsonProperty("url")
    public final String url() {
        return this.url;
    }
}
