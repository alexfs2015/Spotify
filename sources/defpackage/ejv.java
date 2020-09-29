package defpackage;

/* renamed from: ejv reason: default package */
public final class ejv extends epu<ejv> {
    private static volatile ejv[] d;
    public Integer a;
    public ejz[] b;
    public ejw[] c;
    private Boolean e;
    private Boolean f;

    public static ejv[] a() {
        if (d == null) {
            synchronized (epy.b) {
                if (d == null) {
                    d = new ejv[0];
                }
            }
        }
        return d;
    }

    public ejv() {
        this.a = null;
        this.b = ejz.a();
        this.c = ejw.a();
        this.e = null;
        this.f = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ejv)) {
            return false;
        }
        ejv ejv = (ejv) obj;
        Integer num = this.a;
        if (num == null) {
            if (ejv.a != null) {
                return false;
            }
        } else if (!num.equals(ejv.a)) {
            return false;
        }
        if (!epy.a((Object[]) this.b, (Object[]) ejv.b) || !epy.a((Object[]) this.c, (Object[]) ejv.c)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            if (ejv.e != null) {
                return false;
            }
        } else if (!bool.equals(ejv.e)) {
            return false;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            if (ejv.f != null) {
                return false;
            }
        } else if (!bool2.equals(ejv.f)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ejv.L == null || ejv.L.a();
        }
        return this.L.equals(ejv.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + epy.a((Object[]) this.b)) * 31) + epy.a((Object[]) this.c)) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode4 + i;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        ejz[] ejzArr = this.b;
        int i = 0;
        if (ejzArr != null && ejzArr.length > 0) {
            int i2 = 0;
            while (true) {
                ejz[] ejzArr2 = this.b;
                if (i2 >= ejzArr2.length) {
                    break;
                }
                ejz ejz = ejzArr2[i2];
                if (ejz != null) {
                    ept.a(2, (epz) ejz);
                }
                i2++;
            }
        }
        ejw[] ejwArr = this.c;
        if (ejwArr != null && ejwArr.length > 0) {
            while (true) {
                ejw[] ejwArr2 = this.c;
                if (i >= ejwArr2.length) {
                    break;
                }
                ejw ejw = ejwArr2[i];
                if (ejw != null) {
                    ept.a(3, (epz) ejw);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            ept.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            ept.a(5, bool2.booleanValue());
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
        ejz[] ejzArr = this.b;
        int i = 0;
        if (ejzArr != null && ejzArr.length > 0) {
            int i2 = b2;
            int i3 = 0;
            while (true) {
                ejz[] ejzArr2 = this.b;
                if (i3 >= ejzArr2.length) {
                    break;
                }
                ejz ejz = ejzArr2[i3];
                if (ejz != null) {
                    i2 += ept.b(2, (epz) ejz);
                }
                i3++;
            }
            b2 = i2;
        }
        ejw[] ejwArr = this.c;
        if (ejwArr != null && ejwArr.length > 0) {
            while (true) {
                ejw[] ejwArr2 = this.c;
                if (i >= ejwArr2.length) {
                    break;
                }
                ejw ejw = ejwArr2[i];
                if (ejw != null) {
                    b2 += ept.b(3, (epz) ejw);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(32) + 1;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            return b2;
        }
        bool2.booleanValue();
        return b2 + ept.c(40) + 1;
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
                int a3 = eqc.a(eps, 18);
                ejz[] ejzArr = this.b;
                int length = ejzArr == null ? 0 : ejzArr.length;
                ejz[] ejzArr2 = new ejz[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, ejzArr2, 0, length);
                }
                while (length < ejzArr2.length - 1) {
                    ejzArr2[length] = new ejz();
                    eps.a((epz) ejzArr2[length]);
                    eps.a();
                    length++;
                }
                ejzArr2[length] = new ejz();
                eps.a((epz) ejzArr2[length]);
                this.b = ejzArr2;
            } else if (a2 == 26) {
                int a4 = eqc.a(eps, 26);
                ejw[] ejwArr = this.c;
                int length2 = ejwArr == null ? 0 : ejwArr.length;
                ejw[] ejwArr2 = new ejw[(a4 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.c, 0, ejwArr2, 0, length2);
                }
                while (length2 < ejwArr2.length - 1) {
                    ejwArr2[length2] = new ejw();
                    eps.a((epz) ejwArr2[length2]);
                    eps.a();
                    length2++;
                }
                ejwArr2[length2] = new ejw();
                eps.a((epz) ejwArr2[length2]);
                this.c = ejwArr2;
            } else if (a2 == 32) {
                this.e = Boolean.valueOf(eps.b());
            } else if (a2 == 40) {
                this.f = Boolean.valueOf(eps.b());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
