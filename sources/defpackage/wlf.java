package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;

/* renamed from: wlf reason: default package */
public final class wlf {
    public final wlx a;
    public final wls b;
    public final SocketFactory c;
    public final List<Protocol> d;
    public final List<wlo> e;
    public final ProxySelector f;
    public final Proxy g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final wll j;
    private wlg k;

    public wlf(String str, int i2, wls wls, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wll wll, wlg wlg, Proxy proxy, List<Protocol> list, List<wlo> list2, ProxySelector proxySelector) {
        a b2 = new a().a(sSLSocketFactory != null ? "https" : "http").b(str);
        if (i2 <= 0 || i2 > 65535) {
            StringBuilder sb = new StringBuilder("unexpected port: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        b2.e = i2;
        this.a = b2.b();
        if (wls != null) {
            this.b = wls;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (wlg != null) {
                    this.k = wlg;
                    if (list != null) {
                        this.d = wmk.a(list);
                        if (list2 != null) {
                            this.e = wmk.a(list2);
                            if (proxySelector != null) {
                                this.f = proxySelector;
                                this.g = proxy;
                                this.h = sSLSocketFactory;
                                this.i = hostnameVerifier;
                                this.j = wll;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wlf) {
            wlf wlf = (wlf) obj;
            if (this.a.equals(wlf.a) && a(wlf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.k.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Proxy proxy = this.g;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.h;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        wll wll = this.j;
        if (wll != null) {
            i2 = wll.hashCode();
        }
        return hashCode4 + i2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(wlf wlf) {
        return this.b.equals(wlf.b) && this.k.equals(wlf.k) && this.d.equals(wlf.d) && this.e.equals(wlf.e) && this.f.equals(wlf.f) && wmk.a((Object) this.g, (Object) wlf.g) && wmk.a((Object) this.h, (Object) wlf.h) && wmk.a((Object) this.i, (Object) wlf.i) && wmk.a((Object) this.j, (Object) wlf.j) && this.a.c == wlf.a.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.a.b);
        sb.append(":");
        sb.append(this.a.c);
        if (this.g != null) {
            sb.append(", proxy=");
            sb.append(this.g);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f);
        }
        sb.append("}");
        return sb.toString();
    }
}
