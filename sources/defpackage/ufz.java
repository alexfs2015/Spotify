package defpackage;

import android.content.Context;

/* renamed from: ufz reason: default package */
public final class ufz implements vua<ufy> {
    private final wlc<Context> a;

    private ufz(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ufz a(wlc<Context> wlc) {
        return new ufz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ufy((Context) this.a.get());
    }
}
