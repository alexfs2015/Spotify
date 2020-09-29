package defpackage;

import java.util.NoSuchElementException;
import rx.internal.producers.SingleProducer;

/* renamed from: wwh reason: default package */
public final class wwh<T> implements defpackage.wud.b<T, T> {
    private final boolean a;
    private final T b;

    /* renamed from: wwh$a */
    static final class a {
        static final wwh<?> a = new wwh<>();
    }

    /* renamed from: wwh$b */
    static final class b<T> extends wuj<T> {
        private final wuj<? super T> a;
        private final boolean b;
        private final T c;
        private T d;
        private boolean e;
        private boolean f;

        b(wuj<? super T> wuj, boolean z, T t) {
            this.a = wuj;
            this.b = z;
            this.c = t;
            request(2);
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

        public final void onCompleted() {
            if (!this.f) {
                if (this.e) {
                    wuj<? super T> wuj = this.a;
                    wuj.setProducer(new SingleProducer(wuj, this.d));
                } else if (this.b) {
                    wuj<? super T> wuj2 = this.a;
                    wuj2.setProducer(new SingleProducer(wuj2, this.c));
                } else {
                    this.a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                wzs.a(th);
            } else {
                this.a.onError(th);
            }
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        b bVar = new b(wuj, this.a, this.b);
        wuj.add(bVar);
        return bVar;
    }

    public static <T> wwh<T> a() {
        return a.a;
    }

    wwh() {
        this(false, null);
    }

    public wwh(T t) {
        this(true, t);
    }

    private wwh(boolean z, T t) {
        this.a = z;
        this.b = t;
    }
}
