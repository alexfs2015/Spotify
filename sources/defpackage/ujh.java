package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: ujh reason: default package */
public final class ujh implements wig<ujg> {
    private final wzi<Player> a;
    private final wzi<aqq> b;
    private final wzi<a> c;
    private final wzi<Flowable<PlayerState>> d;
    private final wzi<hgz> e;
    private final wzi<Scheduler> f;
    private final wzi<AudioManager> g;
    private final wzi<jtz> h;

    private ujh(wzi<Player> wzi, wzi<aqq> wzi2, wzi<a> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<hgz> wzi5, wzi<Scheduler> wzi6, wzi<AudioManager> wzi7, wzi<jtz> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static ujh a(wzi<Player> wzi, wzi<aqq> wzi2, wzi<a> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<hgz> wzi5, wzi<Scheduler> wzi6, wzi<AudioManager> wzi7, wzi<jtz> wzi8) {
        ujh ujh = new ujh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return ujh;
    }

    public final /* synthetic */ Object get() {
        ujg ujg = new ujg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return ujg;
    }
}
