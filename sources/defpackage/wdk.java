package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: wdk reason: default package */
public final class wdk implements wig<Single<weo>> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<wck> b;
    private final wzi<wep> c;

    private wdk(wzi<Flowable<PlayerState>> wzi, wzi<wck> wzi2, wzi<wep> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static wdk a(wzi<Flowable<PlayerState>> wzi, wzi<wck> wzi2, wzi<wep> wzi3) {
        return new wdk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get(), (wck) this.b.get(), (wep) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
