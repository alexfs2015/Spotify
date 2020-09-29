package defpackage;

import com.spotify.cosmos.router.Request;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;

/* renamed from: wlh reason: default package */
public final class wlh implements Closeable, Flushable {
    final wmq a;
    public final wmo b;
    int c;
    int d;
    private int e;
    private int f;
    private int g;

    /* renamed from: wlh$a */
    final class a implements wmm {
        boolean a;
        private final defpackage.wmo.a c;
        private woz d;
        private woz e;

        a(final defpackage.wmo.a aVar) {
            this.c = aVar;
            this.d = aVar.a(1);
            this.e = new woo(this.d, wlh.this) {
                public final void close() {
                    synchronized (wlh.this) {
                        if (!a.this.a) {
                            a.this.a = true;
                            wlh.this.c++;
                            super.close();
                            aVar.b();
                        }
                    }
                }
            };
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.c.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            defpackage.wmk.a((java.io.Closeable) r4.d);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r4 = this;
                wlh r0 = defpackage.wlh.this
                monitor-enter(r0)
                boolean r1 = r4.a     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.a = r1     // Catch:{ all -> 0x001f }
                wlh r2 = defpackage.wlh.this     // Catch:{ all -> 0x001f }
                int r3 = r2.d     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.d = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                woz r0 = r4.d
                defpackage.wmk.a(r0)
                wmo$a r0 = r4.c     // Catch:{ IOException -> 0x001e }
                r0.c()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wlh.a.a():void");
        }

        public final woz b() {
            return this.e;
        }
    }

    /* renamed from: wlh$b */
    static class b extends wmg {
        final defpackage.wmo.c a;
        private final wom c;
        private final String d;
        private final String e;

