package defpackage;

import android.content.Context;

/* renamed from: ncc reason: default package */
public final class ncc implements wig<Boolean> {
    private final wzi<Context> a;

    private ncc(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ncc a(wzi<Context> wzi) {
        return new ncc(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jvi.c((Context) this.a.get()));
    }
}
