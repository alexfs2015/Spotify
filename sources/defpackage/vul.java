package defpackage;

import io.reactivex.Flowable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: vul reason: default package */
final class vul<T> extends Flowable<T> {
    private wud<T> b;

    /* renamed from: vul$a */
    static final class a<T> extends wuj<T> {
        private wrg<? super T> a;
        private boolean b;

        a(wrg<? super T> wrg) {
            this.a = wrg;
            request(0);
        }

        public final void onNext(T t) {
            if (!this.b) {
                if (t == null) {
                    unsubscribe();
                    onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                    return;
                }
                this.a.b_(t);
            }
        }

        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.a(th);
                return;
            }
            this.b = true;
            this.a.onError(th);
            unsubscribe();
        }

        public final void onCompleted() {
            if (!this.b) {
                this.b = true;
                this.a.c();
                unsubscribe();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            request(j);
        }
    }

    /* renamed from: vul$b */
    static final class b implements wrh {
        private a<?> a;

        b(a<?> aVar) {
            this.a = aVar;
        }

        public final void a(long j) {
            this.a.a(j);
        }

        public final void a() {
            this.a.unsubscribe();
        }
    }

    vul(wud<T> wud) {
        this.b = wud;
    }

    public final void a(wrg<? super T> wrg) {
        a aVar = new a(wrg);
        wrg.a(new b(aVar));
        this.b.a((wuj<? super T>) aVar);
    }
}
