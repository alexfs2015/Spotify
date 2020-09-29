package defpackage;

import android.content.Context;

/* renamed from: omz reason: default package */
public final class omz implements vua<omy> {
    private final wlc<Context> a;

    private omz(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static omz a(wlc<Context> wlc) {
        return new omz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new omy((Context) this.a.get());
    }
}
