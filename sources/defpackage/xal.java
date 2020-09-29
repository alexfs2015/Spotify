package defpackage;

import com.spotify.core.http.HttpConnection;
import java.io.Closeable;
import okhttp3.Protocol;

/* renamed from: xal reason: default package */
public final class xal implements Closeable {
    public final xaj a;
    public final Protocol b;
    public final int c;
    public final String d;
    public final xab e;
    public final xac f;
    public final xam g;
    public final xal h;
    public final xal i;
    public final xal j;
    public final long k;
    public final long l;
    private volatile wzo m;

    /* renamed from: xal$a */
    public static class a {
        public xaj a;
        public Protocol b;
        public int c;
        public String d;
        public xab e;
        public defpackage.xac.a f;
        public xam g;
        xal h;
        xal i;
        public xal j;
        public long k;
        public long l;

        public a() {
            this.c = -1;
            this.f = new defpackage.xac.a();
        }

        a(xal xal) {
            this.c = -1;
            this.a = xal.a;
            this.b = xal.b;
            this.c = xal.c;
            this.d = xal.d;
            this.e = xal.e;
            this.f = xal.f.b();
            this.g = xal.g;
            this.h = xal.h;
            this.i = xal.i;
            this.j = xal.j;
            this.k = xal.k;
            this.l = xal.l;
        }

        private static void a(String str, xal xal) {
            if (xal.g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (xal.h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (xal.i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (xal.j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public final a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public final a a(xac xac) {
            this.f = xac.b();
            return this;
        }

        public final a a(xal xal) {
            if (xal != null) {
                a("networkResponse", xal);
            }
            this.h = xal;
            return this;
        }

        public final xal a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.c);
                throw new IllegalStateException(sb.toString());
            } else if (this.d != null) {
                return new xal(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public final a b(xal xal) {
            if (xal != null) {
                a("cacheResponse", xal);
            }
            this.i = xal;
            return this;
        }
    }

    xal(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public final String a(String str) {
        return a(str, null);
    }

    public final String a(String str, String str2) {
        String a2 = this.f.a(str);
        return a2 != null ? a2 : str2;
    }

    public final boolean a() {
        int i2 = this.c;
        return i2 >= 200 && i2 < 300;
    }

    public final a b() {
        return new a(this);
    }

    public final boolean c() {
        int i2 = this.c;
        if (!(i2 == 307 || i2 == 308)) {
            switch (i2) {
                case 300:
                case HttpConnection.kErrorHttpConnectTimeout /*301*/:
                case HttpConnection.kErrorHttpConnectFail /*302*/:
                case HttpConnection.kErrorHttpInvalidUrl /*303*/:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final void close() {
        xam xam = this.g;
        if (xam != null) {
            xam.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final wzo d() {
        wzo wzo = this.m;
        if (wzo != null) {
            return wzo;
        }
        wzo a2 = wzo.a(this.f);
        this.m = a2;
        return a2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.a.a);
        sb.append('}');
        return sb.toString();
    }
}
