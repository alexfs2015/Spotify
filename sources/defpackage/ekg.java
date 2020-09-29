package defpackage;

/* renamed from: ekg reason: default package */
public final class ekg extends epu<ekg> {
    private static volatile ekg[] f;
    public ekh[] a;
    public String b;
    public Long c;
    public Long d;
    public Integer e;

    public static ekg[] a() {
        if (f == null) {
            synchronized (epy.b) {
                if (f == null) {
                    f = new ekg[0];
                }
            }
        }
        return f;
    }

    public ekg() {
        this.a = ekh.a();
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
        if (!(obj instanceof ekg)) {
            return false;
        }
        ekg ekg = (ekg) obj;
        if (!epy.a((Object[]) this.a, (Object[]) ekg.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekg.b != null) {
                return false;
            }
        } else if (!str.equals(ekg.b)) {
            return false;
        }
        Long l = this.c;
        if (l == null) {
            if (ekg.c != null) {
                return false;
            }
        } else if (!l.equals(ekg.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (ekg.d != null) {
                return false;
            }
        } else if (!l2.equals(ekg.d)) {
            return false;
        }
        Integer num = this.e;
        if (num == null) {
            if (ekg.e != null) {
                return false;
            }
        } else if (!num.equals(ekg.e)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekg.L == null || ekg.L.a();
        }
        return this.L.equals(ekg.L);
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + epy.a((Object[]) this.a)) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }

    public final void a(ept ept) {
        ekh[] ekhArr = this.a;
        if (ekhArr != null && ekhArr.length > 0) {
            int i = 0;
            while (true) {
                ekh[] ekhArr2 = this.a;
                if (i >= ekhArr2.length) {
                    break;
                }
                ekh ekh = ekhArr2[i];
                if (ekh != null) {
                    ept.a(1, (epz) ekh);
                }
                i++;
            }
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        Long l = this.c;
        if (l != null) {
            ept.b(3, l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            ept.b(4, l2.longValue());
        }
        Integer num = this.e;
        if (num != null) {
            ept.a(5, num.intValue());
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        ekh[] ekhArr = this.a;
        if (ekhArr != null && ekhArr.length > 0) {
            int i = 0;
            while (true) {
                ekh[] ekhArr2 = this.a;
                if (i >= ekhArr2.length) {
                    break;
                }
                ekh ekh = ekhArr2[i];
                if (ekh != null) {
                    b2 += ept.b(1, (epz) ekh);
                }
                i++;
            }
        }
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        Long l = this.c;
        if (l != null) {
            b2 += ept.c(3, l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += ept.c(4, l2.longValue());
        }
        Integer num = this.e;
        return num != null ? b2 + ept.b(5, num.intValue()) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                int a3 = eqc.a(eps, 10);
                ekh[] ekhArr = this.a;
                int length = ekhArr == null ? 0 : ekhArr.length;
                ekh[] ekhArr2 = new ekh[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, ekhArr2, 0, length);
                }
                while (length < ekhArr2.length - 1) {
                    ekhArr2[length] = new ekh();
                    eps.a((epz) ekhArr2[length]);
                    eps.a();
                    length++;
                }
                ekhArr2[length] = new ekh();
                eps.a((epz) ekhArr2[length]);
                this.a = ekhArr2;
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 24) {
                this.c = Long.valueOf(eps.e());
            } else if (a2 == 32) {
                this.d = Long.valueOf(eps.e());
            } else if (a2 == 40) {
                this.e = Integer.valueOf(eps.d());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
