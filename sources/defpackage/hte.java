package defpackage;

import android.content.Context;

/* renamed from: hte reason: default package */
public final class hte implements wig<htd> {
    private final wzi<Context> a;
    private final wzi<hrg> b;

    private hte(wzi<Context> wzi, wzi<hrg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hte a(wzi<Context> wzi, wzi<hrg> wzi2) {
        return new hte(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new htd((Context) this.a.get(), (hrg) this.b.get());
    }
}
