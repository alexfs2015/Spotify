package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.SegmentedByteString;

/* renamed from: xcq reason: default package */
public final class xcq implements Cloneable, ByteChannel, xcr, xcs {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public xdd a;
    public long b;

    private String a(long j, Charset charset) {
        xdi.a(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            xdd xdd = this.a;
            if (((long) xdd.b) + j > ((long) xdd.c)) {
                return new String(h(j), charset);
            }
            String str = new String(xdd.a, xdd.b, (int) j, charset);
            xdd.b = (int) (((long) xdd.b) + j);
            this.b -= j;
            if (xdd.b == xdd.c) {
                this.a = xdd.b();
                xde.a(xdd);
            }
            return str;
        }
    }

    private ByteString k(int i) {
        return i == 0 ? ByteString.a : new SegmentedByteString(this, i);
    }

    public final int a(byte[] bArr, int i, int i2) {
        xdi.a((long) bArr.length, (long) i, (long) i2);
        xdd xdd = this.a;
        if (xdd == null) {
            return -1;
        }
        int min = Math.min(i2, xdd.c - xdd.b);
        System.arraycopy(xdd.a, xdd.b, bArr, i, min);
        xdd.b += min;
        this.b -= (long) min;
        if (xdd.b == xdd.c) {
            this.a = xdd.b();
            xde.a(xdd);
        }
        return min;
    }

    public final long a(byte b2) {
        return a(0, 0, Long.MAX_VALUE);
    }

