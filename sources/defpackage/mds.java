package defpackage;

import com.google.common.base.Optional;

/* renamed from: mds reason: default package */
final class mds extends defpackage.mdu.a {
    private final ios a;
    private final boolean b;
    private final Optional<Boolean> c;

    /* renamed from: mds$a */
    static final class a implements C0054a {
        private ios a;
        private Boolean b;
        private Optional<Boolean> c;

        /* synthetic */ a(defpackage.mdu.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.c = Optional.e();
        }

        private a(defpackage.mdu.a aVar) {
            this.c = Optional.e();
            this.a = aVar.a();
            this.b = Boolean.valueOf(aVar.b());
            this.c = aVar.c();
        }

        public final C0054a a(ios ios) {
            if (ios != null) {
                this.a = ios;
                return this;
            }
            throw new NullPointerException("Null albumEntity");
        }

        public final C0054a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final C0054a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null areAllTracksSavedToCollection");
        }

        public final defpackage.mdu.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" albumEntity");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isOnline");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mds(this.a, this.b.booleanValue(), this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ mds(ios ios, boolean z, Optional optional, byte b2) {
        this(ios, z, optional);
    }

    private mds(ios ios, boolean z, Optional<Boolean> optional) {
        this.a = ios;
        this.b = z;
        this.c = optional;
    }

    public final ios a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Optional<Boolean> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{albumEntity=");
        sb.append(this.a);
        sb.append(", isOnline=");
        sb.append(this.b);
        sb.append(", areAllTracksSavedToCollection=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mdu.a) {
            defpackage.mdu.a aVar = (defpackage.mdu.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b() && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public final C0054a d() {
        return new a(this, 0);
    }
}
