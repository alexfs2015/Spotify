package defpackage;

import android.content.Context;

/* renamed from: kfn reason: default package */
public final class kfn implements wig<kfm> {
    private final wzi<Context> a;
    private final wzi<jyg> b;

    private kfn(wzi<Context> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kfn a(wzi<Context> wzi, wzi<jyg> wzi2) {
        return new kfn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kfm((Context) this.a.get(), (jyg) this.b.get());
    }
}
