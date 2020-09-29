package defpackage;

import android.content.Context;

/* renamed from: qge reason: default package */
public final class qge implements wig<gwr> {
    private final wzi<Context> a;
    private final wzi<sps> b;
    private final wzi<gwm> c;

    private qge(wzi<Context> wzi, wzi<sps> wzi2, wzi<gwm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qge a(wzi<Context> wzi, wzi<sps> wzi2, wzi<gwm> wzi3) {
        return new qge(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(a.a().a((gwm) this.c.get(), (Context) this.a.get(), (sps) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
