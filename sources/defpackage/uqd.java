package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: uqd reason: default package */
final class uqd extends b {
    private final String a;
    private final boolean b;
    private final String c;
    private final SpotifyIconV2 d;

    /* renamed from: uqd$a */
    public static final class a extends defpackage.uqg.b.a {
        private String a;
        private Boolean b;
        private String c;
        private SpotifyIconV2 d;

        public final defpackage.uqg.b.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.uqg.b.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uqg.b.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.uqg.b.a a(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.d = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" active");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" title");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" icon");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                uqd uqd = new uqd(this.a, this.b.booleanValue(), this.c, this.d, 0);
                return uqd;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ uqd(String str, boolean z, String str2, SpotifyIconV2 spotifyIconV2, byte b2) {
        this(str, z, str2, spotifyIconV2);
    }

    private uqd(String str, boolean z, String str2, SpotifyIconV2 spotifyIconV2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = spotifyIconV2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final SpotifyIconV2 d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterToggle{id=");
        sb.append(this.a);
        sb.append(", active=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a()) && this.b == bVar.b() && this.c.equals(bVar.c()) && this.d.equals(bVar.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
