package defpackage;

import android.content.Context;

/* renamed from: lzl reason: default package */
public final class lzl implements vua<lzk> {
    private final wlc<Context> a;

    private lzl(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lzl a(wlc<Context> wlc) {
        return new lzl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lzk((Context) this.a.get());
    }
}
