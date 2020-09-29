package defpackage;

/* renamed from: apu reason: default package */
public abstract class apu implements aqo, aqp {
    protected aqq a;
    protected int b;
    protected int c;
    protected axt d;
    protected aqe[] e;
    protected boolean f = true;
    protected boolean g;
    private final int h;
    private long i;

    public /* synthetic */ void a(float f2) {
        CC.$default$a(this, f2);
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(aqe[] aqeArr, long j) {
    }

    public final aqp b() {
        return this;
    }

    public bdf c() {
        return null;
    }

    public void handleMessage(int i2, Object obj) {
    }

    public int m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    public apu(int i2) {
        this.h = i2;
    }

    public final int a() {
        return this.h;
    }

    public final void a(int i2) {
        this.b = i2;
    }

    public final int j_() {
        return this.c;
    }

    public final void a(aqq aqq, aqe[] aqeArr, axt axt, long j, boolean z, long j2) {
        bcu.b(this.c == 0);
        this.a = aqq;
        this.c = 1;
        a(z);
        a(aqeArr, axt, j2);
        a(j, z);
    }

    public final void k_() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        bcu.b(z);
        this.c = 2;
        n();
    }

    public final void a(aqe[] aqeArr, axt axt, long j) {
        bcu.b(!this.g);
        this.d = axt;
        this.f = false;
        this.e = aqeArr;
        this.i = j;
        a(aqeArr, j);
    }

    public final axt f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final void h() {
        this.g = true;
    }

    public final boolean i() {
        return this.g;
    }

    public final void j() {
        this.d.b();
    }

    public final void a(long j) {
        this.g = false;
        this.f = false;
        a(j, false);
    }

    public final void k() {
        bcu.b(this.c == 2);
        this.c = 1;
        o();
    }

    public final void l() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        bcu.b(z);
        this.c = 0;
        this.d = null;
        this.e = null;
        this.g = false;
        p();
    }

    /* access modifiers changed from: protected */
    public final int a(aqf aqf, arv arv, boolean z) {
        int a2 = this.d.a(aqf, arv, z);
        if (a2 == -4) {
            if (arv.c()) {
                this.f = true;
                if (this.g) {
                    return -4;
                }
                return -3;
            }
            arv.d += this.i;
        } else if (a2 == -5) {
            aqe aqe = aqf.a;
            if (aqe.j != Long.MAX_VALUE) {
                aqf.a = aqe.a(aqe.j + this.i);
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final int b(long j) {
        return this.d.b_(j - this.i);
    }

    protected static boolean a(asd<?> asd, asc asc) {
        if (asc == null) {
            return true;
        }
        if (asd == null) {
            return false;
        }
        return asd.a(asc);
    }
}
