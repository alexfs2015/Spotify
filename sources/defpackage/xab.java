package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

/* renamed from: xab reason: default package */
public final class xab {
    final TlsVersion a;
    public final wzs b;
    public final List<Certificate> c;
    final List<Certificate> d;

    xab(TlsVersion tlsVersion, wzs wzs, List<Certificate> list, List<Certificate> list2) {
        this.a = tlsVersion;
        this.b = wzs;
        this.c = list;
        this.d = list2;
    }

    public static xab a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            wzs a2 = wzs.a(cipherSuite);
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
                List a4 = certificateArr != null ? xaq.a((T[]) certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new xab(a3, a2, a4, localCertificates != null ? xaq.a((T[]) localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xab)) {
            return false;
        }
        xab xab = (xab) obj;
        return this.a.equals(xab.a) && this.b.equals(xab.b) && this.c.equals(xab.c) && this.d.equals(xab.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
