package defpackage;

import android.content.Context;

/* renamed from: rpw reason: default package */
public final class rpw implements wig<rpv> {
    private final wzi<hgy> a;
    private final wzi<String> b;
    private final wzi<Context> c;
    private final wzi<kyk> d;
    private final wzi<sye> e;

    private rpw(wzi<hgy> wzi, wzi<String> wzi2, wzi<Context> wzi3, wzi<kyk> wzi4, wzi<sye> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rpw a(wzi<hgy> wzi, wzi<String> wzi2, wzi<Context> wzi3, wzi<kyk> wzi4, wzi<sye> wzi5) {
        rpw rpw = new rpw(wzi, wzi2, wzi3, wzi4, wzi5);
        return rpw;
    }

    public final /* synthetic */ Object get() {
        rpv rpv = new rpv((hgy) this.a.get(), (String) this.b.get(), (Context) this.c.get(), (kyk) this.d.get(), (sye) this.e.get());
        return rpv;
    }
}
