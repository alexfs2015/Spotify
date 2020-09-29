package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: urk reason: default package */
public final class urk implements vua<urj> {
    private final wlc<Flowable<Boolean>> a;
    private final wlc<a> b;

    private urk(wlc<Flowable<Boolean>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static urk a(wlc<Flowable<Boolean>> wlc, wlc<a> wlc2) {
        return new urk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new urj((Flowable) this.a.get(), (a) this.b.get());
    }
}
