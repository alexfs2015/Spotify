package defpackage;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;

/* renamed from: uci reason: default package */
public final class uci implements wig<SpeedControlInteractor> {
    private final wzi<uiu> a;

    private uci(wzi<uiu> wzi) {
        this.a = wzi;
    }

    public static uci a(wzi<uiu> wzi) {
        return new uci(wzi);
    }

    public final /* synthetic */ Object get() {
        return new SpeedControlInteractor((uiu) this.a.get());
    }
}
