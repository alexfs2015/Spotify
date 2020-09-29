package defpackage;

/* renamed from: xkn reason: default package */
public final class xkn<T> implements b<T, T> {
    final int a;

    public xkn(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        return new xio<T>(xio) {
            private int a;

            public final void onCompleted() {
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final void onNext(T t) {
                if (this.a >= xkn.this.a) {
                    xio.onNext(t);
                } else {
                    this.a++;
                }
            }

            public final void setProducer(xik xik) {
                xio.setProducer(xik);
                xik.a((long) xkn.this.a);
            }
        };
    }
}
