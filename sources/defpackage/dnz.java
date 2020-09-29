package defpackage;

/* renamed from: dnz reason: default package */
public final class dnz extends dga<dnz> {
    private dnx a;
    private dof[] b;
    private Integer c;
    private dog d;

    public dnz() {
        this.a = null;
        this.b = dof.b();
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnz a(dfx dfx) {
        dgf dgf;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new dnx();
                }
                dgf = this.a;
            } else if (a2 == 18) {
                int a3 = dgi.a(dfx, 18);
                dof[] dofArr = this.b;
                int length = dofArr == null ? 0 : dofArr.length;
                dof[] dofArr2 = new dof[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dofArr2, 0, length);
                }
                while (length < dofArr2.length - 1) {
                    dofArr2[length] = new dof();
                    dfx.a((dgf) dofArr2[length]);
                    dfx.a();
                    length++;
                }
                dofArr2[length] = new dof();
                dfx.a((dgf) dofArr2[length]);
                this.b = dofArr2;
            } else if (a2 == 24) {
                int i = dfx.i();
                try {
                    this.c = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
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
        dnx dnx = this.a;
        if (dnx != null) {
            a2 += dfz.b(1, (dgf) dnx);
        }
        dof[] dofArr = this.b;
        if (dofArr != null && dofArr.length > 0) {
            int i = 0;
            while (true) {
                dof[] dofArr2 = this.b;
                if (i >= dofArr2.length) {
                    break;
                }
                dof dof = dofArr2[i];
                if (dof != null) {
                    a2 += dfz.b(2, (dgf) dof);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dfz.b(3, num.intValue());
        }
        dog dog = this.d;
        return dog != null ? a2 + dfz.b(4, (dgf) dog) : a2;
    }

    public final void a(dfz dfz) {
        dnx dnx = this.a;
        if (dnx != null) {
            dfz.a(1, (dgf) dnx);
        }
        dof[] dofArr = this.b;
        if (dofArr != null && dofArr.length > 0) {
            int i = 0;
            while (true) {
                dof[] dofArr2 = this.b;
                if (i >= dofArr2.length) {
                    break;
                }
                dof dof = dofArr2[i];
                if (dof != null) {
                    dfz.a(2, (dgf) dof);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            dfz.a(3, num.intValue());
        }
        dog dog = this.d;
        if (dog != null) {
            dfz.a(4, (dgf) dog);
        }
        super.a(dfz);
    }
}
