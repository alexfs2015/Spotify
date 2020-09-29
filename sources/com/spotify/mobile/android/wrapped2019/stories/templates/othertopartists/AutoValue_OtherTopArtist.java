package com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists;

final class AutoValue_OtherTopArtist extends OtherTopArtist {
    private static final long serialVersionUID = 1;
    private final String artistImageUrl;
    private final String artistName;
    private final String artistRank;
    private final String previewUrl;

    static final class a extends com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null artistImageUrl");
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null artistName");
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null artistRank");
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final OtherTopArtist a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artistImageUrl");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" artistName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" artistRank");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" previewUrl");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_OtherTopArtist autoValue_OtherTopArtist = new AutoValue_OtherTopArtist(this.a, this.b, this.c, this.d, 0);
                return autoValue_OtherTopArtist;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ AutoValue_OtherTopArtist(String str, String str2, String str3, String str4, byte b) {
        this(str, str2, str3, str4);
    }

    private AutoValue_OtherTopArtist(String str, String str2, String str3, String str4) {
        this.artistImageUrl = str;
        this.artistName = str2;
        this.artistRank = str3;
        this.previewUrl = str4;
    }

    public final String a() {
        return this.artistImageUrl;
    }

    public final String b() {
        return this.artistName;
    }

    public final String c() {
        return this.artistRank;
    }

    public final String d() {
        return this.previewUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherTopArtist{artistImageUrl=");
        sb.append(this.artistImageUrl);
        sb.append(", artistName=");
        sb.append(this.artistName);
        sb.append(", artistRank=");
        sb.append(this.artistRank);
        sb.append(", previewUrl=");
        sb.append(this.previewUrl);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OtherTopArtist) {
            OtherTopArtist otherTopArtist = (OtherTopArtist) obj;
            return this.artistImageUrl.equals(otherTopArtist.a()) && this.artistName.equals(otherTopArtist.b()) && this.artistRank.equals(otherTopArtist.c()) && this.previewUrl.equals(otherTopArtist.d());
        }
    }

    public final int hashCode() {
        return ((((((this.artistImageUrl.hashCode() ^ 1000003) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.artistRank.hashCode()) * 1000003) ^ this.previewUrl.hashCode();
    }
}
