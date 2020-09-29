package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: woq reason: default package */
public final class woq extends wpb {
    public wpb a;

    public woq(wpb wpb) {
        if (wpb != null) {
            this.a = wpb;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final wpb a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    public final long bj_() {
        return this.a.bj_();
    }

    public final boolean bl_() {
        return this.a.bl_();
    }

    public final long c() {
        return this.a.c();
    }

    public final wpb a(long j) {
        return this.a.a(j);
    }

    public final wpb d() {
        return this.a.d();
    }

    public final wpb bk_() {
        return this.a.bk_();
    }

    public final void f() {
        this.a.f();
    }
}
