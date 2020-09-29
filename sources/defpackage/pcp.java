package defpackage;

import android.content.Context;

/* renamed from: pcp reason: default package */
public final class pcp implements wig<pco> {
    private final wzi<Context> a;

    private pcp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static pcp a(wzi<Context> wzi) {
        return new pcp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pco((Context) this.a.get());
    }
}
