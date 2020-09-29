package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: giz reason: default package */
public class giz {
    public final xah a = new xah();
    public final xah b;
    public final xah c;
    private final xah d;

    public giz(wzi<WebgateTokenProvider> wzi, gcb gcb, gjm gjm, git git, git git2, gjp gjp, gjo gjo, gjz gjz, giw giw) {
        jtr.b("Not called on main looper");
        giv giv = new giv(giw, gcb);
        gjr gjr = new gjr();
        gkb gkb = new gkb(gjz, gcb);
        gjy gjy = new gjy(gjz, wzi);
        gjl gjl = new gjl(git);
        a b2 = this.a.b();
        git.a(b2);
        b2.a(gjp);
        b2.a(gjo);
        b2.a(gjm);
        b2.f.add(gjr);
        gjb gjb = a.a;
        if (!(gjb.b == null || gjb.a == null || gjb.c == null)) {
            SSLSocketFactory sSLSocketFactory = gjb.b;
            X509TrustManager x509TrustManager = gjb.a;
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                b2.m = sSLSocketFactory;
                b2.n = xch.c().a(x509TrustManager);
                b2.d = xaq.a(gjb.c);
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }
        b2.g = giv;
        this.d = b2.a();
        this.b = this.d.b().a(gkb).a(gjy).a(gjl).a();
        a b3 = this.d.b();
        git2.a(b2);
        this.c = b3.a();
    }
}
