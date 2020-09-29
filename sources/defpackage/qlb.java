package defpackage;

import android.content.Context;

/* renamed from: qlb reason: default package */
public final class qlb implements vua<qla> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<qiq> c;

    private qlb(wlc<Context> wlc, wlc<a> wlc2, wlc<qiq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qlb a(wlc<Context> wlc, wlc<a> wlc2, wlc<qiq> wlc3) {
        return new qlb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qla((Context) this.a.get(), (a) this.b.get(), (qiq) this.c.get());
    }
}
