package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: tvp reason: default package */
public final class tvp {
    private final jug a;
    private final tvh b;

    public tvp(jug jug, tvh tvh) {
        this.b = tvh;
        this.a = jug;
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) jto.b(this.b.a).a(Functions.a()), (ObservableSource<? extends T2>) this.a.n.c((Function<? super T, ? extends R>) $$Lambda$b2a6H22DQ5mBj_4WmR5dbBJQ4.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tvp$_Tvca38lTALF_qZnpWujvtFvXU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(ConnectionType connectionType, Boolean bool) {
        if (!connectionType.mCellular || connectionType == ConnectionType.CONNECTION_TYPE_COMPANION_PROXY) {
            return Boolean.TRUE;
        }
        return bool;
    }
}
