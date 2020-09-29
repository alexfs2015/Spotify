package defpackage;

import android.content.Context;

/* renamed from: nvx reason: default package */
public final class nvx implements vua<nvw> {
    private final wlc<wud<String>> a;
    private final wlc<Context> b;
    private final wlc<jvy> c;

    private nvx(wlc<wud<String>> wlc, wlc<Context> wlc2, wlc<jvy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nvx a(wlc<wud<String>> wlc, wlc<Context> wlc2, wlc<jvy> wlc3) {
        return new nvx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nvw((wud) this.a.get(), (Context) this.b.get(), (jvy) this.c.get());
    }
}
