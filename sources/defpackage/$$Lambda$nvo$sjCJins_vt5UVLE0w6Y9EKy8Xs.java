package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nvo$sjCJins_vt5UVLE0w6Y9EKy-8Xs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvo$sjCJins_vt5UVLE0w6Y9EKy8Xs implements ObservableTransformer {
    private final /* synthetic */ nvw f$0;

    public /* synthetic */ $$Lambda$nvo$sjCJins_vt5UVLE0w6Y9EKy8Xs(nvw nvw) {
        this.f$0 = nvw;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nvo$UuvNFMg4CHkf5oRAevgrCwT8VWY<Object,Object>(this.f$0), false).e();
    }
}
