package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: jfd reason: default package */
public final class jfd {
    private final hec a;

    jfd(hec hec) {
        this.a = hec;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RolloutFlag a(fpt fpt) {
        return (RolloutFlag) fpt.a(jdx.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(RolloutFlag rolloutFlag) {
        return Boolean.valueOf(RolloutFlag.ENABLED == rolloutFlag);
    }

    public final Observable<jet> a() {
        return this.a.a().j().c((Function<? super T, ? extends R>) $$Lambda$jfd$bBcfKFdeDWYJwm_leAdupWTEmo.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$jfd$jJpy4nHel7bkAWQwbFMzAWB50k.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$4Q3dQ4UjFTw1XoapgAqTbQK7SEE.INSTANCE);
    }
}
