package defpackage;

/* renamed from: ekf reason: default package */
public final class ekf extends epu<ekf> {
    private static volatile ekf[] c;
    public Integer a;
    public Long b;

    public static ekf[] a() {
        if (c == null) {
            synchronized (epy.b) {
                if (c == null) {
                    c = new ekf[0];
                }
            }
        }
        return c;
    }

    public ekf() {
        this.a = null;
        this.b = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekf)) {
            return false;
        }
        ekf ekf = (ekf) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekf.a != null) {
                return false;
            }
        } else if (!num.equals(ekf.a)) {
            return false;
        }
        Long l = this.b;
        if (l == null) {
            if (ekf.b != null) {
                return false;
            }
        } else if (!l.equals(ekf.b)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekf.L == null || ekf.L.a();
        }
        return this.L.equals(ekf.L);
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

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        Long l = this.b;
        if (l != null) {
            ept.b(2, l.longValue());
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
        Long l = this.b;
        return l != null ? b2 + ept.c(2, l.longValue()) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(eps.d());
            } else if (a2 == 16) {
                this.b = Long.valueOf(eps.e());
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
