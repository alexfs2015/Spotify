package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: syv reason: default package */
public final class syv implements vua<syu> {
    private final wlc<Flowable<Integer>> a;
    private final wlc<a> b;

    private syv(wlc<Flowable<Integer>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static syv a(wlc<Flowable<Integer>> wlc, wlc<a> wlc2) {
        return new syv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new syu((Flowable) this.a.get(), (a) this.b.get());
    }
}
