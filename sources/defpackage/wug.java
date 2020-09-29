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
import org.apache.tomcat.jni.CertificateRequestedCallback;
import org.apache.tomcat.jni.SSLContext;

/* renamed from: wug reason: default package */
public final class wug extends wuh {
    private final wub i;

    /* renamed from: wug$a */
    static final class a extends a {
        private final X509ExtendedTrustManager a;

        a(wtv wtv, X509ExtendedTrustManager x509ExtendedTrustManager) {
            super(wtv);
            this.a = x509ExtendedTrustManager;
        }
    }

    /* renamed from: wug$b */
    static final class b implements CertificateRequestedCallback {
        private final wtv a;
        private final wty b;

        b(wtv wtv, wty wty) {
            this.a = wtv;
            this.b = wty;
        }
    }

    /* renamed from: wug$c */
    static final class c extends wub {
        c(wuh wuh) {
            super(wuh);
        }

        public final int getSessionCacheSize() {
            return 0;
        }

        public final int getSessionTimeout() {
            return 0;
        }

        public final void setSessionCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }

        public final void setSessionTimeout(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: wug$d */
    static final class d extends a {
        private final X509TrustManager a;

        d(wtv wtv, X509TrustManager x509TrustManager) {
            super(wtv);
            this.a = x509TrustManager;
        }
    }

    static {
        wyd.a(wug.class);
    }

    wug(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(iterable, wtb, applicationProtocolConfig, j, j2, 0, (Certificate[]) x509CertificateArr2, ClientAuth.NONE, false, true);
        try {
            this.i = a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    static wub a(wuh wuh, long j, wtv wtv, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        if ((privateKey != null || x509CertificateArr2 == null) && (privateKey == null || x509CertificateArr2 != null)) {
            synchronized (wuh.class) {
                try {
                    if (wtp.d()) {
                        if (keyManagerFactory == null && x509CertificateArr2 != null) {
                            keyManagerFactory = a(x509CertificateArr2, privateKey, str, keyManagerFactory);
                        }
                        if (keyManagerFactory != null) {
                            X509KeyManager a2 = a(keyManagerFactory.getKeyManagers());
                            SSLContext.setCertRequestedCallback(j, new b(wtv, a(a2) ? new wtw((X509ExtendedKeyManager) a2, str) : new wty(a2, str)));
                        }
                    } else if (keyManagerFactory != null) {
                        throw new IllegalArgumentException("KeyManagerFactory not supported");
                    } else if (x509CertificateArr2 != null) {
                        a(j, x509CertificateArr2, privateKey, str);
                    }
                    SSLContext.setVerify(j, 0, 10);
                    if (x509CertificateArr != null) {
                        trustManagerFactory = a(x509CertificateArr, trustManagerFactory);
                    } else if (trustManagerFactory == null) {
                        trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init(null);
                    }
                    X509TrustManager a3 = a(trustManagerFactory.getTrustManagers());
                    if (a(a3)) {
                        SSLContext.setCertVerifyCallback(j, new a(wtv, (X509ExtendedTrustManager) a3));
                    } else {
                        SSLContext.setCertVerifyCallback(j, new d(wtv, a3));
                    }
                } catch (Exception e) {
                    throw new SSLException("failed to set certificate and key", e);
                } catch (Exception e2) {
                    throw new SSLException("unable to setup trustmanager", e2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new c(wuh);
        }
        throw new IllegalArgumentException("Either both keyCertChain and key needs to be null or none of them");
    }

    public final wub b() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public final wty c() {
        return null;
    }
}
