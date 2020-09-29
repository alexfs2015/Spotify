package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;

/* renamed from: ogr reason: default package */
final class ogr extends ohd {
    private final boolean b;
    private final AllSongsConfiguration c;
    private final ohe d;

    /* renamed from: ogr$a */
    static final class a implements defpackage.ohd.a {
        private Boolean a;
        private AllSongsConfiguration b;
        private ohe c;

        /* synthetic */ a(ohd ohd, byte b2) {
            this(ohd);
        }

        a() {
        }

        private a(ohd ohd) {
            this.a = Boolean.valueOf(ohd.a());
            this.b = ohd.b();
            this.c = ohd.c();
        }

        public final defpackage.ohd.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohd.a a(AllSongsConfiguration allSongsConfiguration) {
            if (allSongsConfiguration != null) {
                this.b = allSongsConfiguration;
                return this;
            }
            throw new NullPointerException("Null allSongsConfiguration");
        }

        public final defpackage.ohd.a a(ohe ohe) {
            if (ohe != null) {
                this.c = ohe;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final ohd a() {
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
                return new ogr(this.a.booleanValue(), this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ ogr(boolean z, AllSongsConfiguration allSongsConfiguration, ohe ohe, byte b2) {
        this(z, allSongsConfiguration, ohe);
    }

    private ogr(boolean z, AllSongsConfiguration allSongsConfiguration, ohe ohe) {
        this.b = z;
        this.c = allSongsConfiguration;
        this.d = ohe;
    }

    public final boolean a() {
        return this.b;
    }

    public final AllSongsConfiguration b() {
        return this.c;
    }

    public final ohe c() {
        return this.d;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohd) {
            ohd ohd = (ohd) obj;
            return this.b == ohd.a() && this.c.equals(ohd.b()) && this.d.equals(ohd.c());
        }
    }

    public final int hashCode() {
        return (((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.ohd.a d() {
        return new a(this, 0);
    }
}
