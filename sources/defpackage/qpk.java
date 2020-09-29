package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qpk reason: default package */
public final class qpk implements wig<Observable<String>> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<Scheduler> b;

    private qpk(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qpk a(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2) {
        return new qpk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((Flowable) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
