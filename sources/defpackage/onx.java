package defpackage;

import com.google.common.base.Optional;

/* renamed from: onx reason: default package */
final class onx extends ooj {
    private final Optional<Boolean> b;
    private final Optional<Boolean> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    /* renamed from: onx$a */
    static final class a implements defpackage.ooj.a {
        private Optional<Boolean> a;
        private Optional<Boolean> b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(ooj ooj) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = ooj.a();
            this.b = ooj.b();
            this.c = Boolean.valueOf(ooj.c());
            this.d = Boolean.valueOf(ooj.d());
            this.e = Boolean.valueOf(ooj.e());
            this.f = Boolean.valueOf(ooj.f());
        }

        /* synthetic */ a(ooj ooj, byte b2) {
            this(ooj);
        }

        public final defpackage.ooj.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null shuffle");
        }

        public final defpackage.ooj.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final ooj a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" useWeightedShuffle");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" jumpInOnDemandInFree");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" suppressResumePoints");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" allowToStartPlaybackFromItemInShuffleOnlyContext");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                onx onx = new onx(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return onx;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.ooj.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null repeat");
        }

        public final defpackage.ooj.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ooj.a c(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final defpackage.ooj.a d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    private onx(Optional<Boolean> optional, Optional<Boolean> optional2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = optional;
        this.c = optional2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    /* synthetic */ onx(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(optional, optional2, z, z2, z3, z4);
    }

    public final Optional<Boolean> a() {
        return this.b;
    }

    public final Optional<Boolean> b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ooj) {
            ooj ooj = (ooj) obj;
            return this.b.equals(ooj.a()) && this.c.equals(ooj.b()) && this.d == ooj.c() && this.e == ooj.d() && this.f == ooj.e() && this.g == ooj.f();
        }
    }

    public final boolean f() {
        return this.g;
    }

    public final defpackage.ooj.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerConfiguration{shuffle=");
        sb.append(this.b);
        sb.append(", repeat=");
        sb.append(this.c);
        sb.append(", useWeightedShuffle=");
        sb.append(this.d);
        sb.append(", jumpInOnDemandInFree=");
        sb.append(this.e);
        sb.append(", suppressResumePoints=");
        sb.append(this.f);
        sb.append(", allowToStartPlaybackFromItemInShuffleOnlyContext=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
