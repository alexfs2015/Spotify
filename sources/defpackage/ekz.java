package defpackage;

/* renamed from: ekz reason: default package */
public final class ekz extends eql<ekz> {
    public ela[] a;

    public ekz() {
        this.a = ela.a();
        this.L = null;
        this.M = -1;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                int a3 = eqt.a(eqj, 10);
                ela[] elaArr = this.a;
                int length = elaArr == null ? 0 : elaArr.length;
                ela[] elaArr2 = new ela[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, elaArr2, 0, length);
                }
                while (length < elaArr2.length - 1) {
                    elaArr2[length] = new ela();
                    eqj.a((eqq) elaArr2[length]);
                    eqj.a();
                    length++;
                }
                elaArr2[length] = new ela();
                eqj.a((eqq) elaArr2[length]);
                this.a = elaArr2;
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        ela[] elaArr = this.a;
        if (elaArr != null && elaArr.length > 0) {
            int i = 0;
            while (true) {
                ela[] elaArr2 = this.a;
                if (i >= elaArr2.length) {
                    break;
                }
                ela ela = elaArr2[i];
                if (ela != null) {
                    eqk.a(1, (eqq) ela);
                }
                i++;
            }
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b = super.b();
        ela[] elaArr = this.a;
        if (elaArr != null && elaArr.length > 0) {
            int i = 0;
            while (true) {
                ela[] elaArr2 = this.a;
                if (i >= elaArr2.length) {
                    break;
                }
                ela ela = elaArr2[i];
                if (ela != null) {
                    b += eqk.b(1, (eqq) ela);
                }
                i++;
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekz)) {
            return false;
        }
        ekz ekz = (ekz) obj;
        if (!eqp.a((Object[]) this.a, (Object[]) ekz.a)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekz.L == null || ekz.L.a() : this.L.equals(ekz.L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + eqp.a((Object[]) this.a)) * 31) + ((this.L == null || this.L.a()) ? 0 : this.L.hashCode());
    }
}
