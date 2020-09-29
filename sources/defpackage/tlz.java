package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tlz reason: default package */
public final class tlz implements wig<Flowable<Long>> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<Long> b;
    private final wzi<Scheduler> c;

    private tlz(wzi<Flowable<PlayerState>> wzi, wzi<Long> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tlz a(wzi<Flowable<PlayerState>> wzi, wzi<Long> wzi2, wzi<Scheduler> wzi3) {
        return new tlz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((Flowable) this.a.get()).a(PlayerStateTransformers.position(((Long) this.b.get()).longValue(), (Scheduler) this.c.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
