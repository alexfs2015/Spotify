package defpackage;

import android.content.Context;

/* renamed from: koc reason: default package */
public final class koc implements vua<kob> {
    private final wlc<Context> a;

    private koc(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static koc a(wlc<Context> wlc) {
        return new koc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kob((Context) this.a.get());
    }
}
