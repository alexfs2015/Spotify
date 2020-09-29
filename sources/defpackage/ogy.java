package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;

/* renamed from: ogy reason: default package */
final class ogy extends ohl {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final AllSongsConfiguration j;
    private final boolean k;

    /* renamed from: ogy$a */
    static final class a implements defpackage.ohl.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private AllSongsConfiguration i;
        private Boolean j;

        /* synthetic */ a(ohl ohl, byte b2) {
            this(ohl);
        }

        a() {
        }

        private a(ohl ohl) {
            this.a = Boolean.valueOf(ohl.a());
            this.b = Boolean.valueOf(ohl.b());
            this.c = Boolean.valueOf(ohl.c());
            this.d = Boolean.valueOf(ohl.d());
            this.e = Boolean.valueOf(ohl.e());
            this.f = Boolean.valueOf(ohl.f());
            this.g = Boolean.valueOf(ohl.g());
            this.h = Boolean.valueOf(ohl.h());
            this.i = ohl.i();
            this.j = Boolean.valueOf(ohl.j());
        }

        public final defpackage.ohl.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a b(boolean z) {
            this.b = Boolean.FALSE;
            return this;
        }

        public final defpackage.ohl.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohl.a a(AllSongsConfiguration allSongsConfiguration) {
            if (allSongsConfiguration != null) {
                this.i = allSongsConfiguration;
                return this;
            }
            throw new NullPointerException("Null allSongsConfiguration");
        }

        public final defpackage.ohl.a i(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final ohl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" allowAutoPlay");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" allowAutoPlayTrack");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" allowAutoPlayEpisode");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" openNpvWhenStartingPlaybackOfNonVideoItem");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" openNpvWhenStartingPlaybackOfVideoItem");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showNumbers");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" shouldShuffleTrackCloud");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" showOnlySongs");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" allSongsConfiguration");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" shouldShowReachedCapDialogInsteadAllSongsNavigates");
                str = sb10.toString();
            }
            if (str.isEmpty()) {
                ogy ogy = new ogy(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j.booleanValue(), 0);
                return ogy;
            }
            StringBuilder sb11 = new StringBuilder("Missing required properties:");
            sb11.append(str);
            throw new IllegalStateException(sb11.toString());
        }
    }

    /* synthetic */ ogy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, AllSongsConfiguration allSongsConfiguration, boolean z9, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, allSongsConfiguration, z9);
    }

    private ogy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, AllSongsConfiguration allSongsConfiguration, boolean z9) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = allSongsConfiguration;
        this.k = z9;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final AllSongsConfiguration i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackCloudConfiguration{allowAutoPlay=");
        sb.append(this.b);
        sb.append(", allowAutoPlayTrack=");
        sb.append(this.c);
        sb.append(", allowAutoPlayEpisode=");
        sb.append(this.d);
        sb.append(", openNpvWhenStartingPlaybackOfNonVideoItem=");
        sb.append(this.e);
        sb.append(", openNpvWhenStartingPlaybackOfVideoItem=");
        sb.append(this.f);
        sb.append(", showNumbers=");
        sb.append(this.g);
        sb.append(", shouldShuffleTrackCloud=");
        sb.append(this.h);
        sb.append(", showOnlySongs=");
        sb.append(this.i);
        sb.append(", allSongsConfiguration=");
        sb.append(this.j);
        sb.append(", shouldShowReachedCapDialogInsteadAllSongsNavigates=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohl) {
            ohl ohl = (ohl) obj;
            return this.b == ohl.a() && this.c == ohl.b() && this.d == ohl.c() && this.e == ohl.d() && this.f == ohl.e() && this.g == ohl.f() && this.h == ohl.g() && this.i == ohl.h() && this.j.equals(ohl.i()) && this.k == ohl.j();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ this.j.hashCode()) * 1000003;
        if (!this.k) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final defpackage.ohl.a k() {
        return new a(this, 0);
    }
}
