package defpackage;

import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.functions.Functions;

/* renamed from: tvg reason: default package */
public final class tvg implements viy {
    private final vix a;
    private final Observable<Boolean> b;

    public tvg(vix vix, Observable<Boolean> observable) {
        this.a = vix;
        this.b = observable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return bool.booleanValue() ? this.a.b() : Observable.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(int i, int i2, Boolean bool) {
        return bool.booleanValue() ? this.a.a(i, i2) : Flowable.d();
    }

    public final Flowable<PlayerState> a() {
        return a(2, 2);
    }

    public final Flowable<PlayerState> a(int i, int i2) {
        return this.b.a(Functions.a()).a(BackpressureStrategy.LATEST).e(new $$Lambda$tvg$HKVPxSPprwI5zHyRDVz9NTGAdo(this, i, i2));
    }

    public final Observable<PlayerError> b() {
        return this.b.a(Functions.a()).h(new $$Lambda$tvg$oo6aTOidMgd1NmxAOLPiclcuV_Y(this));
    }
}
