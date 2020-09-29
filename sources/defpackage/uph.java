package defpackage;

/* renamed from: uph reason: default package */
final class uph extends upl {
    private final uns a;
    private final boolean b;
    private final boolean c;

    /* renamed from: uph$a */
    static final class a extends defpackage.upl.a {
        private uns a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        private a(upl upl) {
            this.a = upl.a();
            this.b = Boolean.valueOf(upl.b());
            this.c = Boolean.valueOf(upl.c());
        }

        /* synthetic */ a(upl upl, byte b2) {
            this(upl);
        }

        public final defpackage.upl.a a(uns uns) {
            if (uns != null) {
                this.a = uns;
                return this;
            }
            throw new NullPointerException("Null socialListeningState");
        }

        public final defpackage.upl.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final upl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" socialListeningState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" hostEducationShown");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" participantEducationShown");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new uph(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.upl.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    private uph(uns uns, boolean z, boolean z2) {
        this.a = uns;
        this.b = z;
        this.c = z2;
    }

    /* synthetic */ uph(uns uns, boolean z, boolean z2, byte b2) {
        this(uns, z, z2);
    }

    public final uns a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final defpackage.upl.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof upl) {
            upl upl = (upl) obj;
            return this.a.equals(upl.a()) && this.b == upl.b() && this.c == upl.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsModel{socialListeningState=");
        sb.append(this.a);
        sb.append(", hostEducationShown=");
        sb.append(this.b);
        sb.append(", participantEducationShown=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
