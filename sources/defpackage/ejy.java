package defpackage;

/* renamed from: ejy reason: default package */
public final class ejy extends epu<ejy> {
    public Integer a;
    public Boolean b;
    public String c;
    public String d;
    public String e;

    public ejy() {
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
        if (!(obj instanceof ejy)) {
            return false;
        }
        ejy ejy = (ejy) obj;
        Integer num = this.a;
        if (num == null) {
            if (ejy.a != null) {
                return false;
            }
        } else if (!num.equals(ejy.a)) {
            return false;
        }
        Boolean bool = this.b;
        if (bool == null) {
            if (ejy.b != null) {
                return false;
            }
        } else if (!bool.equals(ejy.b)) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (ejy.c != null) {
                return false;
            }
        } else if (!str.equals(ejy.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (ejy.d != null) {
                return false;
            }
        } else if (!str2.equals(ejy.d)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (ejy.e != null) {
                return false;
            }
        } else if (!str3.equals(ejy.e)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ejy.L == null || ejy.L.a();
        }
        return this.L.equals(ejy.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool = this.b;
        int hashCode2 = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        Boolean bool = this.b;
        if (bool != null) {
            ept.a(2, bool.booleanValue());
        }
        String str = this.c;
        if (str != null) {
            ept.a(3, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            ept.a(4, str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            ept.a(5, str3);
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
        Boolean bool = this.b;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(16) + 1;
        }
        String str = this.c;
        if (str != null) {
            b2 += ept.b(3, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            b2 += ept.b(4, str2);
        }
        String str3 = this.e;
        return str3 != null ? b2 + ept.b(5, str3) : b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ejy a(eps eps) {
        int d2;
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    d2 = eps.d();
                    if (d2 < 0 || d2 > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d2);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.a = Integer.valueOf(d2);
                    }
                } catch (IllegalArgumentException unused) {
                    eps.e(eps.i());
                    a(eps, a2);
                }
            } else if (a2 == 16) {
                this.b = Boolean.valueOf(eps.b());
            } else if (a2 == 26) {
                this.c = eps.c();
            } else if (a2 == 34) {
                this.d = eps.c();
            } else if (a2 == 42) {
                this.e = eps.c();
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d2);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
