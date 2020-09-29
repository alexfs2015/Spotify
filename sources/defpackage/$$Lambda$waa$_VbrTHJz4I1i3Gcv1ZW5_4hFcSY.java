package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$waa$_VbrTHJz4I1i3Gcv1ZW5_4hFcSY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$waa$_VbrTHJz4I1i3Gcv1ZW5_4hFcSY implements ObservableTransformer {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$waa$_VbrTHJz4I1i3Gcv1ZW5_4hFcSY(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$waa$2c6cXsGvITx6nX4FqLtpdRgyOo4<Object,Object>(this.f$0));
    }
}
