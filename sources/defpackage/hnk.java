package defpackage;

import android.content.Context;

/* renamed from: hnk reason: default package */
public final class hnk implements vua<hnj> {
    private final wlc<Context> a;
    private final wlc<String> b;

    private hnk(wlc<Context> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hnk a(wlc<Context> wlc, wlc<String> wlc2) {
        return new hnk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hnj((Context) this.a.get(), (String) this.b.get());
    }
}
