package defpackage;

/* renamed from: dol reason: default package */
public final class dol extends dga<dol> {
    private doh a;
    private Integer b;
    private dok c;
    private dog d;

    public dol() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dol a(dfx dfx) {
        dgf dgf;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new doh();
                }
                dgf = this.a;
            } else if (a2 == 16) {
                int i = dfx.i();
                try {
                    this.b = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new dok();
                }
                dgf = this.c;
            } else if (a2 == 34) {
                if (this.d == null) {
                    this.d = new dog();
                }
                dgf = this.d;
            } else if (!super.a(dfx, a2)) {
                return this;
            }
            dfx.a(dgf);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        doh doh = this.a;
        if (doh != null) {
            a2 += dfz.b(1, (dgf) doh);
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dfz.b(2, num.intValue());
        }
        dok dok = this.c;
        if (dok != null) {
            a2 += dfz.b(3, (dgf) dok);
        }
        dog dog = this.d;
        return dog != null ? a2 + dfz.b(4, (dgf) dog) : a2;
    }

    public final void a(dfz dfz) {
        doh doh = this.a;
        if (doh != null) {
            dfz.a(1, (dgf) doh);
        }
        Integer num = this.b;
        if (num != null) {
            dfz.a(2, num.intValue());
        }
        dok dok = this.c;
        if (dok != null) {
            dfz.a(3, (dgf) dok);
        }
        dog dog = this.d;
        if (dog != null) {
            dfz.a(4, (dgf) dog);
        }
        super.a(dfz);
    }
}
