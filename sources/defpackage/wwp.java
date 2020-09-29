package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wwp reason: default package */
public final class wwp<T, U, R> implements b<R, T> {
    static final Object b = new Object();
    final wuu<? super T, ? super U, ? extends R> a;
    private wud<? extends U> c;

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        final wzo wzo = new wzo(wuj, false);
        wuj.add(wzo);
        final AtomicReference atomicReference = new AtomicReference(b);
        AnonymousClass1 r0 = new wuj<T>(wzo, true, atomicReference, wzo) {
            private /* synthetic */ AtomicReference a;
            private /* synthetic */ wzo b;

            {
                this.a = r4;
                this.b = r5;
            }

            public final void onNext(T t) {
                Object obj = this.a.get();
                if (obj != wwp.b) {
                    try {
                        this.b.onNext(wwp.this.a.call(t, obj));
                    } catch (Throwable th) {
                        wul.a(th, (wue<?>) this);
                    }
                }
            }

            public final void onError(Throwable th) {
                this.b.onError(th);
                this.b.unsubscribe();
            }

            public final void onCompleted() {
                this.b.onCompleted();
                this.b.unsubscribe();
            }
        };
        AnonymousClass2 r02 = new wuj<U>() {
            public final void onNext(U u) {
                atomicReference.set(u);
            }

            public final void onError(Throwable th) {
                wzo.onError(th);
                wzo.unsubscribe();
            }

            public final void onCompleted() {
                if (atomicReference.get() == wwp.b) {
                    wzo.onCompleted();
                    wzo.unsubscribe();
                }
            }
        };
        wzo.add(r0);
        wzo.add(r02);
        this.c.a((wuj<? super T>) r02);
        return r0;
    }

    public wwp(wud<? extends U> wud, wuu<? super T, ? super U, ? extends R> wuu) {
        this.c = wud;
        this.a = wuu;
    }
}
