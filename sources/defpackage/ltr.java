package defpackage;

import android.content.Context;

/* renamed from: ltr reason: default package */
public final class ltr implements vua<ltq> {
    private final wlc<Context> a;
    private final wlc<fpt> b;

    private ltr(wlc<Context> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ltr a(wlc<Context> wlc, wlc<fpt> wlc2) {
        return new ltr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ltq((Context) this.a.get(), (fpt) this.b.get());
    }
}
