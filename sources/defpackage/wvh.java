package defpackage;

import java.util.concurrent.Callable;
import rx.internal.producers.SingleDelayedProducer;

/* renamed from: wvh reason: default package */
public final class wvh<T> implements a<T> {
    private final Callable<? extends T> a;

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(wuj);
        wuj.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.a(this.a.call());
        } catch (Throwable th) {
            wul.a(th, (wue<?>) wuj);
        }
    }

    public wvh(Callable<? extends T> callable) {
        this.a = callable;
    }
}
