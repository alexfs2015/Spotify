package defpackage;

import io.netty.util.IllegalReferenceCountException;

/* renamed from: wuf reason: default package */
public final class wuf extends wvb implements wud {
    private final wnb a;
    private final boolean b;

    public wuf(wnb wnb, boolean z) {
        this.a = (wnb) wxq.a(wnb, "content");
        this.b = z;
    }

    public final wnb a() {
        int z = z();
        if (z > 0) {
            return this.a;
        }
        throw new IllegalReferenceCountException(z);
    }

    public final /* synthetic */ wvo b(Object obj) {
        this.a.b(obj);
        return this;
    }

    public final boolean b() {
        return this.b;
    }

    public final /* synthetic */ wud c() {
        return (wuf) super.e();
    }

    public final void d() {
        if (this.b) {
            wun.a(this.a);
        }
        this.a.B();
    }

    public final /* bridge */ /* synthetic */ wvo e() {
        return (wuf) super.e();
    }
}
