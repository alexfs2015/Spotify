package defpackage;

import android.content.Context;

/* renamed from: grm reason: default package */
public final class grm implements vua<nd> {
    private final wlc<Context> a;

    private grm(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static grm a(wlc<Context> wlc) {
        return new grm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nd) vuf.a(nd.a((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
