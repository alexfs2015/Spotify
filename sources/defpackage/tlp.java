package defpackage;

import android.content.Context;

/* renamed from: tlp reason: default package */
public final class tlp implements vua<tlo> {
    private final wlc<Context> a;

    private tlp(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tlp a(wlc<Context> wlc) {
        return new tlp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tlo((Context) this.a.get());
    }
}
