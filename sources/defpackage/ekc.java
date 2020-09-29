package defpackage;

/* renamed from: ekc reason: default package */
public final class ekc extends epu<ekc> {
    public Long a;
    public String b;
    public ekd[] c;
    public ekb[] d;
    public ejv[] e;
    private Integer f;
    private String g;

    public ekc() {
        this.a = null;
        this.b = null;
        this.f = null;
        this.c = ekd.a();
        this.d = ekb.a();
        this.e = ejv.a();
        this.g = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekc)) {
            return false;
        }
        ekc ekc = (ekc) obj;
        Long l = this.a;
        if (l == null) {
            if (ekc.a != null) {
                return false;
            }
        } else if (!l.equals(ekc.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekc.b != null) {
                return false;
            }
        } else if (!str.equals(ekc.b)) {
            return false;
        }
        Integer num = this.f;
        if (num == null) {
            if (ekc.f != null) {
                return false;
            }
        } else if (!num.equals(ekc.f)) {
            return false;
        }
        if (!epy.a((Object[]) this.c, (Object[]) ekc.c) || !epy.a((Object[]) this.d, (Object[]) ekc.d) || !epy.a((Object[]) this.e, (Object[]) ekc.e)) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (ekc.g != null) {
                return false;
            }
        } else if (!str2.equals(ekc.g)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekc.L == null || ekc.L.a();
        }
        return this.L.equals(ekc.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + epy.a((Object[]) this.c)) * 31) + epy.a((Object[]) this.d)) * 31) + epy.a((Object[]) this.e)) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }

    public final void a(ept ept) {
        Long l = this.a;
        if (l != null) {
            ept.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        Integer num = this.f;
        if (num != null) {
            ept.a(3, num.intValue());
        }
        ekd[] ekdArr = this.c;
        int i = 0;
        if (ekdArr != null && ekdArr.length > 0) {
            int i2 = 0;
            while (true) {
                ekd[] ekdArr2 = this.c;
                if (i2 >= ekdArr2.length) {
                    break;
                }
                ekd ekd = ekdArr2[i2];
                if (ekd != null) {
                    ept.a(4, (epz) ekd);
                }
                i2++;
            }
        }
        ekb[] ekbArr = this.d;
        if (ekbArr != null && ekbArr.length > 0) {
            int i3 = 0;
            while (true) {
                ekb[] ekbArr2 = this.d;
                if (i3 >= ekbArr2.length) {
                    break;
                }
                ekb ekb = ekbArr2[i3];
                if (ekb != null) {
                    ept.a(5, (epz) ekb);
                }
                i3++;
            }
        }
        ejv[] ejvArr = this.e;
        if (ejvArr != null && ejvArr.length > 0) {
            while (true) {
                ejv[] ejvArr2 = this.e;
                if (i >= ejvArr2.length) {
                    break;
                }
                ejv ejv = ejvArr2[i];
                if (ejv != null) {
                    ept.a(6, (epz) ejv);
                }
                i++;
            }
        }
        String str2 = this.g;
        if (str2 != null) {
            ept.a(7, str2);
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Long l = this.a;
        if (l != null) {
            b2 += ept.c(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        Integer num = this.f;
        if (num != null) {
            b2 += ept.b(3, num.intValue());
        }
        ekd[] ekdArr = this.c;
        int i = 0;
        if (ekdArr != null && ekdArr.length > 0) {
            int i2 = b2;
            int i3 = 0;
            while (true) {
                ekd[] ekdArr2 = this.c;
                if (i3 >= ekdArr2.length) {
                    break;
                }
                ekd ekd = ekdArr2[i3];
                if (ekd != null) {
                    i2 += ept.b(4, (epz) ekd);
                }
                i3++;
            }
            b2 = i2;
        }
        ekb[] ekbArr = this.d;
        if (ekbArr != null && ekbArr.length > 0) {
            int i4 = b2;
            int i5 = 0;
            while (true) {
                ekb[] ekbArr2 = this.d;
                if (i5 >= ekbArr2.length) {
                    break;
                }
                ekb ekb = ekbArr2[i5];
                if (ekb != null) {
                    i4 += ept.b(5, (epz) ekb);
                }
                i5++;
            }
            b2 = i4;
        }
        ejv[] ejvArr = this.e;
        if (ejvArr != null && ejvArr.length > 0) {
            while (true) {
                ejv[] ejvArr2 = this.e;
                if (i >= ejvArr2.length) {
                    break;
                }
                ejv ejv = ejvArr2[i];
                if (ejv != null) {
                    b2 += ept.b(6, (epz) ejv);
                }
                i++;
            }
        }
        String str2 = this.g;
        return str2 != null ? b2 + ept.b(7, str2) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(eps.e());
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 24) {
                this.f = Integer.valueOf(eps.d());
            } else if (a2 == 34) {
                int a3 = eqc.a(eps, 34);
                ekd[] ekdArr = this.c;
                int length = ekdArr == null ? 0 : ekdArr.length;
                ekd[] ekdArr2 = new ekd[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, ekdArr2, 0, length);
                }
                while (length < ekdArr2.length - 1) {
                    ekdArr2[length] = new ekd();
                    eps.a((epz) ekdArr2[length]);
                    eps.a();
                    length++;
                }
                ekdArr2[length] = new ekd();
                eps.a((epz) ekdArr2[length]);
                this.c = ekdArr2;
            } else if (a2 == 42) {
                int a4 = eqc.a(eps, 42);
                ekb[] ekbArr = this.d;
                int length2 = ekbArr == null ? 0 : ekbArr.length;
                ekb[] ekbArr2 = new ekb[(a4 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.d, 0, ekbArr2, 0, length2);
                }
                while (length2 < ekbArr2.length - 1) {
                    ekbArr2[length2] = new ekb();
                    eps.a((epz) ekbArr2[length2]);
                    eps.a();
                    length2++;
                }
                ekbArr2[length2] = new ekb();
                eps.a((epz) ekbArr2[length2]);
                this.d = ekbArr2;
            } else if (a2 == 50) {
                int a5 = eqc.a(eps, 50);
                ejv[] ejvArr = this.e;
                int length3 = ejvArr == null ? 0 : ejvArr.length;
                ejv[] ejvArr2 = new ejv[(a5 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.e, 0, ejvArr2, 0, length3);
                }
                while (length3 < ejvArr2.length - 1) {
                    ejvArr2[length3] = new ejv();
                    eps.a((epz) ejvArr2[length3]);
                    eps.a();
                    length3++;
                }
                ejvArr2[length3] = new ejv();
                eps.a((epz) ejvArr2[length3]);
                this.e = ejvArr2;
            } else if (a2 == 58) {
                this.g = eps.c();
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
