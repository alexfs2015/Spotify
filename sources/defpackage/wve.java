package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;

/* renamed from: wve reason: default package */
public final class wve<T> implements defpackage.wud.a<T> {
    private final wue<? super T> a;
    private final wud<T> b;

    /* renamed from: wve$a */
    static final class a<T> extends wuj<T> {
        private final wuj<? super T> a;
        private final wue<? super T> b;
        private boolean c;

        a(wuj<? super T> wuj, wue<? super T> wue) {
            super(wuj);
            this.a = wuj;
            this.b = wue;
        }

        public final void onCompleted() {
            if (!this.c) {
                try {
                    this.b.onCompleted();
                    this.c = true;
                    this.a.onCompleted();
                } catch (Throwable th) {
                    wul.a(th, (wue<?>) this);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                wzs.a(th);
                return;
            }
            this.c = true;
            try {
                this.b.onError(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                wul.b(th2);
                this.a.onError(new CompositeException(Arrays.asList(new Throwable[]{th, th2}), 0));
            }
        }

        public final void onNext(T t) {
            if (!this.c) {
                try {
                    this.b.onNext(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    wul.a(th, this, t);
                }
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        this.b.a((wuj<? super T>) new a<Object>((wuj) obj, this.a));
    }

    public wve(wud<T> wud, wue<? super T> wue) {
        this.b = wud;
        this.a = wue;
    }
}
