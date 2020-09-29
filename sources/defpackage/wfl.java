package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.io.File;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: wfl reason: default package */
public final class wfl extends wfm {
    private final wfv i;

    /* access modifiers changed from: 0000 */
    public final wfs c() {
        return null;
    }

    @Deprecated
    public wfl() {
        this((File) null, (TrustManagerFactory) null, (File) null, (File) null, (String) null, (KeyManagerFactory) null, null, (wev) wew.a, (ApplicationProtocolConfig) null, 0, 0);
    }

    @Deprecated
    private wfl(File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        this(a((File) null), (TrustManagerFactory) null, a((File) null), a((File) null, (String) null), (String) null, (KeyManagerFactory) null, null, wev, (ApplicationProtocolConfig) null, 0, 0);
    }

    wfl(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(iterable, wev, applicationProtocolConfig, j, j2, 0, (Certificate[]) x509CertificateArr2, ClientAuth.NONE, false);
        try {
            this.i = wga.a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    public final wfv b() {
        return this.i;
    }
}
