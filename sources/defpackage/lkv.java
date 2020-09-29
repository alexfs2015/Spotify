package defpackage;

import android.content.Context;

/* renamed from: lkv reason: default package */
public final class lkv implements vua<lku> {
    private final wlc<Context> a;

    private lkv(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lkv a(wlc<Context> wlc) {
        return new lkv(wlc);
    }

    public static lku a(Context context) {
        return new lku(context);
    }

    public final /* synthetic */ Object get() {
        return new lku((Context) this.a.get());
    }
}
