package defpackage;

import android.content.Context;

/* renamed from: sji reason: default package */
public final class sji implements vua<sjh> {
    private final wlc<Context> a;

    private sji(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static sji a(wlc<Context> wlc) {
        return new sji(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sjh((Context) this.a.get());
    }
}
