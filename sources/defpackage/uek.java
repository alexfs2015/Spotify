package defpackage;

/* renamed from: uek reason: default package */
final class uek extends uem {
    private final Long b;
    private final Long c;
    private final Long d;

    /* renamed from: uek$a */
    static final class a implements defpackage.uem.a {
        private Long a;
        private Long b;
        private Long c;

        a() {
        }

        private a(uem uem) {
            this.a = uem.a();
            this.b = uem.b();
            this.c = uem.c();
        }

        /* synthetic */ a(uem uem, byte b2) {
            this(uem);
        }

        public final defpackage.uem.a a(Long l) {
            if (l != null) {
                this.a = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final uem a() {
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
                return new uek(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.uem.a b(Long l) {
            if (l != null) {
                this.b = l;
                return this;
            }
            throw new NullPointerException("Null duration");
        }

        public final defpackage.uem.a c(Long l) {
            if (l != null) {
                this.c = l;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }
    }

    private uek(Long l, Long l2, Long l3) {
        this.b = l;
        this.c = l2;
        this.d = l3;
    }

    /* synthetic */ uek(Long l, Long l2, Long l3, byte b2) {
        this(l, l2, l3);
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

    public final defpackage.uem.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uem) {
            uem uem = (uem) obj;
            return this.b.equals(uem.a()) && this.c.equals(uem.b()) && this.d.equals(uem.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
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
}
