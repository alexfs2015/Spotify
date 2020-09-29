package defpackage;

/* renamed from: eke reason: default package */
public final class eke extends epu<eke> {
    private static volatile eke[] e;
    public Integer a;
    public ekk b;
    public ekk c;
    public Boolean d;

    public static eke[] a() {
        if (e == null) {
            synchronized (epy.b) {
                if (e == null) {
                    e = new eke[0];
                }
            }
        }
        return e;
    }

    public eke() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eke)) {
            return false;
        }
        eke eke = (eke) obj;
        Integer num = this.a;
        if (num == null) {
            if (eke.a != null) {
                return false;
            }
        } else if (!num.equals(eke.a)) {
            return false;
        }
        ekk ekk = this.b;
        if (ekk == null) {
            if (eke.b != null) {
                return false;
            }
        } else if (!ekk.equals(eke.b)) {
            return false;
        }
        ekk ekk2 = this.c;
        if (ekk2 == null) {
            if (eke.c != null) {
                return false;
            }
        } else if (!ekk2.equals(eke.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (eke.d != null) {
                return false;
            }
        } else if (!bool.equals(eke.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return eke.L == null || eke.L.a();
        }
        return this.L.equals(eke.L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i3 = 0;
        int hashCode2 = hashCode + (num == null ? 0 : num.hashCode());
        ekk ekk = this.b;
        int i4 = hashCode2 * 31;
        if (ekk == null) {
            i = 0;
        } else {
            i = ekk.hashCode();
        }
        int i5 = i4 + i;
        ekk ekk2 = this.c;
        int i6 = i5 * 31;
        if (ekk2 == null) {
            i2 = 0;
        } else {
            i2 = ekk2.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        Boolean bool = this.d;
        int hashCode3 = (i7 + (bool == null ? 0 : bool.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i3 = this.L.hashCode();
        }
        return hashCode3 + i3;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        ekk ekk = this.b;
        if (ekk != null) {
            ept.a(2, (epz) ekk);
        }
        ekk ekk2 = this.c;
        if (ekk2 != null) {
            ept.a(3, (epz) ekk2);
        }
        Boolean bool = this.d;
        if (bool != null) {
            ept.a(4, bool.booleanValue());
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
        ekk ekk = this.b;
        if (ekk != null) {
            b2 += ept.b(2, (epz) ekk);
        }
        ekk ekk2 = this.c;
        if (ekk2 != null) {
            b2 += ept.b(3, (epz) ekk2);
        }
        Boolean bool = this.d;
        if (bool == null) {
            return b2;
        }
        bool.booleanValue();
        return b2 + ept.c(32) + 1;
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
                if (this.b == null) {
                    this.b = new ekk();
                }
                eps.a((epz) this.b);
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new ekk();
                }
                eps.a((epz) this.c);
            } else if (a2 == 32) {
                this.d = Boolean.valueOf(eps.b());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
