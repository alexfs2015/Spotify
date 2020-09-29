package defpackage;

import io.netty.util.IllegalReferenceCountException;

/* renamed from: wfz reason: default package */
public final class wfz extends wgv implements wfx {
    private final vyv a;
    private final boolean b;

    public wfz(vyv vyv, boolean z) {
        this.a = (vyv) wjk.a(vyv, "content");
        this.b = z;
    }

    public final boolean b() {
        return this.b;
    }

    public final vyv a() {
        int z = z();
        if (z > 0) {
            return this.a;
        }
        throw new IllegalReferenceCountException(z);
    }

    public final void d() {
        if (this.b) {
            wgh.a(this.a);
        }
        this.a.B();
    }

    public final /* bridge */ /* synthetic */ whi e() {
        return (wfz) super.e();
    }

    public final /* synthetic */ whi b(Object obj) {
        this.a.b(obj);
        return this;
    }

    public final /* synthetic */ wfx c() {
        return (wfz) super.e();
    }
}
