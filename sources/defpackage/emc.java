package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;

/* renamed from: emc reason: default package */
public abstract class emc {
    int a;
    int b;
    emf c;
    private int d;
    private boolean e;

    public abstract int a();

    public abstract <T extends enx> T a(eoh<T> eoh, eml eml);

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

    static emc a(byte[] bArr, int i, int i2) {
        eme eme = new eme(bArr, i, i2, false, 0);
        try {
            eme.c(i2);
            return eme;
        } catch (zzwe e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private emc() {
        this.b = 100;
        this.d = Integer.MAX_VALUE;
        this.e = false;
    }

    /* synthetic */ emc(byte b2) {
        this();
    }
}
