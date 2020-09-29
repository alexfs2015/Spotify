package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: wft reason: default package */
public final class wft extends wfm {
    private final wfu i;
    private final wfs j;

    wft(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, ClientAuth clientAuth, boolean z) {
        this(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wev, a(applicationProtocolConfig), j2, j3, clientAuth, z);
    }

    private wft(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wev wev, wfk wfk, long j2, long j3, ClientAuth clientAuth, boolean z) {
        super(iterable, wev, wfk, j2, j3, 1, (Certificate[]) x509CertificateArr2, clientAuth, z);
        try {
            b a = wgc.a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
            this.i = a.a;
            this.j = a.b;
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public final wfs c() {
        return this.j;
    }

    public final /* bridge */ /* synthetic */ wfv b() {
        return this.i;
    }
}
