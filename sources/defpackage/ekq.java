package defpackage;

/* renamed from: ekq reason: default package */
public final class ekq extends eql<ekq> {
    private static volatile ekq[] f;
    public Integer a;
    public String b;
    public eko c;
    public Boolean d;
    public Boolean e;

    public ekq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    public static ekq[] a() {
        if (f == null) {
            synchronized (eqp.b) {
                if (f == null) {
                    f = new ekq[0];
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
                this.a = Integer.valueOf(eqj.d());
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new eko();
                }
                eqj.a((eqq) this.c);
            } else if (a2 == 32) {
                this.d = Boolean.valueOf(eqj.b());
            } else if (a2 == 40) {
                this.e = Boolean.valueOf(eqj.b());
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        Integer num = this.a;
        if (num != null) {
            eqk.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            eqk.a(2, str);
        }
        eko eko = this.c;
        if (eko != null) {
            eqk.a(3, (eqq) eko);
        }
        Boolean bool = this.d;
        if (bool != null) {
            eqk.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            eqk.a(5, bool2.booleanValue());
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += eqk.b(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += eqk.b(2, str);
        }
        eko eko = this.c;
        if (eko != null) {
            b2 += eqk.b(3, (eqq) eko);
        }
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(32) + 1;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            return b2;
        }
        bool2.booleanValue();
        return b2 + eqk.c(40) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekq)) {
            return false;
        }
        ekq ekq = (ekq) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekq.a != null) {
                return false;
            }
        } else if (!num.equals(ekq.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekq.b != null) {
                return false;
            }
        } else if (!str.equals(ekq.b)) {
            return false;
        }
        eko eko = this.c;
        if (eko == null) {
            if (ekq.c != null) {
                return false;
            }
        } else if (!eko.equals(ekq.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (ekq.d != null) {
                return false;
            }
        } else if (!bool.equals(ekq.d)) {
            return false;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            if (ekq.e != null) {
                return false;
            }
        } else if (!bool2.equals(ekq.e)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekq.L == null || ekq.L.a() : this.L.equals(ekq.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        eko eko = this.c;
        int hashCode4 = ((hashCode3 * 31) + (eko == null ? 0 : eko.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode6 + i;
    }
}
