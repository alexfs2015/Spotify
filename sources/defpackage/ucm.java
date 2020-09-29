package defpackage;

/* renamed from: ucm reason: default package */
final class ucm extends ucq {
    private final uax a;
    private final boolean b;
    private final boolean c;

    /* renamed from: ucm$a */
    static final class a extends defpackage.ucq.a {
        private uax a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(ucq ucq, byte b2) {
            this(ucq);
        }

        a() {
        }

        private a(ucq ucq) {
            this.a = ucq.a();
            this.b = Boolean.valueOf(ucq.b());
            this.c = Boolean.valueOf(ucq.c());
        }

        public final defpackage.ucq.a a(uax uax) {
            if (uax != null) {
                this.a = uax;
                return this;
            }
            throw new NullPointerException("Null socialListeningState");
        }

        public final defpackage.ucq.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucq.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final ucq a() {
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
                return new ucm(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ ucm(uax uax, boolean z, boolean z2, byte b2) {
        this(uax, z, z2);
    }

    private ucm(uax uax, boolean z, boolean z2) {
        this.a = uax;
        this.b = z;
        this.c = z2;
    }

    public final uax a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucq) {
            ucq ucq = (ucq) obj;
            return this.a.equals(ucq.a()) && this.b == ucq.b() && this.c == ucq.c();
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

    public final defpackage.ucq.a d() {
        return new a(this, 0);
    }
}
