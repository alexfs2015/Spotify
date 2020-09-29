package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: gho reason: default package */
public class gho {
    public final wmb a = new wmb();
    public final wmb b;
    public final wmb c;
    private final wmb d;

    public gho(wlc<WebgateTokenProvider> wlc, gbd gbd, gib gib, ghi ghi, ghi ghi2, gie gie, gid gid, gio gio, ghl ghl) {
        jrh.b("Not called on main looper");
        ghk ghk = new ghk(ghl, gbd);
        gig gig = new gig();
        giq giq = new giq(gio, gbd);
        gin gin = new gin(gio, wlc);
        gia gia = new gia(ghi);
        a b2 = this.a.b();
        ghi.a(b2);
        b2.a(gie);
        b2.a(gid);
        b2.a(gib);
        b2.f.add(gig);
        ghq ghq = a.a;
        if (!(ghq.b == null || ghq.a == null || ghq.c == null)) {
            SSLSocketFactory sSLSocketFactory = ghq.b;
            X509TrustManager x509TrustManager = ghq.a;
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                b2.m = sSLSocketFactory;
                b2.n = wob.c().a(x509TrustManager);
                b2.d = wmk.a(ghq.c);
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }
        b2.g = ghk;
        this.d = b2.a();
        this.b = this.d.b().a(giq).a(gin).a(gia).a();
        a b3 = this.d.b();
        ghi2.a(b2);
        this.c = b3.a();
    }
}
