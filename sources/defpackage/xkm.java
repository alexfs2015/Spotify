package defpackage;

import java.util.NoSuchElementException;
import rx.internal.producers.SingleProducer;

/* renamed from: xkm reason: default package */
public final class xkm<T> implements defpackage.xii.b<T, T> {
    private final boolean a;
    private final T b;

    /* renamed from: xkm$a */
    static final class a {
        static final xkm<?> a = new xkm<>();
    }

    /* renamed from: xkm$b */
    static final class b<T> extends xio<T> {
        private final xio<? super T> a;
        private final boolean b;
        private final T c;
        private T d;
        private boolean e;
        private boolean f;

        b(xio<? super T> xio, boolean z, T t) {
            this.a = xio;
            this.b = z;
            this.c = t;
            request(2);
        }

        public final void onCompleted() {
            if (!this.f) {
                if (this.e) {
                    xio<? super T> xio = this.a;
                    xio.setProducer(new SingleProducer(xio, this.d));
                } else if (this.b) {
                    xio<? super T> xio2 = this.a;
                    xio2.setProducer(new SingleProducer(xio2, this.c));
                } else {
                    this.a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                xnx.a(th);
            } else {
                this.a.onError(th);
            }
        }

        public final void onNext(T t) {
            if (!this.f) {
                if (this.e) {
                    this.f = true;
                    this.a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.d = t;
                this.e = true;
            }
        }
    }

    xkm() {
        this(false, null);
    }

    public xkm(T t) {
        this(true, t);
    }

    private xkm(boolean z, T t) {
        this.a = z;
        this.b = t;
    }

    public static <T> xkm<T> a() {
        return a.a;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        b bVar = new b(xio, this.a, this.b);
        xio.add(bVar);
        return bVar;
    }
}
