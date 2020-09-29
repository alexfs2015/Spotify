package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;

/* renamed from: hta reason: default package */
public final class hta {
    private final Observable<uyv> a;
    private final Observable<uyy<uyq>> b;
    private final Observable<uyy<uys>> c;

    public hta(Observable<uyv> observable, Observable<uyy<uyq>> observable2, Observable<uyy<uys>> observable3) {
        this.a = observable;
        this.b = observable2;
        this.c = observable3;
    }

    public final Single<Boolean> a(String str) {
        return Observable.a((ObservableSource<? extends T1>) this.a.c((Function<? super T, ? extends R>) new $$Lambda$hta$tKcWyDcGBpN8EnNuGD0XndlrZ4<Object,Object>(str)), (ObservableSource<? extends T2>) this.b.c((Function<? super T, ? extends R>) new $$Lambda$hta$kNromxkyMvLInvuKcFZualATjMw<Object,Object>(str)), (ObservableSource<? extends T3>) this.c.c((Function<? super T, ? extends R>) new $$Lambda$hta$nQIQO6_OStXbnls5KrWkelHbPXU<Object,Object>(str)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$hta$QJmB8xy_NsGzlCLyXrEC7MHu99Y.INSTANCE).a(0, Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue() || bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static Boolean a(uyy<? extends uyx> uyy, String str) {
        for (uyx uri : (uyx[]) uyy.getItems()) {
            if (uri.getUri().equals(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
