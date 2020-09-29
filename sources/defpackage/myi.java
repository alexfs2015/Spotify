package defpackage;

import android.content.Context;

/* renamed from: myi reason: default package */
public final class myi implements wig<Boolean> {
    private final wzi<Context> a;

    private myi(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static myi a(wzi<Context> wzi) {
        return new myi(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jvi.c((Context) this.a.get()));
    }
}
