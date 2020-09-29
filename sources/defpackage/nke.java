package defpackage;

import android.content.Context;

/* renamed from: nke reason: default package */
public final class nke implements wig<nkb> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<rwl> c;

    private nke(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nke a(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3) {
        return new nke(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new nkb((Context) this.a.get(), (String) this.b.get(), (rwl) this.c.get());
    }
}
