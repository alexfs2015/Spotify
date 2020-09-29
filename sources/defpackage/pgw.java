package defpackage;

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
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: pgw reason: default package */
public final class pgw implements PlayerStateObserver, b {
    final Player a;
    final CompositeDisposable b = new CompositeDisposable();
    PlayerTrack c;
    private final String d;
    private final QueueManager e;
    private final Scheduler f;
    private final Scheduler g;
    private final jtz h;
    private final PlayerQueueUtil i = new PlayerQueueUtil();
    private final BehaviorSubject<uem> j = BehaviorSubject.a(uem.a);
    private PlayerTrack k;

    public pgw(String str, QueueManager queueManager, Player player, Scheduler scheduler, Scheduler scheduler2, jtz jtz) {
        this.d = str;
        this.e = queueManager;
        this.a = player;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = jtz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(PlayerTrack playerTrack, PlayerQueue playerQueue) {
        PlayerTrack[] prevTracks;
        LinkedHashMap linkedHashMap = new LinkedHashMap(playerQueue.prevTracks().length);
        for (PlayerTrack playerTrack2 : playerQueue.prevTracks()) {
            linkedHashMap.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack2), playerTrack2);
        }
        return ((PlayerTrack) linkedHashMap.remove(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack))) != null ? Optional.b(new PlayerQueue(playerQueue.revision(), playerQueue.track(), playerQueue.nextTracks(), (PlayerTrack[]) linkedHashMap.values().toArray(new PlayerTrack[0]))) : Optional.e();
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

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(PlayerQueue playerQueue) {
        return this.e.setQueue(playerQueue, true).c((Function<? super T, ? extends R>) $$Lambda$pgw$A2jgvOjTDKWv10o5Ckty274qic.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Optional optional) {
        return (Observable) optional.a((com.google.common.base.Function<? super T, V>) new $$Lambda$pgw$uEnA4jFLziY4WhmDyPo_A7UXldU<Object,V>(this)).a(Observable.b(Boolean.TRUE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional, Response response) {
        this.k = (PlayerTrack) optional.d();
        this.a.skipToNextTrack(true);
        this.a.resume();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(PlayerQueue playerQueue) {
        return this.e.setQueue(playerQueue, true);
    }

    public final void a() {
        Optional optional;
        PlayerTrack playerTrack = this.c;
        if (playerTrack != null) {
            PlayerState lastPlayerState = this.a.getLastPlayerState();
            Optional b2 = (lastPlayerState == null || !lastPlayerState.isPlaying() || lastPlayerState.contextUri().isEmpty()) ? Optional.b(PlayerContext.create(this.d, new PlayerTrack[]{playerTrack})) : Optional.e();
            PlayerTrack playerTrack2 = null;
            if (b2.b()) {
                this.a.play((PlayerContext) b2.c(), new Builder().suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null).build());
                return;
            }
            if (lastPlayerState != null) {
                playerTrack2 = lastPlayerState.track();
            }
            if (playerTrack2 == null) {
                optional = Optional.e();
            } else {
                long currentPlaybackPosition = lastPlayerState.currentPlaybackPosition();
                String valueOf = currentPlaybackPosition > -1 ? String.valueOf(currentPlaybackPosition) : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
                HashMap hashMap = new HashMap(playerTrack2.metadata());
                String str = "media.start_position";
                hashMap.remove(str);
                hashMap.put(str, valueOf);
                optional = Optional.b(PlayerTrack.create(playerTrack2.uri(), playerTrack2.uid(), null, null, playerTrack2.provider(), ImmutableMap.a((Map<? extends K, ? extends V>) hashMap)));
            }
            if (((Boolean) optional.a((com.google.common.base.Function<? super T, V>) new $$Lambda$pgw$37ztkIzB0wL6Qx6CoBDgYsoDjXs<Object,V>(playerTrack)).a(Boolean.FALSE)).booleanValue()) {
                if (lastPlayerState == null || !lastPlayerState.isPaused()) {
                    this.a.skipToNextTrack(true);
                    this.a.pause();
                    return;
                }
                this.a.resume();
            } else if (lastPlayerState == null || lastPlayerState.future().length <= 0 || !lastPlayerState.future()[0].uri().equals(playerTrack.uri())) {
                this.b.a(this.e.getQueue().c(1).c((Function<? super T, ? extends R>) new $$Lambda$pgw$9fI9epy9a4UFKp9W5e3thR6Q2fA<Object,Object>(this, playerTrack, optional)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pgw$3PeCW4HzkFwRmKhjkDZGlnzA4M<Object,Object>(this), false).h().d().b(this.f).a(this.g).a((Consumer<? super T>) new $$Lambda$pgw$Z3KCElkj6hN9bZGa7II1WCK6v8<Object>(this, optional), (Consumer<? super Throwable>) $$Lambda$pgw$BLs3he9HUGiq8FFhERgYisiJOf4.INSTANCE));
            } else {
                this.a.skipToNextTrack(true);
                this.a.resume();
            }
        }
    }

    public final Observable<uem> b() {
        return this.j.a((BiPredicate<? super T, ? super T>) $$Lambda$LusWzhfWiqajB8V_0INBxHNwLgs.INSTANCE);
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        PlayerTrack playerTrack = this.c;
        if (playerTrack != null) {
            PlayerTrack track = playerState.track();
            if (track == null || !fbn.a(track.uri(), playerTrack.uri())) {
                this.j.onNext(uem.a);
            } else if (!playerState.isPlaying() || playerState.isPaused()) {
                this.j.onNext(uem.a);
            } else {
                PlayerTrack playerTrack2 = this.k;
                if (playerTrack2 != null) {
                    this.k = null;
                    this.b.a(this.e.getQueue().c(1).c((Function<? super T, ? extends R>) new $$Lambda$pgw$1xoc9GzlA4X9oWxD_YTlQCjO9s<Object,Object>(playerTrack2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pgw$M28eHeTfZaUYGRTSkdIxDKW0nY<Object,Object>(this), false).h().d().b(this.f).a(this.g).a((Consumer<? super T>) $$Lambda$pgw$eEUDZyHdjx5d6J0HmXIPTK0SLs4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pgw$D7fCPgKYC4d2gIT5wDHihg17q8.INSTANCE));
                }
                this.j.onNext(uem.e().b(Long.valueOf(playerState.duration())).a(Long.valueOf(playerState.currentPlaybackPosition())).c(Long.valueOf(this.h.d())).a());
            }
        }
    }
}
