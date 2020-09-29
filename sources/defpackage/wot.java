package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: wot reason: default package */
public final class wot implements wpa {
    private final wom a;
    private final Inflater b;
    private int c;
    private boolean d;

    wot(wom wom, Inflater inflater) {
        if (wom == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.a = wom;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final long a(wok wok, long j) {
        wox f;
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.b.needsInput()) {
                    b();
                    if (this.b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.a.c()) {
                        z = true;
                    } else {
                        wox wox = this.a.b().a;
                        this.c = wox.c - wox.b;
                        this.b.setInput(wox.a, wox.b, this.c);
                    }
                }
                try {
                    f = wok.f(1);
                    int inflate = this.b.inflate(f.a, f.c, (int) Math.min(j, (long) (8192 - f.c)));
                    if (inflate > 0) {
                        f.c += inflate;
                        long j2 = (long) inflate;
                        wok.b += j2;
                        return j2;
                    } else if (this.b.finished()) {
                        break;
                    } else if (this.b.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            b();
            if (f.b == f.c) {
                wok.a = f.b();
                woy.a(f);
            }
            return -1;
        }
    }

    private void b() {
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.a.i((long) remaining);
        }
    }

    public final wpb a() {
        return this.a.a();
    }

    public final void close() {
        if (!this.d) {
            this.b.end();
            this.d = true;
            this.a.close();
        }
    }
}
