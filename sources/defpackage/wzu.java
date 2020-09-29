package defpackage;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* renamed from: wzu reason: default package */
public final class wzu {
    public static final wzu a = new a(true).a(i).a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).a(true).a();
    public static final wzu b = new a(true).a(i).a(TlsVersion.TLS_1_0).a(true).a();
    public static final wzu c = new a(false).a();
    private static final wzs[] h = {wzs.o, wzs.p, wzs.q, wzs.r, wzs.s, wzs.i, wzs.k, wzs.j, wzs.l, wzs.n, wzs.m};
    private static final wzs[] i = {wzs.o, wzs.p, wzs.q, wzs.r, wzs.s, wzs.i, wzs.k, wzs.j, wzs.l, wzs.n, wzs.m, wzs.g, wzs.h, wzs.e, wzs.f, wzs.c, wzs.d, wzs.b};
    final boolean d;
    public final boolean e;
    final String[] f;
    final String[] g;

    /* renamed from: wzu$a */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(wzu wzu) {
            this.a = wzu.d;
            this.b = wzu.f;
            this.c = wzu.g;
            this.d = wzu.e;
        }

        a(boolean z) {
            this.a = z;
        }

        public final a a(boolean z) {
            if (this.a) {
                this.d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
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

        public final a a(wzs... wzsArr) {
            if (this.a) {
                String[] strArr = new String[wzsArr.length];
                for (int i = 0; i < wzsArr.length; i++) {
                    strArr[i] = wzsArr[i].t;
                }
                return a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final wzu a() {
            return new wzu(this);
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
    }

    static {
        new a(true).a(h).a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).a(true).a();
    }

    wzu(a aVar) {
        this.d = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.e = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        if (this.g == null || xaq.b(xaq.g, this.g, sSLSocket.getEnabledProtocols())) {
            return this.f == null || xaq.b(wzs.a, this.f, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wzu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        wzu wzu = (wzu) obj;
        boolean z = this.d;
        if (z != wzu.d) {
            return false;
        }
        return !z || (Arrays.equals(this.f, wzu.f) && Arrays.equals(this.g, wzu.g) && this.e == wzu.e);
    }

    public final int hashCode() {
        if (this.d) {
            return ((((Arrays.hashCode(this.f) + 527) * 31) + Arrays.hashCode(this.g)) * 31) + (this.e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f;
        List list = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            str = (strArr != null ? wzs.a(strArr) : null).toString();
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
