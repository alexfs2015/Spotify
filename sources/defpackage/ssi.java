package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.Flowable;
import java.util.Map;

/* renamed from: ssi reason: default package */
public final class ssi implements vua<ssh> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<ssn> b;
    private final wlc<Flowable<kxx>> c;
    private final wlc<Map<Type, srt>> d;
    private final wlc<Map<Type, NowPlayingWidget>> e;

    private ssi(wlc<Flowable<PlayerState>> wlc, wlc<ssn> wlc2, wlc<Flowable<kxx>> wlc3, wlc<Map<Type, srt>> wlc4, wlc<Map<Type, NowPlayingWidget>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ssi a(wlc<Flowable<PlayerState>> wlc, wlc<ssn> wlc2, wlc<Flowable<kxx>> wlc3, wlc<Map<Type, srt>> wlc4, wlc<Map<Type, NowPlayingWidget>> wlc5) {
        ssi ssi = new ssi(wlc, wlc2, wlc3, wlc4, wlc5);
        return ssi;
    }

    public final /* synthetic */ Object get() {
        ssh ssh = new ssh((Flowable) this.a.get(), (ssn) this.b.get(), (Flowable) this.c.get(), (Map) this.d.get(), (Map) this.e.get());
        return ssh;
    }
}
