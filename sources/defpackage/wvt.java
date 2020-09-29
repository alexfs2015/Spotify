package defpackage;

import rx.internal.producers.SingleDelayedProducer;

/* renamed from: wvt reason: default package */
public final class wvt<T> implements b<Boolean, T> {
    final wut<? super T, Boolean> a;
    final boolean b = true;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(wuj);
        AnonymousClass1 r1 = new wuj<T>() {
            private boolean a;
            private boolean b;

            public final void onNext(T t) {
                if (!this.b) {
                    this.a = true;
                    try {
                        if (((Boolean) wvt.this.a.call(t)).booleanValue()) {
                            this.b = true;
                            singleDelayedProducer.a(Boolean.valueOf(true ^ wvt.this.b));
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        wul.a(th, this, t);
                    }
                }
            }

            public final void onError(Throwable th) {
                if (!this.b) {
                    this.b = true;
                    wuj.onError(th);
                    return;
                }
                wzs.a(th);
            }

            public final void onCompleted() {
                if (!this.b) {
                    this.b = true;
                    if (this.a) {
                        singleDelayedProducer.a(Boolean.FALSE);
                        return;
                    }
                    singleDelayedProducer.a(Boolean.valueOf(wvt.this.b));
                }
            }
        };
        wuj.add(r1);
        wuj.setProducer(singleDelayedProducer);
        return r1;
    }

    public wvt(wut<? super T, Boolean> wut, boolean z) {
        this.a = wut;
    }
}
