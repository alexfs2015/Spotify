package defpackage;

import io.reactivex.Completable;

/* renamed from: qwr reason: default package */
public final class qwr implements wig<Completable> {
    private final wzi<hgy> a;
    private final wzi<qwt> b;
    private final wzi<qwg> c;
    private final wzi<qwc> d;

    private qwr(wzi<hgy> wzi, wzi<qwt> wzi2, wzi<qwg> wzi3, wzi<qwc> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qwr a(wzi<hgy> wzi, wzi<qwt> wzi2, wzi<qwg> wzi3, wzi<qwc> wzi4) {
        return new qwr(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (Completable) wil.a(CC.a((hgy) this.a.get(), (qwt) this.b.get(), (qwg) this.c.get(), (qwc) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
