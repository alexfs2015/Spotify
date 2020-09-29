package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* renamed from: wag reason: default package */
final class wag {
    private static final boolean a = PlatformDependent.f();

    static byte a(long j) {
        return PlatformDependent.a(j);
    }

    static short b(long j) {
        if (a) {
            short b = PlatformDependent.b(j);
            return PlatformDependent.a ? b : Short.reverseBytes(b);
        }
        return (short) ((PlatformDependent.a(j + 1) & 255) | (PlatformDependent.a(j) << 8));
    }

    static short c(long j) {
        if (a) {
            short b = PlatformDependent.b(j);
            if (PlatformDependent.a) {
                b = Short.reverseBytes(b);
            }
            return b;
        }
        return (short) ((PlatformDependent.a(j + 1) << 8) | (PlatformDependent.a(j) & 255));
    }

    static int d(long j) {
        if (a) {
            int c = PlatformDependent.c(j);
            return PlatformDependent.a ? c : Integer.reverseBytes(c);
        }
        return (PlatformDependent.a(j + 3) & 255) | (PlatformDependent.a(j) << 24) | ((PlatformDependent.a(1 + j) & 255) << 16) | ((PlatformDependent.a(2 + j) & 255) << 8);
    }

    static int e(long j) {
        if (a) {
            int c = PlatformDependent.c(j);
            if (PlatformDependent.a) {
                c = Integer.reverseBytes(c);
            }
            return c;
        }
        return (PlatformDependent.a(j + 3) << 24) | (PlatformDependent.a(j) & 255) | ((PlatformDependent.a(1 + j) & 255) << 8) | ((PlatformDependent.a(2 + j) & 255) << 16);
    }

    static long f(long j) {
        if (a) {
            long d = PlatformDependent.d(j);
            return PlatformDependent.a ? d : Long.reverseBytes(d);
        }
        return (((long) PlatformDependent.a(j + 7)) & 255) | (((long) PlatformDependent.a(j)) << 56) | ((((long) PlatformDependent.a(1 + j)) & 255) << 48) | ((((long) PlatformDependent.a(2 + j)) & 255) << 40) | ((((long) PlatformDependent.a(3 + j)) & 255) << 32) | ((((long) PlatformDependent.a(4 + j)) & 255) << 24) | ((((long) PlatformDependent.a(5 + j)) & 255) << 16) | ((((long) PlatformDependent.a(6 + j)) & 255) << 8);
    }

    static void a(long j, int i) {
        PlatformDependent.a(j, (byte) i);
    }

    static void b(long j, int i) {
        if (a) {
            short s = (short) i;
            if (!PlatformDependent.a) {
                s = Short.reverseBytes(s);
            }
            PlatformDependent.a(j, s);
            return;
        }
        PlatformDependent.a(j, (byte) (i >>> 8));
        PlatformDependent.a(j + 1, (byte) i);
    }

    static void c(long j, int i) {
        if (a) {
            if (!PlatformDependent.a) {
                i = Integer.reverseBytes(i);
            }
            PlatformDependent.a(j, i);
            return;
        }
        PlatformDependent.a(j, (byte) (i >>> 24));
        PlatformDependent.a(1 + j, (byte) (i >>> 16));
        PlatformDependent.a(2 + j, (byte) (i >>> 8));
        PlatformDependent.a(j + 3, (byte) i);
    }

    static void a(long j, long j2) {
        if (a) {
            if (!PlatformDependent.a) {
                j2 = Long.reverseBytes(j2);
            }
            PlatformDependent.a(j, j2);
            return;
        }
        PlatformDependent.a(j, (byte) ((int) (j2 >>> 56)));
        PlatformDependent.a(1 + j, (byte) ((int) (j2 >>> 48)));
        PlatformDependent.a(2 + j, (byte) ((int) (j2 >>> 40)));
        PlatformDependent.a(3 + j, (byte) ((int) (j2 >>> 32)));
        PlatformDependent.a(4 + j, (byte) ((int) (j2 >>> 24)));
        PlatformDependent.a(5 + j, (byte) ((int) (j2 >>> 16)));
        PlatformDependent.a(6 + j, (byte) ((int) (j2 >>> 8)));
        PlatformDependent.a(j + 7, (byte) ((int) j2));
    }

