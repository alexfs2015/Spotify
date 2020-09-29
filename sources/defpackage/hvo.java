package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;

/* renamed from: hvo reason: default package */
public final class hvo {
    private final Observable<vky> a;
    private final Observable<vlb<vkt>> b;
    private final Observable<vlb<vkv>> c;

    public hvo(Observable<vky> observable, Observable<vlb<vkt>> observable2, Observable<vlb<vkv>> observable3) {
        this.a = observable;
        this.b = observable2;
        this.c = observable3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue() || bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static Boolean a(vlb<? extends vla> vlb, String str) {
        for (vla uri : (vla[]) vlb.getItems()) {
            if (uri.getUri().equals(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final Single<Boolean> a(String str) {
        return Observable.a((ObservableSource<? extends T1>) this.a.c((Function<? super T, ? extends R>) new $$Lambda$hvo$KsSJI3pCONiS4G8q1S7wPoK1zM<Object,Object>(str)), (ObservableSource<? extends T2>) this.b.c((Function<? super T, ? extends R>) new $$Lambda$hvo$wEQrRwFf0cUTavl6kZfOKETexCA<Object,Object>(str)), (ObservableSource<? extends T3>) this.c.c((Function<? super T, ? extends R>) new $$Lambda$hvo$VlWDxJUD8qeu6TJuovnWSI5VcC8<Object,Object>(str)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$hvo$TIS3HWRn0lHO8q91mIkPQNbHIBs.INSTANCE).a(0, Boolean.FALSE);
    }
}
