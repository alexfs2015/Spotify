package defpackage;

import android.content.Context;

/* renamed from: olx reason: default package */
public final class olx implements vua<olv> {
    private final wlc<Context> a;

    private olx(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static olx a(wlc<Context> wlc) {
        return new olx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new olv((Context) this.a.get());
    }
}
