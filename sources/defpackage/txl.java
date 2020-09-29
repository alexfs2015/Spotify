package defpackage;

import android.content.Context;

/* renamed from: txl reason: default package */
public final class txl implements vua<apz> {
    private final wlc<twy> a;
    private final wlc<Context> b;

    private txl(wlc<twy> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static txl a(wlc<twy> wlc, wlc<Context> wlc2) {
        return new txl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return ((twy) this.a.get()).create(new apy((Context) this.b.get()), new bba());
    }
}
