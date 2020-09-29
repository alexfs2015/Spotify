package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: oiq reason: default package */
public final class oiq {
    static Observable<SignupConfigurationResponse> a(vxa vxa) {
        Observable a = ObservablePublish.h(vxa.a().d()).a().a((Consumer<? super Throwable>) $$Lambda$oiq$JkyHBk4chf4S1GTyDC8zKttBUo.INSTANCE);
        Observable b = Observable.b(SignupConfigurationResponse.DEFAULT);
        ObjectHelper.a(b, "next is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableOnErrorNext<T>(a, Functions.b(b), true));
    }
}
