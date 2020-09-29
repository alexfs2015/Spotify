package defpackage;

/* renamed from: ekb reason: default package */
public final class ekb extends epu<ekb> {
    private static volatile ekb[] e;
    public String a;
    public Boolean b;
    public Boolean c;
    public Integer d;

    public static ekb[] a() {
        if (e == null) {
            synchronized (epy.b) {
                if (e == null) {
                    e = new ekb[0];
                }
            }
        }
        return e;
    }

    public ekb() {
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
        if (!(obj instanceof ekb)) {
            return false;
        }
        ekb ekb = (ekb) obj;
        String str = this.a;
        if (str == null) {
            if (ekb.a != null) {
                return false;
            }
        } else if (!str.equals(ekb.a)) {
            return false;
        }
        Boolean bool = this.b;
        if (bool == null) {
            if (ekb.b != null) {
                return false;
            }
        } else if (!bool.equals(ekb.b)) {
            return false;
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            if (ekb.c != null) {
                return false;
            }
        } else if (!bool2.equals(ekb.c)) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (ekb.d != null) {
                return false;
            }
        } else if (!num.equals(ekb.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekb.L == null || ekb.L.a();
        }
        return this.L.equals(ekb.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }

    public final void a(ept ept) {
        String str = this.a;
        if (str != null) {
            ept.a(1, str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            ept.a(2, bool.booleanValue());
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            ept.a(3, bool2.booleanValue());
        }
        Integer num = this.d;
        if (num != null) {
            ept.a(4, num.intValue());
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        String str = this.a;
        if (str != null) {
            b2 += ept.b(1, str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(16) + 1;
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += ept.c(24) + 1;
        }
        Integer num = this.d;
        return num != null ? b2 + ept.b(4, num.intValue()) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = eps.c();
            } else if (a2 == 16) {
                this.b = Boolean.valueOf(eps.b());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eps.b());
            } else if (a2 == 32) {
                this.d = Integer.valueOf(eps.d());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
