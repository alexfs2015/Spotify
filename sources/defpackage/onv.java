package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;

/* renamed from: onv reason: default package */
final class onv extends ooh {
    private final boolean b;
    private final AllSongsConfiguration c;
    private final ooi d;

    /* renamed from: onv$a */
    static final class a implements defpackage.ooh.a {
        private Boolean a;
        private AllSongsConfiguration b;
        private ooi c;

        a() {
        }

        private a(ooh ooh) {
            this.a = Boolean.valueOf(ooh.a());
            this.b = ooh.b();
            this.c = ooh.c();
        }

        /* synthetic */ a(ooh ooh, byte b2) {
            this(ooh);
        }

        public final defpackage.ooh.a a(AllSongsConfiguration allSongsConfiguration) {
            if (allSongsConfiguration != null) {
                this.b = allSongsConfiguration;
                return this;
            }
            throw new NullPointerException("Null allSongsConfiguration");
        }

        public final defpackage.ooh.a a(ooi ooi) {
            if (ooi != null) {
                this.c = ooi;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.ooh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ooh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" openNpvWhenStartingPlaybackViaPlayButton");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" allSongsConfiguration");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playButtonBehavior");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new onv(this.a.booleanValue(), this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private onv(boolean z, AllSongsConfiguration allSongsConfiguration, ooi ooi) {
        this.b = z;
        this.c = allSongsConfiguration;
        this.d = ooi;
    }

    /* synthetic */ onv(boolean z, AllSongsConfiguration allSongsConfiguration, ooi ooi, byte b2) {
        this(z, allSongsConfiguration, ooi);
    }

    public final boolean a() {
        return this.b;
    }

    public final AllSongsConfiguration b() {
        return this.c;
    }

    public final ooi c() {
        return this.d;
    }

    public final defpackage.ooh.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ooh) {
            ooh ooh = (ooh) obj;
            return this.b == ooh.a() && this.c.equals(ooh.b()) && this.d.equals(ooh.c());
        }
    }

    public final int hashCode() {
        return (((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayAndEditButtonConfiguration{openNpvWhenStartingPlaybackViaPlayButton=");
        sb.append(this.b);
        sb.append(", allSongsConfiguration=");
        sb.append(this.c);
        sb.append(", playButtonBehavior=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
