package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: rah reason: default package */
public final class rah implements vua<rag> {
    private final wlc<a> a;
    private final wlc<rdh> b;
    private final wlc<a> c;
    private final wlc<rwr> d;

    private rah(wlc<a> wlc, wlc<rdh> wlc2, wlc<a> wlc3, wlc<rwr> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rah a(wlc<a> wlc, wlc<rdh> wlc2, wlc<a> wlc3, wlc<rwr> wlc4) {
        return new rah(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rag(this.a, this.b, this.c, this.d);
    }
}
