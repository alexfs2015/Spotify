package defpackage;

/* renamed from: wvd reason: default package */
public final class wvd<T, U> implements a<T> {
    final wud<? extends T> a;
    private wud<U> b;

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        final xai xai = new xai();
        wuj.add(xai);
        final wuj a2 = wzp.a(wuj);
        AnonymousClass1 r1 = new wuj<U>() {
            private boolean a;

            public final void onNext(U u) {
                onCompleted();
            }

            public final void onError(Throwable th) {
                if (this.a) {
                    wzs.a(th);
                    return;
                }
                this.a = true;
                a2.onError(th);
            }

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    xai.a(xaj.b());
                    wvd.this.a.a(a2);
                }
            }
        };
        xai.a(r1);
        this.b.a((wuj<? super T>) r1);
    }

    public wvd(wud<? extends T> wud, wud<U> wud2) {
        this.a = wud;
        this.b = wud2;
    }
}
