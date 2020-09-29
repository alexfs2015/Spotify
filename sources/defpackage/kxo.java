package defpackage;

import android.content.Context;

/* renamed from: kxo reason: default package */
public final class kxo implements vua<kxn> {
    private final wlc<Context> a;

    private kxo(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static kxo a(wlc<Context> wlc) {
        return new kxo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kxn((Context) this.a.get());
    }
}
