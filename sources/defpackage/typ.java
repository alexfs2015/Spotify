package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: typ reason: default package */
public final class typ implements wig<tyo> {
    private final wzi<Flowable<PlayerState>> a;

    private typ(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static typ a(wzi<Flowable<PlayerState>> wzi) {
        return new typ(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tyo((Flowable) this.a.get());
    }
}
