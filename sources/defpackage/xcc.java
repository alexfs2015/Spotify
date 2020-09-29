package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* renamed from: xcc reason: default package */
final class xcc extends xch {
    private final Class<?> b;
    private final xcg<Socket> c;
    private final xcg<Socket> d;
    private final xcg<Socket> e;
    private final xcg<Socket> f;
    private final c g = c.a();

    /* renamed from: xcc$a */
    static final class a extends xcl {
        private final Object a;
        private final Method b;

        a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        public final List<Certificate> a(List<Certificate> list, String str) {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.b.invoke(this.a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: xcc$b */
    static final class b implements xcn {
        private final X509TrustManager a;
        private final Method b;

        b(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw xaq.a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.a.hashCode() + (this.b.hashCode() * 31);
        }
    }

    /* renamed from: xcc$c */
    static final class c {
        private final Method a;
        private final Method b;
        private final Method c;

        private c(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }

        static c a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new c(method3, method, method2);
        }

        /* access modifiers changed from: 0000 */
        public final Object a(String str) {
            Method method = this.a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    private xcc(Class<?> cls, xcg<Socket> xcg, xcg<Socket> xcg2, xcg<Socket> xcg3, xcg<Socket> xcg4) {
        this.b = cls;
        this.c = xcg;
        this.d = xcg2;
        this.e = xcg3;
        this.f = xcg4;
    }

    public static xch a() {
        Class cls;
        xcg xcg;
        xcg xcg2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class cls3 = cls;
        xcg xcg3 = new xcg(null, "setUseSessionTickets", Boolean.TYPE);
        xcg xcg4 = new xcg(null, "setHostname", String.class);
        if (e()) {
            xcg xcg5 = new xcg(cls2, "getAlpnSelectedProtocol", new Class[0]);
            xcg = new xcg(null, "setAlpnProtocols", cls2);
            xcg2 = xcg5;
        } else {
            xcg2 = null;
            xcg = null;
        }
        xcc xcc = new xcc(cls3, xcg3, xcg4, xcg2, xcg);
        return xcc;
    }

    private boolean a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    private static boolean e() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Object a(String str) {
        return this.g.a(str);
    }

    public final String a(SSLSocket sSLSocket) {
        xcg<Socket> xcg = this.e;
        if (xcg == null || !xcg.a(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.e.b(sSLSocket, new Object[0]);
        if (bArr != null) {
            return new String(bArr, xaq.d);
        }
        return null;
    }

    public final xcl a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public final void a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public final void a(String str, Object obj) {
        if (!this.g.a(obj)) {
            a(5, str, (Throwable) null);
        }
    }

    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        String str = "Exception in connect";
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (xaq.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException(str);
            iOException.initCause(e3);
            throw iOException;
        } catch (ClassCastException e4) {
            if (VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException(str);
                iOException2.initCause(e4);
                throw iOException2;
            }
            throw e4;
        }
    }

    public final void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.c.a(sSLSocket, Boolean.TRUE);
            this.d.a(sSLSocket, str);
        }
        xcg<Socket> xcg = this.f;
        if (xcg != null && xcg.a(sSLSocket)) {
            Object[] objArr = new Object[1];
            xcq xcq = new xcq();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = (Protocol) list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    xcq.j(protocol.toString().length());
                    xcq.b(protocol.toString());
                }
            }
            objArr[0] = xcq.q();
            this.f.b(sSLSocket, objArr);
        }
    }

    public final SSLContext b() {
        boolean z = true;
        try {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public final xcn b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    public final boolean b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw xaq.a("unable to determine cleartext support", e2);
        }
    }
}
