package defpackage;

import android.content.Context;

/* renamed from: mdp reason: default package */
public final class mdp implements wig<mdn> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Boolean> c;
    private final wzi<Boolean> d;

    private mdp(wzi<Context> wzi, wzi<a> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mdp a(wzi<Context> wzi, wzi<a> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4) {
        return new mdp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mdn((Context) this.a.get(), (a) this.b.get(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue());
    }
}
