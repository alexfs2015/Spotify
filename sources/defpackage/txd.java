package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: txd reason: default package */
public final class txd implements a {
    private final wlc<Player> a;
    private final wlc<apz> b;
    private final wlc<a> c;
    private final wlc<Flowable<PlayerState>> d;
    private final wlc<hed> e;
    private final wlc<Scheduler> f;
    private final wlc<AudioManager> g;
    private final wlc<jrp> h;

    public txd(wlc<Player> wlc, wlc<apz> wlc2, wlc<a> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<hed> wlc5, wlc<Scheduler> wlc6, wlc<AudioManager> wlc7, wlc<jrp> wlc8) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ txc a(a aVar) {
        txf txf = new txf((a) a(aVar, 1), (Player) a(this.a.get(), 2), (apz) this.b.get(), (a) a(this.c.get(), 4), (Flowable) a(this.d.get(), 5), (hed) a(this.e.get(), 6), (Scheduler) a(this.f.get(), 7), (AudioManager) a(this.g.get(), 8), (jrp) a(this.h.get(), 9));
        return txf;
    }
}
