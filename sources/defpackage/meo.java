package defpackage;

import android.content.Context;

/* renamed from: meo reason: default package */
public final class meo implements wig<men> {
    private final wzi<Context> a;
    private final wzi<mej> b;

    private meo(wzi<Context> wzi, wzi<mej> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static meo a(wzi<Context> wzi, wzi<mej> wzi2) {
        return new meo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new men((Context) this.a.get(), (mej) this.b.get());
    }
}
