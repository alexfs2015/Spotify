package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.internal.producers.SingleDelayedProducer;

/* renamed from: xkt reason: default package */
public final class xkt<T> implements b<List<T>, T> {

    /* renamed from: xkt$a */
    public static final class a {
        public static final xkt<Object> a = new xkt<>();
    }

    xkt() {
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(xio);
        AnonymousClass1 r1 = new xio<T>() {
            private boolean a;
            private List<T> b = new LinkedList();

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    try {
                        ArrayList arrayList = new ArrayList(this.b);
                        this.b = null;
                        singleDelayedProducer.a(arrayList);
                    } catch (Throwable th) {
                        xiq.a(th, (xij<?>) this);
                    }
                }
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final void onNext(T t) {
                if (!this.a) {
                    this.b.add(t);
                }
            }

            public final void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        xio.add(r1);
        xio.setProducer(singleDelayedProducer);
        return r1;
    }
}
