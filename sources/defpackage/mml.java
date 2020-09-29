package defpackage;

import android.content.Context;

/* renamed from: mml reason: default package */
public final class mml implements wig<mmh> {
    private final wzi<Context> a;
    private final wzi<mmi> b;

    private mml(wzi<Context> wzi, wzi<mmi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mml a(wzi<Context> wzi, wzi<mmi> wzi2) {
        return new mml(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mmh((Context) this.a.get(), (mmi) this.b.get());
    }
}
