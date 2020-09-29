package defpackage;

/* renamed from: eqg reason: default package */
final class eqg {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final Long g;
    final Long h;
    final Long i;
    final Boolean j;

    eqg(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j2;
        long j7 = j3;
        long j8 = j5;
        bwx.a(str);
        bwx.a(str2);
        boolean z = true;
        bwx.b(j6 >= 0);
        bwx.b(j7 >= 0);
        if (j8 < 0) {
            z = false;
        }
        bwx.b(z);
        this.a = str;
        this.b = str2;
        this.c = j6;
        this.d = j7;
        this.e = j4;
        this.f = j8;
        this.g = l;
        this.h = l2;
        this.i = l3;
        this.j = bool;
    }

    /* access modifiers changed from: 0000 */
    public final eqg a(long j2) {
        eqg eqg = new eqg(this.a, this.b, this.c, this.d, j2, this.f, this.g, this.h, this.i, this.j);
        return eqg;
    }

    /* access modifiers changed from: 0000 */
    public final eqg a(long j2, long j3) {
        eqg eqg = new eqg(this.a, this.b, this.c, this.d, this.e, j2, Long.valueOf(j3), this.h, this.i, this.j);
        return eqg;
    }

    /* access modifiers changed from: 0000 */
    public final eqg a(Long l, Long l2, Boolean bool) {
        eqg eqg = new eqg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return eqg;
    }
}
