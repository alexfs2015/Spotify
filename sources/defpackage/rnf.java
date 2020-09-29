package defpackage;

import com.google.common.base.Optional;

/* renamed from: rnf reason: default package */
final class rnf extends rnj {
    private final boolean b;
    private final Optional<rmx> c;

    /* renamed from: rnf$a */
    static final class a extends defpackage.rnj.a {
        private Boolean a;
        private Optional<rmx> b;

        a() {
            this.b = Optional.e();
        }

        private a(rnj rnj) {
            this.b = Optional.e();
            this.a = Boolean.valueOf(rnj.a());
            this.b = rnj.b();
        }

        /* synthetic */ a(rnj rnj, byte b2) {
            this(rnj);
        }

        public final defpackage.rnj.a a(Optional<rmx> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null profilePage");
        }

        public final defpackage.rnj.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final rnj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" connected");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new rnf(this.a.booleanValue(), this.b, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private rnf(boolean z, Optional<rmx> optional) {
        this.b = z;
        this.c = optional;
    }

    /* synthetic */ rnf(boolean z, Optional optional, byte b2) {
        this(z, optional);
    }

    public final boolean a() {
        return this.b;
    }

    public final Optional<rmx> b() {
        return this.c;
    }

    public final defpackage.rnj.a c() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rnj) {
            rnj rnj = (rnj) obj;
            return this.b == rnj.a() && this.c.equals(rnj.b());
        }
    }

    public final int hashCode() {
        return (((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeTierUserProfileModel{connected=");
        sb.append(this.b);
        sb.append(", profilePage=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
