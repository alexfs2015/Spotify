package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: sus reason: default package */
public final class sus implements wig<sur> {
    private final wzi<Flowable<PlayerState>> a;

    private sus(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static sus a(wzi<Flowable<PlayerState>> wzi) {
        return new sus(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sur((Flowable) this.a.get());
    }
}
