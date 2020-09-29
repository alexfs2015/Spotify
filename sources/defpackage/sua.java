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

/* renamed from: sua reason: default package */
public final class sua {
    final CompositeDisposable a = new CompositeDisposable();
    private final LyricsLogger b;
    private final skp c;
    private final sud d;
    private final kf e;
    private final Display f;
    private final Observable<PlayerTrack> g;
    private final Observable<Long> h;
    private final Scheduler i;
    private suc j;
    private final fpt k;
    private LyricsColorsModel l;

    sua(Flowable<PlayerTrack> flowable, Flowable<Long> flowable2, Scheduler scheduler, LyricsLogger lyricsLogger, skp skp, sud sud, kf kfVar, Display display, fpt fpt) {
        this.g = flowable.j();
        this.h = flowable2.j();
        this.i = scheduler;
        this.b = lyricsLogger;
        this.c = skp;
        this.d = sud;
        this.e = kfVar;
        this.f = display;
        this.k = fpt;
    }

    public final void a(suc suc) {
        this.j = (suc) fay.a(suc);
        suc.a((a) new $$Lambda$H7aMCEbpiSCX_KerwsxODBGI7E(this));
        suc.a((sle) new $$Lambda$DxZoDzEqg6FFv1Jv3e7WoYIKw(this));
        Disposable a2 = this.g.a((Function<? super T, K>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).h(new $$Lambda$sua$qb59FfP8lcuCN6ysytleAwRWuY(this)).a(this.i).a((Consumer<? super T>) new $$Lambda$sua$VswiT6TDWYLOpJO7nnJzBs2n5aY<Object>(this), (Consumer<? super Throwable>) $$Lambda$sua$aIcZscaIvBgoQEuhCI67Mw6Wo.INSTANCE);
        Observable a3 = this.h.a(this.i);
        suc.getClass();
        Disposable a4 = a3.a((Consumer<? super T>) new $$Lambda$216bwBVj2Sc8gufCXpNUssZeePo<Object>(suc), (Consumer<? super Throwable>) $$Lambda$sua$Xb8yacAvZ93bbfOQViRfQNw6IFY.INSTANCE);
        this.a.a(a2, a4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PlayerTrack playerTrack) {
        Observable observable;
        skp skp = this.c;
        String uri = playerTrack.uri();
        String uri2 = ivs.a(playerTrack).toString();
        if (uri2 == null || uri2.isEmpty()) {
            observable = skp.a.a(jst.a(uri).f()).d();
        } else {
            observable = skp.a.a(jst.a(uri).f(), gbm.a(uri2, far.c)).d();
        }
        return observable.c((Function<? super T, ? extends R>) $$Lambda$bDNMgKBQC7V5hZlaCY2U9j3bz2w.INSTANCE).e(new c()).e((Function<? super Throwable, ? extends T>) $$Lambda$sua$yJWutU_PsNxoxuU8UEMPDmq5ce0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void a(suk suk) {
        suc suc = (suc) fay.a(this.j);
        suk.a(new $$Lambda$sua$StROAn6mpVIqPVxFXe3RVSZP74Q(this, suc), new $$Lambda$sua$HzUh2qo2BWxw_aHtk8QNaj3rmF8(this, suc), new $$Lambda$sua$FxBYWuuK9wunOmBed5sXdohHn7I(this, suc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(suc suc, c cVar) {
        this.l = null;
        suc.a();
        suc.a((b) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(suc suc, a aVar) {
        this.l = null;
        suc.b();
        sud sud = this.d;
        suc.getClass();
        sud.a(-6579301, new $$Lambda$o7c_f15aWWxRoO51q7v4jDJc5JU(suc));
        suc.a((b) null);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        LyricsLogger lyricsLogger = this.b;
        lyricsLogger.b.a(lyricsLogger.a(), "user-saw-150-characters", "card", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        suc suc = this.j;
        if (suc != null) {
            suc.a((b) null);
            this.j.a((sle) null);
        }
        LyricsLogger lyricsLogger = this.b;
        UserIntent userIntent = UserIntent.SHOW_FULLSCREEN;
        String str = "com.spotify.feature.lyrics";
        lyricsLogger.a.a(lyricsLogger.a(), LyricsMode.CARD.toString(), str, (String) null, -1, InteractionType.HIT, userIntent.toString());
        Bundle a2 = ((suc) fay.a(this.j)).a(this.f);
        if (a2 != null) {
            skt.a(a2, this.k).a(this.e, "lyrics_fullscreen_dialog_fragment");
        } else {
            Assertion.b("Trying to navigate to fullscreen mode with null lyrics or colors");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        suc suc = this.j;
        if (suc == null || !z || this.l == null) {
            if (suc != null && !z) {
                suc.a((b) null);
            }
            return;
        }
        suc.a((b) new $$Lambda$pCZRNdLBkU4161lcbGD1zoEFM(this));
        suc.a((sle) new $$Lambda$DxZoDzEqg6FFv1Jv3e7WoYIKw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(suc suc, b bVar) {
        this.l = bVar.a;
        slf colors = this.l.getColors();
        suc.a(this.l.getTrackLyrics());
        suc.a(colors);
        suc.a(colors.b, colors.c);
        sud sud = this.d;
        int i2 = colors.a;
        suc.getClass();
        sud.a(i2, new $$Lambda$o7c_f15aWWxRoO51q7v4jDJc5JU(suc));
        suc.a((b) new $$Lambda$pCZRNdLBkU4161lcbGD1zoEFM(this));
    }
}
