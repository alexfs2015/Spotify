package defpackage;

import android.content.Context;

/* renamed from: pbi reason: default package */
public final class pbi implements wig<pbh> {
    private final wzi<Context> a;

    private pbi(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static pbi a(wzi<Context> wzi) {
        return new pbi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pbh((Context) this.a.get());
    }
}
