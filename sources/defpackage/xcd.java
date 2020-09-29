package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* renamed from: xcd reason: default package */
public final class xcd extends xch {
    private xcd() {
    }

    public static xcd a() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new xcd();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Provider e() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public final String a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.a(sSLSocket);
    }

    public final void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) xch.a(list).toArray(new String[0]));
            return;
        }
        super.a(sSLSocket, str, list);
    }

    public final void a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public final SSLContext b() {
        try {
            return SSLContext.getInstance("TLSv1.3", e());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", e());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }
}
