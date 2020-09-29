package defpackage;

/* renamed from: ejx reason: default package */
public final class ejx extends epu<ejx> {
    private static volatile ejx[] e;
    public eka a;
    public ejy b;
    public Boolean c;
    public String d;

    public static ejx[] a() {
        if (e == null) {
            synchronized (epy.b) {
                if (e == null) {
                    e = new ejx[0];
                }
            }
        }
        return e;
    }

    public ejx() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ejx)) {
            return false;
        }
        ejx ejx = (ejx) obj;
        eka eka = this.a;
        if (eka == null) {
            if (ejx.a != null) {
                return false;
            }
        } else if (!eka.equals(ejx.a)) {
            return false;
        }
        ejy ejy = this.b;
        if (ejy == null) {
            if (ejx.b != null) {
                return false;
            }
        } else if (!ejy.equals(ejx.b)) {
            return false;
        }
        Boolean bool = this.c;
        if (bool == null) {
            if (ejx.c != null) {
                return false;
            }
        } else if (!bool.equals(ejx.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (ejx.d != null) {
                return false;
            }
        } else if (!str.equals(ejx.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ejx.L == null || ejx.L.a();
        }
        return this.L.equals(ejx.L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = getClass().getName().hashCode() + 527;
        eka eka = this.a;
        int i3 = hashCode * 31;
        int i4 = 0;
        if (eka == null) {
            i = 0;
        } else {
            i = eka.hashCode();
        }
        int i5 = i3 + i;
        ejy ejy = this.b;
        int i6 = i5 * 31;
        if (ejy == null) {
            i2 = 0;
        } else {
            i2 = ejy.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        Boolean bool = this.c;
        int hashCode2 = (i7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i4 = this.L.hashCode();
        }
        return hashCode3 + i4;
    }

    public final void a(ept ept) {
        eka eka = this.a;
        if (eka != null) {
            ept.a(1, (epz) eka);
        }
        ejy ejy = this.b;
        if (ejy != null) {
            ept.a(2, (epz) ejy);
        }
        Boolean bool = this.c;
        if (bool != null) {
            ept.a(3, bool.booleanValue());
        }
        String str = this.d;
        if (str != null) {
            ept.a(4, str);
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        eka eka = this.a;
        if (eka != null) {
            b2 += ept.b(1, (epz) eka);
        }
        ejy ejy = this.b;
        if (ejy != null) {
            b2 += ept.b(2, (epz) ejy);
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(24) + 1;
        }
        String str = this.d;
        return str != null ? b2 + ept.b(4, str) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new eka();
                }
                eps.a((epz) this.a);
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new ejy();
                }
                eps.a((epz) this.b);
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eps.b());
            } else if (a2 == 34) {
                this.d = eps.c();
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
