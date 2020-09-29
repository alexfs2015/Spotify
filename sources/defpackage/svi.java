package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.lyrics.logger.LyricsLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: svi reason: default package */
public final class svi implements wig<svh> {
    private final wzi<suz> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<vcy> c;
    private final wzi<Scheduler> d;
    private final wzi<LyricsLogger> e;

    public static svh a(suz suz, Flowable<PlayerState> flowable, vcy vcy, Scheduler scheduler, LyricsLogger lyricsLogger) {
        svh svh = new svh(suz, flowable, vcy, scheduler, lyricsLogger);
        return svh;
    }

    public final /* synthetic */ Object get() {
        svh svh = new svh((suz) this.a.get(), (Flowable) this.b.get(), (vcy) this.c.get(), (Scheduler) this.d.get(), (LyricsLogger) this.e.get());
        return svh;
    }
}
