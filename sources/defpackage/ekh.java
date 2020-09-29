package defpackage;

/* renamed from: ekh reason: default package */
public final class ekh extends epu<ekh> {
    private static volatile ekh[] e;
    public String a;
    public String b;
    public Long c;
    public Double d;
    private Float f;

    public static ekh[] a() {
        if (e == null) {
            synchronized (epy.b) {
                if (e == null) {
                    e = new ekh[0];
                }
            }
        }
        return e;
    }

    public ekh() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekh)) {
            return false;
        }
        ekh ekh = (ekh) obj;
        String str = this.a;
        if (str == null) {
            if (ekh.a != null) {
                return false;
            }
        } else if (!str.equals(ekh.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (ekh.b != null) {
                return false;
            }
        } else if (!str2.equals(ekh.b)) {
            return false;
        }
        Long l = this.c;
        if (l == null) {
            if (ekh.c != null) {
                return false;
            }
        } else if (!l.equals(ekh.c)) {
            return false;
        }
        Float f2 = this.f;
        if (f2 == null) {
            if (ekh.f != null) {
                return false;
            }
        } else if (!f2.equals(ekh.f)) {
            return false;
        }
        Double d2 = this.d;
        if (d2 == null) {
            if (ekh.d != null) {
                return false;
            }
        } else if (!d2.equals(ekh.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekh.L == null || ekh.L.a();
        }
        return this.L.equals(ekh.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f2 = this.f;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Double d2 = this.d;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode6 + i;
    }

    public final void a(ept ept) {
        String str = this.a;
        if (str != null) {
            ept.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            ept.a(2, str2);
        }
        Long l = this.c;
        if (l != null) {
            ept.b(3, l.longValue());
        }
        Float f2 = this.f;
        if (f2 != null) {
            ept.a(4, f2.floatValue());
        }
        Double d2 = this.d;
        if (d2 != null) {
            ept.a(5, d2.doubleValue());
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
        String str2 = this.b;
        if (str2 != null) {
            b2 += ept.b(2, str2);
        }
        Long l = this.c;
        if (l != null) {
            b2 += ept.c(3, l.longValue());
        }
        Float f2 = this.f;
        if (f2 != null) {
            f2.floatValue();
            b2 += ept.c(32) + 4;
        }
        Double d2 = this.d;
        if (d2 == null) {
            return b2;
        }
        d2.doubleValue();
        return b2 + ept.c(40) + 8;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = eps.c();
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 24) {
                this.c = Long.valueOf(eps.e());
            } else if (a2 == 37) {
                this.f = Float.valueOf(Float.intBitsToFloat(eps.f()));
            } else if (a2 == 41) {
                this.d = Double.valueOf(Double.longBitsToDouble(eps.g()));
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
