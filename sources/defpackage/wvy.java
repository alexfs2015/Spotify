package defpackage;

/* renamed from: wvy reason: default package */
public final class wvy<T> implements b<T, T> {
    final wum a;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        return new wuj<T>(wuj) {
            public final void onNext(T t) {
                wuj.onNext(t);
            }

            public final void onError(Throwable th) {
                try {
                    wuj.onError(th);
                } finally {
                    a();
                }
            }

            public final void onCompleted() {
                try {
                    wuj.onCompleted();
                } finally {
                    a();
                }
            }

            private void a() {
                try {
                    wvy.this.a.call();
                } catch (Throwable th) {
                    wul.b(th);
                    wzs.a(th);
                }
            }
        };
    }

    public wvy(wum wum) {
        if (wum != null) {
            this.a = wum;
            return;
        }
        throw new NullPointerException("Action can not be null");
    }
}
