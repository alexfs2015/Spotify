package defpackage;

import com.google.common.base.Optional;

/* renamed from: ghx reason: default package */
final class ghx extends gib {
    private final Optional<Boolean> b;
    private final Optional<String> c;
    private final Optional<String> d;

    /* renamed from: ghx$a */
    static final class a extends defpackage.gib.a {
        private Optional<Boolean> a;
        private Optional<String> b;
        private Optional<String> c;

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
            this.c = Optional.e();
        }

        private a(gib gib) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.c = Optional.e();
            this.a = gib.a();
            this.b = gib.b();
            this.c = gib.c();
        }

        /* synthetic */ a(gib gib, byte b2) {
            this(gib);
        }

        public final defpackage.gib.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null isAllowedToSwitch");
        }

        public final gib a() {
            return new ghx(this.a, this.b, this.c, 0);
        }

        public final defpackage.gib.a b(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null deviceId");
        }

        public final defpackage.gib.a c(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null gaiaDeviceJson");
        }
    }

    private ghx(Optional<Boolean> optional, Optional<String> optional2, Optional<String> optional3) {
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    /* synthetic */ ghx(Optional optional, Optional optional2, Optional optional3, byte b2) {
        this(optional, optional2, optional3);
    }

    public final Optional<Boolean> a() {
        return this.b;
    }

    public final Optional<String> b() {
        return this.c;
    }

    public final Optional<String> c() {
        return this.d;
    }

    public final defpackage.gib.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gib) {
            gib gib = (gib) obj;
            return this.b.equals(gib.a()) && this.c.equals(gib.b()) && this.d.equals(gib.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeakerDeepLinkModel{isAllowedToSwitch=");
        sb.append(this.b);
        sb.append(", deviceId=");
        sb.append(this.c);
        sb.append(", gaiaDeviceJson=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
