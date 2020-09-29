package defpackage;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$lrw$1$UthBWVR6NVaq598GZgyOTRb0Tgk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lrw$1$UthBWVR6NVaq598GZgyOTRb0Tgk implements Callable {
    private final /* synthetic */ lrm f$0;
    private final /* synthetic */ lqv f$1;

    public /* synthetic */ $$Lambda$lrw$1$UthBWVR6NVaq598GZgyOTRb0Tgk(lrm lrm, lqv lqv) {
        this.f$0 = lrm;
        this.f$1 = lqv;
    }

    public final Object call() {
        return Observable.b(this.f$0.a(this.f$1));
    }
}
