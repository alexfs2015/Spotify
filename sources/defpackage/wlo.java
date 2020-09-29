package defpackage;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* renamed from: wlo reason: default package */
public final class wlo {
    public static final wlo a = new a(true).a(i).a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).a(true).a();
    public static final wlo b = new a(true).a(i).a(TlsVersion.TLS_1_0).a(true).a();
    public static final wlo c = new a(false).a();
    private static final wlm[] h = {wlm.o, wlm.p, wlm.q, wlm.r, wlm.s, wlm.i, wlm.k, wlm.j, wlm.l, wlm.n, wlm.m};
    private static final wlm[] i = {wlm.o, wlm.p, wlm.q, wlm.r, wlm.s, wlm.i, wlm.k, wlm.j, wlm.l, wlm.n, wlm.m, wlm.g, wlm.h, wlm.e, wlm.f, wlm.c, wlm.d, wlm.b};
    final boolean d;
    public final boolean e;
    final String[] f;
    final String[] g;

    /* renamed from: wlo$a */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean z) {
            this.a = z;
        }

        public a(wlo wlo) {
            this.a = wlo.d;
            this.b = wlo.f;
            this.c = wlo.g;
            this.d = wlo.e;
        }

        public final a a(wlm... wlmArr) {
            if (this.a) {
                String[] strArr = new String[wlmArr.length];
                for (int i = 0; i < wlmArr.length; i++) {
                    strArr[i] = wlmArr[i].t;
                }
                return a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final a a(TlsVersion... tlsVersionArr) {
            if (this.a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public final a a(boolean z) {
            if (this.a) {
                this.d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public final wlo a() {
            return new wlo(this);
        }
    }

    static {
        new a(true).a(h).a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).a(true).a();
    }

    wlo(a aVar) {
        this.d = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.e = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        if (this.g != null && !wmk.b(wmk.g, this.g, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f == null || wmk.b(wlm.a, this.f, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wlo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        wlo wlo = (wlo) obj;
        boolean z = this.d;
        if (z != wlo.d) {
            return false;
        }
        return !z || (Arrays.equals(this.f, wlo.f) && Arrays.equals(this.g, wlo.g) && this.e == wlo.e);
    }

    public final int hashCode() {
        if (this.d) {
            return ((((Arrays.hashCode(this.f) + 527) * 31) + Arrays.hashCode(this.g)) * 31) + (this.e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        Object obj;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f;
        List list = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                obj = wlm.a(strArr);
            } else {
                obj = null;
            }
            str = obj.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.g;
        if (strArr2 != null) {
            if (strArr2 != null) {
                list = TlsVersion.a(strArr2);
            }
            str2 = list.toString();
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
