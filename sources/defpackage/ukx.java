package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ukx reason: default package */
public final class ukx implements wig<rnw<?>> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<uky> b;

    private ukx(wzi<Flowable<PlayerState>> wzi, wzi<uky> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ukx a(wzi<Flowable<PlayerState>> wzi, wzi<uky> wzi2) {
        return new ukx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (rnw) wil.a(new uks((Flowable) this.a.get(), (uky) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