    static byte a(byte[] bArr, int i) {
        return PlatformDependent.a(bArr, i);
    }

    static short b(byte[] bArr, int i) {
        if (a) {
            short b = PlatformDependent.b(bArr, i);
            return PlatformDependent.a ? b : Short.reverseBytes(b);
        }
        return (short) ((PlatformDependent.a(bArr, i + 1) & 255) | (PlatformDependent.a(bArr, i) << 8));
    }

    static short c(byte[] bArr, int i) {
        if (!a) {
            return (short) ((PlatformDependent.a((long) i) & 255) | (PlatformDependent.a((long) (i + 1)) << 8));
        }
        short b = PlatformDependent.b(bArr, i);
        if (PlatformDependent.a) {
            b = Short.reverseBytes(b);
        }
        return b;
    }

    static int d(byte[] bArr, int i) {
        if (a) {
            int c = PlatformDependent.c(bArr, i);
            return PlatformDependent.a ? c : Integer.reverseBytes(c);
        }
        return (PlatformDependent.a(bArr, i + 3) & 255) | (PlatformDependent.a(bArr, i) << 24) | ((PlatformDependent.a(bArr, i + 1) & 255) << 16) | ((PlatformDependent.a(bArr, i + 2) & 255) << 8);
    }

    static int e(byte[] bArr, int i) {
        if (a) {
            int c = PlatformDependent.c(bArr, i);
            if (PlatformDependent.a) {
                c = Integer.reverseBytes(c);
            }
            return c;
        }
        return (PlatformDependent.a(bArr, i + 3) << 24) | (PlatformDependent.a(bArr, i) & 255) | ((PlatformDependent.a(bArr, i + 1) & 255) << 8) | ((PlatformDependent.a(bArr, i + 2) & 255) << 16);
    }

    static long f(byte[] bArr, int i) {
        if (a) {
            long d = PlatformDependent.d(bArr, i);
            return PlatformDependent.a ? d : Long.reverseBytes(d);
        }
        return (((long) PlatformDependent.a(bArr, i + 7)) & 255) | (((long) PlatformDependent.a(bArr, i)) << 56) | ((((long) PlatformDependent.a(bArr, i + 1)) & 255) << 48) | ((((long) PlatformDependent.a(bArr, i + 2)) & 255) << 40) | ((((long) PlatformDependent.a(bArr, i + 3)) & 255) << 32) | ((((long) PlatformDependent.a(bArr, i + 4)) & 255) << 24) | ((((long) PlatformDependent.a(bArr, i + 5)) & 255) << 16) | ((((long) PlatformDependent.a(bArr, i + 6)) & 255) << 8);
    }

    static void a(byte[] bArr, int i, int i2) {
        PlatformDependent.a(bArr, i, (byte) i2);
    }

    static void b(byte[] bArr, int i, int i2) {
        if (a) {
            short s = (short) i2;
            if (!PlatformDependent.a) {
                s = Short.reverseBytes(s);
            }
            PlatformDependent.a(bArr, i, s);
            return;
        }
        PlatformDependent.a(bArr, i, (byte) (i2 >>> 8));
        PlatformDependent.a(bArr, i + 1, (byte) i2);
    }

    static void c(byte[] bArr, int i, int i2) {
        if (a) {
            if (!PlatformDependent.a) {
                i2 = Integer.reverseBytes(i2);
            }
            PlatformDependent.a(bArr, i, i2);
            return;
        }
        PlatformDependent.a(bArr, i, (byte) (i2 >>> 24));
        PlatformDependent.a(bArr, i + 1, (byte) (i2 >>> 16));
        PlatformDependent.a(bArr, i + 2, (byte) (i2 >>> 8));
        PlatformDependent.a(bArr, i + 3, (byte) i2);
    }

    static void a(byte[] bArr, int i, long j) {
        if (a) {
            if (!PlatformDependent.a) {
                j = Long.reverseBytes(j);
            }
            PlatformDependent.a(bArr, i, j);
            return;
        }
        PlatformDependent.a(bArr, i, (byte) ((int) (j >>> 56)));
        PlatformDependent.a(bArr, i + 1, (byte) ((int) (j >>> 48)));
        PlatformDependent.a(bArr, i + 2, (byte) ((int) (j >>> 40)));
        PlatformDependent.a(bArr, i + 3, (byte) ((int) (j >>> 32)));
        PlatformDependent.a(bArr, i + 4, (byte) ((int) (j >>> 24)));
        PlatformDependent.a(bArr, i + 5, (byte) ((int) (j >>> 16)));
        PlatformDependent.a(bArr, i + 6, (byte) ((int) (j >>> 8)));
        PlatformDependent.a(bArr, i + 7, (byte) ((int) j));
    }

