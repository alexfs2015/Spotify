package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;

/* renamed from: dcv reason: default package */
public abstract class dcv {
    private static volatile boolean f = true;
    int a;
    int b;
    dcx c;
    private int d;
    private boolean e;

    private dcv() {
        this.b = 100;
        this.d = Integer.MAX_VALUE;
        this.e = false;
    }

    /* synthetic */ dcv(byte b2) {
        this();
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static dcv a(byte[] bArr, int i, int i2, boolean z) {
        dcw dcw = new dcw(bArr, i, i2, z, 0);
        try {
            dcw.c(i2);
            return dcw;
        } catch (zzbbu e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract void e(int i);

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract zzbah l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    /* access modifiers changed from: 0000 */
    public abstract long s();

    public abstract boolean t();

    public abstract int u();
}
