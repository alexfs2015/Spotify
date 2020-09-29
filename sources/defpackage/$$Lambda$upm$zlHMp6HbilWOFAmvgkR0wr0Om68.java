package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$zlHMp6HbilWOFAmvgkR0wr0Om68 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$zlHMp6HbilWOFAmvgkR0wr0Om68 implements ObservableTransformer {
    private final /* synthetic */ lbs f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$zlHMp6HbilWOFAmvgkR0wr0Om68(lbs lbs, Context context) {
        this.f$0 = lbs;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$a9Mu9_fMQCgXyegbtiTndDCs7AE<Object,Object>(this.f$0, this.f$1), false);
    }
}
