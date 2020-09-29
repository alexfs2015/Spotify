package defpackage;

/* renamed from: ekm reason: default package */
public final class ekm extends epu<ekm> {
    private static volatile ekm[] f;
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Double e;
    private Float g;

    public static ekm[] a() {
        if (f == null) {
            synchronized (epy.b) {
                if (f == null) {
                    f = new ekm[0];
                }
            }
        }
        return f;
    }

    public ekm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekm)) {
            return false;
        }
        ekm ekm = (ekm) obj;
        Long l = this.a;
        if (l == null) {
            if (ekm.a != null) {
                return false;
            }
        } else if (!l.equals(ekm.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekm.b != null) {
                return false;
            }
        } else if (!str.equals(ekm.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (ekm.c != null) {
                return false;
            }
        } else if (!str2.equals(ekm.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (ekm.d != null) {
                return false;
            }
        } else if (!l2.equals(ekm.d)) {
            return false;
        }
        Float f2 = this.g;
        if (f2 == null) {
            if (ekm.g != null) {
                return false;
            }
        } else if (!f2.equals(ekm.g)) {
            return false;
        }
        Double d2 = this.e;
        if (d2 == null) {
            if (ekm.e != null) {
                return false;
            }
        } else if (!d2.equals(ekm.e)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekm.L == null || ekm.L.a();
        }
        return this.L.equals(ekm.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f2 = this.g;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Double d2 = this.e;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode7 + i;
    }

    public final void a(ept ept) {
        Long l = this.a;
        if (l != null) {
            ept.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            ept.a(3, str2);
        }
        Long l2 = this.d;
        if (l2 != null) {
            ept.b(4, l2.longValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            ept.a(5, f2.floatValue());
        }
        Double d2 = this.e;
        if (d2 != null) {
            ept.a(6, d2.doubleValue());
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Long l = this.a;
        if (l != null) {
            b2 += ept.c(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            b2 += ept.b(3, str2);
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += ept.c(4, l2.longValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            f2.floatValue();
            b2 += ept.c(40) + 4;
        }
        Double d2 = this.e;
        if (d2 == null) {
            return b2;
        }
        d2.doubleValue();
        return b2 + ept.c(48) + 8;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(eps.e());
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 26) {
                this.c = eps.c();
            } else if (a2 == 32) {
                this.d = Long.valueOf(eps.e());
            } else if (a2 == 45) {
                this.g = Float.valueOf(Float.intBitsToFloat(eps.f()));
            } else if (a2 == 49) {
                this.e = Double.valueOf(Double.longBitsToDouble(eps.g()));
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
