package defpackage;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.Policy;

/* renamed from: vlv reason: default package */
final class vlv extends defpackage.vlx.a {
    private final Optional<Policy> a;
    private final Optional<way> b;
    private final Optional<vlw> c;
    private final Optional<Double> d;
    private final Optional<Integer> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<Integer> h;
    private final Optional<Boolean> i;
    private final Optional<Integer> j;
    private final int k;

    /* renamed from: vlv$a */
    public static final class a implements C0085a {
        private Optional<Policy> a = Optional.e();
        private Optional<way> b = Optional.e();
        private Optional<vlw> c = Optional.e();
        private Optional<Double> d = Optional.e();
        private Optional<Integer> e = Optional.e();
        private Optional<Boolean> f = Optional.e();
        private Optional<Boolean> g = Optional.e();
        private Optional<Integer> h = Optional.e();
        private Optional<Boolean> i = Optional.e();
        private Optional<Integer> j = Optional.e();
        private Integer k;

        public final C0085a a(int i2) {
            this.k = Integer.valueOf(500);
            return this;
        }

        public final C0085a a(Optional<Policy> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null policy");
        }

        public final defpackage.vlx.a a() {
            String str = "";
            if (this.k == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" updateThrottling");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                vlv vlv = new vlv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k.intValue(), 0);
                return vlv;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final C0085a b(Optional<way> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final C0085a c(Optional<vlw> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null range");
        }

        public final C0085a d(Optional<Double> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null relativeTimeLeftInPct");
        }

        public final C0085a e(Optional<Integer> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null absoluteTimeLeftInSec");
        }

        public final C0085a f(Optional<Boolean> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null isAvailable");
        }

        public final C0085a g(Optional<Boolean> optional) {
            if (optional != null) {
                this.g = optional;
                return this;
            }
            throw new NullPointerException("Null hasTimeLeft");
        }

        public final C0085a h(Optional<Integer> optional) {
            if (optional != null) {
                this.h = optional;
                return this;
            }
            throw new NullPointerException("Null timePlayedInSec");
        }

        public final C0085a i(Optional<Boolean> optional) {
            if (optional != null) {
                this.i = optional;
                return this;
            }
            throw new NullPointerException("Null isUnique");
        }

        public final C0085a j(Optional<Integer> optional) {
            if (optional != null) {
                this.j = optional;
                return this;
            }
            throw new NullPointerException("Null lastPlayedInDays");
        }
    }

    private vlv(Optional<Policy> optional, Optional<way> optional2, Optional<vlw> optional3, Optional<Double> optional4, Optional<Integer> optional5, Optional<Boolean> optional6, Optional<Boolean> optional7, Optional<Integer> optional8, Optional<Boolean> optional9, Optional<Integer> optional10, int i2) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = optional9;
        this.j = optional10;
        this.k = i2;
    }

    /* synthetic */ vlv(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, int i2, byte b2) {
        this(optional, optional2, optional3, optional4, optional5, optional6, optional7, optional8, optional9, optional10, i2);
    }

    public final Optional<Policy> a() {
        return this.a;
    }

    public final Optional<way> b() {
        return this.b;
    }

    public final Optional<vlw> c() {
        return this.c;
    }

    public final Optional<Double> d() {
        return this.d;
    }

    public final Optional<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlx.a) {
            defpackage.vlx.a aVar = (defpackage.vlx.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c()) && this.d.equals(aVar.d()) && this.e.equals(aVar.e()) && this.f.equals(aVar.f()) && this.g.equals(aVar.g()) && this.h.equals(aVar.h()) && this.i.equals(aVar.i()) && this.j.equals(aVar.j()) && this.k == aVar.k();
        }
    }

    public final Optional<Boolean> f() {
        return this.f;
    }

    public final Optional<Boolean> g() {
        return this.g;
    }

    public final Optional<Integer> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k;
    }

    public final Optional<Boolean> i() {
        return this.i;
    }

    public final Optional<Integer> j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{policy=");
        sb.append(this.a);
        sb.append(", sortOrder=");
        sb.append(this.b);
        sb.append(", range=");
        sb.append(this.c);
        sb.append(", relativeTimeLeftInPct=");
        sb.append(this.d);
        sb.append(", absoluteTimeLeftInSec=");
        sb.append(this.e);
        sb.append(", isAvailable=");
        sb.append(this.f);
        sb.append(", hasTimeLeft=");
        sb.append(this.g);
        sb.append(", timePlayedInSec=");
        sb.append(this.h);
        sb.append(", isUnique=");
        sb.append(this.i);
        sb.append(", lastPlayedInDays=");
        sb.append(this.j);
        sb.append(", updateThrottling=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }
}
