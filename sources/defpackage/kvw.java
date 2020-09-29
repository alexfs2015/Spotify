package defpackage;

import android.content.Intent;

/* renamed from: kvw reason: default package */
abstract class kvw extends kwc {
    final int a;
    final tze b;
    final tze c;
    final tze d;
    final tze e;
    final tzb f;
    final Long g;
    final Long h;
    final Long i;
    final tze j;
    final tze k;
    final int l;
    final int m;
    final int n;
    final Intent o;
    final haa p;

    /* renamed from: kvw$a */
    static final class a extends defpackage.kwc.a {
        private Integer a;
        private tze b;
        private tze c;
        private tze d;
        private tze e;
        private tzb f;
        private Long g;
        private Long h;
        private Long i;
        private tze j;
        private tze k;
        private Integer l;
        private Integer m;
        private Integer n;
        private Intent o;
        private haa p;

        a() {
        }

        public final defpackage.kwc.a a(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kwc.a a(tze tze) {
            this.b = tze;
            return this;
        }

        public final defpackage.kwc.a b(tze tze) {
            this.c = tze;
            return this;
        }

        public final defpackage.kwc.a c(tze tze) {
            this.d = tze;
            return this;
        }

        public final defpackage.kwc.a d(tze tze) {
            this.e = tze;
            return this;
        }

        public final defpackage.kwc.a a(tzb tzb) {
            this.f = tzb;
            return this;
        }

        public final defpackage.kwc.a a(Long l2) {
            this.g = l2;
            return this;
        }

        public final defpackage.kwc.a b(Long l2) {
            this.h = l2;
            return this;
        }

        public final defpackage.kwc.a c(Long l2) {
            this.i = l2;
            return this;
        }

        public final defpackage.kwc.a e(tze tze) {
            this.j = tze;
            return this;
        }

        public final defpackage.kwc.a f(tze tze) {
            this.k = tze;
            return this;
        }

        public final defpackage.kwc.a b(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kwc.a c(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kwc.a d(int i2) {
            this.n = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.kwc.a a(Intent intent) {
            this.o = intent;
            return this;
        }

        public final defpackage.kwc.a a(haa haa) {
            this.p = haa;
            return this;
        }

        public final kwc a() {
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
                kvx kvx = new kvx(this.a.intValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o, this.p);
                return kvx;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    kvw(int i2, tze tze, tze tze2, tze tze3, tze tze4, tzb tzb, Long l2, Long l3, Long l4, tze tze5, tze tze6, int i3, int i4, int i5, Intent intent, haa haa) {
        this.a = i2;
        this.b = tze;
        this.c = tze2;
        this.d = tze3;
        this.e = tze4;
        this.f = tzb;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = tze5;
        this.k = tze6;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = intent;
        this.p = haa;
    }

    public final int a() {
        return this.a;
    }

    public final tze b() {
        return this.b;
    }

    public final tze c() {
        return this.c;
    }

    public final tze d() {
        return this.d;
    }

    public final tze e() {
        return this.e;
    }

    public final tzb f() {
        return this.f;
    }

    public final Long g() {
        return this.g;
    }

    public final Long h() {
        return this.h;
    }

    public final Long i() {
        return this.i;
    }

    public final tze j() {
        return this.j;
    }

    public final tze k() {
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

    public final haa p() {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwc) {
            kwc kwc = (kwc) obj;
            if (this.a == kwc.a()) {
                tze tze = this.b;
                if (tze != null ? tze.equals(kwc.b()) : kwc.b() == null) {
                    tze tze2 = this.c;
                    if (tze2 != null ? tze2.equals(kwc.c()) : kwc.c() == null) {
                        tze tze3 = this.d;
                        if (tze3 != null ? tze3.equals(kwc.d()) : kwc.d() == null) {
                            tze tze4 = this.e;
                            if (tze4 != null ? tze4.equals(kwc.e()) : kwc.e() == null) {
                                tzb tzb = this.f;
                                if (tzb != null ? tzb.equals(kwc.f()) : kwc.f() == null) {
                                    Long l2 = this.g;
                                    if (l2 != null ? l2.equals(kwc.g()) : kwc.g() == null) {
                                        Long l3 = this.h;
                                        if (l3 != null ? l3.equals(kwc.h()) : kwc.h() == null) {
                                            Long l4 = this.i;
                                            if (l4 != null ? l4.equals(kwc.i()) : kwc.i() == null) {
                                                tze tze5 = this.j;
                                                if (tze5 != null ? tze5.equals(kwc.j()) : kwc.j() == null) {
                                                    tze tze6 = this.k;
                                                    if (tze6 != null ? tze6.equals(kwc.k()) : kwc.k() == null) {
                                                        if (this.l == kwc.l() && this.m == kwc.m() && this.n == kwc.n()) {
                                                            Intent intent = this.o;
                                                            if (intent != null ? intent.equals(kwc.o()) : kwc.o() == null) {
                                                                haa haa = this.p;
                                                                return haa != null ? haa.equals(kwc.p()) : kwc.p() == null;
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

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        tze tze = this.b;
        int i3 = 0;
        int hashCode = (i2 ^ (tze == null ? 0 : tze.hashCode())) * 1000003;
        tze tze2 = this.c;
        int hashCode2 = (hashCode ^ (tze2 == null ? 0 : tze2.hashCode())) * 1000003;
        tze tze3 = this.d;
        int hashCode3 = (hashCode2 ^ (tze3 == null ? 0 : tze3.hashCode())) * 1000003;
        tze tze4 = this.e;
        int hashCode4 = (hashCode3 ^ (tze4 == null ? 0 : tze4.hashCode())) * 1000003;
        tzb tzb = this.f;
        int hashCode5 = (hashCode4 ^ (tzb == null ? 0 : tzb.hashCode())) * 1000003;
        Long l2 = this.g;
        int hashCode6 = (hashCode5 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.h;
        int hashCode7 = (hashCode6 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.i;
        int hashCode8 = (hashCode7 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        tze tze5 = this.j;
        int hashCode9 = (hashCode8 ^ (tze5 == null ? 0 : tze5.hashCode())) * 1000003;
        tze tze6 = this.k;
        int hashCode10 = (((((((hashCode9 ^ (tze6 == null ? 0 : tze6.hashCode())) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003;
        Intent intent = this.o;
        int hashCode11 = (hashCode10 ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        haa haa = this.p;
        if (haa != null) {
            i3 = haa.hashCode();
        }
        return hashCode11 ^ i3;
    }
}
