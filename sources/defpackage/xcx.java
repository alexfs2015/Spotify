package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: xcx reason: default package */
public final class xcx implements xdf {
    private final xcr a;
    private final Deflater b;
    private final xct c;
    private boolean d;
    private final CRC32 e = new CRC32();

    public xcx(xdf xdf) {
        if (xdf != null) {
            this.b = new Deflater(-1, true);
            this.a = xda.a(xdf);
            this.c = new xct(this.a, this.b);
            xcq b2 = this.a.b();
            b2.i(8075);
            b2.j(8);
            b2.j(0);
            b2.h(0);
            b2.j(0);
            b2.j(0);
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    private void b(xcq xcq, long j) {
        xdd xdd = xcq.a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (xdd.c - xdd.b));
            this.e.update(xdd.a, xdd.b, min);
            j -= (long) min;
            xdd = xdd.f;
        }
    }

    public final xdh a() {
        return this.a.a();
    }

    public final void a_(xcq xcq, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j != 0) {
            b(xcq, j);
            this.c.a_(xcq, j);
        }
    }

    public final void close() {
        if (!this.d) {
            Throwable th = null;
            try {
                this.c.b();
                this.a.g((int) this.e.getValue());
                this.a.g((int) this.b.getBytesRead());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.d = true;
            if (th != null) {
                xdi.a(th);
            }
        }
    }

    public final void flush() {
        this.c.flush();
    }
}
