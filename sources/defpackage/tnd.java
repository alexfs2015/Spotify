package defpackage;

import android.content.Context;

/* renamed from: tnd reason: default package */
public final class tnd implements vua<tnc> {
    private final wlc<Context> a;

    private tnd(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tnd a(wlc<Context> wlc) {
        return new tnd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tnc((Context) this.a.get());
    }
}
