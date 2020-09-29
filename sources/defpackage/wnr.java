package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: wnr reason: default package */
final class wnr implements Closeable {
    private static final Logger b = Logger.getLogger(wnm.class.getName());
    int a = 16384;
    private final wol c;
    private final boolean d;
    private final wok e = new wok();
    private boolean f;
    private b g = new b(this.e);

    wnr(wol wol, boolean z) {
        this.c = wol;
        this.d = z;
    }

    public final synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.d) {
            if (b.isLoggable(Level.FINE)) {
                b.fine(wmk.a(">> CONNECTION %s", wnm.a.f()));
            }
            this.c.c(wnm.a.i());
            this.c.flush();
        }
    }

    public final synchronized void a(wnu wnu) {
        if (!this.f) {
            int i = this.a;
            if ((wnu.a & 32) != 0) {
                i = wnu.b[5];
            }
            this.a = i;
            if (wnu.a() != -1) {
                this.g.a(wnu.a());
            }
            a(0, 0, 4, 1);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b() {
        if (!this.f) {
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z, int i, List<wnk> list) {
        if (this.f) {
            throw new IOException("closed");
        } else if (!this.f) {
            this.g.a(list);
            long j = this.e.b;
            int min = (int) Math.min((long) this.a, j);
            long j2 = (long) min;
            byte b2 = j == j2 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i, min, 1, b2);
            this.c.a_(this.e, j2);
            if (j > j2) {
                b(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, ErrorCode errorCode) {
        if (this.f) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            a(i, 4, 3, 0);
            this.c.h(errorCode.httpCode);
            this.c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(boolean z, int i, wok wok, int i2) {
        if (!this.f) {
            a(i, i2, 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.c.a_(wok, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(wnu wnu) {
        if (!this.f) {
            int i = 0;
            a(0, Integer.bitCount(wnu.a) * 6, 4, 0);
            while (i < 10) {
                if (wnu.a(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.c.i(i2);
                    this.c.h(wnu.b[i]);
                }
                i++;
            }
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z, int i, int i2) {
        if (!this.f) {
            a(0, 8, 6, z ? (byte) 1 : 0);
            this.c.h(i);
            this.c.h(i2);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            a(0, bArr.length + 8, 7, 0);
            this.c.h(i);
            this.c.h(errorCode.httpCode);
            if (bArr.length > 0) {
                this.c.c(bArr);
            }
            this.c.flush();
        } else {
            throw wnm.a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw wnm.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            a(i, 4, 8, 0);
            this.c.h((int) j);
            this.c.flush();
        }
    }

    private void a(int i, int i2, byte b2, byte b3) {
        if (b.isLoggable(Level.FINE)) {
            b.fine(wnm.a(false, i, i2, b2, b3));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw wnm.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            a(this.c, i2);
            this.c.j(b2 & 255);
            this.c.j(b3 & 255);
            this.c.h(i & Integer.MAX_VALUE);
        } else {
            throw wnm.a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void close() {
        this.f = true;
        this.c.close();
    }

    private static void a(wol wol, int i) {
        wol.j((i >>> 16) & 255);
        wol.j((i >>> 8) & 255);
        wol.j(i & 255);
    }

    private void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.a, j);
            long j2 = (long) min;
            j -= j2;
            a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.c.a_(this.e, j2);
        }
    }
}
