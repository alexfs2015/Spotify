package defpackage;

/* renamed from: dok reason: default package */
public final class dok extends dgr<dok> {
    private Integer a;
    private dox b;
    private dox c;
    private dox d;
    private dox[] e;
    private Integer f;

    public dok() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = dox.b();
        this.f = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        dox dox = this.b;
        if (dox != null) {
            a2 += dgq.b(2, (dgw) dox);
        }
        dox dox2 = this.c;
        if (dox2 != null) {
            a2 += dgq.b(3, (dgw) dox2);
        }
        dox dox3 = this.d;
        if (dox3 != null) {
            a2 += dgq.b(4, (dgw) dox3);
        }
        dox[] doxArr = this.e;
        if (doxArr != null && doxArr.length > 0) {
            int i = 0;
            while (true) {
                dox[] doxArr2 = this.e;
                if (i >= doxArr2.length) {
                    break;
                }
                dox dox4 = doxArr2[i];
                if (dox4 != null) {
                    a2 += dgq.b(5, (dgw) dox4);
                }
                i++;
            }
        }
        Integer num2 = this.f;
        return num2 != null ? a2 + dgq.b(6, num2.intValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        dox dox;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 8) {
                if (a2 == 18) {
                    if (this.b == null) {
                        this.b = new dox();
                    }
                    dox = this.b;
                } else if (a2 == 26) {
                    if (this.c == null) {
                        this.c = new dox();
                    }
                    dox = this.c;
                } else if (a2 == 34) {
                    if (this.d == null) {
                        this.d = new dox();
                    }
                    dox = this.d;
                } else if (a2 == 42) {
                    int a3 = dgz.a(dgo, 42);
                    dox[] doxArr = this.e;
                    int length = doxArr == null ? 0 : doxArr.length;
                    dox[] doxArr2 = new dox[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, doxArr2, 0, length);
                    }
                    while (length < doxArr2.length - 1) {
                        doxArr2[length] = new dox();
                        dgo.a((dgw) doxArr2[length]);
                        dgo.a();
                        length++;
                    }
                    doxArr2[length] = new dox();
                    dgo.a((dgw) doxArr2[length]);
                    this.e = doxArr2;
                } else if (a2 == 48) {
                    this.f = Integer.valueOf(dgo.f());
                } else if (!super.a(dgo, a2)) {
                    return this;
                }
                dgo.a((dgw) dox);
            } else {
                this.a = Integer.valueOf(dgo.f());
            }
        }
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        dox dox = this.b;
        if (dox != null) {
            dgq.a(2, (dgw) dox);
        }
        dox dox2 = this.c;
        if (dox2 != null) {
            dgq.a(3, (dgw) dox2);
        }
        dox dox3 = this.d;
        if (dox3 != null) {
            dgq.a(4, (dgw) dox3);
        }
        dox[] doxArr = this.e;
        if (doxArr != null && doxArr.length > 0) {
            int i = 0;
            while (true) {
                dox[] doxArr2 = this.e;
                if (i >= doxArr2.length) {
                    break;
                }
                dox dox4 = doxArr2[i];
                if (dox4 != null) {
                    dgq.a(5, (dgw) dox4);
                }
                i++;
            }
        }
        Integer num2 = this.f;
        if (num2 != null) {
            dgq.a(6, num2.intValue());
        }
        super.a(dgq);
    }
}
