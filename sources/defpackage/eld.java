package defpackage;

/* renamed from: eld reason: default package */
public final class eld extends eql<eld> {
    private static volatile eld[] f;
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Double e;
    private Float g;

    public eld() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    public static eld[] a() {
        if (f == null) {
            synchronized (eqp.b) {
                if (f == null) {
                    f = new eld[0];
                }
            }
        }
        return f;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(eqj.e());
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (a2 == 26) {
                this.c = eqj.c();
            } else if (a2 == 32) {
                this.d = Long.valueOf(eqj.e());
            } else if (a2 == 45) {
                this.g = Float.valueOf(Float.intBitsToFloat(eqj.f()));
            } else if (a2 == 49) {
                this.e = Double.valueOf(Double.longBitsToDouble(eqj.g()));
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        Long l = this.a;
        if (l != null) {
            eqk.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            eqk.a(2, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            eqk.a(3, str2);
        }
        Long l2 = this.d;
        if (l2 != null) {
            eqk.b(4, l2.longValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            eqk.a(5, f2.floatValue());
        }
        Double d2 = this.e;
        if (d2 != null) {
            eqk.a(6, d2.doubleValue());
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Long l = this.a;
        if (l != null) {
            b2 += eqk.c(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += eqk.b(2, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            b2 += eqk.b(3, str2);
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += eqk.c(4, l2.longValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            f2.floatValue();
            b2 += eqk.c(40) + 4;
        }
        Double d2 = this.e;
        if (d2 == null) {
            return b2;
        }
        d2.doubleValue();
        return b2 + eqk.c(48) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eld)) {
            return false;
        }
        eld eld = (eld) obj;
        Long l = this.a;
        if (l == null) {
            if (eld.a != null) {
                return false;
            }
        } else if (!l.equals(eld.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (eld.b != null) {
                return false;
            }
        } else if (!str.equals(eld.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (eld.c != null) {
                return false;
            }
        } else if (!str2.equals(eld.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (eld.d != null) {
                return false;
            }
        } else if (!l2.equals(eld.d)) {
            return false;
        }
        Float f2 = this.g;
        if (f2 == null) {
            if (eld.g != null) {
                return false;
            }
        } else if (!f2.equals(eld.g)) {
            return false;
        }
        Double d2 = this.e;
        if (d2 == null) {
            if (eld.e != null) {
                return false;
            }
        } else if (!d2.equals(eld.e)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? eld.L == null || eld.L.a() : this.L.equals(eld.L);
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
}
