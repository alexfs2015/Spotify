package defpackage;

import android.content.Context;

/* renamed from: nyu reason: default package */
public final class nyu implements wig<nyt> {
    private final wzi<nys> a;
    private final wzi<jtz> b;
    private final wzi<jty> c;
    private final wzi<String> d;
    private final wzi<Context> e;

    private nyu(wzi<nys> wzi, wzi<jtz> wzi2, wzi<jty> wzi3, wzi<String> wzi4, wzi<Context> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nyu a(wzi<nys> wzi, wzi<jtz> wzi2, wzi<jty> wzi3, wzi<String> wzi4, wzi<Context> wzi5) {
        nyu nyu = new nyu(wzi, wzi2, wzi3, wzi4, wzi5);
        return nyu;
    }

    public final /* synthetic */ Object get() {
        nyt nyt = new nyt((nys) this.a.get(), (jtz) this.b.get(), (jty) this.c.get(), (String) this.d.get(), (Context) this.e.get());
        return nyt;
    }
}
