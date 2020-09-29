package defpackage;

import android.content.Context;

/* renamed from: uon reason: default package */
public final class uon implements wig<uom> {
    private final wzi<Context> a;

    private uon(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uon a(wzi<Context> wzi) {
        return new uon(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uom((Context) this.a.get());
    }
}
