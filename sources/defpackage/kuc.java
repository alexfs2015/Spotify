package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: kuc reason: default package */
public final class kuc implements wig<Observable<PlayerState>> {
    private final wzi<Flowable<PlayerState>> a;

    public static Observable<PlayerState> a(Flowable<PlayerState> flowable) {
        return (Observable) wil.a(CC.a(flowable), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get());
    }
}
