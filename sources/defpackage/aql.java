package defpackage;

/* renamed from: aql reason: default package */
public abstract class aql implements arf, arg {
    protected arh a;
    protected int b;
    protected int c;
    protected ayk d;
    protected aqv[] e;
    protected boolean f = true;
    protected boolean g;
    private final int h;
    private long i;

    public aql(int i2) {
        this.h = i2;
    }

    protected static boolean a(asu<?> asu, ast ast) {
        if (ast == null) {
            return true;
        }
        if (asu == null) {
            return false;
        }
        return asu.a(ast);
    }

    public final int a() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final int a(aqw aqw, asm asm, boolean z) {
        int a2 = this.d.a(aqw, asm, z);
        if (a2 == -4) {
            if (asm.c()) {
                this.f = true;
                return this.g ? -4 : -3;
            }
            asm.d += this.i;
        } else if (a2 == -5) {
            aqv aqv = aqw.a;
            if (aqv.j != Long.MAX_VALUE) {
                aqw.a = aqv.a(aqv.j + this.i);
            }
        }
        return a2;
    }

    public /* synthetic */ void a(float f2) {
        CC.$default$a(this, f2);
    }

    public final void a(int i2) {
        this.b = i2;
    }

    public final void a(long j) {
        this.g = false;
        this.f = false;
        a(j, false);
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) {
    }

    public final void a(arh arh, aqv[] aqvArr, ayk ayk, long j, boolean z, long j2) {
        bdl.b(this.c == 0);
        this.a = arh;
        this.c = 1;
        a(z);
        a(aqvArr, ayk, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(aqv[] aqvArr, long j) {
    }

    public final void a(aqv[] aqvArr, ayk ayk, long j) {
        bdl.b(!this.g);
        this.d = ayk;
        this.f = false;
        this.e = aqvArr;
        this.i = j;
        a(aqvArr, j);
    }

    /* access modifiers changed from: protected */
    public final int b(long j) {
        return this.d.b_(j - this.i);
    }

    public final arg b() {
        return this;
    }

    public bdw c() {
        return null;
    }

    public final ayk f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final void h() {
        this.g = true;
    }

    public void handleMessage(int i2, Object obj) {
    }

    public final boolean i() {
        return this.g;
    }

    public final void j() {
        this.d.b();
    }

    public final int j_() {
        return this.c;
    }

    public final void k() {
        bdl.b(this.c == 2);
        this.c = 1;
        o();
    }

    public final void k_() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        bdl.b(z);
        this.c = 2;
        n();
    }

    public final void l() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        bdl.b(z);
        this.c = 0;
        this.d = null;
        this.e = null;
        this.g = false;
        p();
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
}
