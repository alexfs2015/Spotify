package defpackage;

import android.content.Context;

/* renamed from: pkb reason: default package */
public final class pkb implements wig<pka> {
    private final wzi<Context> a;
    private final wzi<fzt> b;
    private final wzi<utg> c;
    private final wzi<a> d;

    private pkb(wzi<Context> wzi, wzi<fzt> wzi2, wzi<utg> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pkb a(wzi<Context> wzi, wzi<fzt> wzi2, wzi<utg> wzi3, wzi<a> wzi4) {
        return new pkb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pka((Context) this.a.get(), (fzt) this.b.get(), (utg) this.c.get(), wif.b(this.d));
    }
}
