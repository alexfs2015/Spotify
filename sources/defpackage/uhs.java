package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: uhs reason: default package */
public final class uhs {
    private final jwo a;
    private final uhk b;

    public uhs(jwo jwo, uhk uhk) {
        this.b = uhk;
        this.a = jwo;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(ConnectionType connectionType, Boolean bool) {
        return (!connectionType.mCellular || connectionType == ConnectionType.CONNECTION_TYPE_COMPANION_PROXY) ? Boolean.TRUE : bool;
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) jvw.b(this.b.a).a(Functions.a()), (ObservableSource<? extends T2>) this.a.n.c((Function<? super T, ? extends R>) $$Lambda$b2a6H22DQ5mBj_4WmR5dbBJQ4.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$uhs$BHRM6k4TEEdsdNaHaKixAXfb5K0.INSTANCE);
    }
}
