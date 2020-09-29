package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;

/* renamed from: out reason: default package */
public final class out implements vua<ous> {
    private final wlc<String> a;
    private final wlc<hed> b;
    private final wlc<RxWebToken> c;
    private final wlc<Scheduler> d;

    private out(wlc<String> wlc, wlc<hed> wlc2, wlc<RxWebToken> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static out a(wlc<String> wlc, wlc<hed> wlc2, wlc<RxWebToken> wlc3, wlc<Scheduler> wlc4) {
        return new out(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ous((String) this.a.get(), (hed) this.b.get(), (RxWebToken) this.c.get(), (Scheduler) this.d.get());
    }
}
