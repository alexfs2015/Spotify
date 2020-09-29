package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: kyh reason: default package */
public final class kyh implements wig<kyg> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<jlr> b;

    private kyh(wzi<Flowable<PlayerState>> wzi, wzi<jlr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kyh a(wzi<Flowable<PlayerState>> wzi, wzi<jlr> wzi2) {
        return new kyh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kyg((Flowable) this.a.get(), (jlr) this.b.get());
    }
}
