package defpackage;

import java.nio.ByteBuffer;
import okio.ByteString;

/* renamed from: wov reason: default package */
final class wov implements wol {
    private wok a = new wok();
    private woz b;
    private boolean c;

    wov(woz woz) {
        if (woz != null) {
            this.b = woz;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final wok b() {
        return this.a;
    }

    public final void a_(wok wok, long j) {
        if (!this.c) {
            this.a.a_(wok, j);
            u();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final wol b(ByteString byteString) {
        if (!this.c) {
            this.a.b(byteString);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol b(String str) {
        if (!this.c) {
            this.a.b(str);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol c(byte[] bArr) {
        if (!this.c) {
            this.a.c(bArr);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol c(byte[] bArr, int i, int i2) {
        if (!this.c) {
            this.a.c(bArr, i, i2);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            u();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public final wol j(int i) {
        if (!this.c) {
            this.a.j(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol i(int i) {
        if (!this.c) {
            this.a.i(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol h(int i) {
        if (!this.c) {
            this.a.h(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol g(int i) {
        if (!this.c) {
            this.a.g(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol o(long j) {
        if (!this.c) {
            this.a.o(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol n(long j) {
        if (!this.c) {
            this.a.n(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol m(long j) {
        if (!this.c) {
            this.a.m(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final wol u() {
        if (!this.c) {
            long e = this.a.e();
            if (e > 0) {
                this.b.a_(this.a, e);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.c) {
            if (this.a.b > 0) {
                woz woz = this.b;
                wok wok = this.a;
                woz.a_(wok, wok.b);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.a_(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                wpc.a(th);
            }
        }
    }

    public final wpb a() {
        return this.b.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
