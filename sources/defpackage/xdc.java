package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: xdc reason: default package */
final class xdc implements xcs {
    public final xcq a = new xcq();
    public final xdg b;
    boolean c;

    xdc(xdg xdg) {
        if (xdg != null) {
            this.b = xdg;
            return;
        }
        throw new NullPointerException("source == null");
    }

    private long a(byte b2, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long a2 = this.a.a(b2, j, j2);
                if (a2 == -1) {
                    long j3 = this.a.b;
                    if (j3 >= j2 || this.b.a(this.a, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a2;
                }
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(0), Long.valueOf(j2)}));
        }
    }

    public final long a(byte b2) {
        return a(0, 0, Long.MAX_VALUE);
    }

    public final long a(xcq xcq, long j) {
        if (xcq == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else if (this.a.b == 0 && this.b.a(this.a, 8192) == -1) {
            return -1;
        } else {
            return this.a.a(xcq, Math.min(j, this.a.b));
        }
    }

    public final long a(xdf xdf) {
        long j = 0;
        while (this.b.a(this.a, 8192) != -1) {
            long e = this.a.e();
            if (e > 0) {
                j += e;
                xdf.a_(this.a, e);
            }
        }
        if (this.a.b <= 0) {
            return j;
        }
        long j2 = j + this.a.b;
        xcq xcq = this.a;
        xdf.a_(xcq, xcq.b);
        return j2;
    }

    public final String a(Charset charset) {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final xdh a() {
        return this.b.a();
    }

    public final void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    public final void a(byte[] bArr) {
        try {
            a((long) bArr.length);
            this.a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.a.b > 0) {
                xcq xcq = this.a;
                int a2 = xcq.a(bArr, i, (int) xcq.b);
                if (a2 != -1) {
                    i += a2;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final boolean a(long j, ByteString byteString) {
        int h = byteString.h();
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (h < 0 || byteString.h() < h) {
            return false;
        } else {
            for (int i = 0; i < h; i++) {
                long j2 = 0 + ((long) i);
                if (!b(1 + j2) || this.a.c(j2) != byteString.a(i + 0)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final xcq b() {
        return this.a;
    }

    public final boolean b(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.c) {
            while (this.a.b < j) {
                if (this.b.a(this.a, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final boolean c() {
        if (!this.c) {
            return this.a.c() && this.b.a(this.a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.r();
        }
    }

    public final InputStream d() {
        return new InputStream() {
            public final int available() {
                if (!xdc.this.c) {
                    return (int) Math.min(xdc.this.a.b, 2147483647L);
                }
                throw new IOException("closed");
            }

            public final void close() {
                xdc.this.close();
            }

            public final int read() {
                if (xdc.this.c) {
                    throw new IOException("closed");
                } else if (xdc.this.a.b == 0 && xdc.this.b.a(xdc.this.a, 8192) == -1) {
                    return -1;
                } else {
                    return xdc.this.a.f() & 255;
                }
            }

            public final int read(byte[] bArr, int i, int i2) {
                if (!xdc.this.c) {
                    xdi.a((long) bArr.length, (long) i, (long) i2);
                    if (xdc.this.a.b == 0 && xdc.this.b.a(xdc.this.a, 8192) == -1) {
                        return -1;
                    }
                    return xdc.this.a.a(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(xdc.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final ByteString d(long j) {
        a(j);
        return this.a.d(j);
    }

    public final String e(long j) {
        a(j);
        return this.a.e(j);
    }

    public final byte f() {
        a(1);
        return this.a.f();
    }

    public final String f(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a(10, 0, j2);
            if (a2 != -1) {
                return this.a.g(a2);
            }
            if (j2 < Long.MAX_VALUE && b(j2) && this.a.c(j2 - 1) == 13 && b(1 + j2) && this.a.c(j2) == 10) {
                return this.a.g(j2);
            }
            xcq xcq = new xcq();
            xcq xcq2 = this.a;
            xcq2.a(xcq, 0, Math.min(32, xcq2.b));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.a.b, j));
            sb.append(" content=");
            sb.append(xcq.n().f());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final short g() {
        a(2);
        return this.a.g();
    }

    public final int h() {
        a(4);
        return this.a.h();
    }

    public final byte[] h(long j) {
        a(j);
        return this.a.h(j);
    }

    public final short i() {
        a(2);
        return xdi.a(this.a.g());
    }

    public final void i(long j) {
        if (!this.c) {
            while (j > 0) {
                if (this.a.b == 0 && this.b.a(this.a, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.b);
                this.a.i(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final int j() {
        a(4);
        return xdi.a(this.a.h());
    }

    public final long k() {
        a(8);
        return this.a.k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l() {
        /*
            r6 = this;
            r0 = 1
            r6.a(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L_0x0040
            xcq r3 = r6.a
            long r4 = (long) r1
            byte r3 = r3.c(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            xcq r0 = r6.a
            long r0 = r0.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdc.l():long");
    }

    public final long m() {
        a(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!b((long) i2)) {
                break;
            }
            byte c2 = this.a.c((long) i);
            if ((c2 >= 48 && c2 <= 57) || ((c2 >= 97 && c2 <= 102) || (c2 >= 65 && c2 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(c2)}));
            }
        }
        return this.a.m();
    }

    public final String p() {
        return f(Long.MAX_VALUE);
    }

    public final byte[] q() {
        this.a.a(this.b);
        return this.a.q();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (this.a.b == 0 && this.b.a(this.a, 8192) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
