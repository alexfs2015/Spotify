package defpackage;

import android.content.Context;

/* renamed from: ulc reason: default package */
public final class ulc implements vua<ulb> {
    private final wlc<Context> a;

    private ulc(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ulc a(wlc<Context> wlc) {
        return new ulc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ulb((Context) this.a.get());
    }
}
