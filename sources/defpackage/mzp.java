package defpackage;

import android.content.Context;

/* renamed from: mzp reason: default package */
public final class mzp implements wig<mzo> {
    private final wzi<Context> a;

    private mzp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static mzp a(wzi<Context> wzi) {
        return new mzp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mzo((Context) this.a.get());
    }
}
