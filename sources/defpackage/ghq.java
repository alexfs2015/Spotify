package defpackage;

import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.TlsVersion;

/* renamed from: ghq reason: default package */
public final class ghq {
    public X509TrustManager a;
    public SSLSocketFactory b;
    public List<wlo> c;

    /* renamed from: ghq$a */
    public static class a {
        public static final ghq a = new ghq(0);
    }

    /* synthetic */ ghq(byte b2) {
        this();
    }

    private ghq() {
        try {
            if (VERSION.SDK_INT <= 19) {
                try {
                    TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    instance.init(null);
                    TrustManager[] trustManagers = instance.getTrustManagers();
                    if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                        StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
                        sb.append(Arrays.toString(trustManagers));
                        throw new IllegalStateException(sb.toString());
                    }
                    this.a = (X509TrustManager) trustManagers[0];
                    SSLContext instance2 = SSLContext.getInstance(TlsVersion.TLS_1_2.javaName);
                    instance2.init(null, new TrustManager[]{this.a}, null);
                    this.b = new ghr(instance2.getSocketFactory());
                    this.c = Arrays.asList(new wlo[]{new defpackage.wlo.a(wlo.a).a(TlsVersion.TLS_1_2).a(), wlo.b, wlo.c});
                } catch (GeneralSecurityException e) {
                    Assertion.a("Failed to enable TLS 1.2.", (Throwable) e);
                }
            }
        } catch (Exception e2) {
            Logger.e(e2, "Unexpected problem on applying TLS patch.", new Object[0]);
        }
    }
}
