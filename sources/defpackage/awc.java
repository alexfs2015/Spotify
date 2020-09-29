package defpackage;

/* renamed from: awc reason: default package */
public final class awc implements awi {
    private final awb a;
    private final bea b = new bea(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public awc(awb awb) {
        this.a = awb;
    }

    public final void a() {
        this.f = true;
    }

    public final void a(bea bea, boolean z) {
        int c2 = z ? bea.c() + bea.b : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                bea.c(c2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (bea.b() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int c3 = bea.c();
                    bea.c(bea.b - 1);
                    if (c3 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(bea.b(), 3 - this.d);
                bea.a(this.b.a, this.d, min);
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
                int min2 = Math.min(bea.b(), this.c - this.d);
                bea.a(this.b.a, this.d, min2);
                this.d += min2;
                int i2 = this.d;
                int i3 = this.c;
                if (i2 != i3) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.a(i3);
                    } else if (ben.a(this.b.a, 0, this.c, -1) != 0) {
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

    public final void a(bek bek, atm atm, d dVar) {
        this.a.a(bek, atm, dVar);
        this.f = true;
    }
}
