package defpackage;

import android.content.Context;

/* renamed from: okb reason: default package */
public final class okb implements vua<oka> {
    private final wlc<Context> a;

    private okb(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static okb a(wlc<Context> wlc) {
        return new okb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oka(this.a);
    }
}
