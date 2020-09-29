package defpackage;

import io.reactivex.Flowable;

/* renamed from: qgh reason: default package */
public final class qgh implements wig<Flowable<sqj>> {
    private final wzi<snz<sqj>> a;
    private final wzi<spr> b;

    private qgh(wzi<snz<sqj>> wzi, wzi<spr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qgh a(wzi<snz<sqj>> wzi, wzi<spr> wzi2) {
        return new qgh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((snz) this.a.get()).a((spr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
