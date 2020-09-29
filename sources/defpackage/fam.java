package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fam reason: default package */
public final class fam extends bbk implements HttpDataSource {
    private static final CharSequence a = "only-if-cached";
    private static final byte[] b = new byte[4096];
    private final a c;
    private final c d;
    private final String e;
    private final bdl<String> f = null;
    private final wli g;
    private final c h;
    private bbp i;
    private wmf j;
    private InputStream k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;

    static {
        aqd.a("goog.exo.okhttp");
    }

    public fam(a aVar, String str, bdl<String> bdl, wli wli, c cVar) {
        super(true);
        this.c = (a) bcu.a(aVar);
        this.e = str;
        this.g = wli;
        this.h = cVar;
        this.d = new c();
    }

    public final Uri a() {
        wmf wmf = this.j;
        if (wmf == null) {
            return null;
        }
        return Uri.parse(wmf.a.a.toString());
    }

    public final Map<String, List<String>> b() {
        wmf wmf = this.j;
        if (wmf == null) {
            return Collections.emptyMap();
        }
        return wmf.f.c();
    }

    public final long a(bbp bbp) {
        this.i = bbp;
        long j2 = 0;
        this.p = 0;
        this.o = 0;
        b(bbp);
        long j3 = bbp.e;
        long j4 = bbp.f;
        boolean a2 = bbp.a(1);
        wlx e2 = wlx.e(bbp.a.toString());
        if (e2 != null) {
            a a3 = new a().a(e2);
            wli wli = this.g;
            if (wli != null) {
                a3.a(wli);
            }
            c cVar = this.h;
            if (cVar != null) {
                for (Entry entry : cVar.a().entrySet()) {
                    a3.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            for (Entry entry2 : this.d.a().entrySet()) {
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
            String str = this.e;
            if (str != null) {
                a3.b("User-Agent", str);
            }
            if (!a2) {
                a3.b("Accept-Encoding", "identity");
            }
            String str2 = null;
            wme wme = bbp.c != null ? wme.a((wlz) null, bbp.c) : bbp.b == 2 ? wme.a((wlz) null, bdw.f) : null;
            a3.a(bbp.b(bbp.b), wme);
            try {
                this.j = this.c.a(a3.a()).b();
                wmf wmf = this.j;
                wmg wmg = (wmg) bcu.a(wmf.g);
                this.k = wmg.d();
                int i2 = wmf.c;
                String str3 = "";
                if (!wmf.a()) {
                    try {
                        str2 = wmf.g != null ? wmf.g.f() : str3;
                    } catch (IOException e3) {
                        Logger.b(e3, e3.getMessage(), new Object[0]);
                    }
                    if (i2 != 504 || str2 == null || !str2.contains(a)) {
                        Map c2 = wmf.f.c();
                        e();
                        HttpDataSourceException httpDataSourceException = new HttpDataSourceException((IOException) new InvalidResponseCodeException(i2, c2, bbp, str2), bbp, 1);
                        if (i2 == 416) {
                            httpDataSourceException.initCause(new DataSourceException(0));
                        }
                        throw httpDataSourceException;
                    }
                    throw new HttpDataSourceException((IOException) new NetworkAccessWhileInOfflineModeException(), bbp, 1);
                }
                wlz a4 = wmg.a();
                if (a4 != null) {
                    str3 = a4.toString();
                }
                bdl<String> bdl = this.f;
                if (bdl == null || bdl.evaluate(str3)) {
                    if (i2 == 200 && bbp.e != 0) {
                        j2 = bbp.e;
                    }
                    this.m = j2;
                    if (bbp.f != -1) {
                        j5 = bbp.f;
                    } else {
                        long b2 = wmg.b();
                        if (b2 != -1) {
                            j5 = b2 - this.m;
                        }
                    }
                    this.n = j5;
                    this.l = true;
                    c(bbp);
                    return this.n;
                }
                e();
                throw new InvalidContentTypeException(str3, bbp);
            } catch (IOException e4) {
                StringBuilder sb4 = new StringBuilder("Unable to connect to ");
                sb4.append(bbp.a);
                throw new HttpDataSourceException(sb4.toString(), e4, bbp, 1);
            }
        } else {
            throw new HttpDataSourceException("Malformed URL", bbp, 1);
        }
    }

    public final void c() {
        if (this.l) {
            this.l = false;
            d();
            e();
        }
    }

    private void e() {
        wmf wmf = this.j;
        if (wmf != null) {
            ((wmg) bcu.a(wmf.g)).close();
            this.j = null;
        }
        this.k = null;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.o != this.m) {
                while (this.o != this.m) {
                    int read = ((InputStream) bdw.a(this.k)).read(b, 0, (int) Math.min(this.m - this.o, 4096));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.o += (long) read;
                        a(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.n != -1) {
                long j2 = this.n - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = ((InputStream) bdw.a(this.k)).read(bArr, i2, i3);
            if (read2 != -1) {
                this.p += (long) read2;
                a(read2);
                return read2;
            } else if (this.n == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new HttpDataSourceException(e2, (bbp) bcu.a(this.i), 2);
        }
    }
}
