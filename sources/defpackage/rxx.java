package defpackage;

import android.content.Context;

/* renamed from: rxx reason: default package */
public final class rxx implements vua<rxw> {
    private final wlc<Context> a;

    private rxx(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static rxx a(wlc<Context> wlc) {
        return new rxx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rxw((Context) this.a.get());
    }
}
