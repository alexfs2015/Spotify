package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.io.File;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManagerFactory;

@Deprecated
/* renamed from: wtk reason: default package */
public final class wtk extends wtl {
    @Deprecated
    public wtk() {
        this(null, null);
    }

    @Deprecated
    private wtk(File file, TrustManagerFactory trustManagerFactory) {
        this(null, null, null, wtc.a, wth.a, 0, 0);
    }

    @Deprecated
    private wtk(File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, wtf wtf, long j, long j2) {
        Iterable<String> iterable2 = iterable;
        wtb wtb2 = wtb;
        wtf wtf2 = wtf;
        super(a(a(file), trustManagerFactory, a((File) null), a((File) null, (String) null), null, null, j, j2), true, iterable2, wtb2, wtf2, ClientAuth.NONE, false);
    }

    @Deprecated
    private wtk(File file, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, wtb wtb, wtf wtf, long j, long j2) {
        this(file, trustManagerFactory, (File) null, (File) null, (String) null, (KeyManagerFactory) null, null, wtb, wtf, 0, 0);
    }

    wtk(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(a(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, j, j2), true, iterable, wtb, a(applicationProtocolConfig, false), ClientAuth.NONE, false);
    }

    private static SSLContext a(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, long j, long j2) {
        if (x509CertificateArr != null) {
            try {
                trustManagerFactory = a(x509CertificateArr, trustManagerFactory);
            } catch (Exception e) {
                if (e instanceof SSLException) {
                    throw ((SSLException) e);
                }
                throw new SSLException("failed to initialize the client-side SSL context", e);
            }
        }
        if (x509CertificateArr2 != null) {
            keyManagerFactory = a(x509CertificateArr2, privateKey, str, keyManagerFactory);
        }
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(keyManagerFactory == null ? null : keyManagerFactory.getKeyManagers(), trustManagerFactory == null ? null : trustManagerFactory.getTrustManagers(), null);
        SSLSessionContext clientSessionContext = instance.getClientSessionContext();
        if (j > 0) {
            clientSessionContext.setSessionCacheSize((int) Math.min(j, 2147483647L));
        }
        if (j2 > 0) {
            clientSessionContext.setSessionTimeout((int) Math.min(j2, 2147483647L));
        }
        return instance;
    }
}
