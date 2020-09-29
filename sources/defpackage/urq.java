package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: urq reason: default package */
public final class urq implements vua<urp> {
    private final wlc<Flowable<String>> a;
    private final wlc<a> b;

    private urq(wlc<Flowable<String>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static urq a(wlc<Flowable<String>> wlc, wlc<a> wlc2) {
        return new urq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new urp((Flowable) this.a.get(), (a) this.b.get());
    }
}
