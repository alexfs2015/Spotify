package defpackage;

import com.google.common.base.Optional;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$gdf$_j9yVb133VL3OcfQ48VFFpL_gd8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gdf$_j9yVb133VL3OcfQ48VFFpL_gd8 implements ObservableOnSubscribe {
    private final /* synthetic */ gdf f$0;
    private final /* synthetic */ Optional f$1;

    public /* synthetic */ $$Lambda$gdf$_j9yVb133VL3OcfQ48VFFpL_gd8(gdf gdf, Optional optional) {
        this.f$0 = gdf;
        this.f$1 = optional;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, observableEmitter);
    }
}
