package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: ayj reason: default package */
public final class ayj implements atu {
    public final ayi a = new ayi();
    public boolean b;
    public b c;
    private final bbz d;
    private final int e;
    private final defpackage.ayi.a f = new defpackage.ayi.a();
    private final bea g = new bea(32);
    private a h = new a(0, this.e);
    private a i;
    private a j;
    private aqv k;
    private boolean l;
    private aqv m;
    private long n;
    private long o;

    /* renamed from: ayj$a */
    static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public bby d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
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

        public final void a(bby bby, a aVar) {
            this.d = bby;
            this.e = aVar;
            this.c = true;
        }
    }

    /* renamed from: ayj$b */
    public interface b {
        void h();
    }

    public ayj(bbz bbz) {
        this.d = bbz;
        this.e = bbz.c();
        a aVar = this.h;
        this.i = aVar;
        this.j = aVar;
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

    private void a(asm asm, defpackage.ayi.a aVar) {
        int i2;
        asm asm2 = asm;
        defpackage.ayi.a aVar2 = aVar;
        long j2 = aVar2.b;
        this.g.a(1);
        a(j2, this.g.a, 1);
        long j3 = j2 + 1;
        byte b2 = this.g.a[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Byte.MAX_VALUE;
        if (asm2.b.a == null) {
            asm2.b.a = new byte[16];
        }
        a(j3, asm2.b.a, (int) b3);
        long j4 = j3 + ((long) b3);
        if (z) {
            this.g.a(2);
            a(j4, this.g.a, 2);
            j4 += 2;
            i2 = this.g.d();
        } else {
            i2 = 1;
        }
        int[] iArr = asm2.b.b;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = asm2.b.c;
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
        defpackage.atu.a aVar3 = aVar2.c;
        asm2.b.a(i2, iArr2, iArr4, aVar3.b, asm2.b.a, aVar3.a, aVar3.c, aVar3.d);
        int i5 = (int) (j4 - aVar2.b);
        aVar2.b += (long) i5;
        aVar2.a -= i5;
    }

    private void a(a aVar) {
        if (aVar.c) {
            int i2 = ((int) (this.j.a - aVar.a)) / this.e;
            bby[] bbyArr = new bby[((this.j.c ? 1 : 0) + i2)];
            for (int i3 = 0; i3 < bbyArr.length; i3++) {
                bbyArr[i3] = aVar.d;
                aVar = aVar.a();
            }
            this.d.a(bbyArr);
        }
    }

    private void b(long j2) {
        while (j2 >= this.i.b) {
            this.i = this.i.e;
        }
    }

    private int c(int i2) {
        if (!this.j.c) {
            this.j.a(this.d.a(), new a(this.j.b, this.e));
        }
        return Math.min(i2, (int) (this.j.b - this.o));
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

    private void d(int i2) {
        this.o += (long) i2;
        if (this.o == this.j.b) {
            this.j = this.j.e;
        }
    }

    public final int a() {
        return this.a.b;
    }

    public final int a(aqw aqw, asm asm, boolean z, boolean z2, long j2) {
        int a2 = this.a.a(aqw, asm, z, z2, this.k, this.f);
        if (a2 == -5) {
            this.k = aqw.a;
            return -5;
        } else if (a2 == -4) {
            if (!asm.c()) {
                if (asm.d < j2) {
                    asm.a(Integer.MIN_VALUE);
                }
                if (asm.e()) {
                    a(asm, this.f);
                }
                asm.c(this.f.a);
                a(this.f.b, asm.c, this.f.a);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    public final int a(atl atl, int i2, boolean z) {
        int a2 = atl.a(this.j.d.a, this.j.a(this.o), c(i2));
        if (a2 != -1) {
            d(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(int i2) {
        this.a.d = i2;
    }

    public final void a(long j2) {
        if (this.n != j2) {
            this.n = j2;
            this.l = true;
        }
    }

    public final void a(long j2, int i2, int i3, int i4, defpackage.atu.a aVar) {
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

    public final void a(long j2, boolean z, boolean z2) {
        c(this.a.b(j2, z, z2));
    }

    public final void a(aqv aqv) {
        long j2 = this.n;
        aqv aqv2 = aqv == null ? null : (j2 == 0 || aqv.j == Long.MAX_VALUE) ? aqv : aqv.a(aqv.j + j2);
        boolean a2 = this.a.a(aqv2);
        this.m = aqv;
        this.l = false;
        b bVar = this.c;
        if (bVar != null && a2) {
            bVar.h();
        }
    }

    public final void a(bea bea, int i2) {
        while (i2 > 0) {
            int c2 = c(i2);
            bea.a(this.j.d.a, this.j.a(this.o), c2);
            i2 -= c2;
            d(c2);
        }
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

    public final int b() {
        ayi ayi = this.a;
        return ayi.c() ? ayi.a[ayi.c(ayi.c)] : ayi.d;
    }

    public final int b(long j2, boolean z, boolean z2) {
        return this.a.a(j2, true, z2);
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

    public final void c() {
        this.a.g();
        this.i = this.h;
    }

    public final void d() {
        c(this.a.i());
    }
}
