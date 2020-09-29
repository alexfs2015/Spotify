package defpackage;

/* renamed from: ekk reason: default package */
public final class ekk extends epu<ekk> {
    public long[] a;
    public long[] b;
    public ekf[] c;
    public ekl[] d;

    public ekk() {
        this.a = eqc.b;
        this.b = eqc.b;
        this.c = ekf.a();
        this.d = ekl.a();
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekk)) {
            return false;
        }
        ekk ekk = (ekk) obj;
        if (!epy.a(this.a, ekk.a) || !epy.a(this.b, ekk.b) || !epy.a((Object[]) this.c, (Object[]) ekk.c) || !epy.a((Object[]) this.d, (Object[]) ekk.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekk.L == null || ekk.L.a();
        }
        return this.L.equals(ekk.L);
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + epy.a(this.a)) * 31) + epy.a(this.b)) * 31) + epy.a((Object[]) this.c)) * 31) + epy.a((Object[]) this.d)) * 31) + ((this.L == null || this.L.a()) ? 0 : this.L.hashCode());
    }

    public final void a(ept ept) {
        long[] jArr = this.a;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.a;
                if (i2 >= jArr2.length) {
                    break;
                }
                ept.a(1, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.b;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr4 = this.b;
                if (i3 >= jArr4.length) {
                    break;
                }
                ept.a(2, jArr4[i3]);
                i3++;
            }
        }
        ekf[] ekfArr = this.c;
        if (ekfArr != null && ekfArr.length > 0) {
            int i4 = 0;
            while (true) {
                ekf[] ekfArr2 = this.c;
                if (i4 >= ekfArr2.length) {
                    break;
                }
                ekf ekf = ekfArr2[i4];
                if (ekf != null) {
                    ept.a(3, (epz) ekf);
                }
                i4++;
            }
        }
        ekl[] eklArr = this.d;
        if (eklArr != null && eklArr.length > 0) {
            while (true) {
                ekl[] eklArr2 = this.d;
                if (i >= eklArr2.length) {
                    break;
                }
                ekl ekl = eklArr2[i];
                if (ekl != null) {
                    ept.a(4, (epz) ekl);
                }
                i++;
            }
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        long[] jArr;
        long[] jArr2;
        int b2 = super.b();
        long[] jArr3 = this.a;
        int i = 0;
        if (jArr3 != null && jArr3.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr2 = this.a;
                if (i2 >= jArr2.length) {
                    break;
                }
                i3 += ept.a(jArr2[i2]);
                i2++;
            }
            b2 = b2 + i3 + (jArr2.length * 1);
        }
        long[] jArr4 = this.b;
        if (jArr4 != null && jArr4.length > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                jArr = this.b;
                if (i4 >= jArr.length) {
                    break;
                }
                i5 += ept.a(jArr[i4]);
                i4++;
            }
            b2 = b2 + i5 + (jArr.length * 1);
        }
        ekf[] ekfArr = this.c;
        if (ekfArr != null && ekfArr.length > 0) {
            int i6 = b2;
            int i7 = 0;
            while (true) {
                ekf[] ekfArr2 = this.c;
                if (i7 >= ekfArr2.length) {
                    break;
                }
                ekf ekf = ekfArr2[i7];
                if (ekf != null) {
                    i6 += ept.b(3, (epz) ekf);
                }
                i7++;
            }
            b2 = i6;
        }
        ekl[] eklArr = this.d;
        if (eklArr != null && eklArr.length > 0) {
            while (true) {
                ekl[] eklArr2 = this.d;
                if (i >= eklArr2.length) {
                    break;
                }
                ekl ekl = eklArr2[i];
                if (ekl != null) {
                    b2 += ept.b(4, (epz) ekl);
                }
                i++;
            }
        }
        return b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int a3 = eqc.a(eps, 8);
                long[] jArr = this.a;
                int length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = eps.e();
                    eps.a();
                    length++;
                }
                jArr2[length] = eps.e();
                this.a = jArr2;
            } else if (a2 == 10) {
                int c2 = eps.c(eps.d());
                int i = eps.i();
                int i2 = 0;
                while (eps.h() > 0) {
                    eps.e();
                    i2++;
                }
                eps.e(i);
                long[] jArr3 = this.a;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                long[] jArr4 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.a, 0, jArr4, 0, length2);
                }
                while (length2 < jArr4.length) {
                    jArr4[length2] = eps.e();
                    length2++;
                }
                this.a = jArr4;
                eps.d(c2);
            } else if (a2 == 16) {
                int a4 = eqc.a(eps, 16);
                long[] jArr5 = this.b;
                int length3 = jArr5 == null ? 0 : jArr5.length;
                long[] jArr6 = new long[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.b, 0, jArr6, 0, length3);
                }
                while (length3 < jArr6.length - 1) {
                    jArr6[length3] = eps.e();
                    eps.a();
                    length3++;
                }
                jArr6[length3] = eps.e();
                this.b = jArr6;
            } else if (a2 == 18) {
                int c3 = eps.c(eps.d());
                int i3 = eps.i();
                int i4 = 0;
                while (eps.h() > 0) {
                    eps.e();
                    i4++;
                }
                eps.e(i3);
                long[] jArr7 = this.b;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                long[] jArr8 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.b, 0, jArr8, 0, length4);
                }
                while (length4 < jArr8.length) {
                    jArr8[length4] = eps.e();
                    length4++;
                }
                this.b = jArr8;
                eps.d(c3);
            } else if (a2 == 26) {
                int a5 = eqc.a(eps, 26);
                ekf[] ekfArr = this.c;
                int length5 = ekfArr == null ? 0 : ekfArr.length;
                ekf[] ekfArr2 = new ekf[(a5 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.c, 0, ekfArr2, 0, length5);
                }
                while (length5 < ekfArr2.length - 1) {
                    ekfArr2[length5] = new ekf();
                    eps.a((epz) ekfArr2[length5]);
                    eps.a();
                    length5++;
                }
                ekfArr2[length5] = new ekf();
                eps.a((epz) ekfArr2[length5]);
                this.c = ekfArr2;
            } else if (a2 == 34) {
                int a6 = eqc.a(eps, 34);
                ekl[] eklArr = this.d;
                int length6 = eklArr == null ? 0 : eklArr.length;
                ekl[] eklArr2 = new ekl[(a6 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.d, 0, eklArr2, 0, length6);
                }
                while (length6 < eklArr2.length - 1) {
                    eklArr2[length6] = new ekl();
                    eps.a((epz) eklArr2[length6]);
                    eps.a();
                    length6++;
                }
                eklArr2[length6] = new ekl();
                eps.a((epz) eklArr2[length6]);
                this.d = eklArr2;
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
