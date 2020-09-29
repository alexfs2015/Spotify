package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: asl reason: default package */
public final class asl extends bbk implements HttpDataSource {
    private static final byte[] a = new byte[4096];
    private final a b;
    private final c c;
    private final String d;
    private final bdl<String> e = null;
    private final wli f;
    private final c g;
    private bbp h;
    private wmf i;
    private InputStream j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;

    static {
        aqd.a("goog.exo.okhttp");
    }

    public asl(a aVar, String str, bdl<String> bdl, wli wli, c cVar) {
        super(true);
        this.b = (a) bcu.a(aVar);
        this.d = str;
        this.f = wli;
        this.g = cVar;
        this.c = new c();
    }

    public final Uri a() {
        wmf wmf = this.i;
        if (wmf == null) {
            return null;
        }
        return Uri.parse(wmf.a.a.toString());
    }

    public final Map<String, List<String>> b() {
        wmf wmf = this.i;
        if (wmf == null) {
            return Collections.emptyMap();
        }
        return wmf.f.c();
    }

    public final long a(bbp bbp) {
        this.h = bbp;
        long j2 = 0;
        this.o = 0;
        this.n = 0;
        b(bbp);
        long j3 = bbp.e;
        long j4 = bbp.f;
        boolean a2 = bbp.a(1);
        wlx e2 = wlx.e(bbp.a.toString());
        if (e2 != null) {
            a a3 = new a().a(e2);
            wli wli = this.f;
            if (wli != null) {
                a3.a(wli);
            }
            c cVar = this.g;
            if (cVar != null) {
                for (Entry entry : cVar.a().entrySet()) {
                    a3.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            for (Entry entry2 : this.c.a().entrySet()) {
                a3.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            long j5 = -1;
            if (!(j3 == 0 && j4 == -1)) {
                StringBuilder sb = new StringBuilder("bytes=");
                sb.append(j3);
                sb.append("-");
                String sb2 = sb.toString();
                if (j4 != -1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append((j3 + j4) - 1);
                    sb2 = sb3.toString();
                }
                a3.b("Range", sb2);
            }
            String str = this.d;
            if (str != null) {
                a3.b("User-Agent", str);
            }
            if (!a2) {
                a3.b("Accept-Encoding", "identity");
            }
            wme wme = null;
            if (bbp.c != null) {
                wme = wme.a((wlz) null, bbp.c);
            } else if (bbp.b == 2) {
                wme = wme.a((wlz) null, bdw.f);
            }
            a3.a(bbp.b(bbp.b), wme);
            try {
                this.i = this.b.a(a3.a()).b();
                wmf wmf = this.i;
                wmg wmg = (wmg) bcu.a(wmf.g);
                this.j = wmg.d();
                int i2 = wmf.c;
                if (!wmf.a()) {
                    Map c2 = wmf.f.c();
                    e();
                    InvalidResponseCodeException invalidResponseCodeException = new InvalidResponseCodeException(i2, c2, bbp);
                    if (i2 == 416) {
                        invalidResponseCodeException.initCause(new DataSourceException(0));
                    }
                    throw invalidResponseCodeException;
                }
                wlz a4 = wmg.a();
                String wlz = a4 != null ? a4.toString() : "";
                bdl<String> bdl = this.e;
                if (bdl == null || bdl.evaluate(wlz)) {
                    if (i2 == 200 && bbp.e != 0) {
                        j2 = bbp.e;
                    }
                    this.l = j2;
                    if (bbp.f != -1) {
                        j5 = bbp.f;
                    } else {
                        long b2 = wmg.b();
                        if (b2 != -1) {
                            j5 = b2 - this.l;
                        }
                    }
                    this.m = j5;
                    this.k = true;
                    c(bbp);
                    return this.m;
                }
                e();
                throw new InvalidContentTypeException(wlz, bbp);
            } catch (IOException e3) {
                StringBuilder sb4 = new StringBuilder("Unable to connect to ");
                sb4.append(bbp.a);
                throw new HttpDataSourceException(sb4.toString(), e3, bbp, 1);
            }
        } else {
            throw new HttpDataSourceException("Malformed URL", bbp, 1);
        }
    }

    public final void c() {
        if (this.k) {
            this.k = false;
            d();
            e();
        }
    }

    private void e() {
        wmf wmf = this.i;
        if (wmf != null) {
            ((wmg) bcu.a(wmf.g)).close();
            this.i = null;
        }
        this.j = null;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.n != this.l) {
                while (this.n != this.l) {
                    int read = ((InputStream) bdw.a(this.j)).read(a, 0, (int) Math.min(this.l - this.n, 4096));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.n += (long) read;
                        a(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.m != -1) {
                long j2 = this.m - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = ((InputStream) bdw.a(this.j)).read(bArr, i2, i3);
            if (read2 != -1) {
                this.o += (long) read2;
                a(read2);
                return read2;
            } else if (this.m == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new HttpDataSourceException(e2, (bbp) bcu.a(this.h), 2);
        }
    }
}
