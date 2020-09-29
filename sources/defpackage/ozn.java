package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayTrackQueueUtils;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ozn reason: default package */
public final class ozn implements PlayerStateObserver, b {
    final Player a;
    final CompositeDisposable b = new CompositeDisposable();
    PlayerTrack c;
    private final String d;
    private final QueueManager e;
    private final Scheduler f;
    private final Scheduler g;
    private final jrp h;
    private final PlayerQueueUtil i = new PlayerQueueUtil();
    private final BehaviorSubject<tsj> j = BehaviorSubject.a(tsj.a);
    private PlayerTrack k;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public ozn(String str, QueueManager queueManager, Player player, Scheduler scheduler, Scheduler scheduler2, jrp jrp) {
        this.d = str;
        this.e = queueManager;
        this.a = player;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = jrp;
    }

    public final void a() {
        Optional optional;
        Optional optional2;
        PlayerTrack playerTrack = this.c;
        if (playerTrack != null) {
            PlayerState lastPlayerState = this.a.getLastPlayerState();
            if (lastPlayerState == null || !lastPlayerState.isPlaying() || lastPlayerState.contextUri().isEmpty()) {
                optional = Optional.b(PlayerContext.create(this.d, new PlayerTrack[]{playerTrack}));
            } else {
                optional = Optional.e();
            }
            PlayerTrack playerTrack2 = null;
            if (optional.b()) {
                this.a.play((PlayerContext) optional.c(), new Builder().suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null).build());
                return;
            }
            if (lastPlayerState != null) {
                playerTrack2 = lastPlayerState.track();
            }
            if (playerTrack2 == null) {
                optional2 = Optional.e();
            } else {
                long currentPlaybackPosition = lastPlayerState.currentPlaybackPosition();
                String valueOf = currentPlaybackPosition > -1 ? String.valueOf(currentPlaybackPosition) : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
                HashMap hashMap = new HashMap(playerTrack2.metadata());
                String str = "media.start_position";
                hashMap.remove(str);
                hashMap.put(str, valueOf);
                optional2 = Optional.b(PlayerTrack.create(playerTrack2.uri(), playerTrack2.uid(), null, null, playerTrack2.provider(), ImmutableMap.a((Map<? extends K, ? extends V>) hashMap)));
            }
            if (((Boolean) optional2.a((Function<? super T, V>) new $$Lambda$ozn$pM71JhzAM1Rculvs0MB8keyYi2A<Object,V>(playerTrack)).a(Boolean.FALSE)).booleanValue()) {
                if (lastPlayerState == null || !lastPlayerState.isPaused()) {
                    this.a.skipToNextTrack(true);
                    this.a.pause();
                    return;
                }
                this.a.resume();
            } else if (lastPlayerState == null || lastPlayerState.future().length <= 0 || !lastPlayerState.future()[0].uri().equals(playerTrack.uri())) {
                this.b.a(this.e.getQueue().c(1).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$ozn$wCIGtE9YeBVOQPbpBsmdwbwas<Object,Object>(this, playerTrack, optional2)).a((io.reactivex.functions.Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ozn$QcW0DatTaZDTWyxZsEZzfgqva4<Object,Object>(this), false).h().d().b(this.f).a(this.g).a((Consumer<? super T>) new $$Lambda$ozn$7Kn_NIst5doNmkL8lOJOorVKrK4<Object>(this, optional2), (Consumer<? super Throwable>) $$Lambda$ozn$1ado1WgTudumt2bLmj7D_11I3g.INSTANCE));
            } else {
                this.a.skipToNextTrack(true);
                this.a.resume();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(PlayerQueue playerQueue) {
        return this.e.setQueue(playerQueue, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional, Response response) {
        this.k = (PlayerTrack) optional.d();
        this.a.skipToNextTrack(true);
        this.a.resume();
    }

    public final Observable<tsj> b() {
        return this.j.a((BiPredicate<? super T, ? super T>) $$Lambda$RBiqacgdUl8Orr6ukXBzt0M5p0.INSTANCE);
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        PlayerTrack playerTrack = this.c;
        if (playerTrack != null) {
            PlayerTrack track = playerState.track();
            if (track == null || !faw.a(track.uri(), playerTrack.uri())) {
                this.j.onNext(tsj.a);
            } else if (!playerState.isPlaying() || playerState.isPaused()) {
                this.j.onNext(tsj.a);
            } else {
                PlayerTrack playerTrack2 = this.k;
                if (playerTrack2 != null) {
                    this.k = null;
                    this.b.a(this.e.getQueue().c(1).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$ozn$2HvQxXkOJPQPuBhEiJgJ2GNledk<Object,Object>(playerTrack2)).a((io.reactivex.functions.Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ozn$G1KR_9_1BPEJzKrLgNXyAE5kctc<Object,Object>(this), false).h().d().b(this.f).a(this.g).a((Consumer<? super T>) $$Lambda$ozn$ezPBqnyL6PETOslRY2G00u7ilZc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ozn$SNrhnzRENy4Wqp8p60SDkdtImOI.INSTANCE));
                }
                this.j.onNext(tsj.e().b(Long.valueOf(playerState.duration())).a(Long.valueOf(playerState.currentPlaybackPosition())).c(Long.valueOf(this.h.d())).a());
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(PlayerQueue playerQueue) {
        return this.e.setQueue(playerQueue, true).c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$ozn$4S9jaTjb4bv6vUHroX8Vgsd36JU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Optional optional) {
        return (Observable) optional.a((Function<? super T, V>) new $$Lambda$ozn$kEQ1FDSh31TjTnlUP6WfodRZkMw<Object,V>(this)).a(Observable.b(Boolean.TRUE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(PlayerTrack playerTrack, PlayerQueue playerQueue) {
        PlayerTrack[] prevTracks;
        LinkedHashMap linkedHashMap = new LinkedHashMap(playerQueue.prevTracks().length);
        for (PlayerTrack playerTrack2 : playerQueue.prevTracks()) {
            linkedHashMap.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack2), playerTrack2);
        }
        if (((PlayerTrack) linkedHashMap.remove(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack))) != null) {
            return Optional.b(new PlayerQueue(playerQueue.revision(), playerQueue.track(), playerQueue.nextTracks(), (PlayerTrack[]) linkedHashMap.values().toArray(new PlayerTrack[0])));
        }
        return Optional.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerQueue a(PlayerTrack playerTrack, Optional optional, PlayerQueue playerQueue) {
        a g2 = ImmutableList.g();
        g2.c(this.i.queuedExplicitly(playerTrack, true));
        if (optional.b()) {
            g2.c(optional.c());
        }
        g2.b((E[]) playerQueue.nextTracks());
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) g2.a().toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }
}
