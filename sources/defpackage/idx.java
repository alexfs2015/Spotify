package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: idx reason: default package */
public final class idx implements vua<idw> {
    private final wlc<RxResolver> a;

    private idx(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static idx a(wlc<RxResolver> wlc) {
        return new idx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new idw((RxResolver) this.a.get());
    }
}
