package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: thb reason: default package */
public final class thb implements wig<tha> {
    private final wzi<Flowable<Ad>> a;
    private final wzi<Flowable<PlayerState>> b;

    private thb(wzi<Flowable<Ad>> wzi, wzi<Flowable<PlayerState>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static thb a(wzi<Flowable<Ad>> wzi, wzi<Flowable<PlayerState>> wzi2) {
        return new thb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tha((Flowable) this.a.get(), (Flowable) this.b.get());
    }
}
