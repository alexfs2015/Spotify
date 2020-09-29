package defpackage;

/* renamed from: ekd reason: default package */
public final class ekd extends epu<ekd> {
    private static volatile ekd[] c;
    public String a;
    public String b;

    public static ekd[] a() {
        if (c == null) {
            synchronized (epy.b) {
                if (c == null) {
                    c = new ekd[0];
                }
            }
        }
        return c;
    }

    public ekd() {
        this.a = null;
        this.b = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekd)) {
            return false;
        }
        ekd ekd = (ekd) obj;
        String str = this.a;
        if (str == null) {
            if (ekd.a != null) {
                return false;
            }
        } else if (!str.equals(ekd.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (ekd.b != null) {
                return false;
            }
        } else if (!str2.equals(ekd.b)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekd.L == null || ekd.L.a();
        }
        return this.L.equals(ekd.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode3 + i;
    }

    public final void a(ept ept) {
        String str = this.a;
        if (str != null) {
            ept.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            ept.a(2, str2);
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        String str = this.a;
        if (str != null) {
            b2 += ept.b(1, str);
        }
        String str2 = this.b;
        return str2 != null ? b2 + ept.b(2, str2) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = eps.c();
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
    }
}
