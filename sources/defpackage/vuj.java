package defpackage;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;

/* renamed from: vuj reason: default package */
final class vuj implements defpackage.wub.a {
    private CompletableSource a;

    /* renamed from: vuj$a */
    static final class a implements CompletableObserver, wuk {
        private wuc a;
        private Disposable b;

        a(wuc wuc) {
            this.a = wuc;
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.a((wuk) this);
        }

        public final void onComplete() {
            this.a.a();
        }

        public final void onError(Throwable th) {
            this.a.a(th);
        }

        public final void unsubscribe() {
            this.b.bf_();
        }

        public final boolean isUnsubscribed() {
            return this.b.b();
        }
    }

    public final /* synthetic */ void call(Object obj) {
        this.a.a(new a((wuc) obj));
    }

    vuj(CompletableSource completableSource) {
        this.a = completableSource;
    }
}
