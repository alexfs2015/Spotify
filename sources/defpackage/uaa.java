package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: uaa reason: default package */
public final class uaa implements vua<tzz> {
    private final wlc<Scheduler> a;
    private final wlc<Observable<ho<String, PlayerTrack>>> b;
    private final wlc<Player> c;

    private uaa(wlc<Scheduler> wlc, wlc<Observable<ho<String, PlayerTrack>>> wlc2, wlc<Player> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uaa a(wlc<Scheduler> wlc, wlc<Observable<ho<String, PlayerTrack>>> wlc2, wlc<Player> wlc3) {
        return new uaa(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tzz((Scheduler) this.a.get(), (Observable) this.b.get(), vtz.b(this.c));
    }
}
