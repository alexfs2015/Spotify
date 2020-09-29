package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$gic$Lm16xtTTnHCiSbqQ25Y3q0pyyqQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gic$Lm16xtTTnHCiSbqQ25Y3q0pyyqQ implements ObservableTransformer {
    private final /* synthetic */ gif f$0;
    private final /* synthetic */ gie f$1;

    public /* synthetic */ $$Lambda$gic$Lm16xtTTnHCiSbqQ25Y3q0pyyqQ(gif gif, gie gie) {
        this.f$0 = gif;
        this.f$1 = gie;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$gic$iN5Cj5txmT8Bij5eqZmKOrPRYgM(this.f$0, this.f$1));
    }
}
