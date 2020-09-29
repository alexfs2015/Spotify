package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$9xEofzLnCRKMm2aeWIAIOwmVfJQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$9xEofzLnCRKMm2aeWIAIOwmVfJQ implements ObservableTransformer {
    private final /* synthetic */ vxa f$0;
    private final /* synthetic */ AgeValidator f$1;
    private final /* synthetic */ gqm f$2;

    public /* synthetic */ $$Lambda$vym$9xEofzLnCRKMm2aeWIAIOwmVfJQ(vxa vxa, AgeValidator ageValidator, gqm gqm) {
        this.f$0 = vxa;
        this.f$1 = ageValidator;
        this.f$2 = gqm;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vym$txWzY34UngnlpkswhcfuX8061I<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
