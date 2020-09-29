package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;

/* renamed from: emt reason: default package */
public abstract class emt {
    int a;
    int b;
    emw c;
    private int d;
    private boolean e;

    private emt() {
        this.b = 100;
        this.d = Integer.MAX_VALUE;
        this.e = false;
    }

    /* synthetic */ emt(byte b2) {
        this();
    }

    static emt a(byte[] bArr, int i, int i2) {
        emv emv = new emv(bArr, i, i2, false, 0);
        try {
            emv.c(i2);
            return emv;
        } catch (zzwe e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int a();

    public abstract <T extends eoo> T a(eoy<T> eoy, enc enc);

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

    public abstract zzun l();

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
