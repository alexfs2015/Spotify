package defpackage;

import android.content.Context;

/* renamed from: mgt reason: default package */
public final class mgt implements vua<fbd<Integer>> {
    private final wlc<Context> a;

    private mgt(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mgt a(wlc<Context> wlc) {
        return new mgt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (fbd) vuf.a(CC.a((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
