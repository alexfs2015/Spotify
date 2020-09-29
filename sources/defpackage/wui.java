package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.tomcat.jni.SSLContext;

/* renamed from: wui reason: default package */
public final class wui extends wuh {
    private static final byte[] i = {110, 101, 116, 116, 121};
    private final wua j;
    private final wty k;

    /* renamed from: wui$a */
    static final class a extends a {
        private final X509ExtendedTrustManager a;

        a(wtv wtv, X509ExtendedTrustManager x509ExtendedTrustManager) {
            super(wtv);
            this.a = x509ExtendedTrustManager;
        }
    }

    /* renamed from: wui$b */
    static final class b {
        wua a;
        wty b;

        b() {
        }
    }

    /* renamed from: wui$c */
    static final class c extends a {
        private final X509TrustManager a;

        c(wtv wtv, X509TrustManager x509TrustManager) {
            super(wtv);
            this.a = x509TrustManager;
        }
    }

    wui(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, ClientAuth clientAuth, boolean z) {
        this(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, a(applicationProtocolConfig), j2, j3, clientAuth, z);
    }

    private wui(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, wtq wtq, long j2, long j3, ClientAuth clientAuth, boolean z) {
        super(iterable, wtb, wtq, j2, j3, 1, (Certificate[]) x509CertificateArr2, clientAuth, z, true);
        try {
            b a2 = a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
            this.j = a2.a;
            this.k = a2.b;
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    static b a(wuh wuh, long j2, wtv wtv, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        b bVar = new b();
        synchronized (wuh.class) {
            try {
                SSLContext.setVerify(j2, 0, 10);
                if (wtp.d()) {
                    if (keyManagerFactory == null) {
                        keyManagerFactory = a(x509CertificateArr2, privateKey, str, keyManagerFactory);
                    }
                    X509KeyManager a2 = a(keyManagerFactory.getKeyManagers());
                    bVar.b = a(a2) ? new wtw((X509ExtendedKeyManager) a2, str) : new wty(a2, str);
                } else if (keyManagerFactory == null) {
                    wxq.a(x509CertificateArr2, "keyCertChain");
                    SSLContext.setVerify(j2, 0, 10);
                    a(j2, x509CertificateArr2, privateKey, str);
                } else {
                    throw new IllegalArgumentException("KeyManagerFactory not supported");
                }
                if (x509CertificateArr != null) {
                    trustManagerFactory = a(x509CertificateArr, trustManagerFactory);
                } else if (trustManagerFactory == null) {
                    trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init(null);
                }
                X509TrustManager a3 = a(trustManagerFactory.getTrustManagers());
                if (a(a3)) {
                    SSLContext.setCertVerifyCallback(j2, new a(wtv, (X509ExtendedTrustManager) a3));
                } else {
                    SSLContext.setCertVerifyCallback(j2, new c(wtv, a3));
                }
            } catch (Exception e) {
                throw new SSLException("failed to set certificate and key", e);
            } catch (Exception e2) {
                throw new SSLException("unable to setup trustmanager", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.a = new wua(wuh);
        bVar.a.a(i);
        return bVar;
    }

    public final /* bridge */ /* synthetic */ wub b() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final wty c() {
        return this.k;
    }
}
