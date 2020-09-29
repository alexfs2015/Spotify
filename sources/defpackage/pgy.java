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

/* renamed from: pgy reason: default package */
public final class pgy extends c {
    public final defpackage.txi.a a;
    public final boolean b;
    private final who<a> c;
    private final SerialDisposable d = new SerialDisposable();
    private final pha e;
    private final Scheduler f;
    private final String g;
    private final tyx h;
    private final Resources i;
    private final pgw j;
    private final ImpressionLogger k;
    private final InteractionLogger l;

    /* renamed from: pgy$a */
    public interface a {
        void g();
    }

    public pgy(who<a> who, pha pha, Scheduler scheduler, String str, defpackage.txi.a aVar, boolean z, tyx tyx, Resources resources, pgw pgw, ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.c = who;
        this.e = pha;
        this.f = scheduler;
        this.g = str;
        this.a = aVar;
        this.b = z;
        this.h = tyx;
        this.i = resources;
        this.j = pgw;
        this.k = impressionLogger;
        this.l = interactionLogger;
    }

    /* access modifiers changed from: private */
    public void a(PodcastTrailerResponse podcastTrailerResponse) {
        if (podcastTrailerResponse.d.isEmpty()) {
            d();
            return;
        }
        pgw pgw = this.j;
        PlayerTrack create = PlayerTrack.create(podcastTrailerResponse.d, ImmutableMap.a("media.type", "audio", "media.start_position", Ad.DEFAULT_SKIPPABLE_AD_DELAY));
        if (!create.equals(pgw.c)) {
            pgw.c = create;
            PlayerState lastPlayerState = pgw.a.getLastPlayerState();
            if (lastPlayerState != null) {
                pgw.onPlayerStateReceived(lastPlayerState);
            }
        }
        defpackage.txi.a aVar = this.a;
        aVar.g = true;
        aVar.b = podcastTrailerResponse.e;
        this.a.c = this.h.a(this.i.getString(R.string.show_trailer), 0, podcastTrailerResponse.g / 1000, null, false).e(true).a();
        this.a.d = podcastTrailerResponse.h;
        this.a.e = podcastTrailerResponse.f;
        defpackage.txi.a aVar2 = this.a;
        aVar2.a = new $$Lambda$pgy$8v0x4i8wxfG2HhUHzkMHBJZJzs(this, podcastTrailerResponse);
        aVar2.f = new $$Lambda$pgy$x9z7QKlwnCIBS9l4oOM9yC9M78Y(this, podcastTrailerResponse);
        ((a) this.c.get()).g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PodcastTrailerResponse podcastTrailerResponse, View view) {
        this.l.a(podcastTrailerResponse.d, "podcast-trailer", -1, InteractionType.HIT, "toggle-trailer-playback");
        this.j.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PodcastTrailerResponse podcastTrailerResponse) {
        this.k.a(podcastTrailerResponse.d, "podcast-trailer", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    private void d() {
        this.a.g = false;
        ((a) this.c.get()).g();
    }

    public final void a() {
        this.d.a(Disposables.a());
        pgw pgw = this.j;
        pgw.b.c();
        pgw.a.unregisterPlayerStateObserver(pgw);
    }

    public final void c() {
        if (this.b) {
            this.d.a(this.e.a(this.g).f($$Lambda$pgy$OnLR0Oiehnp0K09hBP6CknjEg7c.INSTANCE).a(this.f).a((Consumer<? super T>) new $$Lambda$pgy$DfJec00cbcTnFsOJHueVoA8lsfA<Object>(this), (Consumer<? super Throwable>) new $$Lambda$pgy$ZuinISnpz5JN7O2v6_P6UUp1bo<Object>(this)));
            pgw pgw = this.j;
            pgw.a.registerPlayerStateObserver(pgw);
        }
    }
}
