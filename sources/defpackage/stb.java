package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: stb reason: default package */
public final class stb implements vua<sta> {
    private final wlc<tad> a;
    private final wlc<a> b;
    private final wlc<Flowable<String>> c;

    private stb(wlc<tad> wlc, wlc<a> wlc2, wlc<Flowable<String>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static stb a(wlc<tad> wlc, wlc<a> wlc2, wlc<Flowable<String>> wlc3) {
        return new stb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new sta(this.a, this.b, this.c);
    }
}
