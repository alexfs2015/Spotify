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

/* renamed from: wzn reason: default package */
public final class wzn implements Closeable, Flushable {
    final xaw a;
    public final xau b;
    int c;
    int d;
    private int e;
    private int f;
    private int g;

    /* renamed from: wzn$a */
    final class a implements xas {
        boolean a;
        private final defpackage.xau.a c;
        private xdf d;
        private xdf e;

        a(final defpackage.xau.a aVar) {
            this.c = aVar;
            this.d = aVar.a(1);
            this.e = new xcu(this.d, wzn.this) {
                public final void close() {
                    synchronized (wzn.this) {
                        if (!a.this.a) {
                            a.this.a = true;
                            wzn.this.c++;
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
            defpackage.xaq.a((java.io.Closeable) r4.d);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r4 = this;
                wzn r0 = defpackage.wzn.this
                monitor-enter(r0)
                boolean r1 = r4.a     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.a = r1     // Catch:{ all -> 0x001f }
                wzn r2 = defpackage.wzn.this     // Catch:{ all -> 0x001f }
                int r3 = r2.d     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.d = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                xdf r0 = r4.d
                defpackage.xaq.a(r0)
                xau$a r0 = r4.c     // Catch:{ IOException -> 0x001e }
                r0.c()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wzn.a.a():void");
        }

        public final xdf b() {
            return this.e;
        }
    }

    /* renamed from: wzn$b */
    static class b extends xam {
        final defpackage.xau.c a;
        private final xcs c;
        private final String d;
        private final String e;

        b(final defpackage.xau.c cVar, String str, String str2) {
            this.a = cVar;
            this.d = str;
            this.e = str2;
            this.c = xda.a((xdg) new xcv(cVar.c[1]) {
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }

        public final xaf a() {
            String str = this.d;
            if (str != null) {
                return xaf.b(str);
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

        public final xcs c() {
            return this.c;
        }
    }

    /* renamed from: wzn$c */
    static final class c {
        private static final String k;
        private static final String l;
        final String a;
        final xac b;
        final String c;
        final Protocol d;
        final int e;
        final String f;
        final xac g;
        final xab h;
        final long i;
        final long j;

        static {
            StringBuilder sb = new StringBuilder();
            xch.c();
            sb.append(xch.d());
            sb.append("-Sent-Millis");
            k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            xch.c();
            sb2.append(xch.d());
            sb2.append("-Received-Millis");
            l = sb2.toString();
        }

        c(xal xal) {
            this.a = xal.a.a.toString();
            this.b = xbh.c(xal);
            this.c = xal.a.b;
            this.d = xal.b;
            this.e = xal.c;
            this.f = xal.d;
            this.g = xal.f;
            this.h = xal.e;
            this.i = xal.k;
            this.j = xal.l;
        }

        c(xdg xdg) {
            try {
                xcs a2 = xda.a(xdg);
                this.a = a2.p();
                this.c = a2.p();
                defpackage.xac.a aVar = new defpackage.xac.a();
                int a3 = wzn.a(a2);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar.a(a2.p());
                }
                this.b = aVar.a();
                xbn a4 = xbn.a(a2.p());
                this.d = a4.a;
                this.e = a4.b;
                this.f = a4.c;
                defpackage.xac.a aVar2 = new defpackage.xac.a();
                int a5 = wzn.a(a2);
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
                        wzs a6 = wzs.a(a2.p());
                        List a7 = a(a2);
                        List a8 = a(a2);
                        TlsVersion a9 = !a2.c() ? TlsVersion.a(a2.p()) : TlsVersion.SSL_3_0;
                        if (a9 == null) {
                            throw new NullPointerException("tlsVersion == null");
                        } else if (a6 != null) {
                            this.h = new xab(a9, a6, xaq.a(a7), xaq.a(a8));
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
                xdg.close();
            }
        }

        private static List<Certificate> a(xcs xcs) {
            int a2 = wzn.a(xcs);
            if (a2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a2);
                for (int i2 = 0; i2 < a2; i2++) {
                    String p = xcs.p();
                    xcq xcq = new xcq();
                    xcq.b(ByteString.b(p));
                    arrayList.add(instance.generateCertificate(xcq.d()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private static void a(xcr xcr, List<Certificate> list) {
            try {
                xcr.n((long) list.size()).j(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xcr.b(ByteString.a(((Certificate) list.get(i2)).getEncoded()).b()).j(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private boolean a() {
            return this.a.startsWith("https://");
        }

        public final void a(defpackage.xau.a aVar) {
            String str;
            xcr a2 = xda.a(aVar.a(0));
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
            a2.b(new xbn(this.d, this.e, this.f).toString()).j(10);
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
    }

    public wzn(File file, long j) {
        this(file, j, xcb.a);
    }

    private wzn(File file, long j, xcb xcb) {
        this.a = new xaw() {
            public final xal a(xaj xaj) {
                return wzn.this.a(xaj);
            }

            public final xas a(xal xal) {
                return wzn.this.a(xal);
            }

            public final void a() {
                wzn.this.a();
            }

            public final void a(xal xal, xal xal2) {
                defpackage.xau.a aVar;
                wzn wzn = wzn.this;
                c cVar = new c(xal2);
                defpackage.xau.c cVar2 = ((b) xal.g).a;
                try {
                    aVar = xau.this.a(cVar2.a, cVar2.b);
                    if (aVar != null) {
                        try {
                            cVar.a(aVar);
                            aVar.b();
                        } catch (IOException unused) {
                            wzn.a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    wzn.a(aVar);
                }
            }

            public final void a(xat xat) {
                wzn.this.a(xat);
            }

            public final void b(xaj xaj) {
                wzn.this.b(xaj);
            }
        };
        this.b = xau.a(xcb, file, 201105, 2, j);
    }

    static int a(xcs xcs) {
        try {
            long l = xcs.l();
            String p = xcs.p();
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

    private static String a(xad xad) {
        return ByteString.a(xad.toString()).c().f();
    }

    static void a(defpackage.xau.a aVar) {
        if (aVar != null) {
            try {
                aVar.c();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final xal a(xaj xaj) {
        try {
            defpackage.xau.c a2 = this.b.a(a(xaj.a));
            if (a2 == null) {
                return null;
            }
            try {
                boolean z = false;
                c cVar = new c(a2.c[0]);
                String a3 = cVar.g.a("Content-Type");
                String a4 = cVar.g.a("Content-Length");
                xaj a5 = new defpackage.xaj.a().a(cVar.a).a(cVar.c, (xak) null).a(cVar.b).a();
                defpackage.xal.a aVar = new defpackage.xal.a();
                aVar.a = a5;
                aVar.b = cVar.d;
                aVar.c = cVar.e;
                aVar.d = cVar.f;
                defpackage.xal.a a6 = aVar.a(cVar.g);
                a6.g = new b(a2, a3, a4);
                a6.e = cVar.h;
                a6.k = cVar.i;
                a6.l = cVar.j;
                xal a7 = a6.a();
                if (cVar.a.equals(xaj.a.toString()) && cVar.c.equals(xaj.b) && xbh.a(a7, cVar.b, xaj)) {
                    z = true;
                }
                if (z) {
                    return a7;
                }
                xaq.a((Closeable) a7.g);
                return null;
            } catch (IOException unused) {
                xaq.a((Closeable) a2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final xas a(xal xal) {
        defpackage.xau.a aVar;
        String str = xal.a.b;
        if (xbi.a(xal.a.b)) {
            try {
                b(xal.a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals(Request.GET) || xbh.b(xal)) {
            return null;
        } else {
            c cVar = new c(xal);
            try {
                aVar = this.b.a(a(xal.a.a), -1);
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

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        this.f++;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.xat r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.g     // Catch:{ all -> 0x001f }
            int r0 = r0 + 1
            r1.g = r0     // Catch:{ all -> 0x001f }
            xaj r0 = r2.a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0013
            int r2 = r1.e     // Catch:{ all -> 0x001f }
            int r2 = r2 + 1
            r1.e = r2     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            return
        L_0x0013:
            xal r2 = r2.b     // Catch:{ all -> 0x001f }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzn.a(xat):void");
    }

    /* access modifiers changed from: 0000 */
    public final void b(xaj xaj) {
        this.b.b(a(xaj.a));
    }

    public final void close() {
        this.b.close();
    }

    public final void flush() {
        this.b.flush();
    }
}
