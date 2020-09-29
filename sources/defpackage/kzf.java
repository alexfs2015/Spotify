package defpackage;

import android.content.Intent;

/* renamed from: kzf reason: default package */
abstract class kzf extends kzl {
    final int a;
    final ulz b;
    final ulz c;
    final ulz d;
    final ulz e;
    final ulw f;
    final Long g;
    final Long h;
    final Long i;
    final ulz j;
    final ulz k;
    final int l;
    final int m;
    final int n;
    final Intent o;
    final hct p;

    /* renamed from: kzf$a */
    static final class a extends defpackage.kzl.a {
        private Integer a;
        private ulz b;
        private ulz c;
        private ulz d;
        private ulz e;
        private ulw f;
        private Long g;
        private Long h;
        private Long i;
        private ulz j;
        private ulz k;
        private Integer l;
        private Integer m;
        private Integer n;
        private Intent o;
        private hct p;

        a() {
        }

        public final defpackage.kzl.a a(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kzl.a a(Intent intent) {
            this.o = intent;
            return this;
        }

        public final defpackage.kzl.a a(hct hct) {
            this.p = hct;
            return this;
        }

        public final defpackage.kzl.a a(Long l2) {
            this.g = l2;
            return this;
        }

        public final defpackage.kzl.a a(ulw ulw) {
            this.f = ulw;
            return this;
        }

        public final defpackage.kzl.a a(ulz ulz) {
            this.b = ulz;
            return this;
        }

        public final kzl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" layout");
                str = sb.toString();
            }
            if (this.l == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" positiveResultCode");
                str = sb2.toString();
            }
            if (this.m == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" secondaryPositiveResultCode");
                str = sb3.toString();
            }
            if (this.n == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" negativeResultCode");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                kzg kzg = new kzg(this.a.intValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o, this.p);
                return kzg;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.kzl.a b(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kzl.a b(Long l2) {
            this.h = l2;
            return this;
        }

        public final defpackage.kzl.a b(ulz ulz) {
            this.c = ulz;
            return this;
        }

        public final defpackage.kzl.a c(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kzl.a c(Long l2) {
            this.i = l2;
            return this;
        }

        public final defpackage.kzl.a c(ulz ulz) {
            this.d = ulz;
            return this;
        }

        public final defpackage.kzl.a d(int i2) {
            this.n = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kzl.a d(ulz ulz) {
            this.e = ulz;
            return this;
        }

        public final defpackage.kzl.a e(ulz ulz) {
            this.j = ulz;
            return this;
        }

        public final defpackage.kzl.a f(ulz ulz) {
            this.k = ulz;
            return this;
        }
    }

    kzf(int i2, ulz ulz, ulz ulz2, ulz ulz3, ulz ulz4, ulw ulw, Long l2, Long l3, Long l4, ulz ulz5, ulz ulz6, int i3, int i4, int i5, Intent intent, hct hct) {
        this.a = i2;
        this.b = ulz;
        this.c = ulz2;
        this.d = ulz3;
        this.e = ulz4;
        this.f = ulw;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = ulz5;
        this.k = ulz6;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = intent;
        this.p = hct;
    }

    public final int a() {
        return this.a;
    }

    public final ulz b() {
        return this.b;
    }

    public final ulz c() {
        return this.c;
    }

    public final ulz d() {
        return this.d;
    }

    public final ulz e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzl) {
            kzl kzl = (kzl) obj;
            if (this.a == kzl.a()) {
                ulz ulz = this.b;
                if (ulz != null ? ulz.equals(kzl.b()) : kzl.b() == null) {
                    ulz ulz2 = this.c;
                    if (ulz2 != null ? ulz2.equals(kzl.c()) : kzl.c() == null) {
                        ulz ulz3 = this.d;
                        if (ulz3 != null ? ulz3.equals(kzl.d()) : kzl.d() == null) {
                            ulz ulz4 = this.e;
                            if (ulz4 != null ? ulz4.equals(kzl.e()) : kzl.e() == null) {
                                ulw ulw = this.f;
                                if (ulw != null ? ulw.equals(kzl.f()) : kzl.f() == null) {
                                    Long l2 = this.g;
                                    if (l2 != null ? l2.equals(kzl.g()) : kzl.g() == null) {
                                        Long l3 = this.h;
                                        if (l3 != null ? l3.equals(kzl.h()) : kzl.h() == null) {
                                            Long l4 = this.i;
                                            if (l4 != null ? l4.equals(kzl.i()) : kzl.i() == null) {
                                                ulz ulz5 = this.j;
                                                if (ulz5 != null ? ulz5.equals(kzl.j()) : kzl.j() == null) {
                                                    ulz ulz6 = this.k;
                                                    if (ulz6 != null ? ulz6.equals(kzl.k()) : kzl.k() == null) {
                                                        if (this.l == kzl.l() && this.m == kzl.m() && this.n == kzl.n()) {
                                                            Intent intent = this.o;
                                                            if (intent != null ? intent.equals(kzl.o()) : kzl.o() == null) {
                                                                hct hct = this.p;
                                                                return hct != null ? hct.equals(kzl.p()) : kzl.p() == null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final ulw f() {
        return this.f;
    }

    public final Long g() {
        return this.g;
    }

    public final Long h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        ulz ulz = this.b;
        int i3 = 0;
        int hashCode = (i2 ^ (ulz == null ? 0 : ulz.hashCode())) * 1000003;
        ulz ulz2 = this.c;
        int hashCode2 = (hashCode ^ (ulz2 == null ? 0 : ulz2.hashCode())) * 1000003;
        ulz ulz3 = this.d;
        int hashCode3 = (hashCode2 ^ (ulz3 == null ? 0 : ulz3.hashCode())) * 1000003;
        ulz ulz4 = this.e;
        int hashCode4 = (hashCode3 ^ (ulz4 == null ? 0 : ulz4.hashCode())) * 1000003;
        ulw ulw = this.f;
        int hashCode5 = (hashCode4 ^ (ulw == null ? 0 : ulw.hashCode())) * 1000003;
        Long l2 = this.g;
        int hashCode6 = (hashCode5 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.h;
        int hashCode7 = (hashCode6 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.i;
        int hashCode8 = (hashCode7 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        ulz ulz5 = this.j;
        int hashCode9 = (hashCode8 ^ (ulz5 == null ? 0 : ulz5.hashCode())) * 1000003;
        ulz ulz6 = this.k;
        int hashCode10 = (((((((hashCode9 ^ (ulz6 == null ? 0 : ulz6.hashCode())) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003;
        Intent intent = this.o;
        int hashCode11 = (hashCode10 ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        hct hct = this.p;
        if (hct != null) {
            i3 = hct.hashCode();
        }
        return hashCode11 ^ i3;
    }

    public final Long i() {
        return this.i;
    }

    public final ulz j() {
        return this.j;
    }

    public final ulz k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final Intent o() {
        return this.o;
    }

    public final hct p() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CappedOndemandDialogV2ViewModel{layout=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", loadingTitle=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", backgroundImage=");
        sb.append(this.f);
        sb.append(", startCountDown=");
        sb.append(this.g);
        sb.append(", displayActionAfter=");
        sb.append(this.h);
        sb.append(", cancellationPolicyDuration=");
        sb.append(this.i);
        sb.append(", positiveAction=");
        sb.append(this.j);
        sb.append(", secondaryPositiveAction=");
        sb.append(this.k);
        sb.append(", positiveResultCode=");
        sb.append(this.l);
        sb.append(", secondaryPositiveResultCode=");
        sb.append(this.m);
        sb.append(", negativeResultCode=");
        sb.append(this.n);
        sb.append(", intentToPreview=");
        sb.append(this.o);
        sb.append(", playCommandModel=");
        sb.append(this.p);
        sb.append("}");
        return sb.toString();
    }
}
