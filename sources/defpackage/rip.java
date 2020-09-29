package defpackage;

import android.content.Context;

/* renamed from: rip reason: default package */
public final class rip implements wig<rio> {
    private final wzi<Context> a;
    private final wzi<lap> b;
    private final wzi<jrn> c;
    private final wzi<sso> d;
    private final wzi<rit> e;
    private final wzi<jop> f;

    private rip(wzi<Context> wzi, wzi<lap> wzi2, wzi<jrn> wzi3, wzi<sso> wzi4, wzi<rit> wzi5, wzi<jop> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static rip a(wzi<Context> wzi, wzi<lap> wzi2, wzi<jrn> wzi3, wzi<sso> wzi4, wzi<rit> wzi5, wzi<jop> wzi6) {
        rip rip = new rip(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return rip;
    }

    public final /* synthetic */ Object get() {
        rio rio = new rio((Context) this.a.get(), (lap) this.b.get(), (jrn) this.c.get(), (sso) this.d.get(), (rit) this.e.get(), (jop) this.f.get());
        return rio;
    }
}
