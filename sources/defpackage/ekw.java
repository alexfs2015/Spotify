package defpackage;

/* renamed from: ekw reason: default package */
public final class ekw extends eql<ekw> {
    private static volatile ekw[] c;
    public Integer a;
    public Long b;

    public ekw() {
        this.a = null;
        this.b = null;
        this.L = null;
        this.M = -1;
    }

    public static ekw[] a() {
        if (c == null) {
            synchronized (eqp.b) {
                if (c == null) {
                    c = new ekw[0];
                }
            }
        }
        return c;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eqj.d());
            } else if (a2 == 16) {
                this.b = Long.valueOf(eqj.e());
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
        Long l = this.b;
        if (l != null) {
            eqk.b(2, l.longValue());
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
        Long l = this.b;
        return l != null ? b2 + eqk.c(2, l.longValue()) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekw)) {
            return false;
        }
        ekw ekw = (ekw) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekw.a != null) {
                return false;
            }
        } else if (!num.equals(ekw.a)) {
            return false;
        }
        Long l = this.b;
        if (l == null) {
            if (ekw.b != null) {
                return false;
            }
        } else if (!l.equals(ekw.b)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekw.L == null || ekw.L.a() : this.L.equals(ekw.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.b;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode3 + i;
    }
}
