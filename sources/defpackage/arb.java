package defpackage;

/* renamed from: arb reason: default package */
final class arb {
    public static final a a = new a(new Object());
    public final arl b;
    public final Object c;
    public final a d;
    public final long e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ayo i;
    public final bbx j;
    public final a k;
    public volatile long l;
    public volatile long m;
    public volatile long n;

    public arb(arl arl, Object obj, a aVar, long j2, long j3, int i2, boolean z, ayo ayo, bbx bbx, a aVar2, long j4, long j5, long j6) {
        this.b = arl;
        this.c = obj;
        this.d = aVar;
        this.e = j2;
        this.f = j3;
        this.g = i2;
        this.h = z;
        this.i = ayo;
        this.j = bbx;
        this.k = aVar2;
        this.l = j4;
        this.m = j5;
        this.n = j6;
    }

    public static arb a(long j2, bbx bbx) {
        bbx bbx2 = bbx;
        arb arb = new arb(arl.a, null, a, j2, -9223372036854775807L, 1, false, ayo.a, bbx2, a, j2, 0, j2);
        return arb;
    }

    public final arb a(int i2) {
        int i3 = i2;
        arb arb = new arb(this.b, this.c, this.d, this.e, this.f, i3, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        return arb;
    }

    public final arb a(a aVar) {
        a aVar2 = aVar;
        arb arb = new arb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar2, this.l, this.m, this.n);
        return arb;
    }

    public final arb a(a aVar, long j2, long j3) {
        arb arb = new arb(this.b, this.c, aVar, j2, aVar.a() ? j3 : -9223372036854775807L, this.g, this.h, this.i, this.j, aVar, j2, 0, j2);
        return arb;
    }

    public final arb a(ayo ayo, bbx bbx) {
        ayo ayo2 = ayo;
        bbx bbx2 = bbx;
        arb arb = new arb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ayo2, bbx2, this.k, this.l, this.m, this.n);
        return arb;
    }

    public final arb a(boolean z) {
        boolean z2 = z;
        arb arb = new arb(this.b, this.c, this.d, this.e, this.f, this.g, z2, this.i, this.j, this.k, this.l, this.m, this.n);
        return arb;
    }
}
