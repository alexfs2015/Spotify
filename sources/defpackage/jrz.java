package defpackage;

import android.content.Context;

/* renamed from: jrz reason: default package */
public final class jrz implements vua<jry> {
    private final wlc<Context> a;

    private jrz(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static jrz a(wlc<Context> wlc) {
        return new jrz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jry((Context) this.a.get());
    }
}
