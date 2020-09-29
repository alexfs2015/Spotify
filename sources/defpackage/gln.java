package defpackage;

import java.util.Date;

/* renamed from: gln reason: default package */
final class gln extends glr {
    private final int a;
    private final int b;
    private final Date c;
    private final boolean d;
    private final boolean e;

    /* renamed from: gln$a */
    public static final class a extends defpackage.glr.a {
        private Integer a;
        private Integer b;
        private Date c;
        private Boolean d;
        private Boolean e;

        public final defpackage.glr.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.glr.a a(Date date) {
            this.c = date;
            return this;
        }

        public final defpackage.glr.a a(boolean z) {
            this.d = Boolean.FALSE;
            return this;
        }

        public final glr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" lengthInSeconds");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" timeLeftInSeconds");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" publicationDate");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" currentlyPlaying");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" fullyPlayed");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                gln gln = new gln(this.a.intValue(), this.b.intValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), 0);
                return gln;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.glr.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.glr.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    private gln(int i, int i2, Date date, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = date;
        this.d = z;
        this.e = z2;
    }

    /* synthetic */ gln(int i, int i2, Date date, boolean z, boolean z2, byte b2) {
        this(i, i2, date, z, z2);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Date c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glr) {
            glr glr = (glr) obj;
            return this.a == glr.a() && this.b == glr.b() && this.c.equals(glr.c()) && this.d == glr.d() && this.e == glr.e();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastEpisodeSubtitleInformation{lengthInSeconds=");
        sb.append(this.a);
        sb.append(", timeLeftInSeconds=");
        sb.append(this.b);
        sb.append(", publicationDate=");
        sb.append(this.c);
        sb.append(", currentlyPlaying=");
        sb.append(this.d);
        sb.append(", fullyPlayed=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
