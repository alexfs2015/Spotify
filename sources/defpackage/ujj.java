package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: ujj reason: default package */
public final class ujj implements wig<uji> {
    private final wzi<a> a;
    private final wzi<Player> b;
    private final wzi<aqq> c;
    private final wzi<a> d;
    private final wzi<Flowable<PlayerState>> e;
    private final wzi<hgz> f;
    private final wzi<Scheduler> g;
    private final wzi<AudioManager> h;
    private final wzi<jtz> i;

    private ujj(wzi<a> wzi, wzi<Player> wzi2, wzi<aqq> wzi3, wzi<a> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<hgz> wzi6, wzi<Scheduler> wzi7, wzi<AudioManager> wzi8, wzi<jtz> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static ujj a(wzi<a> wzi, wzi<Player> wzi2, wzi<aqq> wzi3, wzi<a> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<hgz> wzi6, wzi<Scheduler> wzi7, wzi<AudioManager> wzi8, wzi<jtz> wzi9) {
        ujj ujj = new ujj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return ujj;
    }

    public final /* synthetic */ Object get() {
        uji uji = new uji((a) this.a.get(), (Player) this.b.get(), (aqq) this.c.get(), (a) this.d.get(), (Flowable) this.e.get(), (hgz) this.f.get(), (Scheduler) this.g.get(), (AudioManager) this.h.get(), (jtz) this.i.get());
        return uji;
    }
}
