package defpackage;

/* renamed from: ejz reason: default package */
public final class ejz extends epu<ejz> {
    private static volatile ejz[] f;
    public Integer a;
    public String b;
    public ejx c;
    public Boolean d;
    public Boolean e;

    public static ejz[] a() {
        if (f == null) {
            synchronized (epy.b) {
                if (f == null) {
                    f = new ejz[0];
                }
            }
        }
        return f;
    }

    public ejz() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ejz)) {
            return false;
        }
        ejz ejz = (ejz) obj;
        Integer num = this.a;
        if (num == null) {
            if (ejz.a != null) {
                return false;
            }
        } else if (!num.equals(ejz.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ejz.b != null) {
                return false;
            }
        } else if (!str.equals(ejz.b)) {
            return false;
        }
        ejx ejx = this.c;
        if (ejx == null) {
            if (ejz.c != null) {
                return false;
            }
        } else if (!ejx.equals(ejz.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (ejz.d != null) {
                return false;
            }
        } else if (!bool.equals(ejz.d)) {
            return false;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            if (ejz.e != null) {
                return false;
            }
        } else if (!bool2.equals(ejz.e)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ejz.L == null || ejz.L.a();
        }
        return this.L.equals(ejz.L);
    }

    public final int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i2 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        ejx ejx = this.c;
        int i3 = hashCode3 * 31;
        if (ejx == null) {
            i = 0;
        } else {
            i = ejx.hashCode();
        }
        int i4 = (i3 + i) * 31;
        Boolean bool = this.d;
        int hashCode4 = (i4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i2 = this.L.hashCode();
        }
        return hashCode5 + i2;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        ejx ejx = this.c;
        if (ejx != null) {
            ept.a(3, (epz) ejx);
        }
        Boolean bool = this.d;
        if (bool != null) {
            ept.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            ept.a(5, bool2.booleanValue());
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
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        ejx ejx = this.c;
        if (ejx != null) {
            b2 += ept.b(3, (epz) ejx);
        }
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(32) + 1;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            return b2;
        }
        bool2.booleanValue();
        return b2 + ept.c(40) + 1;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eps.d());
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new ejx();
                }
                eps.a((epz) this.c);
            } else if (a2 == 32) {
                this.d = Boolean.valueOf(eps.b());
            } else if (a2 == 40) {
                this.e = Boolean.valueOf(eps.b());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
