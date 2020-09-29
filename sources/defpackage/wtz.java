package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: wtz reason: default package */
public final class wtz extends wts {
    private final wua i;
    private final wty j;

    wtz(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, ClientAuth clientAuth, boolean z) {
        this(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, a(applicationProtocolConfig), j2, j3, clientAuth, z);
    }

    private wtz(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, wtq wtq, long j2, long j3, ClientAuth clientAuth, boolean z) {
        super(iterable, wtb, wtq, j2, j3, 1, (Certificate[]) x509CertificateArr2, clientAuth, z);
        try {
            b a = wui.a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
            this.i = a.a;
            this.j = a.b;
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ wub b() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public final wty c() {
        return this.j;
    }
}
