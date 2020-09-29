package defpackage;

import android.content.Context;

/* renamed from: uew reason: default package */
public final class uew implements wig<uev> {
    private final wzi<izh> a;
    private final wzi<Context> b;
    private final wzi<uhz> c;

    private uew(wzi<izh> wzi, wzi<Context> wzi2, wzi<uhz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uew a(wzi<izh> wzi, wzi<Context> wzi2, wzi<uhz> wzi3) {
        return new uew(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uev((izh) this.a.get(), (Context) this.b.get(), (uhz) this.c.get());
    }
}
