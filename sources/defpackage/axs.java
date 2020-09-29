package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: axs reason: default package */
public final class axs implements atd {
    public final axr a = new axr();
    public boolean b;
    public b c;
    private final bbi d;
    private final int e;
    private final defpackage.axr.a f = new defpackage.axr.a();
    private final bdj g = new bdj(32);
    private a h = new a(0, this.e);
    private a i;
    private a j;
    private aqe k;
    private boolean l;
    private aqe m;
    private long n;
    private long o;

    /* renamed from: axs$a */
    static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public bbh d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public final void a(bbh bbh, a aVar) {
            this.d = bbh;
            this.e = aVar;
            this.c = true;
        }

        public final int a(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }

        public final a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }
    }

    /* renamed from: axs$b */
    public interface b {
        void h();
    }

    public axs(bbi bbi) {
        this.d = bbi;
        this.e = bbi.c();
        a aVar = this.h;
        this.i = aVar;
        this.j = aVar;
    }

    public final void a(boolean z) {
        this.a.a(z);
        a(this.h);
        this.h = new a(0, this.e);
        a aVar = this.h;
        this.i = aVar;
        this.j = aVar;
        this.o = 0;
        this.d.b();
    }

    public final void a(int i2) {
        this.a.d = i2;
    }

    public final void b(int i2) {
        this.o = this.a.a(i2);
        long j2 = this.o;
        if (j2 == 0 || j2 == this.h.a) {
            a(this.h);
            this.h = new a(this.o, this.e);
            a aVar = this.h;
            this.i = aVar;
            this.j = aVar;
            return;
        }
        a aVar2 = this.h;
        while (this.o > aVar2.b) {
            aVar2 = aVar2.e;
        }
        a aVar3 = aVar2.e;
        a(aVar3);
        aVar2.e = new a(aVar2.b, this.e);
        this.j = this.o == aVar2.b ? aVar2.e : aVar2;
        if (this.i == aVar3) {
            this.i = aVar2.e;
        }
    }

    public final int a() {
        return this.a.b;
    }

    public final int b() {
        axr axr = this.a;
        return axr.c() ? axr.a[axr.c(axr.c)] : axr.d;
    }

    public final void c() {
        this.a.g();
        this.i = this.h;
    }

    public final void a(long j2, boolean z, boolean z2) {
        c(this.a.b(j2, z, z2));
    }

    public final void d() {
        c(this.a.i());
    }

    public final int b(long j2, boolean z, boolean z2) {
        return this.a.a(j2, true, z2);
    }

    public final int a(aqf aqf, arv arv, boolean z, boolean z2, long j2) {
        int a2 = this.a.a(aqf, arv, z, z2, this.k, this.f);
        if (a2 == -5) {
            this.k = aqf.a;
            return -5;
        } else if (a2 == -4) {
            if (!arv.c()) {
                if (arv.d < j2) {
                    arv.a(Integer.MIN_VALUE);
                }
                if (arv.e()) {
                    a(arv, this.f);
                }
                arv.c(this.f.a);
                a(this.f.b, arv.c, this.f.a);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private void a(arv arv, defpackage.axr.a aVar) {
        int i2;
        arv arv2 = arv;
        defpackage.axr.a aVar2 = aVar;
        long j2 = aVar2.b;
        this.g.a(1);
        a(j2, this.g.a, 1);
        long j3 = j2 + 1;
        byte b2 = this.g.a[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Byte.MAX_VALUE;
        if (arv2.b.a == null) {
            arv2.b.a = new byte[16];
        }
        a(j3, arv2.b.a, (int) b3);
        long j4 = j3 + ((long) b3);
        if (z) {
            this.g.a(2);
            a(j4, this.g.a, 2);
            j4 += 2;
            i2 = this.g.d();
        } else {
            i2 = 1;
        }
        int[] iArr = arv2.b.b;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = arv2.b.c;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            this.g.a(i3);
            a(j4, this.g.a, i3);
            j4 += (long) i3;
            this.g.c(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = this.g.d();
                iArr4[i4] = this.g.n();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.a - ((int) (j4 - aVar2.b));
        }
        defpackage.atd.a aVar3 = aVar2.c;
        arv2.b.a(i2, iArr2, iArr4, aVar3.b, arv2.b.a, aVar3.a, aVar3.c, aVar3.d);
        int i5 = (int) (j4 - aVar2.b);
        aVar2.b += (long) i5;
        aVar2.a -= i5;
    }

    private void a(long j2, ByteBuffer byteBuffer, int i2) {
        b(j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.i.b - j2));
            byteBuffer.put(this.i.d.a, this.i.a(j2), min);
            i2 -= min;
            j2 += (long) min;
            if (j2 == this.i.b) {
                this.i = this.i.e;
            }
        }
    }

    private void a(long j2, byte[] bArr, int i2) {
        b(j2);
        long j3 = j2;
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.i.b - j3));
            System.arraycopy(this.i.d.a, this.i.a(j3), bArr, i2 - i3, min);
            i3 -= min;
            j3 += (long) min;
            if (j3 == this.i.b) {
                this.i = this.i.e;
            }
        }
    }

    private void b(long j2) {
        while (j2 >= this.i.b) {
            this.i = this.i.e;
        }
    }

    private void c(long j2) {
        if (j2 != -1) {
            while (j2 >= this.h.b) {
                this.d.a(this.h.d);
                this.h = this.h.a();
            }
            if (this.i.a < this.h.a) {
                this.i = this.h;
            }
        }
    }

    public final void a(long j2) {
        if (this.n != j2) {
            this.n = j2;
            this.l = true;
        }
    }

    public final void a(aqe aqe) {
        long j2 = this.n;
        aqe aqe2 = aqe == null ? null : (j2 == 0 || aqe.j == Long.MAX_VALUE) ? aqe : aqe.a(aqe.j + j2);
        boolean a2 = this.a.a(aqe2);
        this.m = aqe;
        this.l = false;
        b bVar = this.c;
        if (bVar != null && a2) {
            bVar.h();
        }
    }

    public final int a(asu asu, int i2, boolean z) {
        int a2 = asu.a(this.j.d.a, this.j.a(this.o), c(i2));
        if (a2 != -1) {
            d(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(bdj bdj, int i2) {
        while (i2 > 0) {
            int c2 = c(i2);
            bdj.a(this.j.d.a, this.j.a(this.o), c2);
            i2 -= c2;
            d(c2);
        }
    }

    public final void a(long j2, int i2, int i3, int i4, defpackage.atd.a aVar) {
        if (this.l) {
            a(this.m);
        }
        long j3 = j2 + this.n;
        if (this.b) {
            if ((i2 & 1) != 0 && this.a.a(j3)) {
                this.b = false;
            } else {
                return;
            }
        }
        int i5 = i3;
        this.a.a(j3, i2, (this.o - ((long) i5)) - ((long) i4), i5, aVar);
    }

    private void a(a aVar) {
        if (aVar.c) {
            int i2 = ((int) (this.j.a - aVar.a)) / this.e;
            bbh[] bbhArr = new bbh[((this.j.c ? 1 : 0) + i2)];
            for (int i3 = 0; i3 < bbhArr.length; i3++) {
                bbhArr[i3] = aVar.d;
                aVar = aVar.a();
            }
            this.d.a(bbhArr);
        }
    }

    private int c(int i2) {
        if (!this.j.c) {
            this.j.a(this.d.a(), new a(this.j.b, this.e));
        }
        return Math.min(i2, (int) (this.j.b - this.o));
    }

    private void d(int i2) {
        this.o += (long) i2;
        if (this.o == this.j.b) {
            this.j = this.j.e;
        }
    }
}
