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

/* renamed from: svh reason: default package */
public final class svh {
    final suz a;
    final CompositeDisposable b = new CompositeDisposable();
    private final Flowable<PlayerState> c;
    private final Scheduler d;
    private final vcy e;
    private final LyricsLogger f;

    svh(suz suz, Flowable<PlayerState> flowable, vcy vcy, Scheduler scheduler, LyricsLogger lyricsLogger) {
        this.a = (suz) fbp.a(suz);
        this.c = (Flowable) fbp.a(flowable);
        this.e = (vcy) fbp.a(vcy);
        this.d = (Scheduler) fbp.a(scheduler);
        this.f = (LyricsLogger) fbp.a(lyricsLogger);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        if (this.a.a() == null || playerTrack.equals(this.a.a())) {
            this.a.a(playerState);
        } else {
            this.a.b();
        }
    }

    /* access modifiers changed from: private */
    public void a(Long l) {
        this.a.a(l.longValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Error in getting player state", new Object[0]);
        this.a.b();
    }

    /* access modifiers changed from: private */
    public void b() {
        LyricsLogger lyricsLogger = this.f;
        lyricsLogger.b.a(lyricsLogger.a(), "user-saw-150-characters", "fullscreen", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }

    public final void a() {
        this.a.a((svl) new $$Lambda$svh$AtytESDTMccp9Lw34TCmtGvmVsU(this));
        this.b.a(this.c.a((Predicate<? super T>) $$Lambda$svh$5QBmIn5RzKWqaTp3CwVGpIEko.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a(this.d).a((Consumer<? super T>) new $$Lambda$svh$0VvBCdg6NMU8tPBHlQLozUNxw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$svh$SxV_jcvry69M6htHvW977kg5sJc<Object>(this)));
    }

    public final void a(TrackLyrics trackLyrics) {
        this.e.a((a<T>) new $$Lambda$svh$4YrvAWn7dDkJX1GXN6pWoTVHxbY<T>(this));
        this.a.a(trackLyrics);
    }
}
