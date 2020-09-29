package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.internal.producers.SingleDelayedProducer;

/* renamed from: wwo reason: default package */
public final class wwo<T> implements b<List<T>, T> {

    /* renamed from: wwo$a */
    public static final class a {
        public static final wwo<Object> a = new wwo<>();
    }

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(wuj);
        AnonymousClass1 r1 = new wuj<T>() {
            private boolean a;
            private List<T> b = new LinkedList();

            public final void onStart() {
                request(Long.MAX_VALUE);
            }

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    try {
                        ArrayList arrayList = new ArrayList(this.b);
                        this.b = null;
                        singleDelayedProducer.a(arrayList);
                    } catch (Throwable th) {
                        wul.a(th, (wue<?>) this);
                    }
                }
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }

            public final void onNext(T t) {
                if (!this.a) {
                    this.b.add(t);
                }
            }
        };
        wuj.add(r1);
        wuj.setProducer(singleDelayedProducer);
        return r1;
    }

    wwo() {
    }
}
