package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* renamed from: xah reason: default package */
public class xah implements Cloneable, defpackage.wzp.a {
    static final List<Protocol> a = xaq.a((T[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    static final List<wzu> b = xaq.a((T[]) new wzu[]{wzu.a, wzu.c});
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final wzx c;
    public final Proxy d;
    public final List<Protocol> e;
    public final List<wzu> f;
    final List<xae> g;
    final List<xae> h;
    final defpackage.wzz.a i;
    public final ProxySelector j;
    public final wzw k;
    public final wzn l;
    final xaw m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    final xcl p;
    public final HostnameVerifier q;
    public final wzr r;
    public final wzm s;
    final wzm t;
    public final wzt u;
    public final wzy v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    final int z;

    /* renamed from: xah$a */
    public static final class a {
        public int A;
        int B;
        public wzx a;
        Proxy b;
        List<Protocol> c;
        public List<wzu> d;
        public final List<xae> e;
        public final List<xae> f;
        public defpackage.wzz.a g;
        ProxySelector h;
        wzw i;
        public wzn j;
        public xaw k;
        SocketFactory l;
        public SSLSocketFactory m;
        public xcl n;
        HostnameVerifier o;
        wzr p;
        wzm q;
        wzm r;
        wzt s;
        wzy t;
        boolean u;
        public boolean v = false;
        boolean w;
        int x;
        public int y;
        public int z;

        public a() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new wzx();
            this.c = xah.a;
            this.d = xah.b;
            this.g = wzz.a(wzz.a);
            this.h = ProxySelector.getDefault();
            if (this.h == null) {
                this.h = new xci();
            }
            this.i = wzw.a;
            this.l = SocketFactory.getDefault();
            this.o = xcm.a;
            this.p = wzr.a;
            this.q = wzm.a;
            this.r = wzm.a;
            this.s = new wzt();
            this.t = wzy.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        a(xah xah) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = xah.c;
            this.b = xah.d;
            this.c = xah.e;
            this.d = xah.f;
            this.e.addAll(xah.g);
            this.f.addAll(xah.h);
            this.g = xah.i;
            this.h = xah.j;
            this.i = xah.k;
            this.k = xah.m;
            this.j = xah.l;
            this.l = xah.n;
            this.m = xah.o;
            this.n = xah.p;
            this.o = xah.q;
            this.p = xah.r;
            this.q = xah.s;
            this.r = xah.t;
            this.s = xah.u;
            this.t = xah.v;
            this.u = xah.w;
            this.v = xah.x;
            this.w = xah.y;
            this.x = xah.z;
            this.y = xah.A;
            this.z = xah.B;
            this.A = xah.C;
            this.B = xah.D;
        }

        public final a a(xae xae) {
            if (xae != null) {
                this.e.add(xae);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final xah a() {
            return new xah(this);
        }
    }

    static {
        xao.a = new xao() {
            public final int a(defpackage.xal.a aVar) {
                return aVar.c;
            }

            public final IOException a(wzp wzp, IOException iOException) {
                return ((xai) wzp).a(iOException);
            }

            public final Socket a(wzt wzt, wzl wzl, xbc xbc) {
                return wzt.a(wzl, xbc);
            }

            public final xaz a(wzt wzt, wzl wzl, xbc xbc, xan xan) {
                if (wzt.g || Thread.holdsLock(wzt)) {
                    for (xaz xaz : wzt.d) {
                        if (xaz.a(wzl, xan)) {
                            xbc.a(xaz, true);
                            return xaz;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            public final xba a(wzt wzt) {
                return wzt.e;
            }

            public final void a(wzu wzu, SSLSocket sSLSocket, boolean z) {
                String[] a = wzu.f != null ? xaq.a(wzs.a, sSLSocket.getEnabledCipherSuites(), wzu.f) : sSLSocket.getEnabledCipherSuites();
                String[] a2 = wzu.g != null ? xaq.a(xaq.g, sSLSocket.getEnabledProtocols(), wzu.g) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a3 = xaq.a(wzs.a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && a3 != -1) {
                    a = xaq.a(a, supportedCipherSuites[a3]);
                }
                wzu a4 = new defpackage.wzu.a(wzu).a(a).b(a2).a();
                if (a4.g != null) {
                    sSLSocket.setEnabledProtocols(a4.g);
                }
                if (a4.f != null) {
                    sSLSocket.setEnabledCipherSuites(a4.f);
                }
            }

            public final void a(defpackage.xac.a aVar, String str) {
                aVar.a(str);
            }

            public final void a(defpackage.xac.a aVar, String str, String str2) {
                aVar.c(str, str2);
            }

            public final boolean a(wzl wzl, wzl wzl2) {
                return wzl.a(wzl2);
            }

            public final boolean a(wzt wzt, xaz xaz) {
                if (!wzt.g && !Thread.holdsLock(wzt)) {
                    throw new AssertionError();
                } else if (xaz.h || wzt.b == 0) {
                    wzt.d.remove(xaz);
                    return true;
                } else {
                    wzt.notifyAll();
                    return false;
                }
            }

            public final void b(wzt wzt, xaz xaz) {
                if (wzt.g || Thread.holdsLock(wzt)) {
                    if (!wzt.f) {
                        wzt.f = true;
                        wzt.a.execute(wzt.c);
                    }
                    wzt.d.add(xaz);
                    return;
                }
                throw new AssertionError();
            }
        };
    }

    public xah() {
        this(new a());
    }

    xah(a aVar) {
        boolean z2;
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = aVar.d;
        this.g = xaq.a(aVar.e);
        this.h = xaq.a(aVar.f);
        this.i = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        Iterator it = this.f.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                wzu wzu = (wzu) it.next();
                if (z2 || wzu.d) {
                    z2 = true;
                }
            }
        }
        if (aVar.m != null || !z2) {
            this.o = aVar.m;
            this.p = aVar.n;
        } else {
            X509TrustManager a2 = xaq.a();
            this.o = a(a2);
            this.p = xch.c().a(a2);
        }
        if (this.o != null) {
            xch.c().a(this.o);
        }
        this.q = aVar.o;
        wzr wzr = aVar.p;
        xcl xcl = this.p;
        if (!xaq.a((Object) wzr.c, (Object) xcl)) {
            wzr = new wzr(wzr.b, xcl);
        }
        this.r = wzr;
        this.s = aVar.q;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        if (this.g.contains(null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.g);
            throw new IllegalStateException(sb.toString());
        } else if (this.h.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.h);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b2 = xch.c().b();
            b2.init(null, new TrustManager[]{x509TrustManager}, null);
            return b2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw xaq.a("No System TLS", (Exception) e2);
        }
    }

    public final wzp a(xaj xaj) {
        return xai.a(this, xaj, false);
    }

    /* access modifiers changed from: 0000 */
    public final xaw a() {
        wzn wzn = this.l;
        return wzn != null ? wzn.a : this.m;
    }

    public final a b() {
        return new a(this);
    }
}
