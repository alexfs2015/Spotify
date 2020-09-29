package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbav extends dby {
    static final Logger a = Logger.getLogger(zzbav.class.getName());
    static final boolean b = dfq.a();
    public dci c = this;

    static class a extends zzbav {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int i) {
            super(0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | 0 | (bArr.length - i)) >= 0) {
                this.d = bArr;
                this.e = 0;
                this.g = 0;
                this.f = i;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
            }
        }

        public final void a(byte b) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void a(int i, zzbah zzbah) {
            a(i, 2);
            a(zzbah);
        }

        public final void a(int i, ddz ddz) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(ddz);
            a(1, 4);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, ddz ddz, des des) {
            a(i, 2);
            dbo dbo = (dbo) ddz;
            int h = dbo.h();
            if (h == -1) {
                h = des.b(dbo);
                dbo.b(h);
            }
            b(h);
            des.a(ddz, (dfw) this.c);
        }

        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(zzbah zzbah) {
            b(zzbah.a());
            zzbah.a((dby) this);
        }

        public final void a(ddz ddz) {
            b(ddz.j());
            ddz.a(this);
        }

        public final void a(byte[] bArr, int i) {
            b(i);
            b(bArr, 0, i);
        }

        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        public final void b(int i, zzbah zzbah) {
            a(1, 3);
            c(2, i);
            a(3, zzbah);
            a(1, 4);
        }

        public final void b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        public final void c(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i7 = this.g;
                this.g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v2, types: [int, byte] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r5v2, types: [int, byte] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(int r5) {
            /*
                r4 = this;
                byte[] r0 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte r2 = (byte) r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 8
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 16
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r5 = r5 >> 24
                r0[r1] = r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                return
            L_0x0032:
                r5 = move-exception
                com.google.android.gms.internal.ads.zzbav$zzb r0 = new com.google.android.gms.internal.ads.zzbav$zzb
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbav.a.d(int):void");
        }

        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }

        public final int h() {
            return this.f - this.g;
        }

        public final void b(int i) {
            if (!zzbav.b || h() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    dfq.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                dfq.a(bArr4, (long) i5, (byte) i);
            }
        }

        public final void a(long j) {
            if (!zzbav.b || h() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    dfq.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                dfq.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void a(String str) {
            int i = this.g;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    this.g = i + n2;
                    int a = dfs.a(str, this.d, this.g, h());
                    this.g = i;
                    b((a - i) - n2);
                    this.g = a;
                    return;
                }
                b(dfs.a((CharSequence) str));
                this.g = dfs.a(str, this.d, this.g, h());
            } catch (zzbep e2) {
                zzbep zzbep = e2;
                this.g = i;
                zzbav.a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzbep);
                byte[] bytes = str.getBytes(dda.a);
                try {
                    b(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzb(e3);
                } catch (zzb e4) {
                    throw e4;
                }
            } catch (IndexOutOfBoundsException e5) {
                throw new zzb(e5);
            }
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzbav() {
    }

    /* synthetic */ zzbav(byte b2) {
        this();
    }

    public static int a() {
        return 4;
    }

    public static int a(ddi ddi) {
        int b2 = ddi.b();
        return n(b2) + b2;
    }

    public static int a(ddz ddz, des des) {
        dbo dbo = (dbo) ddz;
        int h = dbo.h();
        if (h == -1) {
            h = des.b(dbo);
            dbo.b(h);
        }
        return n(h) + h;
    }

    public static zzbav a(byte[] bArr) {
        return new a(bArr, bArr.length);
    }

    public static int b() {
        return 4;
    }

    public static int b(zzbah zzbah) {
        int a2 = zzbah.a();
        return n(a2) + a2;
    }

    public static int b(ddz ddz) {
        int j = ddz.j();
        return n(j) + j;
    }

    public static int b(String str) {
        int i;
        try {
            i = dfs.a((CharSequence) str);
        } catch (zzbep unused) {
            i = str.getBytes(dda.a).length;
        }
        return n(i) + i;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return n(length) + length;
    }

    public static int c() {
        return 8;
    }

    @Deprecated
    public static int c(ddz ddz) {
        return ddz.j();
    }

    public static int d() {
        return 8;
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e() {
        return 4;
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int f() {
        return 8;
    }

    public static int f(long j) {
        return e(g(j));
    }

    public static int g() {
        return 1;
    }

    private static long g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int l(int i) {
        return n(i << 3);
    }

    public static int m(int i) {
        if (i >= 0) {
            return n(i);
        }
        return 10;
    }

    public static int n(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int o(int i) {
        return n(r(i));
    }

    public static int p(int i) {
        return m(i);
    }

    @Deprecated
    public static int q(int i) {
        return n(i);
    }

    private static int r(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b2);

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public abstract void a(int i);

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, zzbah zzbah);

    public abstract void a(int i, ddz ddz);

    public abstract void a(int i, ddz ddz, des des);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(zzbah zzbah);

    public abstract void a(ddz ddz);

    public abstract void a(String str);

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    public abstract void a(byte[] bArr, int i);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, g(j));
    }

    public abstract void b(int i, zzbah zzbah);

    public final void b(long j) {
        a(g(j));
    }

    public abstract void b(byte[] bArr, int i, int i2);

    public final void c(int i) {
        b(r(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, r(i2));
    }

    public abstract void e(int i, int i2);

    public abstract int h();

    public final void i() {
        if (h() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int f(int i, int i2) {
        return n(i << 3) + m(i2);
    }

    public static int g(int i, int i2) {
        return n(i << 3) + n(i2);
    }

    public static int h(int i, int i2) {
        return n(i << 3) + n(r(i2));
    }

    public static int e(int i) {
        return n(i << 3) + 4;
    }

    public static int f(int i) {
        return n(i << 3) + 4;
    }

    public static int d(int i, long j) {
        return n(i << 3) + e(j);
    }

    public static int e(int i, long j) {
        return n(i << 3) + e(j);
    }

    public static int f(int i, long j) {
        return n(i << 3) + e(g(j));
    }

    public static int g(int i) {
        return n(i << 3) + 8;
    }

    public static int h(int i) {
        return n(i << 3) + 8;
    }

    public static int i(int i) {
        return n(i << 3) + 4;
    }

    public static int j(int i) {
        return n(i << 3) + 8;
    }

    public static int k(int i) {
        return n(i << 3) + 1;
    }

    public static int i(int i, int i2) {
        return n(i << 3) + m(i2);
    }

    public static int b(int i, String str) {
        return n(i << 3) + b(str);
    }

    public static int c(int i, zzbah zzbah) {
        int n = n(i << 3);
        int a2 = zzbah.a();
        return n + n(a2) + a2;
    }

    public static int a(int i, ddi ddi) {
        int n = n(i << 3);
        int b2 = ddi.b();
        return n + n(b2) + b2;
    }

    public static int b(int i, ddz ddz, des des) {
        return n(i << 3) + a(ddz, des);
    }

    public static int b(int i, ddz ddz) {
        return (n(8) << 1) + g(2, i) + n(24) + b(ddz);
    }

    public static int d(int i, zzbah zzbah) {
        return (n(8) << 1) + g(2, i) + c(3, zzbah);
    }

    public static int b(int i, ddi ddi) {
        return (n(8) << 1) + g(2, i) + a(3, ddi);
    }

    @Deprecated
    public static int c(int i, ddz ddz, des des) {
        int n = n(i << 3) << 1;
        dbo dbo = (dbo) ddz;
        int h = dbo.h();
        if (h == -1) {
            h = des.b(dbo);
            dbo.b(h);
        }
        return n + h;
    }
}
