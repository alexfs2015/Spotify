package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tee reason: default package */
public final class tee implements wig<ted> {
    private final wzi<Flowable<PlayerTrack>> a;

    private tee(wzi<Flowable<PlayerTrack>> wzi) {
        this.a = wzi;
    }

    public static tee a(wzi<Flowable<PlayerTrack>> wzi) {
        return new tee(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ted((Flowable) this.a.get());
    }
}
