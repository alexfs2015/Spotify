package defpackage;

import android.content.Context;

/* renamed from: lbf reason: default package */
public final class lbf implements wig<lbe> {
    private final wzi<Context> a;

    private lbf(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lbf a(wzi<Context> wzi) {
        return new lbf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lbe((Context) this.a.get());
    }
}
