package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tan reason: default package */
public final class tan implements wig<Flowable<tjl>> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<kxp> b;
    private final wzi<fqn> c;

    private tan(wzi<Flowable<PlayerTrack>> wzi, wzi<kxp> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tan a(wzi<Flowable<PlayerTrack>> wzi, wzi<kxp> wzi2, wzi<fqn> wzi3) {
        return new tan(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get(), (kxp) this.b.get(), (fqn) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
