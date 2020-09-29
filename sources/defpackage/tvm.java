package defpackage;

import android.content.Context;

/* renamed from: tvm reason: default package */
public final class tvm implements vua<tvl> {
    private final wlc<Context> a;

    private tvm(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tvm a(wlc<Context> wlc) {
        return new tvm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tvl((Context) this.a.get());
    }
}
