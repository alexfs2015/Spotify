package defpackage;

import com.spotify.core.http.HttpConnection;
import java.io.Closeable;
import okhttp3.Protocol;

/* renamed from: wmf reason: default package */
public final class wmf implements Closeable {
    public final wmd a;
    public final Protocol b;
    public final int c;
    public final String d;
    public final wlv e;
    public final wlw f;
    public final wmg g;
    public final wmf h;
    public final wmf i;
    public final wmf j;
    public final long k;
    public final long l;
    private volatile wli m;

    /* renamed from: wmf$a */
    public static class a {
        public wmd a;
        public Protocol b;
        public int c;
        public String d;
        public wlv e;
        public defpackage.wlw.a f;
        public wmg g;
        wmf h;
        wmf i;
        public wmf j;
        public long k;
        public long l;

        public a() {
            this.c = -1;
            this.f = new defpackage.wlw.a();
        }

        a(wmf wmf) {
            this.c = -1;
            this.a = wmf.a;
            this.b = wmf.b;
            this.c = wmf.c;
            this.d = wmf.d;
            this.e = wmf.e;
            this.f = wmf.f.b();
            this.g = wmf.g;
            this.h = wmf.h;
            this.i = wmf.i;
            this.j = wmf.j;
            this.k = wmf.k;
            this.l = wmf.l;
        }

        public final a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public final a a(wlw wlw) {
            this.f = wlw.b();
            return this;
        }

        public final a a(wmf wmf) {
            if (wmf != null) {
                a("networkResponse", wmf);
            }
            this.h = wmf;
            return this;
        }

        public final a b(wmf wmf) {
            if (wmf != null) {
                a("cacheResponse", wmf);
            }
            this.i = wmf;
            return this;
        }

        private static void a(String str, wmf wmf) {
            if (wmf.g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (wmf.h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (wmf.i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (wmf.j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public final wmf a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.c);
                throw new IllegalStateException(sb.toString());
            } else if (this.d != null) {
                return new wmf(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    wmf(a aVar) {
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

    public final boolean a() {
        int i2 = this.c;
        return i2 >= 200 && i2 < 300;
    }

    public final String a(String str) {
        return a(str, null);
    }

    public final String a(String str, String str2) {
        String a2 = this.f.a(str);
        return a2 != null ? a2 : str2;
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

    public final wli d() {
        wli wli = this.m;
        if (wli != null) {
            return wli;
        }
        wli a2 = wli.a(this.f);
        this.m = a2;
        return a2;
    }

    public final void close() {
        wmg wmg = this.g;
        if (wmg != null) {
            wmg.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
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
