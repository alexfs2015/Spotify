package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: txg reason: default package */
public final class txg implements vua<txf> {
    private final wlc<a> a;
    private final wlc<Player> b;
    private final wlc<apz> c;
    private final wlc<a> d;
    private final wlc<Flowable<PlayerState>> e;
    private final wlc<hed> f;
    private final wlc<Scheduler> g;
    private final wlc<AudioManager> h;
    private final wlc<jrp> i;

    private txg(wlc<a> wlc, wlc<Player> wlc2, wlc<apz> wlc3, wlc<a> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<hed> wlc6, wlc<Scheduler> wlc7, wlc<AudioManager> wlc8, wlc<jrp> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static txg a(wlc<a> wlc, wlc<Player> wlc2, wlc<apz> wlc3, wlc<a> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<hed> wlc6, wlc<Scheduler> wlc7, wlc<AudioManager> wlc8, wlc<jrp> wlc9) {
        txg txg = new txg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return txg;
    }

    public final /* synthetic */ Object get() {
        txf txf = new txf((a) this.a.get(), (Player) this.b.get(), (apz) this.c.get(), (a) this.d.get(), (Flowable) this.e.get(), (hed) this.f.get(), (Scheduler) this.g.get(), (AudioManager) this.h.get(), (jrp) this.i.get());
        return txf;
    }
}
