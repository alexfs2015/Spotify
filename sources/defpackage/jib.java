package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: jib reason: default package */
public final class jib implements vua<jhz> {
    private final wlc<jhu> a;
    private final wlc<jgc> b;
    private final wlc<Random> c;
    private final wlc<Flowable<PlayerState>> d;
    private final wlc<Scheduler> e;

    private jib(wlc<jhu> wlc, wlc<jgc> wlc2, wlc<Random> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<Scheduler> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static jib a(wlc<jhu> wlc, wlc<jgc> wlc2, wlc<Random> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<Scheduler> wlc5) {
        jib jib = new jib(wlc, wlc2, wlc3, wlc4, wlc5);
        return jib;
    }

    public final /* synthetic */ Object get() {
        jhz jhz = new jhz((jhu) this.a.get(), (jgc) this.b.get(), (Random) this.c.get(), (Flowable) this.d.get(), (Scheduler) this.e.get());
        return jhz;
    }
}
