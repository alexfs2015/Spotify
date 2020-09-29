package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: pzx reason: default package */
public final class pzx implements wig<Observable<qab>> {
    private final wzi<hgy> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<pzl> c;

    public static Observable<qab> a(hgy hgy, Flowable<PlayerState> flowable, pzl pzl) {
        return (Observable) wil.a(CC.a(hgy, flowable, pzl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hgy) this.a.get(), (Flowable) this.b.get(), (pzl) this.c.get());
    }
}
