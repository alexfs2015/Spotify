package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function3;

/* renamed from: tuk reason: default package */
public final class tuk {
    private final Observable<Boolean> a;
    private final Observable<Boolean> b;
    private final Observable<Boolean> c;

    public tuk(Observable<Boolean> observable, Observable<Boolean> observable2, Observable<Boolean> observable3) {
        this.a = observable;
        this.b = observable2;
        this.c = observable3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ NetworkErrorReason a(Boolean bool, Boolean bool2, Boolean bool3) {
        return bool.booleanValue() ? NetworkErrorReason.FORCED_OFFLINE : (!bool2.booleanValue() || bool3.booleanValue()) ? NetworkErrorReason.UNKNOWN : NetworkErrorReason.AIRPLANE_MODE;
    }

    public final Single<NetworkErrorReason> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a, (ObservableSource<? extends T2>) this.b, (ObservableSource<? extends T3>) this.c, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$tuk$TKQFkUQRsJf5CEz_QNkGur2ej6c.INSTANCE).a(0);
    }
}
