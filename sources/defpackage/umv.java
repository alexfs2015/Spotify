package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: umv reason: default package */
public final class umv implements wig<umu> {
    private final wzi<Scheduler> a;
    private final wzi<Observable<ho<String, PlayerTrack>>> b;
    private final wzi<Player> c;

    private umv(wzi<Scheduler> wzi, wzi<Observable<ho<String, PlayerTrack>>> wzi2, wzi<Player> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static umv a(wzi<Scheduler> wzi, wzi<Observable<ho<String, PlayerTrack>>> wzi2, wzi<Player> wzi3) {
        return new umv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new umu((Scheduler) this.a.get(), (Observable) this.b.get(), wif.b(this.c));
    }
}