    static void d(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            PlatformDependent.a(bArr, i, (long) i2, 0);
        }
    }

    static void a(vym vym, long j, int i, vyv vyv, int i2, int i3) {
        vym.k(i, i3);
        wjk.a(vyv, "dst");
        if (wjg.a(i2, i3, vyv.P())) {
            StringBuilder sb = new StringBuilder("dstIndex: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (vyv.I()) {
            PlatformDependent.a(j, vyv.L() + ((long) i2), (long) i3);
        } else if (vyv.G()) {
            PlatformDependent.a(j, vyv.H(), vyv.C() + i2, (long) i3);
        } else {
            vyv.b(i2, (vyv) vym, i, i3);
        }
    }

    static void a(vym vym, long j, int i, byte[] bArr, int i2, int i3) {
        vym.k(i, i3);
        wjk.a(bArr, "dst");
        if (wjg.a(i2, i3, bArr.length)) {
            StringBuilder sb = new StringBuilder("dstIndex: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 != 0) {
            PlatformDependent.a(j, bArr, i2, (long) i3);
        }
    }

    static void a(vym vym, long j, int i, ByteBuffer byteBuffer) {
        vym.k(i, byteBuffer.remaining());
        if (byteBuffer.remaining() != 0) {
            if (byteBuffer.isDirect()) {
                if (!byteBuffer.isReadOnly()) {
                    PlatformDependent.a(j, PlatformDependent.b(byteBuffer) + ((long) byteBuffer.position()), (long) byteBuffer.remaining());
                    byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                    return;
                }
                throw new ReadOnlyBufferException();
            } else if (byteBuffer.hasArray()) {
                PlatformDependent.a(j, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), (long) byteBuffer.remaining());
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            } else {
                byteBuffer.put(vym.v());
            }
        }
    }

    static void b(vym vym, long j, int i, vyv vyv, int i2, int i3) {
        vym.k(i, i3);
        wjk.a(vyv, "src");
        if (!wjg.a(i2, i3, vyv.P())) {
            if (i3 != 0) {
                if (vyv.I()) {
                    PlatformDependent.a(vyv.L() + ((long) i2), j, (long) i3);
                    return;
                } else if (vyv.G()) {
                    PlatformDependent.a(vyv.H(), vyv.C() + i2, j, (long) i3);
                    return;
                } else {
                    vyv.a(i2, (vyv) vym, i, i3);
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("srcIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    static void b(vym vym, long j, int i, byte[] bArr, int i2, int i3) {
        vym.k(i, i3);
        if (i3 != 0) {
            PlatformDependent.a(bArr, i2, j, (long) i3);
        }
    }

    static void b(vym vym, long j, int i, ByteBuffer byteBuffer) {
        vym.k(i, byteBuffer.remaining());
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            if (byteBuffer.isDirect()) {
                PlatformDependent.a(PlatformDependent.b(byteBuffer) + ((long) byteBuffer.position()), j, (long) byteBuffer.remaining());
                byteBuffer.position(byteBuffer.position() + remaining);
            } else if (byteBuffer.hasArray()) {
                PlatformDependent.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), j, (long) remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                vyv c = vym.D().c(remaining);
                try {
                    byte[] H = c.H();
                    byteBuffer.get(H, c.C(), remaining);
                    PlatformDependent.a(H, c.C(), j, (long) remaining);
                } finally {
                    c.B();
                }
            }
        }
    }

    static void a(vym vym, long j, int i, int i2) {
        if (i2 != 0) {
            vym.k(i, i2);
            PlatformDependent.a(j, (long) i2, 0);
        }
    }

    static wac a(vyw vyw, int i, int i2) {
        if (PlatformDependent.l()) {
            return new wae(vyw, i, i2);
        }
        return new wac(vyw, i, i2);
    }
}
