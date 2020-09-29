package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* renamed from: wob reason: default package */
public class wob {
    static final wob a;
    private static final Logger b = Logger.getLogger(wmb.class.getName());

    public static String d() {
        return "OkHttp";
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String str) {
        return true;
    }

    public static wob c() {
        return a;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        a(5, str, (Throwable) obj);
    }

    public static List<String> a(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public wof a(X509TrustManager x509TrustManager) {
        return new wod(b(x509TrustManager));
    }

    public SSLContext b() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public woh b(X509TrustManager x509TrustManager) {
        return new woe(x509TrustManager.getAcceptedIssuers());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != null) goto L_0x0044;
     */
    static {
        /*
            wob r0 = defpackage.wnw.a()
            if (r0 == 0) goto L_0x0007
            goto L_0x0044
        L_0x0007:
            java.lang.String r0 = "okhttp.platform"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "conscrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0028
        L_0x0017:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            wnx r0 = defpackage.wnx.a()
            if (r0 == 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            wny r0 = defpackage.wny.a()
            if (r0 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            wob r0 = defpackage.wnz.a()
            if (r0 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            wob r0 = new wob
            r0.<init>()
        L_0x0044:
            a = r0
            java.lang.Class<wmb> r0 = defpackage.wmb.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wob.<clinit>():void");
    }
}
