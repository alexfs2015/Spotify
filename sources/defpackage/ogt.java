package defpackage;

import com.google.common.base.Optional;

/* renamed from: ogt reason: default package */
final class ogt extends ohf {
    private final Optional<Boolean> b;
    private final Optional<Boolean> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    /* renamed from: ogt$a */
    static final class a implements defpackage.ohf.a {
        private Optional<Boolean> a;
        private Optional<Boolean> b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        /* synthetic */ a(ohf ohf, byte b2) {
            this(ohf);
        }

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(ohf ohf) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = ohf.a();
            this.b = ohf.b();
            this.c = Boolean.valueOf(ohf.c());
            this.d = Boolean.valueOf(ohf.d());
            this.e = Boolean.valueOf(ohf.e());
            this.f = Boolean.valueOf(ohf.f());
        }

        public final defpackage.ohf.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null shuffle");
        }

        public final defpackage.ohf.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null repeat");
        }

        public final defpackage.ohf.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohf.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohf.a c(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final defpackage.ohf.a d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final ohf a() {
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
                ogt ogt = new ogt(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return ogt;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ ogt(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(optional, optional2, z, z2, z3, z4);
    }

    private ogt(Optional<Boolean> optional, Optional<Boolean> optional2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = optional;
        this.c = optional2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
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

    public final boolean f() {
        return this.g;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohf) {
            ohf ohf = (ohf) obj;
            return this.b.equals(ohf.a()) && this.c.equals(ohf.b()) && this.d == ohf.c() && this.e == ohf.d() && this.f == ohf.e() && this.g == ohf.f();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.ohf.a g() {
        return new a(this, 0);
    }
}
