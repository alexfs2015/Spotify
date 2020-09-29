package defpackage;

import android.content.Context;

/* renamed from: gkv reason: default package */
public final class gkv implements vua<gku> {
    private final wlc<Context> a;

    private gkv(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static gkv a(wlc<Context> wlc) {
        return new gkv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gku((Context) this.a.get());
    }
}
