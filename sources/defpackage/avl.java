package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: avl reason: default package */
public final class avl implements avp {
    private static final byte[] c = {73, 68, 51};
    long a;
    long b;
    private final boolean d;
    private final bdz e;
    private final bea f;
    private final String g;
    private String h;
    private atu i;
    private atu j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private atu u;
    private long v;

    public avl(boolean z) {
        this(true, null);
    }

    public avl(boolean z, String str) {
        this.e = new bdz(new byte[7]);
        this.f = new bea(Arrays.copyOf(c, 10));
        d();
        this.p = -1;
        this.q = -1;
        this.a = -9223372036854775807L;
        this.d = z;
        this.g = str;
    }

    private void a(atu atu, long j2, int i2, int i3) {
        this.k = 4;
        this.l = i2;
        this.u = atu;
        this.v = j2;
        this.t = i3;
    }

    private static boolean a(byte b2, byte b3) {
        return a((int) ((b2 & 255) << 8) | (b3 & 255));
    }

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    private boolean a(bea bea, int i2) {
        bea.c(i2 + 1);
        if (!b(bea, this.e.a, 1)) {
            return false;
        }
        this.e.a(4);
        int c2 = this.e.c(1);
        int i3 = this.p;
        if (i3 != -1 && c2 != i3) {
            return false;
        }
        if (this.q != -1) {
            if (!b(bea, this.e.a, 1)) {
                return true;
            }
            this.e.a(2);
            if (this.e.c(4) != this.q) {
                return false;
            }
            bea.c(i2 + 2);
        }
        if (!b(bea, this.e.a, 4)) {
            return true;
        }
        this.e.a(14);
        int c3 = this.e.c(13);
        if (c3 <= 6) {
            return false;
        }
        int i4 = i2 + c3;
        int i5 = i4 + 1;
        if (i5 >= bea.c) {
            return true;
        }
        return a(bea.a[i4], bea.a[i5]) && (this.p == -1 || ((bea.a[i5] & 8) >> 3) == c2);
    }

    private boolean a(bea bea, byte[] bArr, int i2) {
        int min = Math.min(bea.b(), i2 - this.l);
        bea.a(bArr, this.l, min);
        this.l += min;
        return this.l == i2;
    }

    private void b(bea bea) {
        byte[] bArr = bea.a;
        int i2 = bea.b;
        int i3 = bea.c;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2] & 255;
            if (this.m != 512 || !a(-1, (byte) b2) || (!this.o && !a(bea, i4 - 2))) {
                int i5 = this.m;
                byte b3 = b2 | i5;
                if (b3 == 329) {
                    this.m = 768;
                } else if (b3 == 511) {
                    this.m = 512;
                } else if (b3 == 836) {
                    this.m = 1024;
                } else if (b3 == 1075) {
                    e();
                    bea.c(i4);
                    return;
                } else if (i5 != 256) {
                    this.m = 256;
                    i4--;
                }
                i2 = i4;
            } else {
                this.r = (b2 & 8) >> 3;
                boolean z = true;
                if ((b2 & 1) != 0) {
                    z = false;
                }
                this.n = z;
                if (!this.o) {
                    g();
                } else {
                    f();
                }
                bea.c(i4);
                return;
            }
        }
        bea.c(i2);
    }

    private static boolean b(bea bea, byte[] bArr, int i2) {
        if (bea.b() < i2) {
            return false;
        }
        bea.a(bArr, 0, i2);
        return true;
    }

    private void c(bea bea) {
        if (bea.b() != 0) {
            this.e.a[0] = bea.a[bea.b];
            this.e.a(2);
            int c2 = this.e.c(4);
            int i2 = this.q;
            if (i2 == -1 || c2 == i2) {
                if (!this.o) {
                    this.o = true;
                    this.p = this.r;
                    this.q = c2;
                }
                f();
                return;
            }
            c();
        }
    }

    private void d() {
        this.k = 0;
        this.l = 0;
        this.m = 256;
    }

    private void d(bea bea) {
        int min = Math.min(bea.b(), this.t - this.l);
        this.u.a(bea, min);
        this.l += min;
        int i2 = this.l;
        int i3 = this.t;
        if (i2 == i3) {
            this.u.a(this.b, 1, i3, 0, null);
            this.b += this.v;
            d();
        }
    }

    private void e() {
        this.k = 2;
        this.l = 3;
        this.t = 0;
        this.f.c(0);
    }

    private void f() {
        this.k = 3;
        this.l = 0;
    }

    private void g() {
        this.k = 1;
        this.l = 0;
    }

    private void h() {
        this.j.a(this.f, 10);
        this.f.c(6);
        a(this.j, 0, 10, this.f.m() + 10);
    }

    private void i() {
        this.e.a(0);
        if (!this.s) {
            int c2 = this.e.c(2) + 1;
            if (c2 != 2) {
                StringBuilder sb = new StringBuilder("Detected audio object type: ");
                sb.append(c2);
                sb.append(", but assuming AAC LC.");
                bdu.c("AdtsReader", sb.toString());
                c2 = 2;
            }
            this.e.b(5);
            byte[] a2 = bdo.a(c2, this.q, this.e.c(3));
            Pair a3 = bdo.a(a2);
            aqv a4 = aqv.a(this.h, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), Collections.singletonList(a2), (ast) null, 0, this.g);
            this.a = 1024000000 / ((long) a4.r);
            this.i.a(a4);
            this.s = true;
        } else {
            this.e.b(10);
        }
        this.e.b(4);
        int c3 = (this.e.c(13) - 2) - 5;
        if (this.n) {
            c3 -= 2;
        }
        int i2 = c3;
        a(this.i, this.a, 0, i2);
    }

    public final void a() {
        c();
    }

    public final void a(long j2, boolean z) {
        this.b = j2;
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.h = dVar.c();
        this.i = atm.a(dVar.b(), 1);
        if (this.d) {
            dVar.a();
            this.j = atm.a(dVar.b(), 4);
            this.j.a(aqv.a(dVar.c(), "application/id3", (String) null, -1, (ast) null));
            return;
        }
        this.j = new atj();
    }

    public final void a(bea bea) {
        while (bea.b() > 0) {
            int i2 = this.k;
            if (i2 == 0) {
                b(bea);
            } else if (i2 == 1) {
                c(bea);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (a(bea, this.e.a, this.n ? 7 : 5)) {
                        i();
                    }
                } else if (i2 == 4) {
                    d(bea);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(bea, this.f.a, 10)) {
                h();
            }
        }
    }

    public final void b() {
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.o = false;
        d();
    }
}
