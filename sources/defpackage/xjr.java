package defpackage;

import java.util.NoSuchElementException;

/* renamed from: xjr reason: default package */
public final class xjr<T> implements a<T> {
    private final xii<T> a;

    private xjr(xii<T> xii) {
        this.a = xii;
    }

    public static <T> xjr<T> a(xii<T> xii) {
        return new xjr<>(xii);
    }

    public final /* synthetic */ void call(Object obj) {
        final xin xin = (xin) obj;
        AnonymousClass1 r0 = new xio<T>() {
            private boolean a;
            private boolean b;
            private T c;

            public final void onCompleted() {
                if (!this.a) {
                    if (this.b) {
                        xin.a(this.c);
                        return;
                    }
                    xin.a((Throwable) new NoSuchElementException("Observable emitted no items"));
                }
            }

            public final void onError(Throwable th) {
                xin.a(th);
                unsubscribe();
            }

            public final void onNext(T t) {
                if (this.b) {
                    this.a = true;
                    xin.a((Throwable) new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.b = true;
                this.c = t;
            }

            public final void onStart() {
                request(2);
            }
        };
        xin.a((xip) r0);
        this.a.a((xio<? super T>) r0);
    }
}
