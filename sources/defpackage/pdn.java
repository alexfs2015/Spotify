package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: pdn reason: default package */
public final class pdn {
    private final Flowable<PlayerState> a;

    public pdn(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    public final Observable<pdm> a() {
        return this.a.c((Function<? super T, ? extends R>) $$Lambda$ear1qrCweutyZwVcdQje87BE_d0.INSTANCE).a(Functions.a()).j();
    }
}
