package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$txWzY34Ungnlpk-swhcfuX8061I reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$txWzY34UngnlpkswhcfuX8061I implements Function {
    private final /* synthetic */ vxa f$0;
    private final /* synthetic */ AgeValidator f$1;
    private final /* synthetic */ gqm f$2;

    public /* synthetic */ $$Lambda$vym$txWzY34UngnlpkswhcfuX8061I(vxa vxa, AgeValidator ageValidator, gqm gqm) {
        this.f$0 = vxa;
        this.f$1 = ageValidator;
        this.f$2 = gqm;
    }

    public final Object apply(Object obj) {
        return this.f$0.a().d().a((ObservableTransformer<? super T, ? extends R>) new vvv<Object,Object>()).b((Consumer<? super T>) new $$Lambda$vym$ErMYhWu_s9Y8bFU_nY7bqcU9zE<Object>(this.f$1, this.f$2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vym$KkBPVuNQOR9pOeuNay5pfkdqU6A.INSTANCE, false).d((ObservableSource<? extends T>) Observable.c());
    }
}
