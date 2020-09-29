package defpackage;

import android.content.Context;

/* renamed from: ghv reason: default package */
public final class ghv implements vua<ghi> {
    private final wlc<Context> a;

    private ghv(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ghv a(wlc<Context> wlc) {
        return new ghv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ghi) vuf.a(new ghj(ghj.a((Context) this.a.get(), "http-cache"), 5242880), "Cannot return null from a non-@Nullable @Provides method");
    }
}
