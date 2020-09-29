package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: wmg reason: default package */
public abstract class wmg implements Closeable {
    public Reader b;

    /* renamed from: wmg$a */
    public static final class a extends Reader {
        private final wom a;
        private final Charset b;
        private boolean c;
        private Reader d;

        public a(wom wom, Charset charset) {
            this.a = wom;
            this.b = charset;
        }

        public final int read(char[] cArr, int i, int i2) {
            if (!this.c) {
                Reader reader = this.d;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.a.d(), wmk.a(this.a, this.b));
                    this.d = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
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
    }

    public abstract wlz a();

    public abstract long b();

    public abstract wom c();

    public final InputStream d() {
        return c().d();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] e() {
        long b2 = b();
        if (b2 <= 2147483647L) {
            wom c = c();
            try {
                byte[] q = c.q();
                wmk.a((Closeable) c);
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
                wmk.a((Closeable) c);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot buffer entire body for content length: ");
            sb2.append(b2);
            throw new IOException(sb2.toString());
        }
    }

    public final String f() {
        wom c = c();
        try {
            return c.a(wmk.a(c, g()));
        } finally {
            wmk.a((Closeable) c);
        }
    }

    public Charset g() {
        wlz a2 = a();
        return a2 != null ? a2.a(wmk.d) : wmk.d;
    }

    public void close() {
        wmk.a((Closeable) c());
    }

    public static wmg a(wlz wlz, byte[] bArr) {
        return a(null, (long) bArr.length, new wok().c(bArr));
    }

    public static wmg a(final wlz wlz, final long j, final wom wom) {
        if (wom != null) {
            return new wmg() {
                public final wlz a() {
                    return wlz.this;
                }

                public final long b() {
                    return j;
                }

                public final wom c() {
                    return wom;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
