package defpackage;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;

/* renamed from: tqf reason: default package */
public final class tqf implements vua<SpeedControlInteractor> {
    private final wlc<twr> a;

    private tqf(wlc<twr> wlc) {
        this.a = wlc;
    }

    public static tqf a(wlc<twr> wlc) {
        return new tqf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new SpeedControlInteractor((twr) this.a.get());
    }
}
