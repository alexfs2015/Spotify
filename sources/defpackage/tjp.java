package defpackage;

import android.content.Context;

/* renamed from: tjp reason: default package */
public final class tjp implements wig<tjo> {
    private final wzi<Context> a;
    private final wzi<sso> b;
    private final wzi<jpc> c;
    private final wzi<tjs> d;
    private final wzi<tjq> e;

    private tjp(wzi<Context> wzi, wzi<sso> wzi2, wzi<jpc> wzi3, wzi<tjs> wzi4, wzi<tjq> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tjp a(wzi<Context> wzi, wzi<sso> wzi2, wzi<jpc> wzi3, wzi<tjs> wzi4, wzi<tjq> wzi5) {
        tjp tjp = new tjp(wzi, wzi2, wzi3, wzi4, wzi5);
        return tjp;
    }

    public final /* synthetic */ Object get() {
        tjo tjo = new tjo((Context) this.a.get(), (sso) this.b.get(), (jpc) this.c.get(), wif.b(this.d), wif.b(this.e));
        return tjo;
    }
}
