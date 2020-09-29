package defpackage;

import android.content.Context;

/* renamed from: rat reason: default package */
public final class rat implements vua<ras> {
    private final wlc<Context> a;

    private rat(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static rat a(wlc<Context> wlc) {
        return new rat(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ras((Context) this.a.get());
    }
}
