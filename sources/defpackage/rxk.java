package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: rxk reason: default package */
public final class rxk implements vua<rxj> {
    private final wlc<RxResolver> a;

    private rxk(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static rxk a(wlc<RxResolver> wlc) {
        return new rxk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rxj((RxResolver) this.a.get());
    }
}
