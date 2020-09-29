package defpackage;

import android.content.Context;

/* renamed from: mtu reason: default package */
public final class mtu implements vua<ufy> {
    private final wlc<Context> a;

    private mtu(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mtu a(wlc<Context> wlc) {
        return new mtu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ufy) vuf.a(new ufy((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
