package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: kqt reason: default package */
public final class kqt implements vua<Observable<PlayerState>> {
    private final wlc<Flowable<PlayerState>> a;

    public static Observable<PlayerState> a(Flowable<PlayerState> flowable) {
        return (Observable) vuf.a(CC.a(flowable), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get());
    }
}
