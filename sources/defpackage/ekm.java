package defpackage;

/* renamed from: ekm reason: default package */
public final class ekm extends eql<ekm> {
    private static volatile ekm[] d;
    public Integer a;
    public ekq[] b;
    public ekn[] c;
    private Boolean e;
    private Boolean f;

    public ekm() {
        this.a = null;
        this.b = ekq.a();
        this.c = ekn.a();
        this.e = null;
        this.f = null;
        this.L = null;
        this.M = -1;
    }

    public static ekm[] a() {
        if (d == null) {
            synchronized (eqp.b) {
                if (d == null) {
                    d = new ekm[0];
                }
            }
        }
        return d;
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
                int a3 = eqt.a(eqj, 18);
                ekq[] ekqArr = this.b;
                int length = ekqArr == null ? 0 : ekqArr.length;
                ekq[] ekqArr2 = new ekq[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, ekqArr2, 0, length);
                }
                while (length < ekqArr2.length - 1) {
                    ekqArr2[length] = new ekq();
                    eqj.a((eqq) ekqArr2[length]);
                    eqj.a();
                    length++;
                }
                ekqArr2[length] = new ekq();
                eqj.a((eqq) ekqArr2[length]);
                this.b = ekqArr2;
            } else if (a2 == 26) {
                int a4 = eqt.a(eqj, 26);
                ekn[] eknArr = this.c;
                int length2 = eknArr == null ? 0 : eknArr.length;
                ekn[] eknArr2 = new ekn[(a4 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.c, 0, eknArr2, 0, length2);
                }
                while (length2 < eknArr2.length - 1) {
                    eknArr2[length2] = new ekn();
                    eqj.a((eqq) eknArr2[length2]);
                    eqj.a();
                    length2++;
                }
                eknArr2[length2] = new ekn();
                eqj.a((eqq) eknArr2[length2]);
                this.c = eknArr2;
            } else if (a2 == 32) {
                this.e = Boolean.valueOf(eqj.b());
            } else if (a2 == 40) {
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
        ekq[] ekqArr = this.b;
        int i = 0;
        if (ekqArr != null && ekqArr.length > 0) {
            int i2 = 0;
            while (true) {
                ekq[] ekqArr2 = this.b;
                if (i2 >= ekqArr2.length) {
                    break;
                }
                ekq ekq = ekqArr2[i2];
                if (ekq != null) {
                    eqk.a(2, (eqq) ekq);
                }
                i2++;
            }
        }
        ekn[] eknArr = this.c;
        if (eknArr != null && eknArr.length > 0) {
            while (true) {
                ekn[] eknArr2 = this.c;
                if (i >= eknArr2.length) {
                    break;
                }
                ekn ekn = eknArr2[i];
                if (ekn != null) {
                    eqk.a(3, (eqq) ekn);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            eqk.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            eqk.a(5, bool2.booleanValue());
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
        ekq[] ekqArr = this.b;
        int i = 0;
        if (ekqArr != null && ekqArr.length > 0) {
            int i2 = b2;
            int i3 = 0;
            while (true) {
                ekq[] ekqArr2 = this.b;
                if (i3 >= ekqArr2.length) {
                    break;
                }
                ekq ekq = ekqArr2[i3];
                if (ekq != null) {
                    i2 += eqk.b(2, (eqq) ekq);
                }
                i3++;
            }
            b2 = i2;
        }
        ekn[] eknArr = this.c;
        if (eknArr != null && eknArr.length > 0) {
            while (true) {
                ekn[] eknArr2 = this.c;
                if (i >= eknArr2.length) {
                    break;
                }
                ekn ekn = eknArr2[i];
                if (ekn != null) {
                    b2 += eqk.b(3, (eqq) ekn);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(32) + 1;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            return b2;
        }
        bool2.booleanValue();
        return b2 + eqk.c(40) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekm)) {
            return false;
        }
        ekm ekm = (ekm) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekm.a != null) {
                return false;
            }
        } else if (!num.equals(ekm.a)) {
            return false;
        }
        if (!eqp.a((Object[]) this.b, (Object[]) ekm.b) || !eqp.a((Object[]) this.c, (Object[]) ekm.c)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            if (ekm.e != null) {
                return false;
            }
        } else if (!bool.equals(ekm.e)) {
            return false;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            if (ekm.f != null) {
                return false;
            }
        } else if (!bool2.equals(ekm.f)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekm.L == null || ekm.L.a() : this.L.equals(ekm.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + eqp.a((Object[]) this.b)) * 31) + eqp.a((Object[]) this.c)) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode4 + i;
    }
}
