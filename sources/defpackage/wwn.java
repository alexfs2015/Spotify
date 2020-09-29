package defpackage;

/* renamed from: wwn reason: default package */
public final class wwn<T> implements b<T, T> {
    final wut<? super T, Boolean> a;

    /* renamed from: wwn$a */
    final class a extends wuj<T> {
        private final wuj<? super T> a;
        private boolean b;

        a(wuj<? super T> wuj) {
            this.a = wuj;
        }

        public final void onNext(T t) {
            this.a.onNext(t);
            try {
                if (((Boolean) wwn.this.a.call(t)).booleanValue()) {
                    this.b = true;
                    this.a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.b = true;
                wul.a(th, this.a, t);
                unsubscribe();
            }
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

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            request(j);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        final a aVar = new a(wuj);
        wuj.add(aVar);
        wuj.setProducer(new wuf() {
            public final void a(long j) {
                aVar.a(j);
            }
        });
        return aVar;
    }

    public wwn(wut<? super T, Boolean> wut) {
        this.a = wut;
    }
}
