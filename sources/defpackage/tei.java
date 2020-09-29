package defpackage;

import android.view.Display;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.lyrics.logger.LyricsLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tei reason: default package */
public final class tei implements wig<teh> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<Flowable<Long>> b;
    private final wzi<Scheduler> c;
    private final wzi<LyricsLogger> d;
    private final wzi<suw> e;
    private final wzi<tek> f;
    private final wzi<kk> g;
    private final wzi<Display> h;
    private final wzi<fqn> i;

    private tei(wzi<Flowable<PlayerTrack>> wzi, wzi<Flowable<Long>> wzi2, wzi<Scheduler> wzi3, wzi<LyricsLogger> wzi4, wzi<suw> wzi5, wzi<tek> wzi6, wzi<kk> wzi7, wzi<Display> wzi8, wzi<fqn> wzi9) {
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

    public static tei a(wzi<Flowable<PlayerTrack>> wzi, wzi<Flowable<Long>> wzi2, wzi<Scheduler> wzi3, wzi<LyricsLogger> wzi4, wzi<suw> wzi5, wzi<tek> wzi6, wzi<kk> wzi7, wzi<Display> wzi8, wzi<fqn> wzi9) {
        tei tei = new tei(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return tei;
    }

    public final /* synthetic */ Object get() {
        teh teh = new teh((Flowable) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get(), (LyricsLogger) this.d.get(), (suw) this.e.get(), (tek) this.f.get(), (kk) this.g.get(), (Display) this.h.get(), (fqn) this.i.get());
        return teh;
    }
}
