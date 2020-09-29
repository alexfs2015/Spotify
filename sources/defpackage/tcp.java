package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.Flowable;
import java.util.Map;

/* renamed from: tcp reason: default package */
public final class tcp implements wig<tco> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<tcu> b;
    private final wzi<Flowable<lbg>> c;
    private final wzi<Map<Type, tca>> d;
    private final wzi<Map<Type, NowPlayingWidget>> e;

    private tcp(wzi<Flowable<PlayerState>> wzi, wzi<tcu> wzi2, wzi<Flowable<lbg>> wzi3, wzi<Map<Type, tca>> wzi4, wzi<Map<Type, NowPlayingWidget>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tcp a(wzi<Flowable<PlayerState>> wzi, wzi<tcu> wzi2, wzi<Flowable<lbg>> wzi3, wzi<Map<Type, tca>> wzi4, wzi<Map<Type, NowPlayingWidget>> wzi5) {
        tcp tcp = new tcp(wzi, wzi2, wzi3, wzi4, wzi5);
        return tcp;
    }

    public final /* synthetic */ Object get() {
        tco tco = new tco((Flowable) this.a.get(), (tcu) this.b.get(), (Flowable) this.c.get(), (Map) this.d.get(), (Map) this.e.get());
        return tco;
    }
}
