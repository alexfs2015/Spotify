package defpackage;

/* renamed from: bdb reason: default package */
public final class bdb {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    private int e;
    private int f;
    private int g;
    private int h;

    public bdb(byte[] bArr, int i) {
        bdi bdi = new bdi(bArr);
        bdi.a(136);
        this.e = bdi.c(16);
        this.f = bdi.c(16);
        this.g = bdi.c(24);
        this.h = bdi.c(24);
        this.a = bdi.c(20);
        this.b = bdi.c(3) + 1;
        this.c = bdi.c(5) + 1;
        this.d = (((long) bdi.c(32)) & 4294967295L) | ((((long) bdi.c(4)) & 15) << 32);
    }
}