    public final long a(byte b2, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.b;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4) {
            return -1;
        }
        xdd xdd = this.a;
        if (xdd == null) {
            return -1;
        }
        long j5 = this.b;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (xdd.c - xdd.b)) + j5;
                if (j3 >= j) {
                    break;
                }
                xdd = xdd.f;
            }
        } else {
            while (j5 > j) {
                xdd = xdd.g;
                j5 -= (long) (xdd.c - xdd.b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = xdd.a;
            int min = (int) Math.min((long) xdd.c, (((long) xdd.b) + j4) - j5);
            for (int i = (int) ((((long) xdd.b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - xdd.b)) + j5;
                }
            }
            byte b3 = b2;
            j6 = ((long) (xdd.c - xdd.b)) + j5;
            xdd = xdd.f;
            j5 = j6;
        }
        return -1;
    }

    public final long a(xcq xcq, long j) {
        if (xcq == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            xcq.a_(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final long a(xdf xdf) {
        long j = this.b;
        if (j > 0) {
            xdf.a_(this, j);
        }
        return j;
    }

    public final long a(xdg xdg) {
        if (xdg != null) {
            long j = 0;
            while (true) {
                long a2 = xdg.a(this, 8192);
                if (a2 == -1) {
                    return j;
                }
                j += a2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final xcq a(int i) {
        if (i < 128) {
            j(i);
        } else if (i < 2048) {
            j((i >> 6) | 192);
            j((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                j((i >> 12) | 224);
                j(((i >> 6) & 63) | 128);
                j((i & 63) | 128);
            } else {
                j(63);
            }
        } else if (i <= 1114111) {
            j((i >> 18) | 240);
            j(((i >> 12) & 63) | 128);
            j(((i >> 6) & 63) | 128);
            j((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: a */
    public final xcq b(String str) {
        return a(str, 0, str.length());
    }

    public final xcq a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    xdd f = f(1);
                    byte[] bArr = f.a;
                    int i3 = f.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (true) {
                        i = i4;
                        if (i >= min) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                    }
                    int i5 = (i3 + i) - f.c;
                    f.c += i5;
                    this.b += (long) i5;
                } else {
                    if (charAt < 2048) {
                        j((charAt >> 6) | 192);
                        j((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        j((charAt >> 12) | 224);
                        j(((charAt >> 6) & 63) | 128);
                        j((int) (charAt & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        char charAt3 = i6 < i2 ? str.charAt(i6) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            j(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            j((i7 >> 18) | 240);
                            j(((i7 >> 12) & 63) | 128);
                            j(((i7 >> 6) & 63) | 128);
                            j((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public final xcq b(ByteString byteString) {
        if (byteString != null) {
            byteString.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final xcq a(xcq xcq, long j, long j2) {
        if (xcq != null) {
            xdi.a(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            xcq.b += j2;
            xdd xdd = this.a;
            while (j >= ((long) (xdd.c - xdd.b))) {
                j -= (long) (xdd.c - xdd.b);
                xdd = xdd.f;
            }
            while (j2 > 0) {
                xdd a2 = xdd.a();
                a2.b = (int) (((long) a2.b) + j);
                a2.c = Math.min(a2.b + ((int) j2), a2.c);
                xdd xdd2 = xcq.a;
                if (xdd2 == null) {
                    a2.g = a2;
                    a2.f = a2;
                    xcq.a = a2;
                } else {
                    xdd2.g.a(a2);
                }
                j2 -= (long) (a2.c - a2.b);
                xdd = xdd.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final xdh a() {
        return xdh.b;
    }

    public final void a(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final void a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public final boolean a(long j, ByteString byteString) {
        int h = byteString.h();
        if (h < 0 || this.b - 0 < ((long) h) || byteString.h() < h) {
            return false;
        }
        for (int i = 0; i < h; i++) {
            if (c(((long) i) + 0) != byteString.a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    public final void a_(xcq xcq, long j) {
        xdd xdd;
        if (xcq == null) {
            throw new IllegalArgumentException("source == null");
        } else if (xcq != this) {
            xdi.a(xcq.b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (xcq.a.c - xcq.a.b))) {
                    xdd xdd2 = this.a;
                    xdd xdd3 = xdd2 != null ? xdd2.g : null;
                    if (xdd3 != null && xdd3.e) {
                        if ((((long) xdd3.c) + j) - ((long) (xdd3.d ? 0 : xdd3.b)) <= 8192) {
                            xcq.a.a(xdd3, (int) j);
                            xcq.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    xdd xdd4 = xcq.a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > xdd4.c - xdd4.b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        xdd = xdd4.a();
                    } else {
                        xdd = xde.a();
                        System.arraycopy(xdd4.a, xdd4.b, xdd.a, 0, i2);
                    }
                    xdd.c = xdd.b + i2;
                    xdd4.b += i2;
                    xdd4.g.a(xdd);
                    xcq.a = xdd;
                }
                xdd xdd5 = xcq.a;
                long j2 = (long) (xdd5.c - xdd5.b);
                xcq.a = xdd5.b();
                xdd xdd6 = this.a;
                if (xdd6 == null) {
                    this.a = xdd5;
                    xdd xdd7 = this.a;
                    xdd7.g = xdd7;
                    xdd7.f = xdd7;
                } else {
                    xdd a2 = xdd6.g.a(xdd5);
                    if (a2.g == a2) {
                        throw new IllegalStateException();
                    } else if (a2.g.e) {
                        int i3 = a2.c - a2.b;
                        int i4 = 8192 - a2.g.c;
                        if (!a2.g.d) {
                            i = a2.g.b;
                        }
                        if (i3 <= i4 + i) {
                            a2.a(a2.g, i3);
                            a2.b();
                            xde.a(a2);
                        }
                    }
                }
                xcq.b -= j2;
                this.b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final xcq b() {
        return this;
    }

    /* renamed from: b */
    public final xcq j(int i) {
        xdd f = f(1);
        byte[] bArr = f.a;
        int i2 = f.c;
        f.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    /* renamed from: b */
    public final xcq c(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final xcq c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            xdi.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                xdd f = f(1);
                int min = Math.min(i3 - i, 8192 - f.c);
                System.arraycopy(bArr, i, f.a, f.c, min);
                i += min;
                f.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final boolean b(long j) {
        return this.b >= j;
    }

    public final byte c(long j) {
        xdi.a(this.b, j, 1);
        long j2 = this.b;
        if (j2 - j > j) {
            xdd xdd = this.a;
            while (true) {
                long j3 = (long) (xdd.c - xdd.b);
                if (j < j3) {
                    return xdd.a[xdd.b + ((int) j)];
                }
                j -= j3;
                xdd = xdd.f;
            }
        } else {
            long j4 = j - j2;
            xdd xdd2 = this.a;
            do {
                xdd2 = xdd2.g;
                j4 += (long) (xdd2.c - xdd2.b);
            } while (j4 < 0);
            return xdd2.a[xdd2.b + ((int) j4)];
        }
    }

    /* renamed from: c */
    public final xcq i(int i) {
        xdd f = f(2);
        byte[] bArr = f.a;
        int i2 = f.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        f.c = i4;
        this.b += 2;
        return this;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final void close() {
    }

    public final InputStream d() {
        return new InputStream() {
            public final int available() {
                return (int) Math.min(xcq.this.b, 2147483647L);
            }

            public final void close() {
            }

            public final int read() {
                if (xcq.this.b > 0) {
                    return xcq.this.f() & 255;
                }
                return -1;
            }

            public final int read(byte[] bArr, int i, int i2) {
                return xcq.this.a(bArr, i, i2);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(xcq.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final ByteString d(long j) {
        return new ByteString(h(j));
    }

    /* renamed from: d */
    public final xcq h(int i) {
        xdd f = f(4);
        byte[] bArr = f.a;
        int i2 = f.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i;
        f.c = i6;
        this.b += 4;
        return this;
    }

    public final long e() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        xdd xdd = this.a.g;
        if (xdd.c < 8192 && xdd.e) {
            j -= (long) (xdd.c - xdd.b);
        }
        return j;
    }

    public final String e(long j) {
        return a(j, xdi.a);
    }

    /* renamed from: e */
    public final xcq g(int i) {
        return h(xdi.a(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcq)) {
            return false;
        }
        xcq xcq = (xcq) obj;
        long j = this.b;
        if (j != xcq.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        xdd xdd = this.a;
        xdd xdd2 = xcq.a;
        int i = xdd.b;
        int i2 = xdd2.b;
        while (j2 < this.b) {
            long min = (long) Math.min(xdd.c - i, xdd2.c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (xdd.a[i4] != xdd2.a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == xdd.c) {
                xdd = xdd.f;
                i = xdd.b;
            } else {
                i = i4;
            }
            if (i3 == xdd2.c) {
                xdd2 = xdd2.f;
                i2 = xdd2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final byte f() {
        if (this.b != 0) {
            xdd xdd = this.a;
            int i = xdd.b;
            int i2 = xdd.c;
            int i3 = i + 1;
            byte b2 = xdd.a[i];
            this.b--;
            if (i3 == i2) {
                this.a = xdd.b();
                xde.a(xdd);
            } else {
                xdd.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public final String f(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a2 = a(10, 0, j2);
            if (a2 != -1) {
                return g(a2);
            }
            if (j2 < this.b && c(j2 - 1) == 13 && c(j2) == 10) {
                return g(j2);
            }
            xcq xcq = new xcq();
            a(xcq, 0, Math.min(32, this.b));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.b, j));
            sb.append(" content=");
            sb.append(xcq.n().f());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public final xdd f(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        xdd xdd = this.a;
        if (xdd == null) {
            this.a = xde.a();
            xdd xdd2 = this.a;
            xdd2.g = xdd2;
            xdd2.f = xdd2;
            return xdd2;
        }
        xdd xdd3 = xdd.g;
        if (xdd3.c + i > 8192 || !xdd3.e) {
            xdd3 = xdd3.a(xde.a());
        }
        return xdd3;
    }

    public final void flush() {
    }

    /* access modifiers changed from: 0000 */
    public final String g(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c(j2) == 13) {
                String e = e(j2);
                i(2);
                return e;
            }
        }
        String e2 = e(j);
        i(1);
        return e2;
    }

    public final short g() {
        if (this.b >= 2) {
            xdd xdd = this.a;
            int i = xdd.b;
            int i2 = xdd.c;
            if (i2 - i < 2) {
                return (short) (((f() & 255) << 8) | (f() & 255));
            }
            byte[] bArr = xdd.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b -= 2;
            if (i4 == i2) {
                this.a = xdd.b();
                xde.a(xdd);
            } else {
                xdd.b = i4;
            }
            return (short) b2;
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    public final int h() {
        if (this.b >= 4) {
            xdd xdd = this.a;
            int i = xdd.b;
            int i2 = xdd.c;
            if (i2 - i < 4) {
                return ((f() & 255) << 24) | ((f() & 255) << 16) | ((f() & 255) << 8) | (f() & 255);
            }
            byte[] bArr = xdd.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b3 = b2 | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b4 = b3 | (bArr[i5] & 255);
            this.b -= 4;
            if (i6 == i2) {
                this.a = xdd.b();
                xde.a(xdd);
            } else {
                xdd.b = i6;
            }
            return b4;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    public final byte[] h(long j) {
        xdi.a(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            a(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int hashCode() {
        xdd xdd = this.a;
        if (xdd == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = xdd.b; i2 < xdd.c; i2++) {
                i = (i * 31) + xdd.a[i2];
            }
            xdd = xdd.f;
        } while (xdd != this.a);
        return i;
    }

    public final short i() {
        return xdi.a(g());
    }

    public final void i(long j) {
        while (j > 0) {
            xdd xdd = this.a;
            if (xdd != null) {
                int min = (int) Math.min(j, (long) (xdd.c - this.a.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                this.a.b += min;
                if (this.a.b == this.a.c) {
                    xdd xdd2 = this.a;
                    this.a = xdd2.b();
                    xde.a(xdd2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final boolean isOpen() {
        return true;
    }

    public final int j() {
        return xdi.a(h());
    }

    /* renamed from: j */
    public final xcq o(long j) {
        long a2 = xdi.a(j);
        xdd f = f(8);
        byte[] bArr = f.a;
        int i = f.c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((a2 >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((a2 >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((a2 >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((a2 >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((a2 >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((a2 >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((a2 >>> 8) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) (a2 & 255));
        f.c = i9;
        this.b += 8;
        return this;
    }

    public final long k() {
        long j;
        if (this.b >= 8) {
            xdd xdd = this.a;
            int i = xdd.b;
            int i2 = xdd.c;
            if (i2 - i < 8) {
                j = ((((long) h()) & 4294967295L) << 32) | (4294967295L & ((long) h()));
            } else {
                byte[] bArr = xdd.a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
                int i9 = i8 + 1;
                long j3 = ((((long) bArr[i8]) & 255) << 8) | j2;
                int i10 = i9 + 1;
                long j4 = (((long) bArr[i9]) & 255) | j3;
                this.b -= 8;
                if (i10 == i2) {
                    this.a = xdd.b();
                    xde.a(xdd);
                } else {
                    xdd.b = i10;
                }
                j = j4;
            }
            return xdi.a(j);
        }
        StringBuilder sb = new StringBuilder("size < 8: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public final xcq n(long j) {
        if (j == 0) {
            return j(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        xdd f = f(i);
        byte[] bArr = f.a;
        int i2 = f.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        f.c += i;
        this.b += (long) i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r10 != r11) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r0.a = r15.b();
        defpackage.xde.a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r15.b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r4 != false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bf
            r1 = -7
            r5 = 0
            r6 = r3
            r3 = 0
            r4 = 0
        L_0x0010:
            xdd r8 = r0.a
            byte[] r9 = r8.a
            int r10 = r8.b
            int r11 = r8.c
        L_0x0018:
            r12 = 1
            if (r10 >= r11) goto L_0x009e
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x006d
            r15 = 57
            if (r13 > r15) goto L_0x006d
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0043
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = r8
            r16 = r9
            if (r12 != 0) goto L_0x003c
            long r8 = (long) r14
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            r8 = 10
            long r6 = r6 * r8
            long r8 = (long) r14
            long r6 = r6 + r8
            goto L_0x007a
        L_0x0043:
            xcq r1 = new xcq
            r1.<init>()
            xcq r1 = r1.n(r6)
            xcq r1 = r1.j(r13)
            if (r3 != 0) goto L_0x0055
            r1.f()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r1 = r1.o()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006d:
            r15 = r8
            r16 = r9
            r8 = 45
            if (r13 != r8) goto L_0x0082
            if (r5 != 0) goto L_0x0082
            r8 = 1
            long r1 = r1 - r8
            r3 = 1
        L_0x007a:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r8 = r15
            r9 = r16
            goto L_0x0018
        L_0x0082:
            if (r5 == 0) goto L_0x0086
            r4 = 1
            goto L_0x009f
        L_0x0086:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009e:
            r15 = r8
        L_0x009f:
            if (r10 != r11) goto L_0x00ab
            xdd r8 = r15.b()
            r0.a = r8
            defpackage.xde.a(r15)
            goto L_0x00ae
        L_0x00ab:
            r8 = r15
            r8.b = r10
        L_0x00ae:
            if (r4 != 0) goto L_0x00b4
            xdd r8 = r0.a
            if (r8 != 0) goto L_0x0010
        L_0x00b4:
            long r1 = r0.b
            long r4 = (long) r5
            long r1 = r1 - r4
            r0.b = r1
            if (r3 == 0) goto L_0x00bd
            return r6
        L_0x00bd:
            long r1 = -r6
            return r1
        L_0x00bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00c8
        L_0x00c7:
            throw r1
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcq.l():long");
    }

    /* renamed from: l */
    public final xcq m(long j) {
        if (j == 0) {
            return j(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        xdd f = f(numberOfTrailingZeros);
        byte[] bArr = f.a;
        int i = f.c;
        for (int i2 = (f.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        f.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r15.a = r6.b();
        defpackage.xde.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r5 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
            r15 = this;
            long r0 = r15.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a7
            r0 = 0
            r0 = r2
            r4 = 0
            r5 = 0
        L_0x000c:
            xdd r6 = r15.a
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0014:
            if (r8 >= r9) goto L_0x008c
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0023
            r11 = 57
            if (r10 > r11) goto L_0x0023
            int r11 = r10 + -48
            goto L_0x003b
        L_0x0023:
            r11 = 97
            if (r10 < r11) goto L_0x0030
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0030
            int r11 = r10 + -97
        L_0x002d:
            int r11 = r11 + 10
            goto L_0x003b
        L_0x0030:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002d
        L_0x003b:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r0
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004b
            r10 = 4
            long r0 = r0 << r10
            long r10 = (long) r11
            long r0 = r0 | r10
            int r8 = r8 + 1
            int r4 = r4 + 1
            goto L_0x0014
        L_0x004b:
            xcq r2 = new xcq
            r2.<init>()
            xcq r0 = r2.m(r0)
            xcq r0 = r0.j(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.o()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r4 == 0) goto L_0x0074
            r5 = 1
            goto L_0x008c
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r8 != r9) goto L_0x0098
            xdd r7 = r6.b()
            r15.a = r7
            defpackage.xde.a(r6)
            goto L_0x009a
        L_0x0098:
            r6.b = r8
        L_0x009a:
            if (r5 != 0) goto L_0x00a0
            xdd r6 = r15.a
            if (r6 != 0) goto L_0x000c
        L_0x00a0:
            long r2 = r15.b
            long r4 = (long) r4
            long r2 = r2 - r4
            r15.b = r2
            return r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b0
        L_0x00af:
            throw r0
        L_0x00b0:
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcq.m():long");
    }

    public final ByteString n() {
        return new ByteString(q());
    }

    public final String o() {
        try {
            return a(this.b, xdi.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String p() {
        return f(Long.MAX_VALUE);
    }

    public final byte[] q() {
        try {
            return h(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void r() {
        try {
            i(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        xdd xdd = this.a;
        if (xdd == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), xdd.c - xdd.b);
        byteBuffer.put(xdd.a, xdd.b, min);
        xdd.b += min;
        this.b -= (long) min;
        if (xdd.b == xdd.c) {
            this.a = xdd.b();
            xde.a(xdd);
        }
        return min;
    }

    /* renamed from: s */
    public final xcq clone() {
        xcq xcq = new xcq();
        if (this.b == 0) {
            return xcq;
        }
        xcq.a = this.a.a();
        xdd xdd = xcq.a;
        xdd.g = xdd;
        xdd.f = xdd;
        xdd xdd2 = this.a;
        while (true) {
            xdd2 = xdd2.f;
            if (xdd2 != this.a) {
                xcq.a.g.a(xdd2.a());
            } else {
                xcq.b = this.b;
                return xcq;
            }
        }
    }

    public final ByteString t() {
        long j = this.b;
        if (j <= 2147483647L) {
            return k((int) j);
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.b);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return t().toString();
    }

    public final /* bridge */ /* synthetic */ xcr u() {
        return this;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                xdd f = f(1);
                int min = Math.min(i, 8192 - f.c);
                byteBuffer.get(f.a, f.c, min);
                i -= min;
                f.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }
}
