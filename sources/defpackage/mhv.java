package defpackage;

import com.google.common.base.Optional;

/* renamed from: mhv reason: default package */
final class mhv extends defpackage.mhx.a {
    private final irf a;
    private final boolean b;
    private final Optional<Boolean> c;

    /* renamed from: mhv$a */
    static final class a implements C0055a {
        private irf a;
        private Boolean b;
        private Optional<Boolean> c;

        a() {
            this.c = Optional.e();
        }

        private a(defpackage.mhx.a aVar) {
            this.c = Optional.e();
            this.a = aVar.a();
            this.b = Boolean.valueOf(aVar.b());
            this.c = aVar.c();
        }

        /* synthetic */ a(defpackage.mhx.a aVar, byte b2) {
            this(aVar);
        }

        public final C0055a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null areAllTracksSavedToCollection");
        }

        public final C0055a a(irf irf) {
            if (irf != null) {
                this.a = irf;
                return this;
            }
            throw new NullPointerException("Null albumEntity");
        }

        public final C0055a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mhx.a a() {
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
                return new mhv(this.a, this.b.booleanValue(), this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private mhv(irf irf, boolean z, Optional<Boolean> optional) {
        this.a = irf;
        this.b = z;
        this.c = optional;
    }

    /* synthetic */ mhv(irf irf, boolean z, Optional optional, byte b2) {
        this(irf, z, optional);
    }

    public final irf a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Optional<Boolean> c() {
        return this.c;
    }

    public final C0055a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mhx.a) {
            defpackage.mhx.a aVar = (defpackage.mhx.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b() && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
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
}
