package defpackage;

import android.content.Context;

/* renamed from: hpc reason: default package */
public final class hpc implements vua<hpb> {
    private final wlc<hpg> a;
    private final wlc<Context> b;

    private hpc(wlc<hpg> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hpc a(wlc<hpg> wlc, wlc<Context> wlc2) {
        return new hpc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hpb((hpg) this.a.get(), (Context) this.b.get());
    }
}
