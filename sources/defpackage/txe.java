package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: txe reason: default package */
public final class txe implements vua<txd> {
    private final wlc<Player> a;
    private final wlc<apz> b;
    private final wlc<a> c;
    private final wlc<Flowable<PlayerState>> d;
    private final wlc<hed> e;
    private final wlc<Scheduler> f;
    private final wlc<AudioManager> g;
    private final wlc<jrp> h;

    private txe(wlc<Player> wlc, wlc<apz> wlc2, wlc<a> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<hed> wlc5, wlc<Scheduler> wlc6, wlc<AudioManager> wlc7, wlc<jrp> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static txe a(wlc<Player> wlc, wlc<apz> wlc2, wlc<a> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<hed> wlc5, wlc<Scheduler> wlc6, wlc<AudioManager> wlc7, wlc<jrp> wlc8) {
        txe txe = new txe(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return txe;
    }

    public final /* synthetic */ Object get() {
        txd txd = new txd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return txd;
    }
}
