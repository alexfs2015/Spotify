package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

public final class CodedOutputStream implements Flushable {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public final OutputStream d;

    static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static int c(int i) {
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

    public static int d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public final void a(int i, long j) {
        f(i, 0);
        a(j);
    }

    public final void a(int i, boolean z) {
        f(i, 0);
        a(z ? (byte) 1 : 0);
    }

    public final void a(int i, aht aht) {
        f(i, 2);
        b(aht.a.length);
        int length = aht.a.length;
        int i2 = this.b;
        int i3 = this.c;
        if (i2 - i3 >= length) {
            aht.a(this.a, 0, i3, length);
            this.c += length;
            return;
        }
        int i4 = i2 - i3;
        aht.a(this.a, 0, i3, i4);
        int i5 = i4 + 0;
        int i6 = length - i4;
        this.c = this.b;
        a();
        if (i6 <= this.b) {
            aht.a(this.a, i5, 0, i6);
            this.c = i6;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(aht.a);
        long j = (long) i5;
        if (j == byteArrayInputStream.skip(j)) {
            while (i6 > 0) {
                int min = Math.min(i6, this.b);
                int read = byteArrayInputStream.read(this.a, 0, min);
                if (read == min) {
                    this.d.write(this.a, 0, read);
                    i6 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public final void a(int i, int i2) {
        f(i, 0);
        b(i2);
    }

    public final void b(int i, int i2) {
        f(i, 0);
        if (i2 >= 0) {
            b(i2);
        } else {
            a((long) i2);
        }
    }

    public static int a(int i, float f) {
        return a(1) + 4;
    }

    public static int b(int i, long j) {
        int a2 = a(i);
        int i2 = (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        return a2 + i2;
    }

    public static int b(int i, boolean z) {
        return a(i) + 1;
    }

    public static int b(int i, aht aht) {
        return a(i) + c(aht.a.length) + aht.a.length;
    }

    public static int c(int i, int i2) {
        return a(i) + c(i2);
    }

    public static int d(int i, int i2) {
        return a(i) + (i2 >= 0 ? c(i2) : 10);
    }

    public static int e(int i, int i2) {
        return a(2) + c(d(i2));
    }

    public void a() {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public final void flush() {
        if (this.d != null) {
            a();
        }
    }

    public final void a(byte b2) {
        if (this.c == this.b) {
            a();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
    }

    public final void f(int i, int i2) {
        b((i << 3) | i2);
    }

    public static int a(int i) {
        return c((i << 3) | 0);
    }

    public static CodedOutputStream a(OutputStream outputStream) {
        return new CodedOutputStream(outputStream, new byte[4096]);
    }

    public final void b(int i) {
        while ((i & -128) != 0) {
            a((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        a((byte) i);
    }

    private void a(long j) {
        while ((-128 & j) != 0) {
            a((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        a((byte) ((int) j));
    }
}
