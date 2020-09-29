package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: tby reason: default package */
public final class tby {
    private final Flowable<PlayerState> a;
    private final tch b;

    public tby(Flowable<PlayerState> flowable, tch tch) {
        this.a = flowable;
        this.b = tch;
    }

    public final Flowable<tcf> a() {
        Flowable a2 = this.a.a((Predicate<? super T>) $$Lambda$tby$26t9ofHXuG64V9WLnrrwQQgHSg4.INSTANCE).a((Function<? super T, K>) $$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg.INSTANCE);
        tch tch = this.b;
        tch.getClass();
        return a2.c((Function<? super T, ? extends R>) new $$Lambda$ozfd6_VfFXaE46PTnbA2yyoHZH0<Object,Object>(tch));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }
}
