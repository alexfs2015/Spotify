package defpackage;

/* renamed from: wwi reason: default package */
public final class wwi<T> implements b<T, T> {
    final int a;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        return new wuj<T>(wuj) {
            private int a;

            public final void onCompleted() {
                wuj.onCompleted();
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }

            public final void onNext(T t) {
                if (this.a >= wwi.this.a) {
                    wuj.onNext(t);
                } else {
                    this.a++;
                }
            }

            public final void setProducer(wuf wuf) {
                wuj.setProducer(wuf);
                wuf.a((long) wwi.this.a);
            }
        };
    }

    public wwi(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
