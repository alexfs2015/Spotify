package defpackage;

/* renamed from: xkd reason: default package */
public final class xkd<T> implements b<T, T> {
    final xir a;

    public xkd(xir xir) {
        if (xir != null) {
            this.a = xir;
            return;
        }
        throw new NullPointerException("Action can not be null");
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        return new xio<T>(xio) {
            private void a() {
                try {
                    xkd.this.a.call();
                } catch (Throwable th) {
                    xiq.b(th);
                    xnx.a(th);
                }
            }

            public final void onCompleted() {
                try {
                    xio.onCompleted();
                } finally {
                    a();
                }
            }

            public final void onError(Throwable th) {
                try {
                    xio.onError(th);
                } finally {
                    a();
                }
            }

            public final void onNext(T t) {
                xio.onNext(t);
            }
        };
    }
}
