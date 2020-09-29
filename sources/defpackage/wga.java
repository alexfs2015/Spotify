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

/* renamed from: wga reason: default package */
public final class wga extends wgb {
    private final wfv i;

    /* renamed from: wga$a */
    static final class a extends a {
        private final X509ExtendedTrustManager a;

        a(wfp wfp, X509ExtendedTrustManager x509ExtendedTrustManager) {
            super(wfp);
            this.a = x509ExtendedTrustManager;
        }
    }

    /* renamed from: wga$b */
    static final class b implements CertificateRequestedCallback {
        private final wfp a;
        private final wfs b;

        b(wfp wfp, wfs wfs) {
            this.a = wfp;
            this.b = wfs;
        }
    }

    /* renamed from: wga$c */
    static final class c extends wfv {
        public final int getSessionCacheSize() {
            return 0;
        }

        public final int getSessionTimeout() {
            return 0;
        }

        c(wgb wgb) {
            super(wgb);
        }

        public final void setSessionTimeout(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }

        public final void setSessionCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: wga$d */
    static final class d extends a {
        private final X509TrustManager a;

        d(wfp wfp, X509TrustManager x509TrustManager) {
            super(wfp);
            this.a = x509TrustManager;
        }
    }

    /* access modifiers changed from: 0000 */
    public final wfs c() {
        return null;
    }

    static {
        wjx.a(wga.class);
    }

    wga(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(iterable, wev, applicationProtocolConfig, j, j2, 0, (Certificate[]) x509CertificateArr2, ClientAuth.NONE, false, true);
        try {
            this.i = a(this, this.a, this.e, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
        } catch (Throwable th) {
            B();
            throw th;
        }
    }

    public final wfv b() {
        return this.i;
    }

    static wfv a(wgb wgb, long j, wfp wfp, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        if ((privateKey != null || x509CertificateArr2 == null) && (privateKey == null || x509CertificateArr2 != null)) {
            synchronized (wgb.class) {
                try {
                    if (wfj.d()) {
                        if (keyManagerFactory == null && x509CertificateArr2 != null) {
                            keyManagerFactory = a(x509CertificateArr2, privateKey, str, keyManagerFactory);
                        }
                        if (keyManagerFactory != null) {
                            X509KeyManager a2 = a(keyManagerFactory.getKeyManagers());
                            SSLContext.setCertRequestedCallback(j, new b(wfp, a(a2) ? new wfq((X509ExtendedKeyManager) a2, str) : new wfs(a2, str)));
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
                        SSLContext.setCertVerifyCallback(j, new a(wfp, (X509ExtendedTrustManager) a3));
                    } else {
                        SSLContext.setCertVerifyCallback(j, new d(wfp, a3));
                    }
                } catch (Exception e) {
                    throw new SSLException("failed to set certificate and key", e);
                } catch (Exception e2) {
                    throw new SSLException("unable to setup trustmanager", e2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new c(wgb);
        }
        throw new IllegalArgumentException("Either both keyCertChain and key needs to be null or none of them");
    }
}
