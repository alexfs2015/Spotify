package defpackage;

import android.content.Context;

/* renamed from: nhn reason: default package */
public final class nhn implements wig<gwr> {
    private final wzi<sso> a;
    private final wzi<gwm> b;
    private final wzi<Context> c;
    private final wzi<nhe> d;

    private nhn(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<nhe> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nhn a(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<nhe> wzi4) {
        return new nhn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(CC.a((sso) this.a.get(), (gwm) this.b.get(), (Context) this.c.get(), (nhe) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
