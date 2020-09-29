package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class OnSubscribeAmb<T> implements defpackage.xii.a<T> {
    private Iterable<? extends xii<? extends T>> a;

    static final class Selection<T> extends AtomicReference<a<T>> {
        final Collection<a<T>> ambSubscribers = new ConcurrentLinkedQueue();

        Selection() {
        }

        public final void a() {
            a aVar = (a) get();
            if (aVar != null) {
                a(aVar);
            }
        }

        public final void a(a<T> aVar) {
            for (a<T> aVar2 : this.ambSubscribers) {
                if (aVar2 != aVar) {
                    aVar2.unsubscribe();
                }
            }
            this.ambSubscribers.clear();
        }
    }

    static final class a<T> extends xio<T> {
        private final xio<? super T> a;
        private final Selection<T> b;
        private boolean c;

        a(long j, xio<? super T> xio, Selection<T> selection) {
            this.a = xio;
            this.b = selection;
            request(0);
        }

        private boolean a() {
            if (this.c) {
                return true;
            }
            if (this.b.get() == this) {
                this.c = true;
                return true;
            } else if (this.b.compareAndSet(null, this)) {
                this.b.a(this);
                this.c = true;
                return true;
            } else {
                this.b.a();
                return false;
            }
        }

        public final void onCompleted() {
            if (a()) {
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (a()) {
                this.a.onError(th);
            }
        }

        public final void onNext(T t) {
            if (a()) {
                this.a.onNext(t);
            }
        }
    }

    private OnSubscribeAmb(Iterable<? extends xii<? extends T>> iterable) {
        this.a = iterable;
    }

    public static <T> defpackage.xii.a<T> a(xii<? extends T> xii, xii<? extends T> xii2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(xii);
        arrayList.add(xii2);
        return new OnSubscribeAmb(arrayList);
    }

    static <T> void a(Collection<a<T>> collection) {
        if (!collection.isEmpty()) {
            for (a unsubscribe : collection) {
                unsubscribe.unsubscribe();
            }
            collection.clear();
        }
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        final Selection selection = new Selection();
        xio.add(xon.a((xir) new xir() {
            public final void call() {
                a aVar = (a) selection.get();
                if (aVar != null) {
                    aVar.unsubscribe();
                }
                OnSubscribeAmb.a(selection.ambSubscribers);
            }
        }));
        for (xii xii : this.a) {
            if (xio.isUnsubscribed()) {
                break;
            }
            a aVar = new a(0, xio, selection);
            selection.ambSubscribers.add(aVar);
            a aVar2 = (a) selection.get();
            if (aVar2 != null) {
                selection.a(aVar2);
                return;
            }
            xii.a((xio<? super T>) aVar);
        }
        if (xio.isUnsubscribed()) {
            a(selection.ambSubscribers);
        }
        xio.setProducer(new xik() {
            public final void a(long j) {
                a aVar = (a) selection.get();
                if (aVar != null) {
                    aVar.request(j);
                    return;
                }
                for (a aVar2 : selection.ambSubscribers) {
                    if (!aVar2.isUnsubscribed()) {
                        if (selection.get() == aVar2) {
                            aVar2.request(j);
                            return;
                        }
                        aVar2.request(j);
                    }
                }
            }
        });
    }
}
