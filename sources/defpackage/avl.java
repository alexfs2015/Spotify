package defpackage;

/* renamed from: avl reason: default package */
public final class avl implements avr {
    private final avk a;
    private final bdj b = new bdj(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public avl(avk avk) {
        this.a = avk;
    }

    public final void a(bdt bdt, asv asv, d dVar) {
        this.a.a(bdt, asv, dVar);
        this.f = true;
    }

    public final void a() {
        this.f = true;
    }

    public final void a(bdj bdj, boolean z) {
        int c2 = z ? bdj.c() + bdj.b : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                bdj.c(c2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (bdj.b() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int c3 = bdj.c();
                    bdj.c(bdj.b - 1);
                    if (c3 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(bdj.b(), 3 - this.d);
                bdj.a(this.b.a, this.d, min);
                this.d += min;
                if (this.d == 3) {
                    this.b.a(3);
                    this.b.d(1);
                    int c4 = this.b.c();
                    int c5 = this.b.c();
                    this.e = (c4 & 128) != 0;
                    this.c = (((c4 & 15) << 8) | c5) + 3;
                    if (this.b.a.length < this.c) {
                        byte[] bArr = this.b.a;
                        this.b.a(Math.min(4098, Math.max(this.c, bArr.length << 1)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(bdj.b(), this.c - this.d);
                bdj.a(this.b.a, this.d, min2);
                this.d += min2;
                int i2 = this.d;
                int i3 = this.c;
                if (i2 != i3) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.a(i3);
                    } else if (bdw.a(this.b.a, 0, this.c, -1) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.a(this.c - 4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
