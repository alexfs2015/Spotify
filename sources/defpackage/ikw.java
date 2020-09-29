package defpackage;

import android.content.Context;

/* renamed from: ikw reason: default package */
public final class ikw implements vua<ikv> {
    private final wlc<Context> a;

    private ikw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ikw a(wlc<Context> wlc) {
        return new ikw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ikv((Context) this.a.get());
    }
}
