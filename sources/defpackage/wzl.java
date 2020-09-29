package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;

/* renamed from: wzl reason: default package */
public final class wzl {
    public final xad a;
    public final wzy b;
    public final SocketFactory c;
    public final List<Protocol> d;
    public final List<wzu> e;
    public final ProxySelector f;
    public final Proxy g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final wzr j;
    private wzm k;

    public wzl(String str, int i2, wzy wzy, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wzr wzr, wzm wzm, Proxy proxy, List<Protocol> list, List<wzu> list2, ProxySelector proxySelector) {
        a b2 = new a().a(sSLSocketFactory != null ? "https" : "http").b(str);
        if (i2 <= 0 || i2 > 65535) {
            StringBuilder sb = new StringBuilder("unexpected port: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        b2.e = i2;
        this.a = b2.b();
        if (wzy != null) {
            this.b = wzy;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (wzm != null) {
                    this.k = wzm;
                    if (list != null) {
                        this.d = xaq.a(list);
                        if (list2 != null) {
                            this.e = xaq.a(list2);
                            if (proxySelector != null) {
                                this.f = proxySelector;
                                this.g = proxy;
                                this.h = sSLSocketFactory;
                                this.i = hostnameVerifier;
                                this.j = wzr;
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

    /* access modifiers changed from: 0000 */
    public final boolean a(wzl wzl) {
        return this.b.equals(wzl.b) && this.k.equals(wzl.k) && this.d.equals(wzl.d) && this.e.equals(wzl.e) && this.f.equals(wzl.f) && xaq.a((Object) this.g, (Object) wzl.g) && xaq.a((Object) this.h, (Object) wzl.h) && xaq.a((Object) this.i, (Object) wzl.i) && xaq.a((Object) this.j, (Object) wzl.j) && this.a.c == wzl.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wzl) {
            wzl wzl = (wzl) obj;
            if (this.a.equals(wzl.a) && a(wzl)) {
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
        wzr wzr = this.j;
        if (wzr != null) {
            i2 = wzr.hashCode();
        }
        return hashCode4 + i2;
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
