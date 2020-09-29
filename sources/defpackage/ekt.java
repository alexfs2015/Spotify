package defpackage;

/* renamed from: ekt reason: default package */
public final class ekt extends eql<ekt> {
    public Long a;
    public String b;
    public eku[] c;
    public eks[] d;
    public ekm[] e;
    private Integer f;
    private String g;

    public ekt() {
        this.a = null;
        this.b = null;
        this.f = null;
        this.c = eku.a();
        this.d = eks.a();
        this.e = ekm.a();
        this.g = null;
        this.L = null;
        this.M = -1;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(eqj.e());
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (a2 == 24) {
                this.f = Integer.valueOf(eqj.d());
            } else if (a2 == 34) {
                int a3 = eqt.a(eqj, 34);
                eku[] ekuArr = this.c;
                int length = ekuArr == null ? 0 : ekuArr.length;
                eku[] ekuArr2 = new eku[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, ekuArr2, 0, length);
                }
                while (length < ekuArr2.length - 1) {
                    ekuArr2[length] = new eku();
                    eqj.a((eqq) ekuArr2[length]);
                    eqj.a();
                    length++;
                }
                ekuArr2[length] = new eku();
                eqj.a((eqq) ekuArr2[length]);
                this.c = ekuArr2;
            } else if (a2 == 42) {
                int a4 = eqt.a(eqj, 42);
                eks[] eksArr = this.d;
                int length2 = eksArr == null ? 0 : eksArr.length;
                eks[] eksArr2 = new eks[(a4 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.d, 0, eksArr2, 0, length2);
                }
                while (length2 < eksArr2.length - 1) {
                    eksArr2[length2] = new eks();
                    eqj.a((eqq) eksArr2[length2]);
                    eqj.a();
                    length2++;
                }
                eksArr2[length2] = new eks();
                eqj.a((eqq) eksArr2[length2]);
                this.d = eksArr2;
            } else if (a2 == 50) {
                int a5 = eqt.a(eqj, 50);
                ekm[] ekmArr = this.e;
                int length3 = ekmArr == null ? 0 : ekmArr.length;
                ekm[] ekmArr2 = new ekm[(a5 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.e, 0, ekmArr2, 0, length3);
                }
                while (length3 < ekmArr2.length - 1) {
                    ekmArr2[length3] = new ekm();
                    eqj.a((eqq) ekmArr2[length3]);
                    eqj.a();
                    length3++;
                }
                ekmArr2[length3] = new ekm();
                eqj.a((eqq) ekmArr2[length3]);
                this.e = ekmArr2;
            } else if (a2 == 58) {
                this.g = eqj.c();
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
    }

    public final void a(eqk eqk) {
        Long l = this.a;
        if (l != null) {
            eqk.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            eqk.a(2, str);
        }
        Integer num = this.f;
        if (num != null) {
            eqk.a(3, num.intValue());
        }
        eku[] ekuArr = this.c;
        int i = 0;
        if (ekuArr != null && ekuArr.length > 0) {
            int i2 = 0;
            while (true) {
                eku[] ekuArr2 = this.c;
                if (i2 >= ekuArr2.length) {
                    break;
                }
                eku eku = ekuArr2[i2];
                if (eku != null) {
                    eqk.a(4, (eqq) eku);
                }
                i2++;
            }
        }
        eks[] eksArr = this.d;
        if (eksArr != null && eksArr.length > 0) {
            int i3 = 0;
            while (true) {
                eks[] eksArr2 = this.d;
                if (i3 >= eksArr2.length) {
                    break;
                }
                eks eks = eksArr2[i3];
                if (eks != null) {
                    eqk.a(5, (eqq) eks);
                }
                i3++;
            }
        }
        ekm[] ekmArr = this.e;
        if (ekmArr != null && ekmArr.length > 0) {
            while (true) {
                ekm[] ekmArr2 = this.e;
                if (i >= ekmArr2.length) {
                    break;
                }
                ekm ekm = ekmArr2[i];
                if (ekm != null) {
                    eqk.a(6, (eqq) ekm);
                }
                i++;
            }
        }
        String str2 = this.g;
        if (str2 != null) {
            eqk.a(7, str2);
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Long l = this.a;
        if (l != null) {
            b2 += eqk.c(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += eqk.b(2, str);
        }
        Integer num = this.f;
        if (num != null) {
            b2 += eqk.b(3, num.intValue());
        }
        eku[] ekuArr = this.c;
        int i = 0;
        if (ekuArr != null && ekuArr.length > 0) {
            int i2 = b2;
            int i3 = 0;
            while (true) {
                eku[] ekuArr2 = this.c;
                if (i3 >= ekuArr2.length) {
                    break;
                }
                eku eku = ekuArr2[i3];
                if (eku != null) {
                    i2 += eqk.b(4, (eqq) eku);
                }
                i3++;
            }
            b2 = i2;
        }
        eks[] eksArr = this.d;
        if (eksArr != null && eksArr.length > 0) {
            int i4 = b2;
            int i5 = 0;
            while (true) {
                eks[] eksArr2 = this.d;
                if (i5 >= eksArr2.length) {
                    break;
                }
                eks eks = eksArr2[i5];
                if (eks != null) {
                    i4 += eqk.b(5, (eqq) eks);
                }
                i5++;
            }
            b2 = i4;
        }
        ekm[] ekmArr = this.e;
        if (ekmArr != null && ekmArr.length > 0) {
            while (true) {
                ekm[] ekmArr2 = this.e;
                if (i >= ekmArr2.length) {
                    break;
                }
                ekm ekm = ekmArr2[i];
                if (ekm != null) {
                    b2 += eqk.b(6, (eqq) ekm);
                }
                i++;
            }
        }
        String str2 = this.g;
        return str2 != null ? b2 + eqk.b(7, str2) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekt)) {
            return false;
        }
        ekt ekt = (ekt) obj;
        Long l = this.a;
        if (l == null) {
            if (ekt.a != null) {
                return false;
            }
        } else if (!l.equals(ekt.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekt.b != null) {
                return false;
            }
        } else if (!str.equals(ekt.b)) {
            return false;
        }
        Integer num = this.f;
        if (num == null) {
            if (ekt.f != null) {
                return false;
            }
        } else if (!num.equals(ekt.f)) {
            return false;
        }
        if (!eqp.a((Object[]) this.c, (Object[]) ekt.c) || !eqp.a((Object[]) this.d, (Object[]) ekt.d) || !eqp.a((Object[]) this.e, (Object[]) ekt.e)) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (ekt.g != null) {
                return false;
            }
        } else if (!str2.equals(ekt.g)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekt.L == null || ekt.L.a() : this.L.equals(ekt.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + eqp.a((Object[]) this.c)) * 31) + eqp.a((Object[]) this.d)) * 31) + eqp.a((Object[]) this.e)) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode5 + i;
    }
}
