package defpackage;

import android.content.Context;

/* renamed from: tro reason: default package */
public final class tro implements wig<trn> {
    private final wzi<Context> a;

    private tro(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static tro a(wzi<Context> wzi) {
        return new tro(wzi);
    }

    public final /* synthetic */ Object get() {
        return new trn((Context) this.a.get());
    }
}
