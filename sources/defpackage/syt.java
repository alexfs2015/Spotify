package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;

/* renamed from: syt reason: default package */
public final class syt implements vua<sys> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<Picasso> b;

    private syt(wlc<Flowable<PlayerTrack>> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static syt a(wlc<Flowable<PlayerTrack>> wlc, wlc<Picasso> wlc2) {
        return new syt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sys((Flowable) this.a.get(), (Picasso) this.b.get());
    }
}
