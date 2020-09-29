package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wvw reason: default package */
public final class wvw<T> implements b<T, T> {
    final long a;
    final TimeUnit b;
    private wug c;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        final a c2 = this.c.c();
        wuj.add(c2);
        return new wuj<T>(wuj) {
            boolean a;

            public final void onCompleted() {
                c2.a(new wum() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            r0.a = true;
                            wuj.onCompleted();
                        }
                    }
                }, wvw.this.a, wvw.this.b);
            }

            public final void onError(final Throwable th) {
                c2.a(new wum() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            r0.a = true;
                            wuj.onError(th);
                            c2.unsubscribe();
                        }
                    }
                });
            }

            public final void onNext(final T t) {
                c2.a(new wum() {
                    public final void call() {
                        if (!AnonymousClass1.this.a) {
                            wuj.onNext(t);
                        }
                    }
                }, wvw.this.a, wvw.this.b);
            }
        };
    }

    public wvw(long j, TimeUnit timeUnit, wug wug) {
        this.a = j;
        this.b = timeUnit;
        this.c = wug;
    }
}
