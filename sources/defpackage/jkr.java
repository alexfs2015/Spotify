package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: jkr reason: default package */
public final class jkr implements wig<jkp> {
    private final wzi<jkk> a;
    private final wzi<jir> b;
    private final wzi<Random> c;
    private final wzi<Flowable<PlayerState>> d;
    private final wzi<Scheduler> e;

    private jkr(wzi<jkk> wzi, wzi<jir> wzi2, wzi<Random> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static jkr a(wzi<jkk> wzi, wzi<jir> wzi2, wzi<Random> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<Scheduler> wzi5) {
        jkr jkr = new jkr(wzi, wzi2, wzi3, wzi4, wzi5);
        return jkr;
    }

    public final /* synthetic */ Object get() {
        jkp jkp = new jkp((jkk) this.a.get(), (jir) this.b.get(), (Random) this.c.get(), (Flowable) this.d.get(), (Scheduler) this.e.get());
        return jkp;
    }
}
