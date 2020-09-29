package defpackage;

import java.util.concurrent.Callable;
import rx.internal.producers.SingleDelayedProducer;

/* renamed from: xjm reason: default package */
public final class xjm<T> implements a<T> {
    private final Callable<? extends T> a;

    public xjm(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(xio);
        xio.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.a(this.a.call());
        } catch (Throwable th) {
            xiq.a(th, (xij<?>) xio);
        }
    }
}
