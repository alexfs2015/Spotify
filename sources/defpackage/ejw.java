package defpackage;

/* renamed from: ejw reason: default package */
public final class ejw extends epu<ejw> {
    private static volatile ejw[] g;
    public Integer a;
    public String b;
    public ejx[] c;
    public ejy d;
    public Boolean e;
    public Boolean f;
    private Boolean h;

    public static ejw[] a() {
        if (g == null) {
            synchronized (epy.b) {
                if (g == null) {
                    g = new ejw[0];
                }
            }
        }
        return g;
    }

    public ejw() {
        this.a = null;
        this.b = null;
        this.c = ejx.a();
        this.h = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ejw)) {
            return false;
        }
        ejw ejw = (ejw) obj;
        Integer num = this.a;
        if (num == null) {
            if (ejw.a != null) {
                return false;
            }
        } else if (!num.equals(ejw.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ejw.b != null) {
                return false;
            }
        } else if (!str.equals(ejw.b)) {
            return false;
        }
        if (!epy.a((Object[]) this.c, (Object[]) ejw.c)) {
            return false;
        }
        Boolean bool = this.h;
        if (bool == null) {
            if (ejw.h != null) {
                return false;
            }
        } else if (!bool.equals(ejw.h)) {
            return false;
        }
        ejy ejy = this.d;
        if (ejy == null) {
            if (ejw.d != null) {
                return false;
            }
        } else if (!ejy.equals(ejw.d)) {
            return false;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            if (ejw.e != null) {
                return false;
            }
        } else if (!bool2.equals(ejw.e)) {
            return false;
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            if (ejw.f != null) {
                return false;
            }
        } else if (!bool3.equals(ejw.f)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ejw.L == null || ejw.L.a();
        }
        return this.L.equals(ejw.L);
    }

    public final int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i2 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + epy.a((Object[]) this.c)) * 31;
        Boolean bool = this.h;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        ejy ejy = this.d;
        int i3 = hashCode4 * 31;
        if (ejy == null) {
            i = 0;
        } else {
            i = ejy.hashCode();
        }
        int i4 = (i3 + i) * 31;
        Boolean bool2 = this.e;
        int hashCode5 = (i4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i2 = this.L.hashCode();
        }
        return hashCode6 + i2;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        ejx[] ejxArr = this.c;
        if (ejxArr != null && ejxArr.length > 0) {
            int i = 0;
            while (true) {
                ejx[] ejxArr2 = this.c;
                if (i >= ejxArr2.length) {
                    break;
                }
                ejx ejx = ejxArr2[i];
                if (ejx != null) {
                    ept.a(3, (epz) ejx);
                }
                i++;
            }
        }
        Boolean bool = this.h;
        if (bool != null) {
            ept.a(4, bool.booleanValue());
        }
        ejy ejy = this.d;
        if (ejy != null) {
            ept.a(5, (epz) ejy);
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            ept.a(6, bool2.booleanValue());
        }
        Boolean bool3 = this.f;
        if (bool3 != null) {
            ept.a(7, bool3.booleanValue());
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
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        ejx[] ejxArr = this.c;
        if (ejxArr != null && ejxArr.length > 0) {
            int i = 0;
            while (true) {
                ejx[] ejxArr2 = this.c;
                if (i >= ejxArr2.length) {
                    break;
                }
                ejx ejx = ejxArr2[i];
                if (ejx != null) {
                    b2 += ept.b(3, (epz) ejx);
                }
                i++;
            }
        }
        Boolean bool = this.h;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(32) + 1;
        }
        ejy ejy = this.d;
        if (ejy != null) {
            b2 += ept.b(5, (epz) ejy);
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += ept.c(48) + 1;
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            return b2;
        }
        bool3.booleanValue();
        return b2 + ept.c(56) + 1;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eps.d());
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 26) {
                int a3 = eqc.a(eps, 26);
                ejx[] ejxArr = this.c;
                int length = ejxArr == null ? 0 : ejxArr.length;
                ejx[] ejxArr2 = new ejx[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, ejxArr2, 0, length);
                }
                while (length < ejxArr2.length - 1) {
                    ejxArr2[length] = new ejx();
                    eps.a((epz) ejxArr2[length]);
                    eps.a();
                    length++;
                }
                ejxArr2[length] = new ejx();
                eps.a((epz) ejxArr2[length]);
                this.c = ejxArr2;
            } else if (a2 == 32) {
                this.h = Boolean.valueOf(eps.b());
            } else if (a2 == 42) {
                if (this.d == null) {
                    this.d = new ejy();
                }
                eps.a((epz) this.d);
            } else if (a2 == 48) {
                this.e = Boolean.valueOf(eps.b());
            } else if (a2 == 56) {
                this.f = Boolean.valueOf(eps.b());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
