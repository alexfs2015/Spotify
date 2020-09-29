package defpackage;

import java.nio.ByteBuffer;
import okio.ByteString;

/* renamed from: xdb reason: default package */
final class xdb implements xcr {
    private xcq a = new xcq();
    private xdf b;
    private boolean c;

    xdb(xdf xdf) {
        if (xdf != null) {
            this.b = xdf;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final xdh a() {
        return this.b.a();
    }

    public final void a_(xcq xcq, long j) {
        if (!this.c) {
            this.a.a_(xcq, j);
            u();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final xcq b() {
        return this.a;
    }

    public final xcr b(String str) {
        if (!this.c) {
            this.a.b(str);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr b(ByteString byteString) {
        if (!this.c) {
            this.a.b(byteString);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr c(byte[] bArr) {
        if (!this.c) {
            this.a.c(bArr);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr c(byte[] bArr, int i, int i2) {
        if (!this.c) {
            this.a.c(bArr, i, i2);
            return u();
        }
        throw new IllegalStateException("closed");
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
                xdi.a(th);
            }
        }
    }

    public final void flush() {
        if (!this.c) {
            if (this.a.b > 0) {
                xdf xdf = this.b;
                xcq xcq = this.a;
                xdf.a_(xcq, xcq.b);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final xcr g(int i) {
        if (!this.c) {
            this.a.g(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr h(int i) {
        if (!this.c) {
            this.a.h(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr i(int i) {
        if (!this.c) {
            this.a.i(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final xcr j(int i) {
        if (!this.c) {
            this.a.j(i);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr m(long j) {
        if (!this.c) {
            this.a.m(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr n(long j) {
        if (!this.c) {
            this.a.n(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final xcr o(long j) {
        if (!this.c) {
            this.a.o(j);
            return u();
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public final xcr u() {
        if (!this.c) {
            long e = this.a.e();
            if (e > 0) {
                this.b.a_(this.a, e);
            }
            return this;
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
}
