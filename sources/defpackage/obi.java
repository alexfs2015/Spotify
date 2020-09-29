package defpackage;

import android.content.Context;

/* renamed from: obi reason: default package */
public final class obi implements vua<gkl> {
    private final wlc<Context> a;

    private obi(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static obi a(wlc<Context> wlc) {
        return new obi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gkl) vuf.a(new gkn((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
