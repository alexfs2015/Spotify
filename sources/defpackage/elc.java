package defpackage;

/* renamed from: elc reason: default package */
public final class elc extends eql<elc> {
    private static volatile elc[] c;
    public Integer a;
    public long[] b;

    public elc() {
        this.a = null;
        this.b = eqt.b;
        this.L = null;
        this.M = -1;
    }

    public static elc[] a() {
        if (c == null) {
            synchronized (eqp.b) {
                if (c == null) {
                    c = new elc[0];
                }
            }
        }
        return c;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eqj.d());
            } else if (a2 == 16) {
                int a3 = eqt.a(eqj, 16);
                long[] jArr = this.b;
                int length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = eqj.e();
                    eqj.a();
                    length++;
                }
                jArr2[length] = eqj.e();
                this.b = jArr2;
            } else if (a2 == 18) {
                int c2 = eqj.c(eqj.d());
                int i = eqj.i();
                int i2 = 0;
                while (eqj.h() > 0) {
                    eqj.e();
                    i2++;
                }
                eqj.e(i);
                long[] jArr3 = this.b;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                long[] jArr4 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.b, 0, jArr4, 0, length2);
                }
                while (length2 < jArr4.length) {
                    jArr4[length2] = eqj.e();
                    length2++;
                }
                this.b = jArr4;
                eqj.d(c2);
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        Integer num = this.a;
        if (num != null) {
            eqk.a(1, num.intValue());
        }
        long[] jArr = this.b;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.b;
                if (i >= jArr2.length) {
                    break;
                }
                eqk.b(2, jArr2[i]);
                i++;
            }
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += eqk.b(1, num.intValue());
        }
        long[] jArr = this.b;
        if (jArr == null || jArr.length <= 0) {
            return b2;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr2 = this.b;
            if (i >= jArr2.length) {
                return b2 + i2 + (jArr2.length * 1);
            }
            i2 += eqk.a(jArr2[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elc)) {
            return false;
        }
        elc elc = (elc) obj;
        Integer num = this.a;
        if (num == null) {
            if (elc.a != null) {
                return false;
            }
        } else if (!num.equals(elc.a)) {
            return false;
        }
        if (!eqp.a(this.b, elc.b)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? elc.L == null || elc.L.a() : this.L.equals(elc.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + eqp.a(this.b)) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode2 + i;
    }
}
