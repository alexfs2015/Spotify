package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.lyrics.logger.LyricsLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: slb reason: default package */
public final class slb implements vua<sla> {
    private final wlc<sks> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<urt> c;
    private final wlc<Scheduler> d;
    private final wlc<LyricsLogger> e;

    public static sla a(sks sks, Flowable<PlayerState> flowable, urt urt, Scheduler scheduler, LyricsLogger lyricsLogger) {
        sla sla = new sla(sks, flowable, urt, scheduler, lyricsLogger);
        return sla;
    }

    public final /* synthetic */ Object get() {
        sla sla = new sla((sks) this.a.get(), (Flowable) this.b.get(), (urt) this.c.get(), (Scheduler) this.d.get(), (LyricsLogger) this.e.get());
        return sla;
    }
}
