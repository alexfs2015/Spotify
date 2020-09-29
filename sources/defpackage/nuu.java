package defpackage;

import android.content.Context;

/* renamed from: nuu reason: default package */
public final class nuu implements vua<nut> {
    private final wlc<Context> a;

    private nuu(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nuu a(wlc<Context> wlc) {
        return new nuu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nut((Context) this.a.get());
    }
}
