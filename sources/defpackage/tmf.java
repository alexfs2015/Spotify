package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: tmf reason: default package */
public final class tmf {
    private final Flowable<PlayerState> a;
    private final tmo b;

    public tmf(Flowable<PlayerState> flowable, tmo tmo) {
        this.a = flowable;
        this.b = tmo;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }

    public final Flowable<tmm> a() {
        Flowable a2 = this.a.a((Predicate<? super T>) $$Lambda$tmf$geonNO_2dQ9dr5y9YQQ1b34aCW0.INSTANCE).a((Function<? super T, K>) $$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM.INSTANCE);
        tmo tmo = this.b;
        tmo.getClass();
        return a2.c((Function<? super T, ? extends R>) new $$Lambda$CZFzmegB5cK9idMd95H39qYzpCE<Object,Object>(tmo));
    }
}
