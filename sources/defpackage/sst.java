package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;

/* renamed from: sst reason: default package */
public final class sst implements wig<RxWebToken> {
    private final wzi<gmn> a;
    private final wzi<Scheduler> b;

    private sst(wzi<gmn> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sst a(wzi<gmn> wzi, wzi<Scheduler> wzi2) {
        return new sst(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new RxWebToken((gmn) this.a.get(), (Scheduler) this.b.get());
    }
}
