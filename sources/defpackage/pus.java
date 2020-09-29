package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: pus reason: default package */
public final class pus implements wig<pvi> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<Scheduler> b;
    private final wzi<pvc> c;
    private final wzi<szp> d;

    private pus(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2, wzi<pvc> wzi3, wzi<szp> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pus a(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2, wzi<pvc> wzi3, wzi<szp> wzi4) {
        return new pus(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (pvi) wil.a(new pvj((Flowable) this.a.get(), (Scheduler) this.b.get(), (pvc) this.c.get(), (szp) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
