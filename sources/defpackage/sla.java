package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.lyrics.logger.LyricsLogger;
import com.spotify.music.lyrics.model.TrackLyrics;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: sla reason: default package */
public final class sla {
    final sks a;
    final CompositeDisposable b = new CompositeDisposable();
    private final Flowable<PlayerState> c;
    private final Scheduler d;
    private final urt e;
    private final LyricsLogger f;

    sla(sks sks, Flowable<PlayerState> flowable, urt urt, Scheduler scheduler, LyricsLogger lyricsLogger) {
        this.a = (sks) fay.a(sks);
        this.c = (Flowable) fay.a(flowable);
        this.e = (urt) fay.a(urt);
        this.d = (Scheduler) fay.a(scheduler);
        this.f = (LyricsLogger) fay.a(lyricsLogger);
    }

    public final void a() {
        this.a.a((sle) new $$Lambda$sla$WNFxKEapidcHCAgFJ51nURwVIU(this));
        this.b.a(this.c.a((Predicate<? super T>) $$Lambda$sla$eNatV9elK7kp5dRWewA3MfX153E.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a(this.d).a((Consumer<? super T>) new $$Lambda$sla$jcdtVwfFV9zDw4SqPmz8Nqrvg2c<Object>(this), (Consumer<? super Throwable>) new $$Lambda$sla$5lzYmgak4bSB3aHnPPmAJ7Qoig<Object>(this)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        if (this.a.a() == null || playerTrack.equals(this.a.a())) {
            this.a.a(playerState);
        } else {
            this.a.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Error in getting player state", new Object[0]);
        this.a.b();
    }

    public final void a(TrackLyrics trackLyrics) {
        this.e.a((a<T>) new $$Lambda$sla$hYJhXHQCJVyvtDpdTDEPn9whtM<T>(this));
        this.a.a(trackLyrics);
    }

    /* access modifiers changed from: private */
    public void a(Long l) {
        this.a.a(l.longValue());
    }

    /* access modifiers changed from: private */
    public void b() {
        LyricsLogger lyricsLogger = this.f;
        lyricsLogger.b.a(lyricsLogger.a(), "user-saw-150-characters", "fullscreen", -1, ImpressionType.ITEM, RenderType.LIST);
    }
}
