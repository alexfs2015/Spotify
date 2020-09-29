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

/* renamed from: xch reason: default package */
public class xch {
    static final xch a;
    private static final Logger b = Logger.getLogger(xah.class.getName());

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != null) goto L_0x0044;
     */
    static {
        /*
            xch r0 = defpackage.xcc.a()
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
            xcd r0 = defpackage.xcd.a()
            if (r0 == 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            xce r0 = defpackage.xce.a()
            if (r0 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            xch r0 = defpackage.xcf.a()
            if (r0 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            xch r0 = new xch
            r0.<init>()
        L_0x0044:
            a = r0
            java.lang.Class<xah> r0 = defpackage.xah.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xch.<clinit>():void");
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

    public static xch c() {
        return a;
    }

    public static String d() {
        return "OkHttp";
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public xcl a(X509TrustManager x509TrustManager) {
        return new xcj(b(x509TrustManager));
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
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

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
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

    public xcn b(X509TrustManager x509TrustManager) {
        return new xck(x509TrustManager.getAcceptedIssuers());
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
