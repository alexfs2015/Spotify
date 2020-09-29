package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: pqv reason: default package */
public final class pqv implements vua<Observable<prf>> {
    private final wlc<Flowable<PlayerState>> a;

    public static Observable<prf> a(Flowable<PlayerState> flowable) {
        return (Observable) vuf.a(CC.a(flowable), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get());
    }
}
