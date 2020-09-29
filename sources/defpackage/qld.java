package defpackage;

import android.content.Context;

/* renamed from: qld reason: default package */
public final class qld implements vua<qlc> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<qiq> c;

    private qld(wlc<Context> wlc, wlc<a> wlc2, wlc<qiq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qld a(wlc<Context> wlc, wlc<a> wlc2, wlc<qiq> wlc3) {
        return new qld(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qlc((Context) this.a.get(), (a) this.b.get(), (qiq) this.c.get());
    }
}
