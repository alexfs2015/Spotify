package defpackage;

import android.content.Context;

/* renamed from: kun reason: default package */
public final class kun implements vua<kum> {
    private final wlc<kuj> a;
    private final wlc<Context> b;
    private final wlc<rqb> c;

    private kun(wlc<kuj> wlc, wlc<Context> wlc2, wlc<rqb> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kun a(wlc<kuj> wlc, wlc<Context> wlc2, wlc<rqb> wlc3) {
        return new kun(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kum((kuj) this.a.get(), (Context) this.b.get(), (rqb) this.c.get());
    }
}
