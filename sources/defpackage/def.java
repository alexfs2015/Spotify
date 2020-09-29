package defpackage;

/* renamed from: def reason: default package */
public final class def extends dga<def> {
    private Long a;
    private Integer b;
    private Boolean c;
    private int[] d;
    private Long e;

    public def() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = dgi.a;
        this.e = null;
        this.Z = -1;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(dfx.g());
            } else if (a2 == 16) {
                this.b = Integer.valueOf(dfx.f());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(dfx.c());
            } else if (a2 == 32) {
                int a3 = dgi.a(dfx, 32);
                int[] iArr = this.d;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dfx.f();
                    dfx.a();
                    length++;
                }
                iArr2[length] = dfx.f();
                this.d = iArr2;
            } else if (a2 == 34) {
                int c2 = dfx.c(dfx.f());
                int i = dfx.i();
                int i2 = 0;
                while (dfx.h() > 0) {
                    dfx.f();
                    i2++;
                }
                dfx.e(i);
                int[] iArr3 = this.d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.d, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dfx.f();
                    length2++;
                }
                this.d = iArr4;
                dfx.d(c2);
            } else if (a2 == 40) {
                this.e = Long.valueOf(dfx.g());
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        Long l = this.a;
        if (l != null) {
            dfz.b(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            dfz.a(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            dfz.a(3, bool.booleanValue());
        }
        int[] iArr = this.d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.d;
                if (i >= iArr2.length) {
                    break;
                }
                dfz.a(4, iArr2[i]);
                i++;
            }
        }
        Long l2 = this.e;
        if (l2 != null) {
            dfz.a(5, l2.longValue());
        }
        super.a(dfz);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int[] iArr;
        int a2 = super.a();
        Long l = this.a;
        if (l != null) {
            a2 += dfz.d(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dfz.b(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            a2 += dfz.c(24) + 1;
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
                i2 += dfz.a(iArr[i]);
                i++;
            }
            a2 = a2 + i2 + (iArr.length * 1);
        }
        Long l2 = this.e;
        return l2 != null ? a2 + dfz.c(5, l2.longValue()) : a2;
    }
}
