package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ifb reason: default package */
public final class ifb implements vua<Flowable<PlayerState>> {
    private final wlc<Flowable<PlayerState>> a;

    private ifb(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static ifb a(wlc<Flowable<PlayerState>> wlc) {
        return new ifb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.b((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
