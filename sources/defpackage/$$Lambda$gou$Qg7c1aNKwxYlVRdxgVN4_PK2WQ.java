package defpackage;

import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gou$Qg7c1aNKwxYlVRdxgVN-4_PK2WQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gou$Qg7c1aNKwxYlVRdxgVN4_PK2WQ implements Function {
    private final /* synthetic */ ghm f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$gou$Qg7c1aNKwxYlVRdxgVN4_PK2WQ(ghm ghm, Observable observable) {
        this.f$0 = ghm;
        this.f$1 = observable;
    }

    public final Object apply(Object obj) {
        return Observable.b((ObservableSource<? extends T1>) ((fot) this.f$0.a(fot.class)).a(SetPasswordRequestBody.create(((a) obj).a, ((a) obj).b)).d(), (ObservableSource<? extends T2>) this.f$1, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$gHM61irMC882Pp2KbxWPnotsEk8.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$gou$05bIL6rk4_IYdFtbG1QVRKjwj8<Object,Object>((a) obj)).e((Function<? super Throwable, ? extends T>) new $$Lambda$gou$9QZ5Z9U1r6WeGW6ScGvzPs0LQNc<Object,Object>((a) obj));
    }
}
