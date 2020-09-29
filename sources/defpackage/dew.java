package defpackage;

/* renamed from: dew reason: default package */
public final class dew extends dgr<dew> {
    private Long a;
    private Integer b;
    private Boolean c;
    private int[] d;
    private Long e;

    public dew() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = dgz.a;
        this.e = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int[] iArr;
        int a2 = super.a();
        Long l = this.a;
        if (l != null) {
            a2 += dgq.d(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dgq.b(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            a2 += dgq.c(24) + 1;
        }
        int[] iArr2 = this.d;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = this.d;
                if (i >= iArr.length) {
                    break;
                }
                i2 += dgq.a(iArr[i]);
                i++;
            }
            a2 = a2 + i2 + (iArr.length * 1);
        }
        Long l2 = this.e;
        return l2 != null ? a2 + dgq.c(5, l2.longValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(dgo.g());
            } else if (a2 == 16) {
                this.b = Integer.valueOf(dgo.f());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(dgo.c());
            } else if (a2 == 32) {
                int a3 = dgz.a(dgo, 32);
                int[] iArr = this.d;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dgo.f();
                    dgo.a();
                    length++;
                }
                iArr2[length] = dgo.f();
                this.d = iArr2;
            } else if (a2 == 34) {
                int c2 = dgo.c(dgo.f());
                int i = dgo.i();
                int i2 = 0;
                while (dgo.h() > 0) {
                    dgo.f();
                    i2++;
                }
                dgo.e(i);
                int[] iArr3 = this.d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.d, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dgo.f();
                    length2++;
                }
                this.d = iArr4;
                dgo.d(c2);
            } else if (a2 == 40) {
                this.e = Long.valueOf(dgo.g());
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        Long l = this.a;
        if (l != null) {
            dgq.b(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            dgq.a(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            dgq.a(3, bool.booleanValue());
        }
        int[] iArr = this.d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.d;
                if (i >= iArr2.length) {
                    break;
                }
                dgq.a(4, iArr2[i]);
                i++;
            }
        }
        Long l2 = this.e;
        if (l2 != null) {
            dgq.a(5, l2.longValue());
        }
        super.a(dgq);
    }
}
