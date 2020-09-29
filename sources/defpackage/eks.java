package defpackage;

/* renamed from: eks reason: default package */
public final class eks extends eql<eks> {
    private static volatile eks[] e;
    public String a;
    public Boolean b;
    public Boolean c;
    public Integer d;

    public eks() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public static eks[] a() {
        if (e == null) {
            synchronized (eqp.b) {
                if (e == null) {
                    e = new eks[0];
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
            } else if (a2 == 16) {
                this.b = Boolean.valueOf(eqj.b());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eqj.b());
            } else if (a2 == 32) {
                this.d = Integer.valueOf(eqj.d());
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
        Boolean bool = this.b;
        if (bool != null) {
            eqk.a(2, bool.booleanValue());
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            eqk.a(3, bool2.booleanValue());
        }
        Integer num = this.d;
        if (num != null) {
            eqk.a(4, num.intValue());
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
        Boolean bool = this.b;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(16) + 1;
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += eqk.c(24) + 1;
        }
        Integer num = this.d;
        return num != null ? b2 + eqk.b(4, num.intValue()) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eks)) {
            return false;
        }
        eks eks = (eks) obj;
        String str = this.a;
        if (str == null) {
            if (eks.a != null) {
                return false;
            }
        } else if (!str.equals(eks.a)) {
            return false;
        }
        Boolean bool = this.b;
        if (bool == null) {
            if (eks.b != null) {
                return false;
            }
        } else if (!bool.equals(eks.b)) {
            return false;
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            if (eks.c != null) {
                return false;
            }
        } else if (!bool2.equals(eks.c)) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (eks.d != null) {
                return false;
            }
        } else if (!num.equals(eks.d)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? eks.L == null || eks.L.a() : this.L.equals(eks.L);
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
}
