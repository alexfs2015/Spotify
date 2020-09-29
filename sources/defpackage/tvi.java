package defpackage;

import android.content.Context;

/* renamed from: tvi reason: default package */
public final class tvi implements vua<tvh> {
    private final wlc<Context> a;

    private tvi(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tvi a(wlc<Context> wlc) {
        return new tvi(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tvh((Context) this.a.get());
    }
}
