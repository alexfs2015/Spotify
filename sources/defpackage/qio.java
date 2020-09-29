package defpackage;

import android.view.LayoutInflater;

/* renamed from: qio reason: default package */
public final class qio implements vua<qin> {
    private final wlc<LayoutInflater> a;
    private final wlc<qig> b;
    private final wlc<qix> c;
    private final wlc<qjs> d;

    private qio(wlc<LayoutInflater> wlc, wlc<qig> wlc2, wlc<qix> wlc3, wlc<qjs> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qio a(wlc<LayoutInflater> wlc, wlc<qig> wlc2, wlc<qix> wlc3, wlc<qjs> wlc4) {
        return new qio(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qin((LayoutInflater) this.a.get(), (qig) this.b.get(), (qix) this.c.get(), (qjs) this.d.get());
    }
}
