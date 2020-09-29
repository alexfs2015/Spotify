package defpackage;

import android.content.Context;

/* renamed from: kxw reason: default package */
public final class kxw implements vua<kxv> {
    private final wlc<Context> a;

    private kxw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static kxw a(wlc<Context> wlc) {
        return new kxw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kxv((Context) this.a.get());
    }
}
