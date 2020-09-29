package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: wor reason: default package */
public final class wor implements woz {
    private final wol a;
    private final Deflater b;
    private final won c;
    private boolean d;
    private final CRC32 e = new CRC32();

    public wor(woz woz) {
        if (woz != null) {
            this.b = new Deflater(-1, true);
            this.a = wou.a(woz);
            this.c = new won(this.a, this.b);
            wok b2 = this.a.b();
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

    public final void a_(wok wok, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j != 0) {
            b(wok, j);
            this.c.a_(wok, j);
        }
    }

    public final void flush() {
        this.c.flush();
    }

    public final wpb a() {
        return this.a.a();
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
                wpc.a(th);
            }
        }
    }

    private void b(wok wok, long j) {
        wox wox = wok.a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (wox.c - wox.b));
            this.e.update(wox.a, wox.b, min);
            j -= (long) min;
            wox = wox.f;
        }
    }
}
