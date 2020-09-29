package defpackage;

/* renamed from: tsh reason: default package */
final class tsh extends tsj {
    private final Long b;
    private final Long c;
    private final Long d;

    /* renamed from: tsh$a */
    static final class a implements defpackage.tsj.a {
        private Long a;
        private Long b;
        private Long c;

        /* synthetic */ a(tsj tsj, byte b2) {
            this(tsj);
        }

        a() {
        }

        private a(tsj tsj) {
            this.a = tsj.a();
            this.b = tsj.b();
            this.c = tsj.c();
        }

        public final defpackage.tsj.a a(Long l) {
            if (l != null) {
                this.a = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final defpackage.tsj.a b(Long l) {
            if (l != null) {
                this.b = l;
                return this;
            }
            throw new NullPointerException("Null duration");
        }

        public final defpackage.tsj.a c(Long l) {
            if (l != null) {
                this.c = l;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        public final tsj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" position");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" duration");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timestamp");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new tsh(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ tsh(Long l, Long l2, Long l3, byte b2) {
        this(l, l2, l3);
    }

    private tsh(Long l, Long l2, Long l3) {
        this.b = l;
        this.c = l2;
        this.d = l3;
    }

    public final Long a() {
        return this.b;
    }

    public final Long b() {
        return this.c;
    }

    public final Long c() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastTrailerOverlayState{position=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tsj) {
            tsj tsj = (tsj) obj;
            return this.b.equals(tsj.a()) && this.c.equals(tsj.b()) && this.d.equals(tsj.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.tsj.a d() {
        return new a(this, 0);
    }
}
