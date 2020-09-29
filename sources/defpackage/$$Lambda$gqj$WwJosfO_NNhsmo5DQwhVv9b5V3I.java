package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gqj$WwJosfO_NNhsmo5DQwhVv9b5V3I reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gqj$WwJosfO_NNhsmo5DQwhVv9b5V3I implements ObservableTransformer {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$gqj$WwJosfO_NNhsmo5DQwhVv9b5V3I(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gqj$uzIuCkj9MxP2VIZy1eaqSPlOco<Object,Object>(this.f$0), false);
    }
}
