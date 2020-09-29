package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tjf reason: default package */
public final class tjf implements vua<tje> {
    private final wlc<Flowable<PlayerState>> a;

    private tjf(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tjf a(wlc<Flowable<PlayerState>> wlc) {
        return new tjf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tje((Flowable) this.a.get());
    }
}
