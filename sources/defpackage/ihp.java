package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: ihp reason: default package */
public final class ihp implements wig<Flowable<Long>> {
    private final wzi<Flowable<Ad>> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<Flowable<Long>> c;

    private ihp(wzi<Flowable<Ad>> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Flowable<Long>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ihp a(wzi<Flowable<Ad>> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Flowable<Long>> wzi3) {
        return new ihp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get(), (Flowable) this.b.get(), (Flowable) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
