package defpackage;

/* renamed from: eku reason: default package */
public final class eku extends eql<eku> {
    private static volatile eku[] c;
    public String a;
    public String b;

    public eku() {
        this.a = null;
        this.b = null;
        this.L = null;
        this.M = -1;
    }

    public static eku[] a() {
        if (c == null) {
            synchronized (eqp.b) {
                if (c == null) {
                    c = new eku[0];
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
            if (a2 == 10) {
                this.a = eqj.c();
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        String str = this.a;
        if (str != null) {
            eqk.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            eqk.a(2, str2);
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        String str = this.a;
        if (str != null) {
            b2 += eqk.b(1, str);
        }
        String str2 = this.b;
        return str2 != null ? b2 + eqk.b(2, str2) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eku)) {
            return false;
        }
        eku eku = (eku) obj;
        String str = this.a;
        if (str == null) {
            if (eku.a != null) {
                return false;
            }
        } else if (!str.equals(eku.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (eku.b != null) {
                return false;
            }
        } else if (!str2.equals(eku.b)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? eku.L == null || eku.L.a() : this.L.equals(eku.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode3 + i;
    }
}
