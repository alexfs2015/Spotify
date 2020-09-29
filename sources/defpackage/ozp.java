package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.podcasttrailer.v1.proto.PodcastTrailerResponse;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ozp reason: default package */
public final class ozp extends c {
    public final defpackage.tlw.a a;
    public final boolean b;
    private final vti<a> c;
    private final SerialDisposable d = new SerialDisposable();
    private final ozr e;
    private final Scheduler f;
    private final String g;
    private final tmy h;
    private final Resources i;
    private final ozn j;
    private final ImpressionLogger k;
    private final InteractionLogger l;

    /* renamed from: ozp$a */
    public interface a {
        void g();
    }

    public ozp(vti<a> vti, ozr ozr, Scheduler scheduler, String str, defpackage.tlw.a aVar, boolean z, tmy tmy, Resources resources, ozn ozn, ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.c = vti;
        this.e = ozr;
        this.f = scheduler;
        this.g = str;
        this.a = aVar;
        this.b = z;
        this.h = tmy;
        this.i = resources;
        this.j = ozn;
        this.k = impressionLogger;
        this.l = interactionLogger;
    }

    public final void c() {
        if (this.b) {
            this.d.a(this.e.a(this.g).f($$Lambda$ozp$AZuwvKuJwzmHTMrUXCWGuCijpM.INSTANCE).a(this.f).a((Consumer<? super T>) new $$Lambda$ozp$U7WtiIu9dspNDw4L9a65G6oP0s<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ozp$kfiR9nl6piMnUdBmNaEfCHBQyVo<Object>(this)));
            ozn ozn = this.j;
            ozn.a.registerPlayerStateObserver(ozn);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        d();
    }

    public final void a() {
        this.d.a(Disposables.a());
        ozn ozn = this.j;
        ozn.b.c();
        ozn.a.unregisterPlayerStateObserver(ozn);
    }

    private void d() {
        this.a.g = false;
        ((a) this.c.get()).g();
    }

    /* access modifiers changed from: private */
    public void a(PodcastTrailerResponse podcastTrailerResponse) {
        if (podcastTrailerResponse.d.isEmpty()) {
            d();
            return;
        }
        ozn ozn = this.j;
        PlayerTrack create = PlayerTrack.create(podcastTrailerResponse.d, ImmutableMap.a("media.type", "audio", "media.start_position", Ad.DEFAULT_SKIPPABLE_AD_DELAY));
        if (!create.equals(ozn.c)) {
            ozn.c = create;
            PlayerState lastPlayerState = ozn.a.getLastPlayerState();
            if (lastPlayerState != null) {
                ozn.onPlayerStateReceived(lastPlayerState);
            }
        }
        defpackage.tlw.a aVar = this.a;
        aVar.g = true;
        aVar.b = podcastTrailerResponse.e;
        this.a.c = this.h.a(this.i.getString(R.string.show_trailer), 0, podcastTrailerResponse.g / 1000, null, false).e(true).a();
        this.a.d = podcastTrailerResponse.h;
        this.a.e = podcastTrailerResponse.f;
        defpackage.tlw.a aVar2 = this.a;
        aVar2.a = new $$Lambda$ozp$cJp5h0rYPeOlg2JUcXnm1R8ymx4(this, podcastTrailerResponse);
        aVar2.f = new $$Lambda$ozp$nuM3lUeRWmS9Rl9p0Tn1_fwsymk(this, podcastTrailerResponse);
        ((a) this.c.get()).g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PodcastTrailerResponse podcastTrailerResponse) {
        this.k.a(podcastTrailerResponse.d, "podcast-trailer", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PodcastTrailerResponse podcastTrailerResponse, View view) {
        this.l.a(podcastTrailerResponse.d, "podcast-trailer", -1, InteractionType.HIT, "toggle-trailer-playback");
        this.j.a();
    }
}
