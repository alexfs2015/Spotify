package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;

/* renamed from: xjj reason: default package */
public final class xjj<T> implements defpackage.xii.a<T> {
    private final xij<? super T> a;
    private final xii<T> b;

    /* renamed from: xjj$a */
    static final class a<T> extends xio<T> {
        private final xio<? super T> a;
        private final xij<? super T> b;
        private boolean c;

        a(xio<? super T> xio, xij<? super T> xij) {
            super(xio);
            this.a = xio;
            this.b = xij;
        }

        public final void onCompleted() {
            if (!this.c) {
                try {
                    this.b.onCompleted();
                    this.c = true;
                    this.a.onCompleted();
                } catch (Throwable th) {
                    xiq.a(th, (xij<?>) this);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                xnx.a(th);
                return;
            }
            this.c = true;
            try {
                this.b.onError(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                xiq.b(th2);
                this.a.onError(new CompositeException(Arrays.asList(new Throwable[]{th, th2}), 0));
            }
        }

        public final void onNext(T t) {
            if (!this.c) {
                try {
                    this.b.onNext(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    xiq.a(th, this, t);
                }
            }
        }
    }

    public xjj(xii<T> xii, xij<? super T> xij) {
        this.b = xii;
        this.a = xij;
    }

    public final /* synthetic */ void call(Object obj) {
        this.b.a((xio<? super T>) new a<Object>((xio) obj, this.a));
    }
}
