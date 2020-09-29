package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzve extends elt {
    static final boolean a = epk.a();
    private static final Logger c = Logger.getLogger(zzve.class.getName());
    public emh b = this;

    static class a extends zzve {
        final int c;
        int d;
        private final byte[] e;
        private final int f;

        a(byte[] bArr, int i, int i2) {
            super(0);
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.e = bArr;
                    this.c = i;
                    this.d = i;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public void h() {
        }

        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        public final void a(int i, zzun zzun) {
            a(i, 2);
            a(zzun);
        }

        public final void a(zzun zzun) {
            b(zzun.a());
            zzun.a((elt) this);
        }

        public final void a(byte[] bArr, int i) {
            b(i);
            b(bArr, 0, i);
        }

        public final void a(int i, enx enx) {
            a(i, 2);
            a(enx);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, enx enx, eon eon) {
            a(i, 2);
            eln eln = (eln) enx;
            int e2 = eln.e();
            if (e2 == -1) {
                e2 = eon.b(eln);
                eln.b(e2);
            }
            b(e2);
            eon.a(enx, (epr) this.b);
        }

        public final void b(int i, enx enx) {
            a(1, 3);
            c(2, i);
            a(3, enx);
            a(1, 4);
        }

        public final void b(int i, zzun zzun) {
            a(1, 3);
            c(2, i);
            a(3, zzun);
            a(1, 4);
        }

        public final void a(enx enx) {
            b(enx.h());
            enx.a(this);
        }

        /* access modifiers changed from: 0000 */
        public final void a(enx enx, eon eon) {
            eln eln = (eln) enx;
            int e2 = eln.e();
            if (e2 == -1) {
                e2 = eon.b(eln);
                eln.b(e2);
            }
            b(e2);
            eon.a(enx, (epr) this.b);
        }

        public final void a(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.d;
                this.d = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
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
                byte[] r0 = r4.e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte r2 = (byte) r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 8
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 16
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r5 = r5 >> 24
                r0[r1] = r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                return
            L_0x0032:
                r5 = move-exception
                com.google.android.gms.internal.measurement.zzve$zzc r0 = new com.google.android.gms.internal.measurement.zzve$zzc
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.d
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzve.a.d(int):void");
        }

        public final void c(long j) {
            try {
                byte[] bArr = this.e;
                int i = this.d;
                this.d = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.e;
                int i2 = this.d;
                this.d = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.e;
                int i3 = this.d;
                this.d = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.e;
                int i4 = this.d;
                this.d = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.e;
                int i5 = this.d;
                this.d = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.e;
                int i6 = this.d;
                this.d = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.e;
                int i7 = this.d;
                this.d = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.e;
                int i8 = this.d;
                this.d = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.d, i2);
                this.d += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        public final void a(String str) {
            int i = this.d;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    this.d = i + n2;
                    int a = epm.a(str, this.e, this.d, i());
                    this.d = i;
                    b((a - i) - n2);
                    this.d = a;
                    return;
                }
                b(epm.a((CharSequence) str));
                this.d = epm.a(str, this.e, this.d, i());
            } catch (zzyy e2) {
                this.d = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        public final int i() {
            return this.f - this.d;
        }

        public final void b(int i) {
            if (!zzve.a || i() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.e;
                    int i4 = this.d;
                    this.d = i4 + 1;
                    epk.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.e;
                int i5 = this.d;
                this.d = i5 + 1;
                epk.a(bArr4, (long) i5, (byte) i);
            }
        }

        public final void a(long j) {
            if (!zzve.a || i() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.e;
                    int i = this.d;
                    this.d = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.e;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    epk.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.e;
                int i4 = this.d;
                this.d = i4 + 1;
                epk.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }
    }

    static final class b extends a {
        private final ByteBuffer e;
        private int f;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.e = byteBuffer;
            this.f = byteBuffer.position();
        }

        public final void h() {
            this.e.position(this.f + (this.d - this.c));
        }
    }

    static final class c extends zzve {
        private final ByteBuffer c;
        private final ByteBuffer d;
        private final int e;

        c(ByteBuffer byteBuffer) {
            super(0);
            this.c = byteBuffer;
            this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.e = byteBuffer.position();
        }

        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        public final void a(int i, zzun zzun) {
            a(i, 2);
            a(zzun);
        }

        public final void a(int i, enx enx) {
            a(i, 2);
            a(enx);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, enx enx, eon eon) {
            a(i, 2);
            a(enx, eon);
        }

        public final void b(int i, enx enx) {
            a(1, 3);
            c(2, i);
            a(3, enx);
            a(1, 4);
        }

        public final void b(int i, zzun zzun) {
            a(1, 3);
            c(2, i);
            a(3, zzun);
            a(1, 4);
        }

        public final void a(enx enx) {
            b(enx.h());
            enx.a(this);
        }

        /* access modifiers changed from: 0000 */
        public final void a(enx enx, eon eon) {
            eln eln = (eln) enx;
            int e2 = eln.e();
            if (e2 == -1) {
                e2 = eon.b(eln);
                eln.b(e2);
            }
            b(e2);
            eon.a(enx, (epr) this.b);
        }

        public final void a(byte b) {
            try {
                this.d.put(b);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        public final void a(zzun zzun) {
            b(zzun.a());
            zzun.a((elt) this);
        }

        public final void a(byte[] bArr, int i) {
            b(i);
            b(bArr, 0, i);
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void b(int i) {
            while ((i & -128) != 0) {
                this.d.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.d.put((byte) i);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        public final void d(int i) {
            try {
                this.d.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        public final void a(long j) {
            while ((-128 & j) != 0) {
                this.d.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.d.put((byte) ((int) j));
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        public final void c(long j) {
            try {
                this.d.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        public final void b(byte[] bArr, int i, int i2) {
            try {
                this.d.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            } catch (BufferOverflowException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        public final void a(String str) {
            int position = this.d.position();
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int position2 = this.d.position() + n2;
                    this.d.position(position2);
                    c(str);
                    int position3 = this.d.position();
                    this.d.position(position);
                    b(position3 - position2);
                    this.d.position(position3);
                    return;
                }
                b(epm.a((CharSequence) str));
                c(str);
            } catch (zzyy e2) {
                this.d.position(position);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        public final void h() {
            this.c.position(this.d.position());
        }

        public final int i() {
            return this.d.remaining();
        }

        private final void c(String str) {
            try {
                epm.a((CharSequence) str, this.d);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }
    }

    static final class d extends zzve {
        private final ByteBuffer c;
        private final ByteBuffer d;
        private final long e;
        private final long f;
        private final long g;
        private final long h = (this.g - 10);
        private long i = this.f;

        d(ByteBuffer byteBuffer) {
            super(0);
            this.c = byteBuffer;
            this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.e = epk.a(byteBuffer);
            this.f = this.e + ((long) byteBuffer.position());
            this.g = this.e + ((long) byteBuffer.limit());
        }

        public final void a(int i2, int i3) {
            b((i2 << 3) | i3);
        }

        public final void b(int i2, int i3) {
            a(i2, 0);
            a(i3);
        }

        public final void c(int i2, int i3) {
            a(i2, 0);
            b(i3);
        }

        public final void e(int i2, int i3) {
            a(i2, 5);
            d(i3);
        }

        public final void a(int i2, long j) {
            a(i2, 0);
            a(j);
        }

        public final void c(int i2, long j) {
            a(i2, 1);
            c(j);
        }

        public final void a(int i2, boolean z) {
            a(i2, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(int i2, String str) {
            a(i2, 2);
            a(str);
        }

        public final void a(int i2, zzun zzun) {
            a(i2, 2);
            a(zzun);
        }

        public final void a(int i2, enx enx) {
            a(i2, 2);
            a(enx);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, enx enx, eon eon) {
            a(i2, 2);
            a(enx, eon);
        }

        public final void b(int i2, enx enx) {
            a(1, 3);
            c(2, i2);
            a(3, enx);
            a(1, 4);
        }

        public final void b(int i2, zzun zzun) {
            a(1, 3);
            c(2, i2);
            a(3, zzun);
            a(1, 4);
        }

        public final void a(enx enx) {
            b(enx.h());
            enx.a(this);
        }

        /* access modifiers changed from: 0000 */
        public final void a(enx enx, eon eon) {
            eln eln = (eln) enx;
            int e2 = eln.e();
            if (e2 == -1) {
                e2 = eon.b(eln);
                eln.b(e2);
            }
            b(e2);
            eon.a(enx, (epr) this.b);
        }

        public final void a(byte b) {
            long j = this.i;
            if (j < this.g) {
                this.i = 1 + j;
                epk.a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.g), Integer.valueOf(1)}));
        }

        public final void a(zzun zzun) {
            b(zzun.a());
            zzun.a((elt) this);
        }

        public final void a(byte[] bArr, int i2) {
            b(i2);
            b(bArr, 0, i2);
        }

        public final void a(int i2) {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        public final void b(int i2) {
            if (this.i <= this.h) {
                while ((i2 & -128) != 0) {
                    long j = this.i;
                    this.i = j + 1;
                    epk.a(j, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j2 = this.i;
                this.i = 1 + j2;
                epk.a(j2, (byte) i2);
                return;
            }
            while (true) {
                long j3 = this.i;
                if (j3 >= this.g) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j3), Long.valueOf(this.g), Integer.valueOf(1)}));
                } else if ((i2 & -128) == 0) {
                    this.i = 1 + j3;
                    epk.a(j3, (byte) i2);
                    return;
                } else {
                    this.i = j3 + 1;
                    epk.a(j3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        public final void d(int i2) {
            this.d.putInt((int) (this.i - this.e), i2);
            this.i += 4;
        }

        public final void a(long j) {
            if (this.i <= this.h) {
                while ((j & -128) != 0) {
                    long j2 = this.i;
                    this.i = j2 + 1;
                    epk.a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.i;
                this.i = 1 + j3;
                epk.a(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.i;
                if (j4 >= this.g) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j4), Long.valueOf(this.g), Integer.valueOf(1)}));
                } else if ((j & -128) == 0) {
                    this.i = 1 + j4;
                    epk.a(j4, (byte) ((int) j));
                    return;
                } else {
                    this.i = j4 + 1;
                    epk.a(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public final void c(long j) {
            this.d.putLong((int) (this.i - this.e), j);
            this.i += 8;
        }

        public final void b(byte[] bArr, int i2, int i3) {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j = (long) i3;
                long j2 = this.g - j;
                long j3 = this.i;
                if (j2 >= j3) {
                    epk.a(bArr, (long) i2, j3, j);
                    this.i += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i3)}));
        }

        public final void a(byte[] bArr, int i2, int i3) {
            b(bArr, i2, i3);
        }

        public final void a(String str) {
            long j = this.i;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int i2 = ((int) (this.i - this.e)) + n2;
                    this.d.position(i2);
                    epm.a((CharSequence) str, this.d);
                    int position = this.d.position() - i2;
                    b(position);
                    this.i += (long) position;
                    return;
                }
                int a = epm.a((CharSequence) str);
                b(a);
                g(this.i);
                epm.a((CharSequence) str, this.d);
                this.i += (long) a;
            } catch (zzyy e2) {
                this.i = j;
                g(this.i);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc((Throwable) e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzc((Throwable) e4);
            }
        }

        public final void h() {
            this.c.position((int) (this.i - this.e));
        }

        public final int i() {
            return (int) (this.g - this.i);
        }

        private final void g(long j) {
            this.d.position((int) (j - this.e));
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    public static int a() {
        return 4;
    }

    public static zzve a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b() {
        return 4;
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
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

    public static int g() {
        return 1;
    }

    private static long g(long j) {
        return (j >> 63) ^ (j << 1);
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

    private static int r(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b2);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, zzun zzun);

    public abstract void a(int i, enx enx);

    public abstract void a(int i, enx enx, eon eon);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(zzun zzun);

    public abstract void a(enx enx);

    /* access modifiers changed from: 0000 */
    public abstract void a(enx enx, eon eon);

    public abstract void a(String str);

    public abstract void a(byte[] bArr, int i);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, zzun zzun);

    public abstract void b(int i, enx enx);

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public abstract void e(int i, int i2);

    public abstract void h();

    public abstract int i();

    public static zzve a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (epk.b()) {
            return new d(byteBuffer);
        } else {
            return new c(byteBuffer);
        }
    }

    private zzve() {
    }

    public final void d(int i, int i2) {
        c(i, r(i2));
    }

    public final void b(int i, long j) {
        a(i, g(j));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d2) {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void c(int i) {
        b(r(i));
    }

    public final void b(long j) {
        a(g(j));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public final void a(double d2) {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
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

    public static int o(int i) {
        return n(r(i));
    }

    public static int d(long j) {
        return e(j);
    }

    public static int f(long j) {
        return e(g(j));
    }

    public static int p(int i) {
        return m(i);
    }

    public static int b(String str) {
        int i;
        try {
            i = epm.a((CharSequence) str);
        } catch (zzyy unused) {
            i = str.getBytes(emy.a).length;
        }
        return n(i) + i;
    }

    public static int a(eng eng) {
        int b2 = eng.b();
        return n(b2) + b2;
    }

    public static int b(zzun zzun) {
        int a2 = zzun.a();
        return n(a2) + a2;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return n(length) + length;
    }

    public static int b(enx enx) {
        int h = enx.h();
        return n(h) + h;
    }

    public static int b(enx enx, eon eon) {
        eln eln = (eln) enx;
        int e = eln.e();
        if (e == -1) {
            e = eon.b(eln);
            eln.b(e);
        }
        return n(e) + e;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, zzyy zzyy) {
        c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzyy);
        byte[] bytes = str.getBytes(emy.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    @Deprecated
    public static int c(enx enx) {
        return enx.h();
    }

    @Deprecated
    public static int q(int i) {
        return n(i);
    }

    /* synthetic */ zzve(byte b2) {
        this();
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

    public static int c(int i, zzun zzun) {
        int n = n(i << 3);
        int a2 = zzun.a();
        return n + n(a2) + a2;
    }

    public static int a(int i, eng eng) {
        int n = n(i << 3);
        int b2 = eng.b();
        return n + n(b2) + b2;
    }

    public static int c(int i, enx enx) {
        return n(i << 3) + b(enx);
    }

    public static int b(int i, enx enx, eon eon) {
        return n(i << 3) + b(enx, eon);
    }

    public static int d(int i, enx enx) {
        return (n(8) << 1) + g(2, i) + c(3, enx);
    }

    public static int d(int i, zzun zzun) {
        return (n(8) << 1) + g(2, i) + c(3, zzun);
    }

    public static int b(int i, eng eng) {
        return (n(8) << 1) + g(2, i) + a(3, eng);
    }

    @Deprecated
    public static int c(int i, enx enx, eon eon) {
        int n = n(i << 3) << 1;
        eln eln = (eln) enx;
        int e = eln.e();
        if (e == -1) {
            e = eon.b(eln);
            eln.b(e);
        }
        return n + e;
    }
}
