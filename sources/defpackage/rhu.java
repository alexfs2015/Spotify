package defpackage;

import android.content.Context;

/* renamed from: rhu reason: default package */
public final class rhu implements wig<rht> {
    private final wzi<Context> a;
    private final wzi<jyg> b;

    private rhu(wzi<Context> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rhu a(wzi<Context> wzi, wzi<jyg> wzi2) {
        return new rhu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rht((Context) this.a.get(), (jyg) this.b.get());
    }
}
