package defpackage;

import android.content.Context;

/* renamed from: tpc reason: default package */
public final class tpc implements vua<tpb> {
    private final wlc<Context> a;

    private tpc(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tpc a(wlc<Context> wlc) {
        return new tpc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tpb((Context) this.a.get());
    }
}
