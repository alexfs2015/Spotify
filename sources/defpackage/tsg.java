package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tsg reason: default package */
public final class tsg implements wig<tsf> {
    private final wzi<igd> a;
    private final wzi<Flowable<PlayerTrack>> b;

    private tsg(wzi<igd> wzi, wzi<Flowable<PlayerTrack>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tsg a(wzi<igd> wzi, wzi<Flowable<PlayerTrack>> wzi2) {
        return new tsg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tsf((igd) this.a.get(), (Flowable) this.b.get());
    }
}
