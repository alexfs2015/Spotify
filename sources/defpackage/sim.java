package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;

/* renamed from: sim reason: default package */
public final class sim implements vua<RxWebToken> {
    private final wlc<gkz> a;
    private final wlc<Scheduler> b;

    private sim(wlc<gkz> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sim a(wlc<gkz> wlc, wlc<Scheduler> wlc2) {
        return new sim(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new RxWebToken((gkz) this.a.get(), (Scheduler) this.b.get());
    }
}
