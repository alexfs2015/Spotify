package defpackage;

import android.content.Context;

/* renamed from: krr reason: default package */
public final class krr implements vua<krq> {
    private final wlc<kru> a;
    private final wlc<Context> b;

    private krr(wlc<kru> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static krr a(wlc<kru> wlc, wlc<Context> wlc2) {
        return new krr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new krq((kru) this.a.get(), (Context) this.b.get());
    }
}
