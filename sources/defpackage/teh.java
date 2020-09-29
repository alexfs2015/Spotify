package defpackage;

import android.os.Bundle;
import android.view.Display;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.lyrics.logger.LyricsLogger;
import com.spotify.music.lyrics.logger.LyricsLogger.LyricsMode;
import com.spotify.music.lyrics.logger.LyricsLogger.UserIntent;
import com.spotify.music.lyrics.model.LyricsColorsModel;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: teh reason: default package */
public final class teh {
    final CompositeDisposable a = new CompositeDisposable();
    private final LyricsLogger b;
    private final suw c;
    private final tek d;
    private final kk e;
    private final Display f;
    private final Observable<PlayerTrack> g;
    private final Observable<Long> h;
    private final Scheduler i;
    private tej j;
    private final fqn k;
    private LyricsColorsModel l;

    teh(Flowable<PlayerTrack> flowable, Flowable<Long> flowable2, Scheduler scheduler, LyricsLogger lyricsLogger, suw suw, tek tek, kk kkVar, Display display, fqn fqn) {
        this.g = flowable.j();
        this.h = flowable2.j();
        this.i = scheduler;
        this.b = lyricsLogger;
        this.c = suw;
        this.d = tek;
        this.e = kkVar;
        this.f = display;
        this.k = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PlayerTrack playerTrack) {
        suw suw = this.c;
        String uri = playerTrack.uri();
        String uri2 = iyd.a(playerTrack).toString();
        return ((uri2 == null || uri2.isEmpty()) ? suw.a.a(jva.a(uri).f()).d() : suw.a.a(jva.a(uri).f(), gck.a(uri2, fbi.c)).d()).c((Function<? super T, ? extends R>) $$Lambda$JoTfkqWWRQ_qExSnRUteoQYc4r4.INSTANCE).e(new c()).e((Function<? super Throwable, ? extends T>) $$Lambda$teh$QkCR2bYdwCdhQfdnwxdwkXZc7Ik.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tej tej, a aVar) {
        this.l = null;
        tej.b();
        tek tek = this.d;
        tej.getClass();
        tek.a(-6579301, new $$Lambda$qlkDu6Wm6tOQ7c3sr8jn37mJEBA(tej));
        tej.a((b) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tej tej, b bVar) {
        this.l = bVar.a;
        svm colors = this.l.getColors();
        tej.a(this.l.getTrackLyrics());
        tej.a(colors);
        tej.a(colors.b, colors.c);
        tek tek = this.d;
        int i2 = colors.a;
        tej.getClass();
        tek.a(i2, new $$Lambda$qlkDu6Wm6tOQ7c3sr8jn37mJEBA(tej));
        tej.a((b) new $$Lambda$eqhI2r9dcncm26vBx6ROB4474Js(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tej tej, c cVar) {
        this.l = null;
        tej.a();
        tej.a((b) null);
    }

    /* access modifiers changed from: private */
    public void a(ter ter) {
        tej tej = (tej) fbp.a(this.j);
        ter.a(new $$Lambda$teh$CPe0g0wutLtrNrgR5DjnJFwjhFA(this, tej), new $$Lambda$teh$a76jHFw566fStqiw4AsOwW7JIA(this, tej), new $$Lambda$teh$jgLY_Ybk7rwgWHyeqGTC2IcLA(this, tej));
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        LyricsLogger lyricsLogger = this.b;
        lyricsLogger.b.a(lyricsLogger.a(), "user-saw-150-characters", "card", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    public final void a(tej tej) {
        this.j = (tej) fbp.a(tej);
        tej.a((a) new $$Lambda$V4S8l1sIfrR6J561Ke5UMyoHHc(this));
        tej.a((svl) new $$Lambda$LZErV0rSZOYcT_bgD7hWC4ozA0(this));
        Disposable a2 = this.g.a((Function<? super T, K>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).h(new $$Lambda$teh$4XwfDaNJ0JmbnbZi2yGa8NZRchY(this)).a(this.i).a((Consumer<? super T>) new $$Lambda$teh$jbvUbkJjEBwtdbsFGi6m4tbqN38<Object>(this), (Consumer<? super Throwable>) $$Lambda$teh$8ijJQFxINfrnUlI0qtI27SpdYA.INSTANCE);
        Observable a3 = this.h.a(this.i);
        tej.getClass();
        Disposable a4 = a3.a((Consumer<? super T>) new $$Lambda$HCfyz8nZNkvrlruNwZ5suPXs6o<Object>(tej), (Consumer<? super Throwable>) $$Lambda$teh$CcVUfJWJt7PZB09eOS1EYuy7dRQ.INSTANCE);
        this.a.a(a2, a4);
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        tej tej = this.j;
        if (tej == null || !z || this.l == null) {
            if (tej != null && !z) {
                tej.a((b) null);
            }
            return;
        }
        tej.a((b) new $$Lambda$eqhI2r9dcncm26vBx6ROB4474Js(this));
        tej.a((svl) new $$Lambda$LZErV0rSZOYcT_bgD7hWC4ozA0(this));
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        tej tej = this.j;
        if (tej != null) {
            tej.a((b) null);
            this.j.a((svl) null);
        }
        LyricsLogger lyricsLogger = this.b;
        UserIntent userIntent = UserIntent.SHOW_FULLSCREEN;
        String str = "com.spotify.feature.lyrics";
        lyricsLogger.a.a(lyricsLogger.a(), LyricsMode.CARD.toString(), str, (String) null, -1, InteractionType.HIT, userIntent.toString());
        Bundle a2 = ((tej) fbp.a(this.j)).a(this.f);
        if (a2 != null) {
            sva.a(a2, this.k).a(this.e, "lyrics_fullscreen_dialog_fragment");
        } else {
            Assertion.b("Trying to navigate to fullscreen mode with null lyrics or colors");
        }
    }
}
