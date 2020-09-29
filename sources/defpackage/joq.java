package defpackage;

import android.content.Context;

/* renamed from: joq reason: default package */
public final class joq implements wig<jop> {
    private final wzi<Context> a;
    private final wzi<sso> b;

    private joq(wzi<Context> wzi, wzi<sso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static joq a(wzi<Context> wzi, wzi<sso> wzi2) {
        return new joq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jop((Context) this.a.get(), (sso) this.b.get());
    }
}
