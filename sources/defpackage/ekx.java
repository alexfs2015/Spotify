package defpackage;

/* renamed from: ekx reason: default package */
public final class ekx extends eql<ekx> {
    private static volatile ekx[] f;
    public eky[] a;
    public String b;
    public Long c;
    public Long d;
    public Integer e;

    public ekx() {
        this.a = eky.a();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.L = null;
        this.M = -1;
    }

    public static ekx[] a() {
        if (f == null) {
            synchronized (eqp.b) {
                if (f == null) {
                    f = new ekx[0];
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
            if (a2 == 10) {
                int a3 = eqt.a(eqj, 10);
                eky[] ekyArr = this.a;
                int length = ekyArr == null ? 0 : ekyArr.length;
                eky[] ekyArr2 = new eky[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, ekyArr2, 0, length);
                }
                while (length < ekyArr2.length - 1) {
                    ekyArr2[length] = new eky();
                    eqj.a((eqq) ekyArr2[length]);
                    eqj.a();
                    length++;
                }
                ekyArr2[length] = new eky();
                eqj.a((eqq) ekyArr2[length]);
                this.a = ekyArr2;
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (a2 == 24) {
                this.c = Long.valueOf(eqj.e());
            } else if (a2 == 32) {
                this.d = Long.valueOf(eqj.e());
            } else if (a2 == 40) {
                this.e = Integer.valueOf(eqj.d());
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        eky[] ekyArr = this.a;
        if (ekyArr != null && ekyArr.length > 0) {
            int i = 0;
            while (true) {
                eky[] ekyArr2 = this.a;
                if (i >= ekyArr2.length) {
                    break;
                }
                eky eky = ekyArr2[i];
                if (eky != null) {
                    eqk.a(1, (eqq) eky);
                }
                i++;
            }
        }
        String str = this.b;
        if (str != null) {
            eqk.a(2, str);
        }
        Long l = this.c;
        if (l != null) {
            eqk.b(3, l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            eqk.b(4, l2.longValue());
        }
        Integer num = this.e;
        if (num != null) {
            eqk.a(5, num.intValue());
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        eky[] ekyArr = this.a;
        if (ekyArr != null && ekyArr.length > 0) {
            int i = 0;
            while (true) {
                eky[] ekyArr2 = this.a;
                if (i >= ekyArr2.length) {
                    break;
                }
                eky eky = ekyArr2[i];
                if (eky != null) {
                    b2 += eqk.b(1, (eqq) eky);
                }
                i++;
            }
        }
        String str = this.b;
        if (str != null) {
            b2 += eqk.b(2, str);
        }
        Long l = this.c;
        if (l != null) {
            b2 += eqk.c(3, l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += eqk.c(4, l2.longValue());
        }
        Integer num = this.e;
        return num != null ? b2 + eqk.b(5, num.intValue()) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekx)) {
            return false;
        }
        ekx ekx = (ekx) obj;
        if (!eqp.a((Object[]) this.a, (Object[]) ekx.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekx.b != null) {
                return false;
            }
        } else if (!str.equals(ekx.b)) {
            return false;
        }
        Long l = this.c;
        if (l == null) {
            if (ekx.c != null) {
                return false;
            }
        } else if (!l.equals(ekx.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (ekx.d != null) {
                return false;
            }
        } else if (!l2.equals(ekx.d)) {
            return false;
        }
        Integer num = this.e;
        if (num == null) {
            if (ekx.e != null) {
                return false;
            }
        } else if (!num.equals(ekx.e)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekx.L == null || ekx.L.a() : this.L.equals(ekx.L);
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + eqp.a((Object[]) this.a)) * 31;
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
}
