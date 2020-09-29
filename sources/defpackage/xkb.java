package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xkb reason: default package */
public final class xkb<T> implements b<T, T> {
    final long a;
    final TimeUnit b;
    private xil c;

    public xkb(long j, TimeUnit timeUnit, xil xil) {
        this.a = j;
        this.b = timeUnit;
        this.c = xil;
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        final a c2 = this.c.c();
        xio.add(c2);
        return new xio<T>(xio) {
            boolean a;

            public final void onCompleted() {
                c2.a(new xir() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            r0.a = true;
                            xio.onCompleted();
                        }
                    }
                }, xkb.this.a, xkb.this.b);
            }

            public final void onError(final Throwable th) {
                c2.a(new xir() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            r0.a = true;
                            xio.onError(th);
                            c2.unsubscribe();
                        }
                    }
                });
            }

            public final void onNext(final T t) {
                c2.a(new xir() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            xio.onNext(t);
                        }
                    }
                }, xkb.this.a, xkb.this.b);
            }
        };
    }
}
