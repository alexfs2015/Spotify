package defpackage;

import android.content.Context;

/* renamed from: icn reason: default package */
public final class icn implements wig<Boolean> {
    private final wzi<Context> a;

    private icn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static icn a(wzi<Context> wzi) {
        return new icn(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jvi.c((Context) this.a.get()));
    }
}
