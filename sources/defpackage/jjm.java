package defpackage;

import android.content.Context;

/* renamed from: jjm reason: default package */
public final class jjm implements vua<jjl> {
    private final wlc<Context> a;

    private jjm(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static jjm a(wlc<Context> wlc) {
        return new jjm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jjl((Context) this.a.get());
    }
}
