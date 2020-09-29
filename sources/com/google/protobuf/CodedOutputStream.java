package com.google.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends fkb {
    static final boolean a = fky.a();
    static final long b = fky.c();
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            StringBuilder sb = new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    static class a extends CodedOutputStream {
        private final byte[] c;
        private final int d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
            super(0);
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.c = bArr;
                    this.d = i;
                    this.f = i;
                    this.e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
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
            c(i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void b(int i, long j) {
            a(i, 1);
            b(j);
        }

        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        public final void a(int i, ByteString byteString) {
            a(i, 2);
            a(byteString);
        }

        public final void a(ByteString byteString) {
            b(byteString.b());
            byteString.a((fkb) this);
        }

        public final void b(byte[] bArr, int i, int i2) {
            b(i2);
            c(bArr, 0, i2);
        }

        public final void a(int i, fko fko) {
            a(i, 2);
            a(fko);
        }

        public final void a(fko fko) {
            b(fko.j());
            fko.a(this);
        }

        public final void a(byte b) {
            try {
                byte[] bArr = this.c;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void c(int i) {
            try {
                byte[] bArr = this.c;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.c;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.c;
                int i4 = this.f;
                this.f = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.c;
                int i5 = this.f;
                this.f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1)}), e2);
            }
        }

        public final void b(long j) {
            try {
                byte[] bArr = this.c;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.c;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.c;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.c;
                int i4 = this.f;
                this.f = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.c;
                int i5 = this.f;
                this.f = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.c;
                int i6 = this.f;
                this.f = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.c;
                int i7 = this.f;
                this.f = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.c;
                int i8 = this.f;
                this.f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1)}), e2);
            }
        }

        private void c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.c, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)}), e2);
            }
        }

        public final void a(byte[] bArr, int i, int i2) {
            c(bArr, i, i2);
        }

        public final void a(String str) {
            int i = this.f;
            try {
                int f2 = f(str.length() * 3);
                int f3 = f(str.length());
                if (f3 == f2) {
                    this.f = i + f3;
                    int a = Utf8.a(str, this.c, this.f, h());
                    this.f = i;
                    b((a - i) - f3);
                    this.f = a;
                    return;
                }
                b(Utf8.a((CharSequence) str));
                this.f = Utf8.a(str, this.c, this.f, h());
            } catch (UnpairedSurrogateException e2) {
                this.f = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        public final int h() {
            return this.e - this.f;
        }

        public final void b(int i) {
            if (!CodedOutputStream.a || h() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.c;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.c;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1)}), e2);
                }
            } else {
                long j = CodedOutputStream.b + ((long) this.f);
                while ((i & -128) != 0) {
                    long j2 = 1 + j;
                    fky.a(this.c, j, (byte) ((i & 127) | 128));
                    this.f++;
                    i >>>= 7;
                    j = j2;
                }
                fky.a(this.c, j, (byte) i);
                this.f++;
            }
        }

        public final void a(long j) {
            if (!CodedOutputStream.a || h() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.c;
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.c;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1)}), e2);
                }
            } else {
                long j2 = CodedOutputStream.b + ((long) this.f);
                while ((j & -128) != 0) {
                    long j3 = 1 + j2;
                    fky.a(this.c, j2, (byte) ((((int) j) & 127) | 128));
                    this.f++;
                    j >>>= 7;
                    j2 = j3;
                }
                fky.a(this.c, j2, (byte) ((int) j));
                this.f++;
            }
        }
    }

    public static int a() {
        return 4;
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

    public static int d(long j) {
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

    public static int e() {
        return 4;
    }

    public static int f() {
        return 8;
    }

    public static int f(int i) {
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

    public static long f(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int g() {
        return 1;
    }

    public static int j(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b2);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, ByteString byteString);

    public abstract void a(int i, fko fko);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(ByteString byteString);

    public abstract void a(fko fko);

    public abstract void a(String str);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(long j);

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void e(int i, int i2);

    public abstract int h();

    /* synthetic */ CodedOutputStream(byte b2) {
        this();
    }

    public static CodedOutputStream a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    private CodedOutputStream() {
    }

    public final void d(int i, int i2) {
        c(i, j(i2));
    }

    public final void a(int i, double d) {
        b(i, Double.doubleToRawLongBits(d));
    }

    public static int f(int i, int i2) {
        return d(i) + e(i2);
    }

    public static int g(int i, int i2) {
        return d(i) + f(i2);
    }

    public static int h(int i, int i2) {
        return d(i) + f(j(i2));
    }

    public static int i(int i, int i2) {
        return d(i) + 4;
    }

    public static int c(int i, long j) {
        return d(i) + d(j);
    }

    public static int d(int i, long j) {
        return d(i) + d(j);
    }

    public static int e(int i, long j) {
        return d(i) + 8;
    }

    public static int a(int i, float f) {
        return d(5) + 4;
    }

    public static int b(int i, double d) {
        return d(i) + 8;
    }

    public static int b(int i, boolean z) {
        return d(i) + 1;
    }

    public static int j(int i, int i2) {
        return d(i) + e(i2);
    }

    public static int b(int i, String str) {
        return d(i) + b(str);
    }

    public static int b(int i, ByteString byteString) {
        int d = d(i);
        int b2 = byteString.b();
        return d + f(b2) + b2;
    }

    public static int b(int i, fko fko) {
        return d(i) + b(fko);
    }

    public static int d(int i) {
        return f((i << 3) | 0);
    }

    public static int e(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int g(int i) {
        return f(j(i));
    }

    public static int c(long j) {
        return d(j);
    }

    public static int e(long j) {
        return d(f(j));
    }

    public static int h(int i) {
        return e(i);
    }

    public static int b(String str) {
        int i;
        try {
            i = Utf8.a((CharSequence) str);
        } catch (UnpairedSurrogateException unused) {
            i = str.getBytes(fki.a).length;
        }
        return f(i) + i;
    }

    public static int a(fkk fkk) {
        int b2 = fkk.b();
        return f(b2) + b2;
    }

    public static int b(ByteString byteString) {
        int b2 = byteString.b();
        return f(b2) + b2;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return f(length) + length;
    }

    public static int b(fko fko) {
        int j = fko.j();
        return f(j) + j;
    }

    public static int i(int i) {
        return f(i) + i;
    }

    public final void i() {
        if (h() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, UnpairedSurrogateException unpairedSurrogateException) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(fki.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    @Deprecated
    public static int c(fko fko) {
        return fko.j();
    }
}
