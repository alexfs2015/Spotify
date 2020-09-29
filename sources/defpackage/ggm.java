package defpackage;

import com.google.common.base.Optional;

/* renamed from: ggm reason: default package */
final class ggm extends ggq {
    private final Optional<Boolean> b;
    private final Optional<String> c;
    private final Optional<String> d;

    /* renamed from: ggm$a */
    static final class a extends defpackage.ggq.a {
        private Optional<Boolean> a;
        private Optional<String> b;
        private Optional<String> c;

        /* synthetic */ a(ggq ggq, byte b2) {
            this(ggq);
        }

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
            this.c = Optional.e();
        }

        private a(ggq ggq) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.c = Optional.e();
            this.a = ggq.a();
            this.b = ggq.b();
            this.c = ggq.c();
        }

        public final defpackage.ggq.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null isAllowedToSwitch");
        }

        public final defpackage.ggq.a b(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null deviceId");
        }

        public final defpackage.ggq.a c(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null gaiaDeviceJson");
        }

        public final ggq a() {
            return new ggm(this.a, this.b, this.c, 0);
        }
    }

    /* synthetic */ ggm(Optional optional, Optional optional2, Optional optional3, byte b2) {
        this(optional, optional2, optional3);
    }

    private ggm(Optional<Boolean> optional, Optional<String> optional2, Optional<String> optional3) {
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggq) {
            ggq ggq = (ggq) obj;
            return this.b.equals(ggq.a()) && this.c.equals(ggq.b()) && this.d.equals(ggq.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.ggq.a d() {
        return new a(this, 0);
    }
}
