package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pws reason: default package */
abstract class pws extends pwz {
    final BannerMessage a;
    final qag b;
    final boolean c;
    final long d;

    /* renamed from: pws$a */
    static final class a implements defpackage.pwz.a {
        BannerMessage a;
        private qag b;
        private Boolean c;
        private Long d;

        a() {
        }

        private a(pwz pwz) {
            this.a = pwz.a();
            this.b = pwz.b();
            this.c = Boolean.valueOf(pwz.c());
            this.d = Long.valueOf(pwz.d());
        }

        /* synthetic */ a(pwz pwz, byte b2) {
            this(pwz);
        }

        public final defpackage.pwz.a a(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final defpackage.pwz.a a(qag qag) {
            if (qag != null) {
                this.b = qag;
                return this;
            }
            throw new NullPointerException("Null trigger");
        }

        public final defpackage.pwz.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final pwz a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" bannerMessage");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trigger");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" hasLoggedPresentation");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" timeMessageReceived");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                pwu pwu = new pwu(this.a, this.b, this.c.booleanValue(), this.d.longValue());
                return pwu;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    pws(BannerMessage bannerMessage, qag qag, boolean z, long j) {
        if (bannerMessage != null) {
            this.a = bannerMessage;
            if (qag != null) {
                this.b = qag;
                this.c = z;
                this.d = j;
                return;
            }
            throw new NullPointerException("Null trigger");
        }
        throw new NullPointerException("Null bannerMessage");
    }

    public final BannerMessage a() {
        return this.a;
    }

    public final qag b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final defpackage.pwz.a e() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwz) {
            pwz pwz = (pwz) obj;
            return this.a.equals(pwz.a()) && this.b.equals(pwz.b()) && this.c == pwz.c() && this.d == pwz.d();
        }
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerPresentationModel{bannerMessage=");
        sb.append(this.a);
        sb.append(", trigger=");
        sb.append(this.b);
        sb.append(", hasLoggedPresentation=");
        sb.append(this.c);
        sb.append(", timeMessageReceived=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
