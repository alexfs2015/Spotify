package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: xam reason: default package */
public abstract class xam implements Closeable {
    public Reader b;

    /* renamed from: xam$a */
    public static final class a extends Reader {
        private final xcs a;
        private final Charset b;
        private boolean c;
        private Reader d;

        public a(xcs xcs, Charset charset) {
            this.a = xcs;
            this.b = charset;
        }

        public final void close() {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }

        public final int read(char[] cArr, int i, int i2) {
            if (!this.c) {
                Reader reader = this.d;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.a.d(), xaq.a(this.a, this.b));
                    this.d = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public static xam a(final xaf xaf, final long j, final xcs xcs) {
        if (xcs != null) {
            return new xam() {
                public final xaf a() {
                    return xaf.this;
                }

                public final long b() {
                    return j;
                }

                public final xcs c() {
                    return xcs;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static xam a(xaf xaf, byte[] bArr) {
        return a(null, (long) bArr.length, new xcq().c(bArr));
    }

    public abstract xaf a();

    public abstract long b();

    public abstract xcs c();

    public void close() {
        xaq.a((Closeable) c());
    }

    public final InputStream d() {
        return c().d();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] e() {
        long b2 = b();
        if (b2 <= 2147483647L) {
            xcs c = c();
            try {
                byte[] q = c.q();
                xaq.a((Closeable) c);
                if (b2 == -1 || b2 == ((long) q.length)) {
                    return q;
                }
                StringBuilder sb = new StringBuilder("Content-Length (");
                sb.append(b2);
                sb.append(") and stream length (");
                sb.append(q.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                xaq.a((Closeable) c);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot buffer entire body for content length: ");
            sb2.append(b2);
            throw new IOException(sb2.toString());
        }
    }

    public final String f() {
        xcs c = c();
        try {
            return c.a(xaq.a(c, g()));
        } finally {
            xaq.a((Closeable) c);
        }
    }

    public Charset g() {
        xaf a2 = a();
        return a2 != null ? a2.a(xaq.d) : xaq.d;
    }
}
