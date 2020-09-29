package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: prb reason: default package */
public final class prb implements vua<Observable<prf>> {
    private final wlc<hec> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<pqp> c;

    public static Observable<prf> a(hec hec, Flowable<PlayerState> flowable, pqp pqp) {
        return (Observable) vuf.a(CC.a(hec, flowable, pqp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hec) this.a.get(), (Flowable) this.b.get(), (pqp) this.c.get());
    }
}
