package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

/* renamed from: wlv reason: default package */
public final class wlv {
    final TlsVersion a;
    public final wlm b;
    public final List<Certificate> c;
    final List<Certificate> d;

    wlv(TlsVersion tlsVersion, wlm wlm, List<Certificate> list, List<Certificate> list2) {
        this.a = tlsVersion;
        this.b = wlm;
        this.c = list;
        this.d = list2;
    }

    public static wlv a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            wlm a2 = wlm.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion a3 = TlsVersion.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = wmk.a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = wmk.a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new wlv(a3, a2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wlv)) {
            return false;
        }
        wlv wlv = (wlv) obj;
        if (!this.a.equals(wlv.a) || !this.b.equals(wlv.b) || !this.c.equals(wlv.c) || !this.d.equals(wlv.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
