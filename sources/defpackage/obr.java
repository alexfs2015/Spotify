package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: obr reason: default package */
public final class obr {
    static Observable<SignupConfigurationResponse> a(vju vju) {
        Observable a = ObservablePublish.h(vju.a().d()).a().a((Consumer<? super Throwable>) $$Lambda$obr$I1L9yQgKaEVQ_7VLFHUrZsbM6YY.INSTANCE);
        Observable b = Observable.b(SignupConfigurationResponse.DEFAULT);
        ObjectHelper.a(b, "next is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableOnErrorNext<T>(a, Functions.b(b), true));
    }
}
