package defpackage;

import android.content.Context;

/* renamed from: lwe reason: default package */
public final class lwe implements vua<lwd> {
    private final wlc<Context> a;

    private lwe(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lwe a(wlc<Context> wlc) {
        return new lwe(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lwd((Context) this.a.get());
    }
}
