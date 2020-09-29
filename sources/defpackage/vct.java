package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: vct reason: default package */
public final class vct implements wig<vcs> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<a> b;

    private vct(wzi<Flowable<PlayerTrack>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vct a(wzi<Flowable<PlayerTrack>> wzi, wzi<a> wzi2) {
        return new vct(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vcs((Flowable) this.a.get(), (a) this.b.get());
    }
}
