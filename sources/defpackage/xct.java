package defpackage;

import java.util.zip.Deflater;

/* renamed from: xct reason: default package */
public final class xct implements xdf {
    private final xcr a;
    private final Deflater b;
    private boolean c;

    xct(xcr xcr, Deflater deflater) {
        if (xcr == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.a = xcr;
            this.b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void a(boolean z) {
        xdd f;
        xcq b2 = this.a.b();
        while (true) {
            f = b2.f(1);
            int deflate = z ? this.b.deflate(f.a, f.c, 8192 - f.c, 2) : this.b.deflate(f.a, f.c, 8192 - f.c);
            if (deflate > 0) {
                f.c += deflate;
                b2.b += (long) deflate;
                this.a.u();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (f.b == f.c) {
            b2.a = f.b();
            xde.a(f);
        }
    }

    public final xdh a() {
        return this.a.a();
    }

    public final void a_(xcq xcq, long j) {
        xdi.a(xcq.b, 0, j);
        while (j > 0) {
            xdd xdd = xcq.a;
            int min = (int) Math.min(j, (long) (xdd.c - xdd.b));
            this.b.setInput(xdd.a, xdd.b, min);
            a(false);
            long j2 = (long) min;
            xcq.b -= j2;
            xdd.b += min;
            if (xdd.b == xdd.c) {
                xcq.a = xdd.b();
                xde.a(xdd);
            }
            j -= j2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.b.finish();
        a(false);
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                b();
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
            this.c = true;
            if (th != null) {
                xdi.a(th);
            }
        }
    }

    public final void flush() {
        a(true);
        this.a.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeflaterSink(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
