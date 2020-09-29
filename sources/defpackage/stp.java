package defpackage;

import android.content.Context;

/* renamed from: stp reason: default package */
public final class stp implements wig<sto> {
    private final wzi<Context> a;

    private stp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static stp a(wzi<Context> wzi) {
        return new stp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sto((Context) this.a.get());
    }
}
