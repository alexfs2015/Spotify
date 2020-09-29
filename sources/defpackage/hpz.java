package defpackage;

import android.content.Context;

/* renamed from: hpz reason: default package */
public final class hpz implements wig<hpy> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<hjw> c;

    private hpz(wzi<Context> wzi, wzi<String> wzi2, wzi<hjw> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hpz a(wzi<Context> wzi, wzi<String> wzi2, wzi<hjw> wzi3) {
        return new hpz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hpy((Context) this.a.get(), (String) this.b.get(), (hjw) this.c.get());
    }
}
