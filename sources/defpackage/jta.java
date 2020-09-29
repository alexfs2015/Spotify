package defpackage;

import android.content.Context;

/* renamed from: jta reason: default package */
public final class jta implements vua<jsz> {
    private final wlc<Context> a;

    private jta(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static jta a(wlc<Context> wlc) {
        return new jta(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jsz((Context) this.a.get());
    }
}
