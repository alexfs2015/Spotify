package defpackage;

import android.content.Context;

/* renamed from: kzi reason: default package */
public final class kzi implements vua<Boolean> {
    private final wlc<Context> a;

    private kzi(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static kzi a(wlc<Context> wlc) {
        return new kzi(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.b((Context) this.a.get()));
    }
}
