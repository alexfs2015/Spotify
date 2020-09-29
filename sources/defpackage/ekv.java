package defpackage;

/* renamed from: ekv reason: default package */
public final class ekv extends eql<ekv> {
    private static volatile ekv[] e;
    public Integer a;
    public elb b;
    public elb c;
    public Boolean d;

    public ekv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public static ekv[] a() {
        if (e == null) {
            synchronized (eqp.b) {
                if (e == null) {
                    e = new ekv[0];
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
            if (a2 == 8) {
                this.a = Integer.valueOf(eqj.d());
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new elb();
                }
                eqj.a((eqq) this.b);
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new elb();
                }
                eqj.a((eqq) this.c);
            } else if (a2 == 32) {
                this.d = Boolean.valueOf(eqj.b());
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
        elb elb = this.b;
        if (elb != null) {
            eqk.a(2, (eqq) elb);
        }
        elb elb2 = this.c;
        if (elb2 != null) {
            eqk.a(3, (eqq) elb2);
        }
        Boolean bool = this.d;
        if (bool != null) {
            eqk.a(4, bool.booleanValue());
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
        elb elb = this.b;
        if (elb != null) {
            b2 += eqk.b(2, (eqq) elb);
        }
        elb elb2 = this.c;
        if (elb2 != null) {
            b2 += eqk.b(3, (eqq) elb2);
        }
        Boolean bool = this.d;
        if (bool == null) {
            return b2;
        }
        bool.booleanValue();
        return b2 + eqk.c(32) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekv)) {
            return false;
        }
        ekv ekv = (ekv) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekv.a != null) {
                return false;
            }
        } else if (!num.equals(ekv.a)) {
            return false;
        }
        elb elb = this.b;
        if (elb == null) {
            if (ekv.b != null) {
                return false;
            }
        } else if (!elb.equals(ekv.b)) {
            return false;
        }
        elb elb2 = this.c;
        if (elb2 == null) {
            if (ekv.c != null) {
                return false;
            }
        } else if (!elb2.equals(ekv.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (ekv.d != null) {
                return false;
            }
        } else if (!bool.equals(ekv.d)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekv.L == null || ekv.L.a() : this.L.equals(ekv.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = hashCode + (num == null ? 0 : num.hashCode());
        elb elb = this.b;
        int hashCode3 = (hashCode2 * 31) + (elb == null ? 0 : elb.hashCode());
        elb elb2 = this.c;
        int hashCode4 = ((hashCode3 * 31) + (elb2 == null ? 0 : elb2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }
}
