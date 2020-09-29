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

/* renamed from: wmb reason: default package */
public class wmb implements Cloneable, defpackage.wlj.a {
    static final List<Protocol> a = wmk.a((T[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    static final List<wlo> b = wmk.a((T[]) new wlo[]{wlo.a, wlo.c});
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final wlr c;
    public final Proxy d;
    public final List<Protocol> e;
    public final List<wlo> f;
    final List<wly> g;
    final List<wly> h;
    final defpackage.wlt.a i;
    public final ProxySelector j;
    public final wlq k;
    public final wlh l;
    final wmq m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    final wof p;
    public final HostnameVerifier q;
    public final wll r;
    public final wlg s;
    final wlg t;
    public final wln u;
    public final wls v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    final int z;

    /* renamed from: wmb$a */
    public static final class a {
        public int A;
        int B;
        public wlr a;
        Proxy b;
        List<Protocol> c;
        public List<wlo> d;
        public final List<wly> e;
        public final List<wly> f;
        public defpackage.wlt.a g;
        ProxySelector h;
        wlq i;
        public wlh j;
        public wmq k;
        SocketFactory l;
        public SSLSocketFactory m;
        public wof n;
        HostnameVerifier o;
        wll p;
        wlg q;
        wlg r;
        wln s;
        wls t;
        boolean u;
        public boolean v = false;
        boolean w;
        int x;
        public int y;
        public int z;

        public a() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new wlr();
            this.c = wmb.a;
            this.d = wmb.b;
            this.g = wlt.a(wlt.a);
            this.h = ProxySelector.getDefault();
            if (this.h == null) {
                this.h = new woc();
            }
            this.i = wlq.a;
            this.l = SocketFactory.getDefault();
            this.o = wog.a;
            this.p = wll.a;
            this.q = wlg.a;
            this.r = wlg.a;
            this.s = new wln();
            this.t = wls.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        a(wmb wmb) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = wmb.c;
            this.b = wmb.d;
            this.c = wmb.e;
            this.d = wmb.f;
            this.e.addAll(wmb.g);
            this.f.addAll(wmb.h);
            this.g = wmb.i;
            this.h = wmb.j;
            this.i = wmb.k;
            this.k = wmb.m;
            this.j = wmb.l;
            this.l = wmb.n;
            this.m = wmb.o;
            this.n = wmb.p;
            this.o = wmb.q;
            this.p = wmb.r;
            this.q = wmb.s;
            this.r = wmb.t;
            this.s = wmb.u;
            this.t = wmb.v;
            this.u = wmb.w;
            this.v = wmb.x;
            this.w = wmb.y;
            this.x = wmb.z;
            this.y = wmb.A;
            this.z = wmb.B;
            this.A = wmb.C;
            this.B = wmb.D;
        }

        public final a a(wly wly) {
            if (wly != null) {
                this.e.add(wly);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final wmb a() {
            return new wmb(this);
        }
    }

    static {
        wmi.a = new wmi() {
            public final void a(defpackage.wlw.a aVar, String str) {
                aVar.a(str);
            }

            public final void a(defpackage.wlw.a aVar, String str, String str2) {
                aVar.c(str, str2);
            }

            public final boolean a(wlf wlf, wlf wlf2) {
                return wlf.a(wlf2);
            }

            public final Socket a(wln wln, wlf wlf, wmw wmw) {
                return wln.a(wlf, wmw);
            }

            public final wmu a(wln wln) {
                return wln.e;
            }

            public final int a(defpackage.wmf.a aVar) {
                return aVar.c;
            }

            public final IOException a(wlj wlj, IOException iOException) {
                return ((wmc) wlj).a(iOException);
            }

            public final boolean a(wln wln, wmt wmt) {
                if (!wln.g && !Thread.holdsLock(wln)) {
                    throw new AssertionError();
                } else if (wmt.h || wln.b == 0) {
                    wln.d.remove(wmt);
                    return true;
                } else {
                    wln.notifyAll();
                    return false;
                }
            }

            public final wmt a(wln wln, wlf wlf, wmw wmw, wmh wmh) {
                if (wln.g || Thread.holdsLock(wln)) {
                    for (wmt wmt : wln.d) {
                        if (wmt.a(wlf, wmh)) {
                            wmw.a(wmt, true);
                            return wmt;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            public final void b(wln wln, wmt wmt) {
                if (wln.g || Thread.holdsLock(wln)) {
                    if (!wln.f) {
                        wln.f = true;
                        wln.a.execute(wln.c);
                    }
                    wln.d.add(wmt);
                    return;
                }
                throw new AssertionError();
            }

            public final void a(wlo wlo, SSLSocket sSLSocket, boolean z) {
                String[] strArr;
                String[] strArr2;
                if (wlo.f != null) {
                    strArr = wmk.a(wlm.a, sSLSocket.getEnabledCipherSuites(), wlo.f);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (wlo.g != null) {
                    strArr2 = wmk.a(wmk.g, sSLSocket.getEnabledProtocols(), wlo.g);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a = wmk.a(wlm.a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && a != -1) {
                    strArr = wmk.a(strArr, supportedCipherSuites[a]);
                }
                wlo a2 = new defpackage.wlo.a(wlo).a(strArr).b(strArr2).a();
                if (a2.g != null) {
                    sSLSocket.setEnabledProtocols(a2.g);
                }
                if (a2.f != null) {
                    sSLSocket.setEnabledCipherSuites(a2.f);
                }
            }
        };
    }

    public wmb() {
        this(new a());
    }

    wmb(a aVar) {
        boolean z2;
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = aVar.d;
        this.g = wmk.a(aVar.e);
        this.h = wmk.a(aVar.f);
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
                wlo wlo = (wlo) it.next();
                if (z2 || wlo.d) {
                    z2 = true;
                }
            }
        }
        if (aVar.m != null || !z2) {
            this.o = aVar.m;
            this.p = aVar.n;
        } else {
            X509TrustManager a2 = wmk.a();
            this.o = a(a2);
            this.p = wob.c().a(a2);
        }
        if (this.o != null) {
            wob.c().a(this.o);
        }
        this.q = aVar.o;
        wll wll = aVar.p;
        wof wof = this.p;
        if (!wmk.a((Object) wll.c, (Object) wof)) {
            wll = new wll(wll.b, wof);
        }
        this.r = wll;
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
            SSLContext b2 = wob.c().b();
            b2.init(null, new TrustManager[]{x509TrustManager}, null);
            return b2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw wmk.a("No System TLS", (Exception) e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final wmq a() {
        wlh wlh = this.l;
        return wlh != null ? wlh.a : this.m;
    }

    public final wlj a(wmd wmd) {
        return wmc.a(this, wmd, false);
    }

    public final a b() {
        return new a(this);
    }
}
