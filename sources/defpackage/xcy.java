package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: xcy reason: default package */
public final class xcy implements xdg {
    private int a = 0;
    private final xcs b;
    private final Inflater c;
    private final xcz d;
    private final CRC32 e = new CRC32();

    public xcy(xdg xdg) {
        if (xdg != null) {
            this.c = new Inflater(true);
            this.b = xda.a(xdg);
            this.d = new xcz(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    private void a(xcq xcq, long j, long j2) {
        xdd xdd = xcq.a;
        while (j >= ((long) (xdd.c - xdd.b))) {
            j -= (long) (xdd.c - xdd.b);
            xdd = xdd.f;
        }
        while (j2 > 0) {
            int i = (int) (((long) xdd.b) + j);
            int min = (int) Math.min((long) (xdd.c - i), j2);
            this.e.update(xdd.a, i, min);
            j2 -= (long) min;
            xdd = xdd.f;
            j = 0;
        }
    }

    public final long a(xcq xcq, long j) {
        long j2;
        xcq xcq2 = xcq;
        long j3 = j;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (j3 == 0) {
            return 0;
        } else {
            if (this.a == 0) {
                this.b.a(10);
                byte c2 = this.b.b().c(3);
                boolean z = ((c2 >> 1) & 1) == 1;
                if (z) {
                    a(this.b.b(), 0, 10);
                }
                a("ID1ID2", 8075, (int) this.b.g());
                this.b.i(8);
                if (((c2 >> 2) & 1) == 1) {
                    this.b.a(2);
                    if (z) {
                        a(this.b.b(), 0, 2);
                    }
                    long i = (long) this.b.b().i();
                    this.b.a(i);
                    if (z) {
                        j2 = i;
                        a(this.b.b(), 0, i);
                    } else {
                        j2 = i;
                    }
                    this.b.i(j2);
                }
                if (((c2 >> 3) & 1) == 1) {
                    long a2 = this.b.a(0);
                    if (a2 != -1) {
                        if (z) {
                            a(this.b.b(), 0, a2 + 1);
                        }
                        this.b.i(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((c2 >> 4) & 1) == 1) {
                    long a3 = this.b.a(0);
                    if (a3 != -1) {
                        if (z) {
                            a(this.b.b(), 0, a3 + 1);
                        }
                        this.b.i(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", (int) this.b.i(), (int) (short) ((int) this.e.getValue()));
                    this.e.reset();
                }
                this.a = 1;
            }
            if (this.a == 1) {
                long j4 = xcq2.b;
                long a4 = this.d.a(xcq2, j3);
                if (a4 != -1) {
                    a(xcq, j4, a4);
                    return a4;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                a("CRC", this.b.j(), (int) this.e.getValue());
                a("ISIZE", this.b.j(), (int) this.c.getBytesWritten());
                this.a = 3;
                if (!this.b.c()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final xdh a() {
        return this.b.a();
    }

    public final void close() {
        this.d.close();
    }
}
