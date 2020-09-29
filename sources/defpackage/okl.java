package defpackage;

import android.content.Context;

/* renamed from: okl reason: default package */
public final class okl implements wig<okk> {
    private final wzi<Context> a;
    private final wzi<vvb> b;

    private okl(wzi<Context> wzi, wzi<vvb> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static okl a(wzi<Context> wzi, wzi<vvb> wzi2) {
        return new okl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new okk((Context) this.a.get(), (vvb) this.b.get());
    }
}
