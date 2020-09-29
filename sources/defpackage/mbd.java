package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mbd reason: default package */
public final class mbd implements vua<mbc> {
    private final wlc<gup> a;
    private final wlc<gur> b;
    private final wlc<gum> c;
    private final wlc<a> d;

    private mbd(wlc<gup> wlc, wlc<gur> wlc2, wlc<gum> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mbd a(wlc<gup> wlc, wlc<gur> wlc2, wlc<gum> wlc3, wlc<a> wlc4) {
        return new mbd(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mbc((gup) this.a.get(), (gur) this.b.get(), (gum) this.c.get(), (a) this.d.get());
    }
}
