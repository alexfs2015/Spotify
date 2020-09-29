package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$jho$fm_XjhRNKFVHndoZiac8UKVDbAc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jho$fm_XjhRNKFVHndoZiac8UKVDbAc implements ObservableTransformer {
    private final /* synthetic */ jhc f$0;

    public /* synthetic */ $$Lambda$jho$fm_XjhRNKFVHndoZiac8UKVDbAc(jhc jhc) {
        this.f$0 = jhc;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$jho$L3EeAMnhBo8ftp69Kwrzje6qc(this.f$0));
    }
}
