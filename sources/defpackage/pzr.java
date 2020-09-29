package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: pzr reason: default package */
public final class pzr implements wig<Observable<qab>> {
    private final wzi<Flowable<PlayerState>> a;

    public static Observable<qab> a(Flowable<PlayerState> flowable) {
        return (Observable) wil.a(CC.a(flowable), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get());
    }
}
