package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tcb reason: default package */
public final class tcb implements vua<tca> {
    private final wlc<Flowable<tcf>> a;
    private final wlc<a> b;

    private tcb(wlc<Flowable<tcf>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tcb a(wlc<Flowable<tcf>> wlc, wlc<a> wlc2) {
        return new tcb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tca((Flowable) this.a.get(), (a) this.b.get());
    }
}
