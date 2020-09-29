package defpackage;

import rx.internal.producers.SingleDelayedProducer;

/* renamed from: xjy reason: default package */
public final class xjy<T> implements b<Boolean, T> {
    final xiy<? super T, Boolean> a;
    final boolean b = true;

    public xjy(xiy<? super T, Boolean> xiy, boolean z) {
        this.a = xiy;
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(xio);
        AnonymousClass1 r1 = new xio<T>() {
            private boolean a;
            private boolean b;

            public final void onCompleted() {
                if (!this.b) {
                    this.b = true;
                    if (this.a) {
                        singleDelayedProducer.a(Boolean.FALSE);
                        return;
                    }
                    singleDelayedProducer.a(Boolean.valueOf(xjy.this.b));
                }
            }

            public final void onError(Throwable th) {
                if (!this.b) {
                    this.b = true;
                    xio.onError(th);
                    return;
                }
                xnx.a(th);
            }

            public final void onNext(T t) {
                if (!this.b) {
                    this.a = true;
                    try {
                        if (((Boolean) xjy.this.a.call(t)).booleanValue()) {
                            this.b = true;
                            singleDelayedProducer.a(Boolean.valueOf(true ^ xjy.this.b));
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        xiq.a(th, this, t);
                    }
                }
            }
        };
        xio.add(r1);
        xio.setProducer(singleDelayedProducer);
        return r1;
    }
}
