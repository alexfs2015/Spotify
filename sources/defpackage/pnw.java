package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pnw reason: default package */
abstract class pnw extends pod {
    final BannerMessage a;
    final prk b;
    final boolean c;
    final long d;

    /* renamed from: pnw$a */
    static final class a implements defpackage.pod.a {
        BannerMessage a;
        private prk b;
        private Boolean c;
        private Long d;

        /* synthetic */ a(pod pod, byte b2) {
            this(pod);
        }

        a() {
        }

        private a(pod pod) {
            this.a = pod.a();
            this.b = pod.b();
            this.c = Boolean.valueOf(pod.c());
            this.d = Long.valueOf(pod.d());
        }

        public final defpackage.pod.a a(prk prk) {
            if (prk != null) {
                this.b = prk;
                return this;
            }
            throw new NullPointerException("Null trigger");
        }

        public final defpackage.pod.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.pod.a a(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final pod a() {
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
                pny pny = new pny(this.a, this.b, this.c.booleanValue(), this.d.longValue());
                return pny;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    pnw(BannerMessage bannerMessage, prk prk, boolean z, long j) {
        if (bannerMessage != null) {
            this.a = bannerMessage;
            if (prk != null) {
                this.b = prk;
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

    public final prk b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pod) {
            pod pod = (pod) obj;
            return this.a.equals(pod.a()) && this.b.equals(pod.b()) && this.c == pod.c() && this.d == pod.d();
        }
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final defpackage.pod.a e() {
        return new a(this, 0);
    }
}
