package defpackage;

/* renamed from: eko reason: default package */
public final class eko extends eql<eko> {
    private static volatile eko[] e;
    public ekr a;
    public ekp b;
    public Boolean c;
    public String d;

    public eko() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public static eko[] a() {
        if (e == null) {
            synchronized (eqp.b) {
                if (e == null) {
                    e = new eko[0];
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
                if (this.a == null) {
                    this.a = new ekr();
                }
                eqj.a((eqq) this.a);
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new ekp();
                }
                eqj.a((eqq) this.b);
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eqj.b());
            } else if (a2 == 34) {
                this.d = eqj.c();
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        ekr ekr = this.a;
        if (ekr != null) {
            eqk.a(1, (eqq) ekr);
        }
        ekp ekp = this.b;
        if (ekp != null) {
            eqk.a(2, (eqq) ekp);
        }
        Boolean bool = this.c;
        if (bool != null) {
            eqk.a(3, bool.booleanValue());
        }
        String str = this.d;
        if (str != null) {
            eqk.a(4, str);
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        ekr ekr = this.a;
        if (ekr != null) {
            b2 += eqk.b(1, (eqq) ekr);
        }
        ekp ekp = this.b;
        if (ekp != null) {
            b2 += eqk.b(2, (eqq) ekp);
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(24) + 1;
        }
        String str = this.d;
        return str != null ? b2 + eqk.b(4, str) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eko)) {
            return false;
        }
        eko eko = (eko) obj;
        ekr ekr = this.a;
        if (ekr == null) {
            if (eko.a != null) {
                return false;
            }
        } else if (!ekr.equals(eko.a)) {
            return false;
        }
        ekp ekp = this.b;
        if (ekp == null) {
            if (eko.b != null) {
                return false;
            }
        } else if (!ekp.equals(eko.b)) {
            return false;
        }
        Boolean bool = this.c;
        if (bool == null) {
            if (eko.c != null) {
                return false;
            }
        } else if (!bool.equals(eko.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (eko.d != null) {
                return false;
            }
        } else if (!str.equals(eko.d)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? eko.L == null || eko.L.a() : this.L.equals(eko.L);
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        ekr ekr = this.a;
        int i = 0;
        int hashCode2 = (hashCode * 31) + (ekr == null ? 0 : ekr.hashCode());
        ekp ekp = this.b;
        int hashCode3 = ((hashCode2 * 31) + (ekp == null ? 0 : ekp.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }
}
