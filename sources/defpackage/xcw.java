package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xcw reason: default package */
public final class xcw extends xdh {
    public xdh a;

    public xcw(xdh xdh) {
        if (xdh != null) {
            this.a = xdh;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final xdh a(long j) {
        return this.a.a(j);
    }

    public final xdh a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    public final long bh_() {
        return this.a.bh_();
    }

    public final xdh bi_() {
        return this.a.bi_();
    }

    public final boolean bj_() {
        return this.a.bj_();
    }

    public final long c() {
        return this.a.c();
    }

    public final xdh d() {
        return this.a.d();
    }

    public final void f() {
        this.a.f();
    }
}
