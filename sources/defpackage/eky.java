package defpackage;

/* renamed from: eky reason: default package */
public final class eky extends eql<eky> {
    private static volatile eky[] e;
    public String a;
    public String b;
    public Long c;
    public Double d;
    private Float f;

    public eky() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public static eky[] a() {
        if (e == null) {
            synchronized (eqp.b) {
                if (e == null) {
                    e = new eky[0];
                }
            }
        }
        return e;
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
            } else if (a2 == 24) {
                this.c = Long.valueOf(eqj.e());
            } else if (a2 == 37) {
                this.f = Float.valueOf(Float.intBitsToFloat(eqj.f()));
            } else if (a2 == 41) {
                this.d = Double.valueOf(Double.longBitsToDouble(eqj.g()));
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
        Long l = this.c;
        if (l != null) {
            eqk.b(3, l.longValue());
        }
        Float f2 = this.f;
        if (f2 != null) {
            eqk.a(4, f2.floatValue());
        }
        Double d2 = this.d;
        if (d2 != null) {
            eqk.a(5, d2.doubleValue());
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
        if (str2 != null) {
            b2 += eqk.b(2, str2);
        }
        Long l = this.c;
        if (l != null) {
            b2 += eqk.c(3, l.longValue());
        }
        Float f2 = this.f;
        if (f2 != null) {
            f2.floatValue();
            b2 += eqk.c(32) + 4;
        }
        Double d2 = this.d;
        if (d2 == null) {
            return b2;
        }
        d2.doubleValue();
        return b2 + eqk.c(40) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eky)) {
            return false;
        }
        eky eky = (eky) obj;
        String str = this.a;
        if (str == null) {
            if (eky.a != null) {
                return false;
            }
        } else if (!str.equals(eky.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (eky.b != null) {
                return false;
            }
        } else if (!str2.equals(eky.b)) {
            return false;
        }
        Long l = this.c;
        if (l == null) {
            if (eky.c != null) {
                return false;
            }
        } else if (!l.equals(eky.c)) {
            return false;
        }
        Float f2 = this.f;
        if (f2 == null) {
            if (eky.f != null) {
                return false;
            }
        } else if (!f2.equals(eky.f)) {
            return false;
        }
        Double d2 = this.d;
        if (d2 == null) {
            if (eky.d != null) {
                return false;
            }
        } else if (!d2.equals(eky.d)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? eky.L == null || eky.L.a() : this.L.equals(eky.L);
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
}
