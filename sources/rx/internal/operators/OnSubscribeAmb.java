package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class OnSubscribeAmb<T> implements defpackage.wud.a<T> {
    private Iterable<? extends wud<? extends T>> a;

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

    static final class a<T> extends wuj<T> {
        private final wuj<? super T> a;
        private final Selection<T> b;
        private boolean c;

        a(long j, wuj<? super T> wuj, Selection<T> selection) {
            this.a = wuj;
            this.b = selection;
            request(0);
        }

        public final void onNext(T t) {
            if (a()) {
                this.a.onNext(t);
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
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        final Selection selection = new Selection();
        wuj.add(xaj.a((wum) new wum() {
            public final void call() {
                a aVar = (a) selection.get();
                if (aVar != null) {
                    aVar.unsubscribe();
                }
                OnSubscribeAmb.a(selection.ambSubscribers);
            }
        }));
        for (wud wud : this.a) {
            if (wuj.isUnsubscribed()) {
                break;
            }
            a aVar = new a(0, wuj, selection);
            selection.ambSubscribers.add(aVar);
            a aVar2 = (a) selection.get();
            if (aVar2 != null) {
                selection.a(aVar2);
                return;
            }
            wud.a((wuj<? super T>) aVar);
        }
        if (wuj.isUnsubscribed()) {
            a(selection.ambSubscribers);
        }
        wuj.setProducer(new wuf() {
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

    public static <T> defpackage.wud.a<T> a(wud<? extends T> wud, wud<? extends T> wud2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(wud);
        arrayList.add(wud2);
        return new OnSubscribeAmb(arrayList);
    }

    private OnSubscribeAmb(Iterable<? extends wud<? extends T>> iterable) {
        this.a = iterable;
    }

    static <T> void a(Collection<a<T>> collection) {
        if (!collection.isEmpty()) {
            for (a unsubscribe : collection) {
                unsubscribe.unsubscribe();
            }
            collection.clear();
        }
    }
}
