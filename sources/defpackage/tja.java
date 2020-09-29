package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;

/* renamed from: tja reason: default package */
public final class tja implements wig<tiz> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<Picasso> b;

    private tja(wzi<Flowable<PlayerTrack>> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tja a(wzi<Flowable<PlayerTrack>> wzi, wzi<Picasso> wzi2) {
        return new tja(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tiz((Flowable) this.a.get(), (Picasso) this.b.get());
    }
}
