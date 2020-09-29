package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: nxu reason: default package */
public final class nxu {
    public static kjm<nxd> a(Flowable<PlayerState> flowable, Observable<gsd> observable, Observable<uax> observable2, boolean z) {
        return kla.a(a(flowable.j()), b(flowable.j()), a(observable, z), c(observable2));
    }

    private static Observable<nxd> a(Observable<PlayerState> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$eVYYDpPtadKLeZckDdj0RnmRgf8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$faDNEkZOzBRPDfgydAq57rCtIZE.INSTANCE);
    }

    private static Observable<nxd> b(Observable<PlayerState> observable) {
        return observable.a((Predicate<? super T>) $$Lambda$nxu$Q6kLxZodRUYWOIDTPH9e1wpiX18.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a((Function<? super T, K>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$nxu$ZHsuWtozNBnnpsCQXICijQvKa7w.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$r6js3i12g6OKgeat1AIOH6Ugdw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return !PlayerStateUtil.isInLoadingState(playerState) && playerState.track() != null;
    }

    private static Observable<nxd> a(Observable<gsd> observable, boolean z) {
        if (z) {
            return Observable.b(gsd.a).c((Function<? super T, ? extends R>) $$Lambda$Ih2t47K1iOwk2FT6rUqx7aa0nE.INSTANCE);
        }
        return observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$Ih2t47K1iOwk2FT6rUqx7aa0nE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static Accessory a(PlayerTrack playerTrack) {
        if (PlayerTrackUtil.isVideo(playerTrack)) {
            return Accessory.VIDEO;
        }
        if (Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_add"))) {
            return Accessory.HEART;
        }
        return Accessory.CHEVRON;
    }

    private static Observable<nxd> c(Observable<uax> observable) {
        return observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$k23uoVim71yqy583bVrKCUjTO4.INSTANCE);
    }
}
