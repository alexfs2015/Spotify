package defpackage;

/* renamed from: elb reason: default package */
public final class elb extends eql<elb> {
    public long[] a;
    public long[] b;
    public ekw[] c;
    public elc[] d;

    public elb() {
        this.a = eqt.b;
        this.b = eqt.b;
        this.c = ekw.a();
        this.d = elc.a();
        this.L = null;
        this.M = -1;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int a3 = eqt.a(eqj, 8);
                long[] jArr = this.a;
                int length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = eqj.e();
                    eqj.a();
                    length++;
                }
                jArr2[length] = eqj.e();
                this.a = jArr2;
            } else if (a2 == 10) {
                int c2 = eqj.c(eqj.d());
                int i = eqj.i();
                int i2 = 0;
                while (eqj.h() > 0) {
                    eqj.e();
                    i2++;
                }
                eqj.e(i);
                long[] jArr3 = this.a;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                long[] jArr4 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.a, 0, jArr4, 0, length2);
                }
                while (length2 < jArr4.length) {
                    jArr4[length2] = eqj.e();
                    length2++;
                }
                this.a = jArr4;
                eqj.d(c2);
            } else if (a2 == 16) {
                int a4 = eqt.a(eqj, 16);
                long[] jArr5 = this.b;
                int length3 = jArr5 == null ? 0 : jArr5.length;
                long[] jArr6 = new long[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.b, 0, jArr6, 0, length3);
                }
                while (length3 < jArr6.length - 1) {
                    jArr6[length3] = eqj.e();
                    eqj.a();
                    length3++;
                }
                jArr6[length3] = eqj.e();
                this.b = jArr6;
            } else if (a2 == 18) {
                int c3 = eqj.c(eqj.d());
                int i3 = eqj.i();
                int i4 = 0;
                while (eqj.h() > 0) {
                    eqj.e();
                    i4++;
                }
                eqj.e(i3);
                long[] jArr7 = this.b;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                long[] jArr8 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.b, 0, jArr8, 0, length4);
                }
                while (length4 < jArr8.length) {
                    jArr8[length4] = eqj.e();
                    length4++;
                }
                this.b = jArr8;
                eqj.d(c3);
            } else if (a2 == 26) {
                int a5 = eqt.a(eqj, 26);
                ekw[] ekwArr = this.c;
                int length5 = ekwArr == null ? 0 : ekwArr.length;
                ekw[] ekwArr2 = new ekw[(a5 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.c, 0, ekwArr2, 0, length5);
                }
                while (length5 < ekwArr2.length - 1) {
                    ekwArr2[length5] = new ekw();
                    eqj.a((eqq) ekwArr2[length5]);
                    eqj.a();
                    length5++;
                }
                ekwArr2[length5] = new ekw();
                eqj.a((eqq) ekwArr2[length5]);
                this.c = ekwArr2;
            } else if (a2 == 34) {
                int a6 = eqt.a(eqj, 34);
                elc[] elcArr = this.d;
                int length6 = elcArr == null ? 0 : elcArr.length;
                elc[] elcArr2 = new elc[(a6 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.d, 0, elcArr2, 0, length6);
                }
                while (length6 < elcArr2.length - 1) {
                    elcArr2[length6] = new elc();
                    eqj.a((eqq) elcArr2[length6]);
                    eqj.a();
                    length6++;
                }
                elcArr2[length6] = new elc();
                eqj.a((eqq) elcArr2[length6]);
                this.d = elcArr2;
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        long[] jArr = this.a;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.a;
                if (i2 >= jArr2.length) {
                    break;
                }
                eqk.a(1, jArr2[i2]);
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
                eqk.a(2, jArr4[i3]);
                i3++;
            }
        }
        ekw[] ekwArr = this.c;
        if (ekwArr != null && ekwArr.length > 0) {
            int i4 = 0;
            while (true) {
                ekw[] ekwArr2 = this.c;
                if (i4 >= ekwArr2.length) {
                    break;
                }
                ekw ekw = ekwArr2[i4];
                if (ekw != null) {
                    eqk.a(3, (eqq) ekw);
                }
                i4++;
            }
        }
        elc[] elcArr = this.d;
        if (elcArr != null && elcArr.length > 0) {
            while (true) {
                elc[] elcArr2 = this.d;
                if (i >= elcArr2.length) {
                    break;
                }
                elc elc = elcArr2[i];
                if (elc != null) {
                    eqk.a(4, (eqq) elc);
                }
                i++;
            }
        }
        super.a(eqk);
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
                i3 += eqk.a(jArr2[i2]);
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
                i5 += eqk.a(jArr[i4]);
                i4++;
            }
            b2 = b2 + i5 + (jArr.length * 1);
        }
        ekw[] ekwArr = this.c;
        if (ekwArr != null && ekwArr.length > 0) {
            int i6 = b2;
            int i7 = 0;
            while (true) {
                ekw[] ekwArr2 = this.c;
                if (i7 >= ekwArr2.length) {
                    break;
                }
                ekw ekw = ekwArr2[i7];
                if (ekw != null) {
                    i6 += eqk.b(3, (eqq) ekw);
                }
                i7++;
            }
            b2 = i6;
        }
        elc[] elcArr = this.d;
        if (elcArr != null && elcArr.length > 0) {
            while (true) {
                elc[] elcArr2 = this.d;
                if (i >= elcArr2.length) {
                    break;
                }
                elc elc = elcArr2[i];
                if (elc != null) {
                    b2 += eqk.b(4, (eqq) elc);
                }
                i++;
            }
        }
        return b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elb)) {
            return false;
        }
        elb elb = (elb) obj;
        if (eqp.a(this.a, elb.a) && eqp.a(this.b, elb.b) && eqp.a((Object[]) this.c, (Object[]) elb.c) && eqp.a((Object[]) this.d, (Object[]) elb.d)) {
            return (this.L == null || this.L.a()) ? elb.L == null || elb.L.a() : this.L.equals(elb.L);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + eqp.a(this.a)) * 31) + eqp.a(this.b)) * 31) + eqp.a((Object[]) this.c)) * 31) + eqp.a((Object[]) this.d)) * 31) + ((this.L == null || this.L.a()) ? 0 : this.L.hashCode());
    }
}
