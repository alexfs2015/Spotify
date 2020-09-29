package defpackage;

import java.util.zip.Deflater;

/* renamed from: won reason: default package */
public final class won implements woz {
    private final wol a;
    private final Deflater b;
    private boolean c;

    won(wol wol, Deflater deflater) {
        if (wol == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.a = wol;
            this.b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final void a_(wok wok, long j) {
        wpc.a(wok.b, 0, j);
        while (j > 0) {
            wox wox = wok.a;
            int min = (int) Math.min(j, (long) (wox.c - wox.b));
            this.b.setInput(wox.a, wox.b, min);
            a(false);
            long j2 = (long) min;
            wok.b -= j2;
            wox.b += min;
            if (wox.b == wox.c) {
                wok.a = wox.b();
                woy.a(wox);
            }
            j -= j2;
        }
    }

    private void a(boolean z) {
        wox f;
        int i;
        wok b2 = this.a.b();
        while (true) {
            f = b2.f(1);
            if (z) {
                i = this.b.deflate(f.a, f.c, 8192 - f.c, 2);
            } else {
                i = this.b.deflate(f.a, f.c, 8192 - f.c);
            }
            if (i > 0) {
                f.c += i;
                b2.b += (long) i;
                this.a.u();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (f.b == f.c) {
            b2.a = f.b();
            woy.a(f);
        }
    }

    public final void flush() {
        a(true);
        this.a.flush();
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
                wpc.a(th);
            }
        }
    }

    public final wpb a() {
        return this.a.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeflaterSink(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
