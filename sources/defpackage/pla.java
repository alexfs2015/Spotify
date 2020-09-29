package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: pla reason: default package */
public final class pla implements wig<pkz> {
    private final wzi<Flowable<PlayerState>> a;

    private pla(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static pla a(wzi<Flowable<PlayerState>> wzi) {
        return new pla(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pkz((Flowable) this.a.get());
    }
}
