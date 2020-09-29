package defpackage;

import java.util.NoSuchElementException;

/* renamed from: wvm reason: default package */
public final class wvm<T> implements a<T> {
    private final wud<T> a;

    public final /* synthetic */ void call(Object obj) {
        final wui wui = (wui) obj;
        AnonymousClass1 r0 = new wuj<T>() {
            private boolean a;
            private boolean b;
            private T c;

            public final void onStart() {
                request(2);
            }

            public final void onCompleted() {
                if (!this.a) {
                    if (this.b) {
                        wui.a(this.c);
                        return;
                    }
                    wui.a((Throwable) new NoSuchElementException("Observable emitted no items"));
                }
            }

            public final void onError(Throwable th) {
                wui.a(th);
                unsubscribe();
            }

            public final void onNext(T t) {
                if (this.b) {
                    this.a = true;
                    wui.a((Throwable) new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.b = true;
                this.c = t;
            }
        };
        wui.a((wuk) r0);
        this.a.a((wuj<? super T>) r0);
    }

    private wvm(wud<T> wud) {
        this.a = wud;
    }

    public static <T> wvm<T> a(wud<T> wud) {
        return new wvm<>(wud);
    }
}
