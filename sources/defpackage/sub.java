package defpackage;

import android.view.Display;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.lyrics.logger.LyricsLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: sub reason: default package */
public final class sub implements vua<sua> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<Flowable<Long>> b;
    private final wlc<Scheduler> c;
    private final wlc<LyricsLogger> d;
    private final wlc<skp> e;
    private final wlc<sud> f;
    private final wlc<kf> g;
    private final wlc<Display> h;
    private final wlc<fpt> i;

    private sub(wlc<Flowable<PlayerTrack>> wlc, wlc<Flowable<Long>> wlc2, wlc<Scheduler> wlc3, wlc<LyricsLogger> wlc4, wlc<skp> wlc5, wlc<sud> wlc6, wlc<kf> wlc7, wlc<Display> wlc8, wlc<fpt> wlc9) {
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

    public static sub a(wlc<Flowable<PlayerTrack>> wlc, wlc<Flowable<Long>> wlc2, wlc<Scheduler> wlc3, wlc<LyricsLogger> wlc4, wlc<skp> wlc5, wlc<sud> wlc6, wlc<kf> wlc7, wlc<Display> wlc8, wlc<fpt> wlc9) {
        sub sub = new sub(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return sub;
    }

    public final /* synthetic */ Object get() {
        sua sua = new sua((Flowable) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get(), (LyricsLogger) this.d.get(), (skp) this.e.get(), (sud) this.f.get(), (kf) this.g.get(), (Display) this.h.get(), (fpt) this.i.get());
        return sua;
    }
}
