package defpackage;

import android.content.Context;

/* renamed from: kfi reason: default package */
public final class kfi implements wig<kfh> {
    private final wzi<Context> a;
    private final wzi<kff> b;

    private kfi(wzi<Context> wzi, wzi<kff> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kfi a(wzi<Context> wzi, wzi<kff> wzi2) {
        return new kfi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kfh((Context) this.a.get(), (kff) this.b.get());
    }
}
