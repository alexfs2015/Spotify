package defpackage;

/* renamed from: xks reason: default package */
public final class xks<T> implements b<T, T> {
    final xiy<? super T, Boolean> a;

    /* renamed from: xks$a */
    final class a extends xio<T> {
        private final xio<? super T> a;
        private boolean b;

        a(xio<? super T> xio) {
            this.a = xio;
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            request(j);
        }

        public final void onCompleted() {
            if (!this.b) {
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (!this.b) {
                this.a.onError(th);
            }
        }

        public final void onNext(T t) {
            this.a.onNext(t);
            try {
                if (((Boolean) xks.this.a.call(t)).booleanValue()) {
                    this.b = true;
                    this.a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.b = true;
                xiq.a(th, this.a, t);
                unsubscribe();
            }
        }
    }

    public xks(xiy<? super T, Boolean> xiy) {
        this.a = xiy;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        final a aVar = new a(xio);
        xio.add(aVar);
        xio.setProducer(new xik() {
            public final void a(long j) {
                aVar.a(j);
            }
        });
        return aVar;
    }
}
