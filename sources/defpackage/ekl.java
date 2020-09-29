package defpackage;

/* renamed from: ekl reason: default package */
public final class ekl extends epu<ekl> {
    private static volatile ekl[] c;
    public Integer a;
    public long[] b;

    public static ekl[] a() {
        if (c == null) {
            synchronized (epy.b) {
                if (c == null) {
                    c = new ekl[0];
                }
            }
        }
        return c;
    }

    public ekl() {
        this.a = null;
        this.b = eqc.b;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekl)) {
            return false;
        }
        ekl ekl = (ekl) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekl.a != null) {
                return false;
            }
        } else if (!num.equals(ekl.a)) {
            return false;
        }
        if (!epy.a(this.b, ekl.b)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekl.L == null || ekl.L.a();
        }
        return this.L.equals(ekl.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + epy.a(this.b)) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode2 + i;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        long[] jArr = this.b;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.b;
                if (i >= jArr2.length) {
                    break;
                }
                ept.b(2, jArr2[i]);
                i++;
            }
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += ept.b(1, num.intValue());
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
            i2 += ept.a(jArr2[i]);
            i++;
        }
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eps.d());
            } else if (a2 == 16) {
                int a3 = eqc.a(eps, 16);
                long[] jArr = this.b;
                int length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = eps.e();
                    eps.a();
                    length++;
                }
                jArr2[length] = eps.e();
                this.b = jArr2;
            } else if (a2 == 18) {
                int c2 = eps.c(eps.d());
                int i = eps.i();
                int i2 = 0;
                while (eps.h() > 0) {
                    eps.e();
                    i2++;
                }
                eps.e(i);
                long[] jArr3 = this.b;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                long[] jArr4 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.b, 0, jArr4, 0, length2);
                }
                while (length2 < jArr4.length) {
                    jArr4[length2] = eps.e();
                    length2++;
                }
                this.b = jArr4;
                eps.d(c2);
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
