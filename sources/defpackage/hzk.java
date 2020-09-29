package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: hzk reason: default package */
public final class hzk {
    private final QueueManager a;
    private final Player b;
    private final hec c;
    private final SlotApi d;
    private final spi e;
    private final Scheduler f;
    private final Scheduler g;
    private final CompositeDisposable h = new CompositeDisposable();

    public hzk(QueueManager queueManager, Player player, hec hec, SlotApi slotApi, spi spi, Scheduler scheduler, Scheduler scheduler2) {
        this.a = queueManager;
        this.b = player;
        this.c = hec;
        this.d = slotApi;
        this.e = spi;
        this.f = scheduler;
        this.g = scheduler2;
    }

    public final void a(PlayerTrack playerTrack) {
        this.h.a(this.d.a(AdSlot.STREAM.toString(), Intent.CLEAR).a((Action) new $$Lambda$hzk$lk6J3SVh51bSnz0YydXvvATtPMo(this, playerTrack), (Consumer<? super Throwable>) new $$Lambda$hzk$O1SyHbz2JxIB_KYWdn29XrrDbI<Object>(this, playerTrack)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(PlayerTrack playerTrack) {
        Logger.b("Stream adslot cleared", new Object[0]);
        b(playerTrack);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, Throwable th) {
        Logger.b("Request to disable stream ad slot failed", new Object[0]);
        b(playerTrack);
    }

    private void b(PlayerTrack playerTrack) {
        this.h.a(this.c.a(hwb.g).c(1).j().h(new $$Lambda$hzk$xhZaTU18nPY4LmAgGnRw0R4jVJU(this, playerTrack)).b(this.f).a(this.g).a((Consumer<? super T>) new $$Lambda$hzk$8LX31iPlEJT7BOHv24YoK_U489o<Object>(this), (Consumer<? super Throwable>) new $$Lambda$hzk$MDTpB81fWi7p_r4S2pVdhdBZeuU<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PlayerTrack playerTrack, Boolean bool) {
        if (bool.booleanValue()) {
            return this.a.addToQueue(playerTrack, true).h().d();
        }
        this.e.a(spd.a(playerTrack.uri()).a());
        Builder suppressions = new Builder().suppressions(PlayerProviders.ADS, PlayerProviders.MFT);
        Boolean bool2 = Boolean.FALSE;
        PlayOptions build = suppressions.playerOptionsOverride(bool2, bool2, Boolean.FALSE).build();
        this.b.play(PlayerContext.create(playerTrack.uri(), new PlayerTrack[]{playerTrack}), build);
        this.b.skipToNextTrack(true);
        return Observable.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Response response) {
        this.b.skipToNextTrack(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.b(th.getMessage(), new Object[0]);
        this.b.skipToNextTrack(true);
    }
}
