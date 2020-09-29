package defpackage;

/* renamed from: eki reason: default package */
public final class eki extends epu<eki> {
    public ekj[] a;

    public eki() {
        this.a = ekj.a();
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eki)) {
            return false;
        }
        eki eki = (eki) obj;
        if (!epy.a((Object[]) this.a, (Object[]) eki.a)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return eki.L == null || eki.L.a();
        }
        return this.L.equals(eki.L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + epy.a((Object[]) this.a)) * 31) + ((this.L == null || this.L.a()) ? 0 : this.L.hashCode());
    }

    public final void a(ept ept) {
        ekj[] ekjArr = this.a;
        if (ekjArr != null && ekjArr.length > 0) {
            int i = 0;
            while (true) {
                ekj[] ekjArr2 = this.a;
                if (i >= ekjArr2.length) {
                    break;
                }
                ekj ekj = ekjArr2[i];
                if (ekj != null) {
                    ept.a(1, (epz) ekj);
                }
                i++;
            }
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b = super.b();
        ekj[] ekjArr = this.a;
        if (ekjArr != null && ekjArr.length > 0) {
            int i = 0;
            while (true) {
                ekj[] ekjArr2 = this.a;
                if (i >= ekjArr2.length) {
                    break;
                }
                ekj ekj = ekjArr2[i];
                if (ekj != null) {
                    b += ept.b(1, (epz) ekj);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                int a3 = eqc.a(eps, 10);
                ekj[] ekjArr = this.a;
                int length = ekjArr == null ? 0 : ekjArr.length;
                ekj[] ekjArr2 = new ekj[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, ekjArr2, 0, length);
                }
                while (length < ekjArr2.length - 1) {
                    ekjArr2[length] = new ekj();
                    eps.a((epz) ekjArr2[length]);
                    eps.a();
                    length++;
                }
                ekjArr2[length] = new ekj();
                eps.a((epz) ekjArr2[length]);
                this.a = ekjArr2;
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
