package defpackage;

/* renamed from: bds reason: default package */
public final class bds {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    private int e;
    private int f;
    private int g;
    private int h;

    public bds(byte[] bArr, int i) {
        bdz bdz = new bdz(bArr);
        bdz.a(136);
        this.e = bdz.c(16);
        this.f = bdz.c(16);
        this.g = bdz.c(24);
        this.h = bdz.c(24);
        this.a = bdz.c(20);
        this.b = bdz.c(3) + 1;
        this.c = bdz.c(5) + 1;
        this.d = (((long) bdz.c(32)) & 4294967295L) | ((((long) bdz.c(4)) & 15) << 32);
    }
}
