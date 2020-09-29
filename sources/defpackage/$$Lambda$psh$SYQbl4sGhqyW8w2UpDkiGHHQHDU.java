package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$psh$SYQbl4sGhqyW8w2UpDkiGHHQHDU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$SYQbl4sGhqyW8w2UpDkiGHHQHDU implements ObservableTransformer {
    private final /* synthetic */ pqw f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$psh$SYQbl4sGhqyW8w2UpDkiGHHQHDU(pqw pqw, Scheduler scheduler) {
        this.f$0 = pqw;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$pfZQ38NjvOUqH_68640MFfkefY(this.f$0, this.f$1));
    }
}
