package defpackage;

import android.content.Context;

/* renamed from: qxx reason: default package */
public final class qxx implements wig<uvv> {
    private final wzi<Context> a;
    private final wzi<tmo> b;

    private qxx(wzi<Context> wzi, wzi<tmo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qxx a(wzi<Context> wzi, wzi<tmo> wzi2) {
        return new qxx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (uvv) wil.a(new qxt(((Context) this.a.get()).getResources(), (tmo) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
