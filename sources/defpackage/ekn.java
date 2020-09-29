package defpackage;

/* renamed from: ekn reason: default package */
public final class ekn extends eql<ekn> {
    private static volatile ekn[] g;
    public Integer a;
    public String b;
    public eko[] c;
    public ekp d;
    public Boolean e;
    public Boolean f;
    private Boolean h;

    public ekn() {
        this.a = null;
        this.b = null;
        this.c = eko.a();
        this.h = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.L = null;
        this.M = -1;
    }

    public static ekn[] a() {
        if (g == null) {
            synchronized (eqp.b) {
                if (g == null) {
                    g = new ekn[0];
                }
            }
        }
        return g;
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
                int a3 = eqt.a(eqj, 26);
                eko[] ekoArr = this.c;
                int length = ekoArr == null ? 0 : ekoArr.length;
                eko[] ekoArr2 = new eko[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, ekoArr2, 0, length);
                }
                while (length < ekoArr2.length - 1) {
                    ekoArr2[length] = new eko();
                    eqj.a((eqq) ekoArr2[length]);
                    eqj.a();
                    length++;
                }
                ekoArr2[length] = new eko();
                eqj.a((eqq) ekoArr2[length]);
                this.c = ekoArr2;
            } else if (a2 == 32) {
                this.h = Boolean.valueOf(eqj.b());
            } else if (a2 == 42) {
                if (this.d == null) {
                    this.d = new ekp();
                }
                eqj.a((eqq) this.d);
            } else if (a2 == 48) {
                this.e = Boolean.valueOf(eqj.b());
            } else if (a2 == 56) {
                this.f = Boolean.valueOf(eqj.b());
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
        eko[] ekoArr = this.c;
        if (ekoArr != null && ekoArr.length > 0) {
            int i = 0;
            while (true) {
                eko[] ekoArr2 = this.c;
                if (i >= ekoArr2.length) {
                    break;
                }
                eko eko = ekoArr2[i];
                if (eko != null) {
                    eqk.a(3, (eqq) eko);
                }
                i++;
            }
        }
        Boolean bool = this.h;
        if (bool != null) {
            eqk.a(4, bool.booleanValue());
        }
        ekp ekp = this.d;
        if (ekp != null) {
            eqk.a(5, (eqq) ekp);
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            eqk.a(6, bool2.booleanValue());
        }
        Boolean bool3 = this.f;
        if (bool3 != null) {
            eqk.a(7, bool3.booleanValue());
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
        eko[] ekoArr = this.c;
        if (ekoArr != null && ekoArr.length > 0) {
            int i = 0;
            while (true) {
                eko[] ekoArr2 = this.c;
                if (i >= ekoArr2.length) {
                    break;
                }
                eko eko = ekoArr2[i];
                if (eko != null) {
                    b2 += eqk.b(3, (eqq) eko);
                }
                i++;
            }
        }
        Boolean bool = this.h;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(32) + 1;
        }
        ekp ekp = this.d;
        if (ekp != null) {
            b2 += eqk.b(5, (eqq) ekp);
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += eqk.c(48) + 1;
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            return b2;
        }
        bool3.booleanValue();
        return b2 + eqk.c(56) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekn)) {
            return false;
        }
        ekn ekn = (ekn) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekn.a != null) {
                return false;
            }
        } else if (!num.equals(ekn.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekn.b != null) {
                return false;
            }
        } else if (!str.equals(ekn.b)) {
            return false;
        }
        if (!eqp.a((Object[]) this.c, (Object[]) ekn.c)) {
            return false;
        }
        Boolean bool = this.h;
        if (bool == null) {
            if (ekn.h != null) {
                return false;
            }
        } else if (!bool.equals(ekn.h)) {
            return false;
        }
        ekp ekp = this.d;
        if (ekp == null) {
            if (ekn.d != null) {
                return false;
            }
        } else if (!ekp.equals(ekn.d)) {
            return false;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            if (ekn.e != null) {
                return false;
            }
        } else if (!bool2.equals(ekn.e)) {
            return false;
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            if (ekn.f != null) {
                return false;
            }
        } else if (!bool3.equals(ekn.f)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekn.L == null || ekn.L.a() : this.L.equals(ekn.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + eqp.a((Object[]) this.c)) * 31;
        Boolean bool = this.h;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        ekp ekp = this.d;
        int hashCode5 = ((hashCode4 * 31) + (ekp == null ? 0 : ekp.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode7 + i;
    }
}
