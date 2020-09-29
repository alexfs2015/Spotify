package defpackage;

import android.content.Context;

/* renamed from: miq reason: default package */
public final class miq implements wig<mip> {
    private final wzi<Context> a;

    private miq(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static miq a(wzi<Context> wzi) {
        return new miq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mip((Context) this.a.get());
    }
}
