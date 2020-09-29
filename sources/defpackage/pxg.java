package defpackage;

import android.content.Context;

/* renamed from: pxg reason: default package */
public final class pxg implements vua<gur> {
    private final wlc<Context> a;
    private final wlc<sfl> b;
    private final wlc<gum> c;

    private pxg(wlc<Context> wlc, wlc<sfl> wlc2, wlc<gum> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pxg a(wlc<Context> wlc, wlc<sfl> wlc2, wlc<gum> wlc3) {
        return new pxg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(a.a().a((gum) this.c.get(), (Context) this.a.get(), (sfl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
