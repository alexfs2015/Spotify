package defpackage;

import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gqj$joF17w3H3Ixxa38ZEywlg9G-x2M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gqj$joF17w3H3Ixxa38ZEywlg9Gx2M implements Function {
    private final /* synthetic */ gix f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$gqj$joF17w3H3Ixxa38ZEywlg9Gx2M(gix gix, Observable observable) {
        this.f$0 = gix;
        this.f$1 = observable;
    }

    public final Object apply(Object obj) {
        return Observable.b((ObservableSource<? extends T1>) ((fpn) this.f$0.a(fpn.class)).a(SetPasswordRequestBody.create(((a) obj).a, ((a) obj).b)).d(), (ObservableSource<? extends T2>) this.f$1, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$M5GhshK6fl_JNfvSXaj1Rj6uVtA.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$gqj$riTM2MnkcxQt8qThw5DtZBUT8F0<Object,Object>((a) obj)).e((Function<? super Throwable, ? extends T>) new $$Lambda$gqj$xMWEsMNUR6awECumUAFaPJ3LA<Object,Object>((a) obj));
    }
}
