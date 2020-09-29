package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: oeh reason: default package */
public final class oeh {
    /* access modifiers changed from: private */
    public static Accessory a(ContextTrack contextTrack) {
        return "video".equalsIgnoreCase((String) contextTrack.metadata().get("media.type")) ? Accessory.VIDEO : Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add")) ? Accessory.HEART : Accessory.CHEVRON;
    }

    private static Observable<odq> a(Observable<PlayerState> observable) {
        return observable.a((Predicate<? super T>) $$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$3Dwly2MzoQe6u5QtBQ8v7LocwSA.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$4OQpgc1bdJmmaj6ZNMzo1rDfnI.INSTANCE).a((Function<? super T, K>) $$Lambda$sdeaFPy7G2HStpVk7G6uFuRrGHs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$oeh$DyrNFCDVSDhgGqupozLaNUV6YeA.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$h2OvH9dOyyuJGVVD_zk9nYFNAcc.INSTANCE);
    }

    private static Observable<odq> a(Observable<PlayerState> observable, wzi<Long> wzi) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$oeh$dO3wG1BcwfS3wUQSV1x5gQJr8<Object,Object>(wzi)).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$zDi4Ki6KERa6wrdR5LE0mLFFz4.INSTANCE);
    }

    private static Observable<odq> a(Observable<gud> observable, boolean z) {
        return z ? Observable.b(gud.a).c((Function<? super T, ? extends R>) $$Lambda$XaubFIDus_jL8494IYzDLjskpcw.INSTANCE) : observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$XaubFIDus_jL8494IYzDLjskpcw.INSTANCE);
    }

    public static kmv<odq> a(Flowable<PlayerState> flowable, Observable<gud> observable, Observable<uns> observable2, wzi<Long> wzi, boolean z) {
        return koj.a(a(flowable.j(), wzi), a(flowable.j()), a(observable, z), b(observable2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ oec a(wzi wzi, PlayerState playerState) {
        Optional track = playerState.track();
        if (!track.b() || ((ContextTrack) track.c()).metadata().get("title") == null) {
            return new a();
        }
        String contextUri = playerState.contextUri();
        ImmutableList prevTracks = playerState.prevTracks();
        Optional b = !prevTracks.isEmpty() ? Optional.b(oee.a((ContextTrack) prevTracks.get(prevTracks.size() - 1))) : Optional.e();
        Track a = oee.a((ContextTrack) track.c());
        ImmutableList nextTracks = playerState.nextTracks();
        odz odz = new odz(b, a, !nextTracks.isEmpty() ? Optional.b(oee.a((ContextTrack) nextTracks.get(0))) : Optional.e());
        oeb a2 = oeb.e().a(!playerState.isPaused()).a(((Long) playerState.duration().a(Long.valueOf(0))).longValue()).b(((Long) playerState.position(((Long) wzi.get()).longValue()).a(Long.valueOf(0))).longValue()).a(((Double) playerState.playbackSpeed().a(Double.valueOf(0.0d))).floatValue()).a();
        Restrictions restrictions = playerState.restrictions();
        return new b(contextUri, odz, a2, oed.h().a(!restrictions.disallowResumingReasons().isEmpty()).b(!restrictions.disallowPausingReasons().isEmpty()).c(!restrictions.disallowSkippingNextReasons().isEmpty()).d(!restrictions.disallowSkippingPrevReasons().isEmpty()).e(!restrictions.disallowPeekingNextReasons().isEmpty()).f(!restrictions.disallowPeekingPrevReasons().isEmpty()).g(!restrictions.disallowTransferringPlaybackReasons().isEmpty()).a());
    }

    private static Observable<odq> b(Observable<uns> observable) {
        return observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$CavuIKwLMIo7Y_zNzdiZkNLIvoM.INSTANCE);
    }
}
