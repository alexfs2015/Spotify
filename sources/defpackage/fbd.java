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

/* renamed from: fbd reason: default package */
public final class fbd extends bcb implements HttpDataSource {
    private static final byte[] a = new byte[4096];
    private final a b;
    private final c c;
    private final String d;
    private final bec<String> e = null;
    private final wzo f;
    private final c g;
    private bcg h;
    private xal i;
    private InputStream j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;

    static {
        aqu.a("goog.exo.okhttp");
    }

    public fbd(a aVar, String str, bec<String> bec, wzo wzo, c cVar) {
        super(true);
        this.b = (a) bdl.a(aVar);
        this.d = str;
        this.f = wzo;
        this.g = cVar;
        this.c = new c();
    }

    private void e() {
        xal xal = this.i;
        if (xal != null) {
            ((xam) bdl.a(xal.g)).close();
            this.i = null;
        }
        this.j = null;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.n != this.l) {
                while (this.n != this.l) {
                    int read = ((InputStream) ben.a(this.j)).read(a, 0, (int) Math.min(this.l - this.n, 4096));
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
            int read2 = ((InputStream) ben.a(this.j)).read(bArr, i2, i3);
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
            throw new HttpDataSourceException(e2, (bcg) bdl.a(this.h), 2);
        }
    }

    public final long a(bcg bcg) {
        this.h = bcg;
        long j2 = 0;
        this.o = 0;
        this.n = 0;
        b(bcg);
        long j3 = bcg.e;
        long j4 = bcg.f;
        boolean a2 = bcg.a(1);
        xad e2 = xad.e(bcg.a.toString());
        if (e2 != null) {
            a a3 = new a().a(e2);
            wzo wzo = this.f;
            if (wzo != null) {
                a3.a(wzo);
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
            String str2 = null;
            xak xak = bcg.c != null ? xak.a((xaf) null, bcg.c) : bcg.b == 2 ? xak.a((xaf) null, ben.f) : null;
            a3.a(bcg.b(bcg.b), xak);
            try {
                this.i = this.b.a(a3.a()).b();
                xal xal = this.i;
                xam xam = (xam) bdl.a(xal.g);
                this.j = xam.d();
                int i2 = xal.c;
                String str3 = "";
                if (!xal.a()) {
                    try {
                        str2 = xal.g != null ? xal.g.f() : str3;
                    } catch (IOException e3) {
                        Logger.b(e3, e3.getMessage(), new Object[0]);
                    }
                    if (i2 != 504 || !xal.a.b().j) {
                        Map c2 = xal.f.c();
                        e();
                        HttpDataSourceException httpDataSourceException = new HttpDataSourceException((IOException) new InvalidResponseCodeException(i2, c2, bcg, str2), bcg, 1);
                        if (i2 == 416) {
                            httpDataSourceException.initCause(new DataSourceException(0));
                        }
                        throw httpDataSourceException;
                    }
                    throw new HttpDataSourceException((IOException) new NetworkAccessWhileInOfflineModeException(), bcg, 1);
                }
                xaf a4 = xam.a();
                if (a4 != null) {
                    str3 = a4.toString();
                }
                bec<String> bec = this.e;
                if (bec == null || bec.evaluate(str3)) {
                    if (i2 == 200 && bcg.e != 0) {
                        j2 = bcg.e;
                    }
                    this.l = j2;
                    if (bcg.f != -1) {
                        j5 = bcg.f;
                    } else {
                        long b2 = xam.b();
                        if (b2 != -1) {
                            j5 = b2 - this.l;
                        }
                    }
                    this.m = j5;
                    this.k = true;
                    c(bcg);
                    return this.m;
                }
                e();
                throw new InvalidContentTypeException(str3, bcg);
            } catch (IOException e4) {
                StringBuilder sb4 = new StringBuilder("Unable to connect to ");
                sb4.append(bcg.a);
                throw new HttpDataSourceException(sb4.toString(), e4, bcg, 1);
            }
        } else {
            throw new HttpDataSourceException("Malformed URL", bcg, 1);
        }
    }

    public final Uri a() {
        xal xal = this.i;
        if (xal == null) {
            return null;
        }
        return Uri.parse(xal.a.a.toString());
    }

    public final Map<String, List<String>> b() {
        xal xal = this.i;
        return xal == null ? Collections.emptyMap() : xal.f.c();
    }

    public final void c() {
        if (this.k) {
            this.k = false;
            d();
            e();
        }
    }
}
