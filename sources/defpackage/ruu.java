package defpackage;

import android.content.Context;

/* renamed from: ruu reason: default package */
public final class ruu implements vua<rut> {
    private final wlc<Context> a;

    private ruu(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ruu a(wlc<Context> wlc) {
        return new ruu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rut((Context) this.a.get());
    }
}