        b(final defpackage.wmo.c cVar, String str, String str2) {
            this.a = cVar;
            this.d = str;
            this.e = str2;
            this.c = wou.a((wpa) new wop(cVar.c[1]) {
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }

        public final wlz a() {
            String str = this.d;
            if (str != null) {
                return wlz.b(str);
            }
            return null;
        }

        public final long b() {
            try {
                if (this.e != null) {
                    return Long.parseLong(this.e);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public final wom c() {
            return this.c;
        }
    }

    /* renamed from: wlh$c */
    static final class c {
        private static final String k;
        private static final String l;
        final String a;
        final wlw b;
        final String c;
        final Protocol d;
        final int e;
        final String f;
        final wlw g;
        final wlv h;
        final long i;
        final long j;

        static {
            StringBuilder sb = new StringBuilder();
            wob.c();
            sb.append(wob.d());
            sb.append("-Sent-Millis");
            k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            wob.c();
            sb2.append(wob.d());
            sb2.append("-Received-Millis");
            l = sb2.toString();
        }

        c(wpa wpa) {
            TlsVersion tlsVersion;
            try {
                wom a2 = wou.a(wpa);
                this.a = a2.p();
                this.c = a2.p();
                defpackage.wlw.a aVar = new defpackage.wlw.a();
                int a3 = wlh.a(a2);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar.a(a2.p());
                }
                this.b = aVar.a();
                wnh a4 = wnh.a(a2.p());
                this.d = a4.a;
                this.e = a4.b;
                this.f = a4.c;
                defpackage.wlw.a aVar2 = new defpackage.wlw.a();
                int a5 = wlh.a(a2);
                for (int i3 = 0; i3 < a5; i3++) {
                    aVar2.a(a2.p());
                }
                String c2 = aVar2.c(k);
                String c3 = aVar2.c(l);
                aVar2.b(k);
                aVar2.b(l);
                long j2 = 0;
                this.i = c2 != null ? Long.parseLong(c2) : 0;
                if (c3 != null) {
                    j2 = Long.parseLong(c3);
                }
                this.j = j2;
                this.g = aVar2.a();
                if (a()) {
                    String p = a2.p();
                    if (p.length() <= 0) {
                        wlm a6 = wlm.a(a2.p());
                        List a7 = a(a2);
                        List a8 = a(a2);
                        if (!a2.c()) {
                            tlsVersion = TlsVersion.a(a2.p());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        if (tlsVersion == null) {
                            throw new NullPointerException("tlsVersion == null");
                        } else if (a6 != null) {
                            this.h = new wlv(tlsVersion, a6, wmk.a(a7), wmk.a(a8));
                        } else {
                            throw new NullPointerException("cipherSuite == null");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("expected \"\" but was \"");
                        sb.append(p);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.h = null;
                }
            } finally {
                wpa.close();
            }
        }

        c(wmf wmf) {
            this.a = wmf.a.a.toString();
            this.b = wnb.c(wmf);
            this.c = wmf.a.b;
            this.d = wmf.b;
            this.e = wmf.c;
            this.f = wmf.d;
            this.g = wmf.f;
            this.h = wmf.e;
            this.i = wmf.k;
            this.j = wmf.l;
        }

        public final void a(defpackage.wmo.a aVar) {
            String str;
            wol a2 = wou.a(aVar.a(0));
            a2.b(this.a).j(10);
            a2.b(this.c).j(10);
            a2.n((long) (this.b.a.length / 2)).j(10);
            int length = this.b.a.length / 2;
            int i2 = 0;
            while (true) {
                str = ": ";
                if (i2 >= length) {
                    break;
                }
                a2.b(this.b.a(i2)).b(str).b(this.b.b(i2)).j(10);
                i2++;
            }
            a2.b(new wnh(this.d, this.e, this.f).toString()).j(10);
            a2.n((long) ((this.g.a.length / 2) + 2)).j(10);
            int length2 = this.g.a.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                a2.b(this.g.a(i3)).b(str).b(this.g.b(i3)).j(10);
            }
            a2.b(k).b(str).n(this.i).j(10);
            a2.b(l).b(str).n(this.j).j(10);
            if (a()) {
                a2.j(10);
                a2.b(this.h.b.t).j(10);
                a(a2, this.h.c);
                a(a2, this.h.d);
                a2.b(this.h.a.javaName).j(10);
            }
            a2.close();
        }

        private boolean a() {
            return this.a.startsWith("https://");
        }

        private static List<Certificate> a(wom wom) {
            int a2 = wlh.a(wom);
            if (a2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a2);
                for (int i2 = 0; i2 < a2; i2++) {
                    String p = wom.p();
                    wok wok = new wok();
                    wok.b(ByteString.b(p));
                    arrayList.add(instance.generateCertificate(wok.d()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private static void a(wol wol, List<Certificate> list) {
            try {
                wol.n((long) list.size()).j(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    wol.b(ByteString.a(((Certificate) list.get(i2)).getEncoded()).b()).j(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }
    }

    public wlh(File file, long j) {
        this(file, j, wnv.a);
    }

    private wlh(File file, long j, wnv wnv) {
        this.a = new wmq() {
            public final wmf a(wmd wmd) {
                return wlh.this.a(wmd);
            }

            public final wmm a(wmf wmf) {
                return wlh.this.a(wmf);
            }

            public final void b(wmd wmd) {
                wlh.this.b(wmd);
            }

            public final void a(wmf wmf, wmf wmf2) {
                defpackage.wmo.a aVar;
                wlh wlh = wlh.this;
                c cVar = new c(wmf2);
                defpackage.wmo.c cVar2 = ((b) wmf.g).a;
                try {
                    aVar = wmo.this.a(cVar2.a, cVar2.b);
                    if (aVar != null) {
                        try {
                            cVar.a(aVar);
                            aVar.b();
                        } catch (IOException unused) {
                            wlh.a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    wlh.a(aVar);
                }
            }

            public final void a() {
                wlh.this.a();
            }

            public final void a(wmn wmn) {
                wlh.this.a(wmn);
            }
        };
        this.b = wmo.a(wnv, file, 201105, 2, j);
    }

    private static String a(wlx wlx) {
        return ByteString.a(wlx.toString()).c().f();
    }

    /* access modifiers changed from: 0000 */
    public final void b(wmd wmd) {
        this.b.b(a(wmd.a));
    }

    static void a(defpackage.wmo.a aVar) {
        if (aVar != null) {
            try {
                aVar.c();
            } catch (IOException unused) {
            }
        }
    }

    public final void flush() {
        this.b.flush();
    }

    public final void close() {
        this.b.close();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.wmn r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.g     // Catch:{ all -> 0x001f }
            int r0 = r0 + 1
            r1.g = r0     // Catch:{ all -> 0x001f }
            wmd r0 = r2.a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0013
            int r2 = r1.e     // Catch:{ all -> 0x001f }
            int r2 = r2 + 1
            r1.e = r2     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            return
        L_0x0013:
            wmf r2 = r2.b     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f     // Catch:{ all -> 0x001f }
            int r2 = r2 + 1
            r1.f = r2     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlh.a(wmn):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        this.f++;
    }

    static int a(wom wom) {
        try {
            long l = wom.l();
            String p = wom.p();
            if (l >= 0 && l <= 2147483647L && p.isEmpty()) {
                return (int) l;
            }
            StringBuilder sb = new StringBuilder("expected an int but was \"");
            sb.append(l);
            sb.append(p);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* access modifiers changed from: 0000 */
    public final wmf a(wmd wmd) {
        try {
            defpackage.wmo.c a2 = this.b.a(a(wmd.a));
            if (a2 == null) {
                return null;
            }
            try {
                boolean z = false;
                c cVar = new c(a2.c[0]);
                String a3 = cVar.g.a("Content-Type");
                String a4 = cVar.g.a("Content-Length");
                wmd a5 = new defpackage.wmd.a().a(cVar.a).a(cVar.c, (wme) null).a(cVar.b).a();
                defpackage.wmf.a aVar = new defpackage.wmf.a();
                aVar.a = a5;
                aVar.b = cVar.d;
                aVar.c = cVar.e;
                aVar.d = cVar.f;
                defpackage.wmf.a a6 = aVar.a(cVar.g);
                a6.g = new b(a2, a3, a4);
                a6.e = cVar.h;
                a6.k = cVar.i;
                a6.l = cVar.j;
                wmf a7 = a6.a();
                if (cVar.a.equals(wmd.a.toString()) && cVar.c.equals(wmd.b) && wnb.a(a7, cVar.b, wmd)) {
                    z = true;
                }
                if (z) {
                    return a7;
                }
                wmk.a((Closeable) a7.g);
                return null;
            } catch (IOException unused) {
                wmk.a((Closeable) a2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final wmm a(wmf wmf) {
        defpackage.wmo.a aVar;
        String str = wmf.a.b;
        if (wnc.a(wmf.a.b)) {
            try {
                b(wmf.a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals(Request.GET) || wnb.b(wmf)) {
            return null;
        } else {
            c cVar = new c(wmf);
            try {
                aVar = this.b.a(a(wmf.a.a), -1);
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.a(aVar);
                    return new a(aVar);
                } catch (IOException unused2) {
                    a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                a(aVar);
                return null;
            }
        }
    }
}
