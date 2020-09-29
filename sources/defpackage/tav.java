package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tav reason: default package */
public final class tav implements wig<Flowable<tjl>> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<kxp> b;
    private final wzi<PlayerState> c;
    private final wzi<fqn> d;

    private tav(wzi<Flowable<PlayerTrack>> wzi, wzi<kxp> wzi2, wzi<PlayerState> wzi3, wzi<fqn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tav a(wzi<Flowable<PlayerTrack>> wzi, wzi<kxp> wzi2, wzi<PlayerState> wzi3, wzi<fqn> wzi4) {
        return new tav(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get(), (kxp) this.b.get(), this.c, (fqn) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
