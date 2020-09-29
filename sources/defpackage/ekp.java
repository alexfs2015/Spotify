package defpackage;

/* renamed from: ekp reason: default package */
public final class ekp extends eql<ekp> {
    public Integer a;
    public Boolean b;
    public String c;
    public String d;
    public String e;

    public ekp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ekp a(eqj eqj) {
        int d2;
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    d2 = eqj.d();
                    if (d2 < 0 || d2 > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d2);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.a = Integer.valueOf(d2);
                    }
                } catch (IllegalArgumentException unused) {
                    eqj.e(eqj.i());
                    a(eqj, a2);
                }
            } else if (a2 == 16) {
                this.b = Boolean.valueOf(eqj.b());
            } else if (a2 == 26) {
                this.c = eqj.c();
            } else if (a2 == 34) {
                this.d = eqj.c();
            } else if (a2 == 42) {
                this.e = eqj.c();
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d2);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void a(eqk eqk) {
        Integer num = this.a;
        if (num != null) {
            eqk.a(1, num.intValue());
        }
        Boolean bool = this.b;
        if (bool != null) {
            eqk.a(2, bool.booleanValue());
        }
        String str = this.c;
        if (str != null) {
            eqk.a(3, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            eqk.a(4, str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            eqk.a(5, str3);
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
        Boolean bool = this.b;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(16) + 1;
        }
        String str = this.c;
        if (str != null) {
            b2 += eqk.b(3, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            b2 += eqk.b(4, str2);
        }
        String str3 = this.e;
        return str3 != null ? b2 + eqk.b(5, str3) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekp)) {
            return false;
        }
        ekp ekp = (ekp) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekp.a != null) {
                return false;
            }
        } else if (!num.equals(ekp.a)) {
            return false;
        }
        Boolean bool = this.b;
        if (bool == null) {
            if (ekp.b != null) {
                return false;
            }
        } else if (!bool.equals(ekp.b)) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (ekp.c != null) {
                return false;
            }
        } else if (!str.equals(ekp.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (ekp.d != null) {
                return false;
            }
        } else if (!str2.equals(ekp.d)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (ekp.e != null) {
                return false;
            }
        } else if (!str3.equals(ekp.e)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekp.L == null || ekp.L.a() : this.L.equals(ekp.L);
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
}
